package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;

public class Cancion extends vistas.VistaCancion{
//	private Label _cancionL;
//	public Canciones_modificar_y_crear _canciones_modificar_y_crear;
	
	public Cancion() {
		
	}
	
	public Cancion(String nombre) {
		this.getLabel().setText(nombre);
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				for(Cancion cancion: Canciones_modificar_y_crear._canciones) {
					if(cancion.getLabel().getText().equals(getLabel().getText())) {
						Notification.show("Eliminada");
						Canciones_modificar_y_crear._canciones.remove(cancion);
						Vista_dar_alta_album.canciones.actualizar();
					}
					
				}
				
			}

		});
		
	}
}