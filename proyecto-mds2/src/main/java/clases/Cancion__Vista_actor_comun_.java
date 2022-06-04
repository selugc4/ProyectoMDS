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
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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
	
	public Cancion__Vista_actor_comun_(basededatos.Cancion  cancion) {
		inicializar();
		
		String cadena = "";
		for(Artista artista : cancion.es_de.toArray()) {
			cadena += artista.getNombre() + ", ";
		}
			if(cadena.equals("")) {
				this.getLabelDebajoArtista().setText("No Asignado");
			}else
			this.getLabelDebajoArtista().setText(cadena);
			
		this.getLabelDebajoTitulo().setText(cancion.getTitulo());
		
		File file = new File(cancion.getCancion_de().getContiene_imagen().getUrl());
		StreamResource imageResource2;
		try {
			InputStream aux2 = FileUtils.openInputStream(file);
			imageResource2 = new StreamResource("fotoSubida.png",() -> aux2); 
			Image image = new Image(imageResource2, "");
			image.setWidth("100px");
			image.setHeight("100px");

			image.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Image> event) {
					rcs.vcre = new Ver_creditos(cancion);
					rcs.reproducir(cancion.getArchivoMultimedia());
					
				}
			});
			VerticalLayout vl = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
			vl.removeAll();
			vl.add(image);
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