package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;

import basededatos.CancionDAO;
import bds.iAdministrador;

public class Cancion_para_album extends vistas.VistaCancion_para_album{
//	private Label _titulo_CancionL;
//	private Button _anadir_cancion_a_albumB;
//	public Canciones_para_album _canciones_para_album;

	public Cancion_para_album() {
		
	}
	public Cancion_para_album(String texto) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(texto);
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				boolean contiene = true;
				for(Cancion cancion: Vista_dar_alta_album.canciones._canciones) {
					if(cancion.getLabel().toString().equals(texto)) {
						contiene = false;
					}
				}
				if(contiene == true) {
					Vista_dar_alta_album.canciones.agregarCancion(getLabel().getText());
				}
			}});
	}

//	public void Anadir_cancion_a_album() {
//		throw new UnsupportedOperationException();
//	}
}