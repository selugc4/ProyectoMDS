package clases;

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


	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
	}
}