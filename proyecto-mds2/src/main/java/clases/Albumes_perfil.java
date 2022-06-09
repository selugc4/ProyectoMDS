package clases;
public class Albumes_perfil extends Albumes_buscador {
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
//	public ContenedorAlbumes _contenedorAlbumes;
	
	public Albumes_perfil() {
		actualizar();
	}

	public Albumes_perfil(basededatos.Album[] albumes) {
		inicializarPerfil();
		for(basededatos.Album album : albumes) {
			_album.add(new Album(album));
		}
		Mostrar_Lista();
	}

	private void inicializarPerfil() {
		this.getStyle().set("width", "100%");
		
	}	
	

}