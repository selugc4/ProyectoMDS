/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ArtistaDAO {
	public static Artista loadArtistaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadArtistaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getArtistaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadArtistaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getArtistaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy, lockMode);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy, lockMode);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista createArtista() {
		return new basededatos.Artista();
	}
	
	public static boolean save(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista)throws PersistentException {
		try {
			basededatos.Cancion[] lTienes = artista.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].es_de.remove(artista);
			}
			basededatos.Album[] lPropietario_albums = artista.propietario_album.toArray();
			for(int i = 0; i < lPropietario_albums.length; i++) {
				lPropietario_albums[i].autor.remove(artista);
			}
			basededatos.Evento[] lCreas = artista.crea.toArray();
			for(int i = 0; i < lCreas.length; i++) {
				lCreas[i].setCreado_por(null);
			}
			basededatos.Estilo[] lPerteneces = artista.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].cantado_por.remove(artista);
			}
			if (artista.getContiene_imagen() != null) {
				artista.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = artista.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(artista);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = artista.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = artista.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(artista);
			}
			basededatos.Evento[] lRecibe_notificacions = artista.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(artista);
			}
			basededatos.Cancion[] lFavoritas = artista.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(artista);
			}
			basededatos.Cancion[] lUltimo_exitos = artista.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = artista.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = artista.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(artista);
			}
			return delete(artista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Cancion[] lTienes = artista.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].es_de.remove(artista);
			}
			basededatos.Album[] lPropietario_albums = artista.propietario_album.toArray();
			for(int i = 0; i < lPropietario_albums.length; i++) {
				lPropietario_albums[i].autor.remove(artista);
			}
			basededatos.Evento[] lCreas = artista.crea.toArray();
			for(int i = 0; i < lCreas.length; i++) {
				lCreas[i].setCreado_por(null);
			}
			basededatos.Estilo[] lPerteneces = artista.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].cantado_por.remove(artista);
			}
			if (artista.getContiene_imagen() != null) {
				artista.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = artista.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(artista);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = artista.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = artista.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(artista);
			}
			basededatos.Evento[] lRecibe_notificacions = artista.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(artista);
			}
			basededatos.Cancion[] lFavoritas = artista.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(artista);
			}
			basededatos.Cancion[] lUltimo_exitos = artista.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = artista.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = artista.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(artista);
			}
			try {
				session.delete(artista);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		Artista[] artistas = listArtistaByCriteria(artistaCriteria);
		if(artistas == null || artistas.length == 0) {
			return null;
		}
		return artistas[0];
	}
	
	public static Artista[] listArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		return artistaCriteria.listArtista();
	}
}
