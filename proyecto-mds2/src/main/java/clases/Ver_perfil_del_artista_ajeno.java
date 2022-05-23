package clases;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_del_artista_ajeno extends Ver_perfil_ajeno {
//	public Cancion_busqueda _cancion_busqueda;
//	public Ir_a_cancion _ir_a_cancion;
//	public Conciertos_y_festivales _conciertos_y_festivales;
//	public Canciones_mas_exitosas _canciones_mas_exitosas;
//	public Artistas _artistas;
//	public Albumes_perfil _albumes_perfil;
//	public ContenedorListas_Con_Sus_Canciones _contenedorListas_Con_Sus_Canciones;
//	public ContenedorSus_Listas _contenedorSus_Listas;

//	public void Seguir_artista() {
//		throw new UnsupportedOperationException();
//	}
	
	public Canciones_mas_exitosas cms = new Canciones_mas_exitosas();
	public Artistas artistas = new Artistas();
	public ContenedorAlbumes ca = new ContenedorAlbumes();
	public Conciertos_y_festivales cyf = new Conciertos_y_festivales();
	public ContenedorListas_Con_Sus_Canciones clcsc = new ContenedorListas_Con_Sus_Canciones();
	

	public Ver_perfil_del_artista_ajeno() {
		inicializar();
	}

	private void inicializar() {
	this.getStyle().set("width", "100%");
	if(seguido()) {
		this.getVaadinButton().setVisible(false);
		
	}else {
		this.getVaadinButton1().setVisible(false);
	}
	
	
	
	VerticalLayout vl2 = this.getVerticalListasSusCanciones().as(VerticalLayout.class);
	vl2.add(clcsc);
	HorizontalLayout hl = this.getHorizontalAlbumes();
	hl.add(ca);
	VerticalLayout vl3 = this.getVerticalExitosas().as(VerticalLayout.class);
	vl3.add(cms);
	VerticalLayout vl4 = this.getVerticalConciertos().as(VerticalLayout.class);
	vl4.add(cyf);
	HorizontalLayout hl2 = this.getHorizontalArtistas();
	hl2.add(artistas);
	
	}

	
	private boolean seguido() {
		return false;
	}
}