package bds;

import java.util.Vector;
import basededatos.Album;
import basededatos.AlbumDAO;
import basededatos.Artista;
import basededatos.Cancion;
import basededatos.Imagen;

public class BD_Album {
	public BDPrincipal _bd_principal_album;
	public Vector<AlbumDAO> _contiene_album = new Vector<AlbumDAO>();

	public Album[] cargar_Albumes_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Album cargar_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_Albumes_Artista(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_Albumes_Perfil(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Dar_alta_album(String aNombre, Cancion[] aCanciones, Artista[] aArtistas, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Album(int aIdAlbum, String aTituloAlbum, Cancion[] aCanciones, Imagen aImagen, Artista[] aArtistas) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_Albumes_Admin(String aNombre) {
		throw new UnsupportedOperationException();
	}
}