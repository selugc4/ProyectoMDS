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
		

	public Cancion_mas_exitosa(basededatos.Cancion cancion) {
		this.getImg().setSrc("imagenes/"+cancion.getCancion_de().getContiene_imagen().getUrl());
		this.getLabel().setText(cancion.getTitulo());
		this.getLabel1().setVisible(false);
		inicializar();
		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				Actor_comun.rc.reproducir(cancion.getArchivoMultimedia());
				
			}
		});
	}


	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getImg().setHeight("100px");;
	
	
	
	}
}