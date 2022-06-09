package clases;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.AbstractStreamResource;
import com.vaadin.flow.server.StreamResource;

import basededatos.Artista;
public class Cancion__Vista_actor_comun_ extends Cancion_con_imagen {
//	public Canciones _canciones;
//	public Reproductor_completo _reproductor_completo;
	
	public Reproductor_completo rcs  = Actor_comun.rc;
	
	private basededatos.Cancion cancion;
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
		this.cancion = cancion;
		
		String cadena = "";
		for(int i =0; i < cancion.es_de.toArray().length;i++) {
			if(cancion.es_de.toArray().length-1 != i) {
			cadena += cancion.es_de.toArray()[i].getNombre() + ", ";
			}else {
				cadena += cancion.es_de.toArray()[i].getNombre();
			}
		}
			if(cadena.equals("")) {
				this.getLabelDebajoArtista().setText("Artista no Asignado");
				this.getLabelDchaArtista().setText("Artista no Asignado");
			}else {
			this.getLabelDebajoArtista().setText(cadena);
			this.getLabelDchaArtista().setText(cadena);
			}
		
			this.getLabelDebajoTitulo().setText(cancion.getTitulo());
			this.getLabelDchaTitulo().setText(cancion.getTitulo());
			if(cancion.getCancion_de() != null) {
			this.getLabelAlbum().setText(cancion.getCancion_de().getTitutloAlbum());
			}else
				this.getLabelAlbum().setText("Album no asignado");
		
		this.getImg().setSrc("imagenes/"+cancion.getCancion_de().getContiene_imagen().getUrl());
		this.getImg().setWidth("125px");
		this.getImg().setHeight("125px");
		
		
			this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Image> event) {
					rcs.vcre = new Ver_creditos(cancion);
					rcs._ir_a_cancion = new Ir_a_cancion(cancion);
			
					rcs.reproducir(cancion.getArchivoMultimedia());
					
				}
			});
			
		

	}
		
	
	
	public basededatos.Cancion getCancion() {
		return cancion;
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