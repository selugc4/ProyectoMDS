package clases;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import basededatos.Artista;
public class ArtistaBuscador extends vistas.VistaArtistabuscador {
//	private Image _foto_Artista;
//	private Label _nombre_ArtistaL;
//	public Artistas _artistas;

//	public void irArtista() {
//		throw new UnsupportedOperationException();
//	}
	
	public Ver_perfil_del_artista_ajeno vpaj;
	
	public ArtistaBuscador(Artista artista){
		inicializar();
		this.getLabel().setText(artista.getNombre());
		this.getImg().setSrc("imagenes/"+artista.getContiene_imagen().getUrl());
			this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Image> event) {
					VerticalLayout v1 = Usuario_registrado.v1;
					v1.removeAll();
					vpaj = new Ver_perfil_del_artista_ajeno();
					v1.add(vpaj);
					Usuario_registrado.v2.setVisible(false);
					
				}
			});
		this.getVaadinHorizontalLayout1().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				VerticalLayout v1 = Usuario_registrado.v1;
				v1.removeAll();
				vpaj = new Ver_perfil_del_artista_ajeno();
				v1.add(vpaj);
				Usuario_registrado.v2.setVisible(false);
			}
		});
	}
	
	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
	
}

	}