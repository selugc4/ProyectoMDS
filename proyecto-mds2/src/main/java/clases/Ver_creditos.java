package clases;

import basededatos.Cancion;

public class Ver_creditos extends vistas.VistaVer_creditos {
//	private Label _titulo_CancionL;
//	private Label _titulo_Album;
//	private Label _compositoresL;
//	private Label _productoresL;
//	private Label _interpretesL;
//	public Reproductor_canciones_simple _reproductor_canciones_simple;
//	public Ir_a_cancion _ir_a_cancion;
	
	public Ver_creditos() {
		this.getStyle().set("width", "100%");
		
	}

	public Ver_creditos(Cancion cancion) {
		this.getStyle().set("width", "100%");
		this.getLabel1().setText(cancion.getTitulo() + " -  " +cancion.getTituloCreditos());
		if(cancion.getCancion_de() != null) {
		this.getLabel3().setText(cancion.getCancion_de().getTitutloAlbum());
		}
		this.getLabel5().setText(cancion.getCompositores());
		this.getLabel7().setText(cancion.getProductores());
		this.getLabel9().setText(cancion.getIntepretes());
	}
}