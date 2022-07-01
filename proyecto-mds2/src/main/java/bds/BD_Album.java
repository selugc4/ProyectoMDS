package bds;

import java.time.LocalDate;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Album;
import basededatos.AlbumCriteria;
import basededatos.AlbumDAO;
import basededatos.Artista;
import basededatos.ArtistaCriteria;
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
			AlbumCriteria albumCriteria = new AlbumCriteria();
			albumCriteria.titutloAlbum.like("%"+aNombre+"%");
			
			Album[]albumes = AlbumDAO.listAlbumByCriteria(albumCriteria);
			t.commit();
			return albumes;
		}
		catch (Exception e) {
			t.rollback();
			return null;
		}
	}

	public Album cargar_Album(int aIdAlbum) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.getAlbumByORMID(aIdAlbum);
			t.commit();
			return album;
		}
		catch (Exception e) {
			t.rollback();
			return null;
		}
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
				for(int j = 0; j< aCanciones.length; j++) {
					aCanciones[j].es_de.add(aArtistas[i]);
				}
				
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
			if(album.autor != null) {
			Artista[]artistas = album.autor.toArray();
			for(Artista artista: artistas) {
				artista.propietario_album.remove(album);
			}
			}
			Cancion[] canciones = album.contiene_cancion.toArray();
			for(Cancion cancion: canciones) {
				album.contiene_cancion.remove(cancion);
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
			for(int j = 0; j< aCanciones.length; j++) {
			if(aCanciones[j].es_de != null) {
				Artista[] artistas = aCanciones[j].es_de.toArray();
				for(Artista artista: artistas) {
					aCanciones[j].es_de.remove(artista);
					ArtistaDAO.save(artista);
					CancionDAO.save(aCanciones[j]);
				}
			}
			}
			if(album.autor != null) {
			Artista[] artistas = album.autor.toArray();
			for(Artista artista: artistas) {
				album.autor.remove(artista);
				ArtistaDAO.save(artista);
			}
			}
			for (int i = 0; i < aArtistas.length;i++) {
				album.autor.add(aArtistas[i]);
				for(int j = 0; j< aCanciones.length; j++) {
					aCanciones[j].es_de.add(aArtistas[i]);
					ArtistaDAO.save(aArtistas[i]);
					CancionDAO.save(aCanciones[j]);
				}
			}
			album.contiene_cancion.clear();
			Cancion[]canciones = album.contiene_cancion.toArray();
			for(Cancion cancion: canciones) {
				album.contiene_cancion.remove(cancion);
				CancionDAO.save(cancion);
			}
			for(int i = 0; i< aCanciones.length; i++) {
				album.contiene_cancion.add(aCanciones[i]);
				CancionDAO.save(aCanciones[i]);
			}
			AlbumDAO.save(album);
				t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

	}

	public Album[] cargar_Albumes_Admin(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			AlbumCriteria ac = new AlbumCriteria();
			ac.titutloAlbum.like("%"+aNombre+"%");
			Album[]albumes = AlbumDAO.listAlbumByCriteria(ac);
			t.commit();
			return albumes;
		}
		catch (Exception e) {
			t.rollback();
			return null;
		}
	}
}