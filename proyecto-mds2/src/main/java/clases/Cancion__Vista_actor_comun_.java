package clases;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.server.AbstractStreamResource;
import com.vaadin.flow.server.StreamResource;

import basededatos.Artista;
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
	
	public Cancion__Vista_actor_comun_(String titulo, Artista[] artistas, String url) {
		inicializar();
		
		String cadena = "";
		for(Artista artista : artistas) {
			cadena += artista.getNombre() + ", ";
		}
			if(cadena.equals("")) {
				this.getLabelDebajoArtista().setText("No Asignado");
			}else
			this.getLabelDebajoArtista().setText(cadena);
			
		this.getLabelDebajoTitulo().setText(titulo);
		
		File file = new File(url);
		StreamResource imageResource2;
		try {
			InputStream aux2 = FileUtils.openInputStream(file);
			imageResource2 = new StreamResource("fotoSubida.png",() -> aux2); 
			this.getImg().setSrc(imageResource2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	}
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