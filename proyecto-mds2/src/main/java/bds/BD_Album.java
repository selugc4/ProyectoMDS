package bds;

import java.time.LocalDate;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Album;
import basededatos.AlbumDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Imagen;
import basededatos.ImagenDAO;

public class BD_Album {
	public BDPrincipal _bd_principal_album;
	public Vector<AlbumDAO> _contiene_album = new Vector<AlbumDAO>();

	public Album[] cargar_Albumes_Buscador(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Album[]albumes = AlbumDAO.listAlbumByQuery("TitutloAlbum='"+aNombre+"'", null);
			t.commit();
			return albumes;
		}
		catch (Exception e) {
			t.rollback();
			return null;
		}
	}

	public Album cargar_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_Albumes_Artista(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.loadArtistaByORMID(iD);
			Album[] albumes = artista.propietario_album.toArray();
				t.commit();
				return albumes;
		}
		catch (Exception e) {
			t.rollback();
			return null;
		}

	}

	public Album[] cargar_Albumes_Perfil(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Dar_alta_album(String aNombre, Cancion[] aCanciones, Artista[] aArtistas, String aImagen, String fechaedicion) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.createAlbum();
			album.setTitutloAlbum(aNombre);
			album.setFechaEdicion(fechaedicion);
			Imagen img = ImagenDAO.createImagen();
			img.setUrl(aImagen);
			ImagenDAO.save(img);
			album.setContiene_imagen(img);	
			for (int i = 0; i < aArtistas.length;i++) {
				album.autor.add(aArtistas[i]);
				
			}
			
			
			for(int i = 0; i< aCanciones.length; i++) {
				album.contiene_cancion.add(aCanciones[i]);
				
			}
			
				AlbumDAO.save(album);
				t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

	}

	public void eliminar_Album(int aIdAlbum) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.getAlbumByORMID(aIdAlbum);
			album.autor.clear();
			Artista[]artistas = album.autor.toArray();
			for(Artista artista: artistas) {
				artista.propietario_album.remove(album);
			}
			AlbumDAO.delete(album);
			ImagenDAO.delete(album.getContiene_imagen());
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
	}

	public void Modificar_Album(int aIdAlbum, String aTituloAlbum, Cancion[] aCanciones, String aImagen, Artista[] aArtistas) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.loadAlbumByORMID(aIdAlbum);
			album.setTitutloAlbum(aTituloAlbum);
			Imagen img = ImagenDAO.createImagen();
			img.setUrl(aImagen);
			ImagenDAO.save(img);
			album.setContiene_imagen(img);	
			for (int i = 0; i < aArtistas.length;i++) {
				album.autor.add(aArtistas[i]);
			}
			album.contiene_cancion.clear();
			Cancion[]canciones = album.contiene_cancion.toArray();
			for(Cancion cancion: canciones) {
				album.contiene_cancion.remove(cancion);
			}
			for(int i = 0; i< aCanciones.length; i++) {
				album.contiene_cancion.add(aCanciones[i]);
			}
				t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

	}

	public Album[] cargar_Albumes_Admin(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Album[]albumes = AlbumDAO.listAlbumByQuery("TitutloAlbum='"+aNombre+"'", null);
			t.commit();
			return albumes;
		}
		catch (Exception e) {
			t.rollback();
			return null;
		}
	}
}