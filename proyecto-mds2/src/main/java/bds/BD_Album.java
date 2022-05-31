package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Album;
import basededatos.AlbumDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.Imagen;
import basededatos.ImagenDAO;

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

	public void Dar_alta_album(String aNombre, Cancion[] aCanciones, Artista[] aArtistas, String aImagen, String fechaedicion) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.createAlbum();
			album.setTitutloAlbum(aNombre);
			Imagen img = ImagenDAO.createImagen();
			img.setUrl(aImagen);
			ImagenDAO.save(img);
			album.setContiene_imagen(img);
			album.setFechaEdicion(fechaedicion);
			for (int i = 0; i < aArtistas.length;i++) {
				Artista aux = ArtistaDAO.loadArtistaByQuery("Nombre='"+aArtistas[i]+"'", aImagen);
				if(aux == null) {
					continue;
				}else {
					album.autor.add(aux);
				}
			}
				AlbumDAO.save(album);
				t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

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