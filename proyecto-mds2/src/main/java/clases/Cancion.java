package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;

public class Cancion extends vistas.VistaCancion{
//	private Label _cancionL;
//	public Canciones_modificar_y_crear _canciones_modificar_y_crear;
	
	private int idCancion;
	public Cancion() {
	
	}
	
	public Cancion(String nombre, int iD, int tipo) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(nombre);
		this.idCancion = iD;
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(tipo == 0) {
					for(Cancion cancion: Creacion_lista.cmc._canciones) {
						if(cancion.getLabel().getText().equals(getLabel().getText())) {
							Notification.show("Eliminada");
							Creacion_lista.cmc._canciones.remove(cancion);
							Creacion_lista.cmc.actualizar();
							}
					}
				}else if(tipo == 1){
					for(Cancion cancion: Edicion_de_lista.cmc._canciones) {
						if(cancion.getLabel().getText().equals(getLabel().getText())) {
							Notification.show("Eliminada");
							Edicion_de_lista.cmc._canciones.remove(cancion);
							Edicion_de_lista.cmc.actualizar();
							}
					}
				}
				else if(tipo == 3) {
					for(Cancion cancion: Vista_dar_alta_album.canciones._canciones) {
						if(cancion.getLabel().getText().equals(getLabel().getText())) {
							Notification.show("Eliminada");
							Vista_dar_alta_album.canciones._canciones.remove(cancion);
							break;
						}
					}
					Vista_dar_alta_album.canciones.actualizar();
				}
				else {
					for(Cancion cancion: Vista_modificar_album.canciones._canciones) {
						if(cancion.getLabel().getText().equals(getLabel().getText())) {
							Notification.show("Eliminada");
							Vista_modificar_album.canciones._canciones.remove(cancion);
							break;
						}
					}
					Vista_modificar_album.canciones.actualizar();
				}					
			}

		});
		
	}

	public int getIdCancion() {
		return idCancion;
	}
	
}