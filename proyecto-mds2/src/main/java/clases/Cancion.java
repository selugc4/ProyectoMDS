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
		
	}
}