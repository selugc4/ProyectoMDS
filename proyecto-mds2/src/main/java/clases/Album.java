package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Album extends vistas.VistaAlbum {
//	private Image _foto_Album;
//	private Label _titulo_AlbumL;
//	public Albumes_buscador _albumes;
	public Vista_album _vista_album = new Vista_album();

//	public void irAlbum() {
//		throw new UnsupportedOperationException();
//	}
	
	public Vista_album va = new Vista_album();
	public Album() {
		inicializar();
		
	}
	
	
	public Album(String string) {
		this.getLabel().setText(string);
		inicializar();
	}



	public Album(basededatos.Album album) {
		this.getLabel().setText(album.getTitutloAlbum());
		this.getImg().setSrc("imagenes/"+album.getContiene_imagen().getUrl());
		inicializar();
		
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				_vista_album = new Vista_album(album);
				
			}
		});
	}


	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
	}
}