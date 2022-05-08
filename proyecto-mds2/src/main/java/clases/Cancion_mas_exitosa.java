package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class Cancion_mas_exitosa extends vistas.VistaCancion_mas_exitosa {
//	private Image _imagen_Cancion;
//	private Label _titulo_Cancion;
//	private Label _numero_ReproduccionesL;
//	public Canciones_mas_exitosas _canciones_mas_exitosas;
//
//	public void reproducir() {
//		throw new UnsupportedOperationException();
//	}
	
	public Cancion_mas_exitosa() {
		inicializar();
	}
		

	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getImg().setHeight("100px");;
		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				Notification.show("REPRODUCIR");
				
			}
		});
	
	
	}
}