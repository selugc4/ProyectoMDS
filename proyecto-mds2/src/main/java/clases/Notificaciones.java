package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario;
import basededatos.UsuarioDAO;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Notificaciones extends vistas.VistaNotificaciones {
//	public Cabecera_comun _cabecera_comun;
//	public Vector<Notificacion> _notificacion = new Vector<Notificacion>();
	
	private iActor_comun iac = new BDPrincipal();
	private String artistaevento;
	private String nombreevento;
	
	public ArrayList<Notificacion> _notificacion = new ArrayList<Notificacion>();
	public Notificaciones() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		obtener_Notificaciones();
		inicializar();
		
		_notificacion.forEach(t -> t.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_notificacion.remove(t);
				vl.remove(t);
				
				
			}
		}));
	}
		
		
	
	//OBTENER NOTIFICACIOENS BASE DE DATOS
	private void obtener_Notificaciones() {
		basededatos.Evento[] eventos = iac.obtener_Notificaciones(Actor_comun.ID);
		for(basededatos.Evento evento: eventos) {
			artistaevento = evento.getCreado_por().getNombre();
			nombreevento = evento.getNombre();
			if(evento.getTipoEvento() == "Festival") {
				this._notificacion.add(new Notificacion("El artista " +artistaevento+" participará en el festival: " + nombreevento));
			}else
				this._notificacion.add(new Notificacion("El artista " +artistaevento+" realizará un concierto " +nombreevento+ " el día " +evento.getFecha()));
	
		}
		
	}
	private void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
	
		for(int i = 0; i< this._notificacion.size(); i++) {
			vl.add(this._notificacion.get(i));
		}

		
		
		
		
	}



	public void eliminarNotificacion() {
		iac.eliminar_Notificacion(Actor_comun.ID, artistaevento, nombreevento);
		
		
	}
}