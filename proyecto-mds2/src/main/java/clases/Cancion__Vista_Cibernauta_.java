package clases;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import proyectoMDS2.MainView;

public class Cancion__Vista_Cibernauta_ extends Cancion_con_imagen {
//	public Ultimos_exitos _ultimos_exitos;
//	public Reproductor_canciones_simple _reproductor_canciones_simple;
	
	public Reproductor_canciones_simple rcs  = Cibernauta.rcs;
	public Cancion__Vista_Cibernauta_() {
		inicializar();
		
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {				
				rcs.setSource("http://www.groovydomain.com/gallery/music/ORIGINAL/Queen/Greatest%20Hits%20(Parlophone)/16%20We%20Will%20Rock%20You.mp3");			
			}});
		
	}
	
	void inicializar() {
	this.getStyle().set("width", "100%");

	this.getLabel2().setVisible(false);
	this.getLabel3().setVisible(false);
	this.getVaadinButton().setVisible(false);
	}
}