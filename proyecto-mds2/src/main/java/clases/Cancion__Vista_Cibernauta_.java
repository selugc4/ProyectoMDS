package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.AbstractStreamResource;
import com.vaadin.flow.server.StreamResource;

import basededatos.Cancion;
import proyectoMDS2.MainView;

public class Cancion__Vista_Cibernauta_ extends Cancion_con_imagen {
//	public Ultimos_exitos _ultimos_exitos;
//	public Reproductor_canciones_simple _reproductor_canciones_simple;
	
	public Reproductor_canciones_simple rc = Cibernauta.rcs;
	public Cancion__Vista_Cibernauta_() {
		inicializar();
		
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {				
				rc.setSource("http://www.groovydomain.com/gallery/music/ORIGINAL/Queen/Greatest%20Hits%20(Parlophone)/16%20We%20Will%20Rock%20You.mp3");			
			}});
		
	}
	
	public Cancion__Vista_Cibernauta_(Cancion cancion)  {
		inicializar();
		
		if(cancion.getCancion_de() == null ) {
			this.getLabelAlbum().setText("No asignado");
		}else {
		this.getLabelAlbum().setText(cancion.getCancion_de().getTitutloAlbum());
		}
		this.getLabelDebajoTitulo().setText(cancion.getTitulo());
		if(cancion.es_de.isEmpty()) {
			this.getLabelDebajoArtista().setText("No asignado");
		}else {
			this.getLabelDebajoArtista().setText(cancion.es_de.toArray()[0].getNombre());
		}

	

		if(cancion.getCancion_de() != null) {
//			File file = new File(cancion.getCancion_de().getContiene_imagen().getUrl());
//			InputStream aux2;
//			StreamResource imageResource2 = null;
//			
//		try {
//			aux2 = new FileInputStream(file);
//			imageResource2 = new StreamResource("ultimo-exito",() -> aux2); 
////			Image image = new Image(imageResource2, "");
////			image.setWidth("100px");
////			image.setHeight("100px");
////			
//		
////			image.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
////				
////				@Override
////				public void onComponentEvent(ClickEvent<Image> event) {
////					rc.vcre = new Ver_creditos(cancion);
////					rc.reproducir(cancion.getArchivoMultimedia());
////					
////				}
////		
////			});
//			
//
////			
////			VerticalLayout vl = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
////			vl.removeAll();
////			vl.add(image);
////		
////			
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.getImg().setSrc("imagenes/" + cancion.getCancion_de().getContiene_imagen().getUrl());
		this.getImg().setHeight("100px");
		this.getImg().setWidth("100px");
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Image> event) {
			rc.vcre = new Ver_creditos(cancion);
			rc.reproducir(cancion.getArchivoMultimedia());
			
		}});

		}else {
				this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Image> event) {
					rc.vcre = new Ver_creditos(cancion);
					rc.reproducir(cancion.getArchivoMultimedia());
				}
			});
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