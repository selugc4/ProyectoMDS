package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.CancionDAO;
import bds.iAdministrador;

public class Cancion_para_album extends vistas.VistaCancion_para_album{
//	private Label _titulo_CancionL;
//	private Button _anadir_cancion_a_albumB;
//	public Canciones_para_album _canciones_para_album;
public int tipo;
	public Cancion_para_album() {
		
	}
	public Cancion_para_album(String texto, int iD, int tipo) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(texto);
		this.tipo = tipo;
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				boolean nocontiene = true;
				if(tipo == 0) {
				for(Cancion cancion: Vista_dar_alta_album.canciones._canciones) {
					if(cancion.getLabel().toString().equals(texto)) {
						nocontiene = false;
					}
				}
				if(nocontiene == true) {
					Vista_dar_alta_album.canciones.agregarCancion(getLabel().getText(), iD);
				}
				}
				else {
					for(Cancion cancion: Vista_modificar_album.canciones._canciones) {
						if(cancion.getLabel().toString().equals(texto)) {
							nocontiene = false;
						}
				}
					if(nocontiene == true) {
						Vista_modificar_album.canciones.agregarCancion(getLabel().getText(), iD);
					}
				}
			}});
		
		
		}
}