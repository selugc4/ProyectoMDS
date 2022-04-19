package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class Notificacion extends vistas.VistaNotificacion {
//	private Label _notificacionL;
//	private Button _eliminar_NotificacionB;
//	public Notificaciones _notificaciones;
	
	public Notificacion(String nombre) {
		this.getLabel().setText(nombre);
		
	
	}
}