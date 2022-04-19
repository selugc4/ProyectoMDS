package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Notificaciones extends vistas.VistaNotificaciones {
//	public Cabecera_comun _cabecera_comun;
//	public Vector<Notificacion> _notificacion = new Vector<Notificacion>();
	
	public ArrayList<Notificacion> _notificacion = new ArrayList<Notificacion>();
	public Notificaciones() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		ObtenerNotificaciones();
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
	private void ObtenerNotificaciones() {
		for(int i = 0; i< 5; i++) {
			this._notificacion.add(new Notificacion("Hola"));
		}
		
	}
	private void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
	
		for(int i = 0; i< this._notificacion.size(); i++) {
			vl.add(this._notificacion.get(i));
		}

		
		
		
		
	}
}