package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iAdministrador;

public class Album_administrador extends Album {
//	private Button _eliminar_AlbumB;
//	private Button _modificar_AlbumB;
//	public Albumes_administrador _albumes_administrador;
	public Vista_modificar_album _vista_modificar_album;
	
	
	public Album_administrador (basededatos.Album album) {
		inicializar(album);
	}


	private void inicializar(basededatos.Album album) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(album.getTitutloAlbum());
		this.getImg().setSrc("imagenes/" + album.getContiene_imagen().getUrl());
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				Administrador.v1.removeAll();
				_vista_album = new Vista_album(album);
				Administrador.v1.add(_vista_album);
				Administrador.v2.setVisible(false);
			}			
		});
		this.getVaadinButton().setVisible(true);
		this.getVaadinButton1().setVisible(true);
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Administrador.v1.removeAll();
				_vista_modificar_album = new Vista_modificar_album(album.getIdAlbum());
				Administrador.v1.add(_vista_modificar_album);
				Administrador.v2.setVisible(false);
				
			}
		});
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Eliminar_album(album);	
			}
		});
	}
	public void Eliminar_album(basededatos.Album album) {
		iAdministrador iadmin = new BDPrincipal();
		iadmin.eliminar_Album(album.getIdAlbum());
	}
//
//	public void modificar_album() {
//		throw new UnsupportedOperationException();
//	}
}