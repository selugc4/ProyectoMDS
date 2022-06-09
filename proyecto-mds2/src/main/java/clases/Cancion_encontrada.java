package clases;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Cancion;
import bds.BDPrincipal;
import bds.BD_Administrador;
import bds.iAdministrador;
public class Cancion_encontrada extends vistas.VistaCancion_encontrada {
//	private Label _titulo_CancionL;
//	private Button _anadir_a_la_vista_de_cibernautaB;
//	public Canciones_buscadas _canciones_buscadas;

	public Cancion_encontrada(Cancion cancion) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(cancion.getTitulo());
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				boolean nocontiene = true;
				if(!Vista_administracion.cue.uea.lista.isEmpty()) {
				for(Ultimo_exito exito: Vista_administracion.cue.uea.lista) {
					if(exito.id == cancion.getIdCancion()) {
						Notification.show("Cancion ya agregada");
						nocontiene = false;
					}
				}
			}
				if(nocontiene == true) {
					Vista_administracion.cue.uea.agregar(cancion);
					Anadir_a_la_vista_de_cibernauta(cancion.getIdCancion());
					Vista_administracion.cue.uea.obtenerLista();
				}
			}
		});
	}

	public void Anadir_a_la_vista_de_cibernauta(int id) {
		iAdministrador iadmin = new BDPrincipal();
		iadmin.Anadir_a_la_vista_de_cibernauta(id);
	}
}