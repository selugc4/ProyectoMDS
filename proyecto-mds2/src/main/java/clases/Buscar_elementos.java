package clases;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Buscar_elementos extends vistas.VistaBuscar_elementos {
//	private Label _titulo_BusquedaL;
//	public Cabecera_artista _cabecera_artista;
//	public Cabecera_usuario_registrado _cabecera_usuario_registrado;
	public Albumes_buscador _albumes = new Albumes_buscador();
	public Canciones_busqueda _canciones_busqueda = new Canciones_busqueda();
	public Listas_de_reproduccion_buscador _listas_de_reproduccion_buscador = new Listas_de_reproduccion_buscador(); 
	public Artistas _artistas = new Artistas();
	
	public Buscar_elementos(String value) {
		inicializar();
		VerticalLayout canciones = this.getVerticalCanciones().as(VerticalLayout.class);
		VerticalLayout listas = this.getVerticalListas().as(VerticalLayout.class);
		HorizontalLayout artistas = this.getHorizontalArtistas();
		HorizontalLayout albumes = this.getHorizontalAlbumes();
		VerticalLayout sinresultados = this.getVaadinVerticalLayout1().as(VerticalLayout.class);		
		canciones.removeAll();
		listas.removeAll();
		artistas.removeAll();
		albumes.removeAll();
		if(!value.isEmpty()) {
			canciones.add(_canciones_busqueda);
			artistas.add(_artistas);
			listas.add(_listas_de_reproduccion_buscador);
			albumes.add(_albumes);
			sinresultados.setVisible(false);
		}else {	
		sinresultados.setVisible(true);
		}
	}
	
	private void inicializar() {
		this.getStyle().set("width", "100%");
		
	}
	public Buscar_elementos() {
		inicializar();
	}
	public Albumes_buscador get_albumes() {
		return _albumes;
	}
	public void set_albumes(Albumes_buscador _albumes) {
		this._albumes = _albumes;
	}
	public Canciones_busqueda get_canciones_busqueda() {
		return _canciones_busqueda;
	}
	public void set_canciones_busqueda(Canciones_busqueda _canciones_busqueda) {
		this._canciones_busqueda = _canciones_busqueda;
	}
	public Listas_de_reproduccion_buscador get_listas_de_reproduccion_buscador() {
		return _listas_de_reproduccion_buscador;
	}
	public void set_listas_de_reproduccion_buscador(Listas_de_reproduccion_buscador _listas_de_reproduccion_buscador) {
		this._listas_de_reproduccion_buscador = _listas_de_reproduccion_buscador;
	}
	public Artistas get_artistas() {
		return _artistas;
	}
	public void set_artistas(Artistas _artistas) {
		this._artistas = _artistas;
	}
}