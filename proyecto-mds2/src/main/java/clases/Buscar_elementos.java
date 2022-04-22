package clases;
public class Buscar_elementos extends vistas.VistaBuscar_elementos {
//	private Label _titulo_BusquedaL;
//	public Cabecera_artista _cabecera_artista;
//	public Cabecera_usuario_registrado _cabecera_usuario_registrado;
	public Albumes_buscador _albumes;
	public Canciones_busqueda _canciones_busqueda;
	public Listas_de_reproduccion_buscador _listas_de_reproduccion_buscador;
	public Artistas _artistas;
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