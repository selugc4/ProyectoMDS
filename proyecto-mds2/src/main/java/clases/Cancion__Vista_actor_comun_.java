package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;

public class Cancion__Vista_actor_comun_ extends Cancion_con_imagen {
//	public Canciones _canciones;
//	public Reproductor_completo _reproductor_completo;
	
	public Reproductor_canciones_simple rcs  = Actor_comun.rc;
	public Cancion__Vista_actor_comun_() {
		inicializar();
		 
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				rcs.setSource("http://www.groovydomain.com/gallery/music/ORIGINAL/Queen/Greatest%20Hits%20(Parlophone)/16%20We%20Will%20Rock%20You.mp3");
				
			}
		});
			
		
	}
	
	void inicializar() {
	this.getStyle().set("width", "100%");
	this.getLabelAlbum().setVisible(false);
	this.getLabelDchaArtista().setVisible(false);
	this.getLabelDchaTitulo().setVisible(false);
	this.getLabelDuracion().setVisible(false);
	this.getVaadinButton().setVisible(false);

	}
}