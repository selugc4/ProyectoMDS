package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Path;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
	
	public Cancion__Vista_Cibernauta_(Cancion cancion) {
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
			this.getLabelDebajoArtista().setText(cancion.es_de.toString());
		}
		
		
	
		
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {					
					
				try {
					FileInputStream aux = new FileInputStream(new File(cancion.getArchivoMultimedia()));
					AbstractStreamResource resource = new StreamResource("cambioCancion.png", () -> aux);
					rc.getElement().setAttribute("src", resource);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			
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