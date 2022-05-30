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

public class Lista_ReproduccionDAO {
	public static Lista_Reproduccion loadLista_ReproduccionByORMID(int idLista) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadLista_ReproduccionByORMID(session, idLista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion getLista_ReproduccionByORMID(int idLista) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getLista_ReproduccionByORMID(session, idLista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByORMID(int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadLista_ReproduccionByORMID(session, idLista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion getLista_ReproduccionByORMID(int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getLista_ReproduccionByORMID(session, idLista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByORMID(PersistentSession session, int idLista) throws PersistentException {
		try {
			return (Lista_Reproduccion) session.load(basededatos.Lista_Reproduccion.class, Integer.valueOf(idLista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion getLista_ReproduccionByORMID(PersistentSession session, int idLista) throws PersistentException {
		try {
			return (Lista_Reproduccion) session.get(basededatos.Lista_Reproduccion.class, Integer.valueOf(idLista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByORMID(PersistentSession session, int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_Reproduccion) session.load(basededatos.Lista_Reproduccion.class, Integer.valueOf(idLista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion getLista_ReproduccionByORMID(PersistentSession session, int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_Reproduccion) session.get(basededatos.Lista_Reproduccion.class, Integer.valueOf(idLista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_Reproduccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryLista_Reproduccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_Reproduccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryLista_Reproduccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion[] listLista_ReproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listLista_ReproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion[] listLista_ReproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listLista_ReproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_Reproduccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_Reproduccion as Lista_Reproduccion");
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
	
	public static List queryLista_Reproduccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_Reproduccion as Lista_Reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_Reproduccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion[] listLista_ReproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLista_Reproduccion(session, condition, orderBy);
			return (Lista_Reproduccion[]) list.toArray(new Lista_Reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion[] listLista_ReproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLista_Reproduccion(session, condition, orderBy, lockMode);
			return (Lista_Reproduccion[]) list.toArray(new Lista_Reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadLista_ReproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadLista_ReproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lista_Reproduccion[] lista_Reproduccions = listLista_ReproduccionByQuery(session, condition, orderBy);
		if (lista_Reproduccions != null && lista_Reproduccions.length > 0)
			return lista_Reproduccions[0];
		else
			return null;
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lista_Reproduccion[] lista_Reproduccions = listLista_ReproduccionByQuery(session, condition, orderBy, lockMode);
		if (lista_Reproduccions != null && lista_Reproduccions.length > 0)
			return lista_Reproduccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLista_ReproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateLista_ReproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_ReproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateLista_ReproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_ReproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_Reproduccion as Lista_Reproduccion");
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
	
	public static java.util.Iterator iterateLista_ReproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_Reproduccion as Lista_Reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_Reproduccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion createLista_Reproduccion() {
		return new basededatos.Lista_Reproduccion();
	}
	
	public static boolean save(basededatos.Lista_Reproduccion lista_Reproduccion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(lista_Reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Lista_Reproduccion lista_Reproduccion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(lista_Reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista_Reproduccion lista_Reproduccion)throws PersistentException {
		try {
			basededatos.Usuario[] lSeguidors = lista_Reproduccion.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguir.remove(lista_Reproduccion);
			}
			if (lista_Reproduccion.getAutor() != null) {
				lista_Reproduccion.getAutor().propietario.remove(lista_Reproduccion);
			}
			
			basededatos.Cancion[] lContiene_cancions = lista_Reproduccion.contiene_cancion.toArray();
			for(int i = 0; i < lContiene_cancions.length; i++) {
				lContiene_cancions[i].contendor_cancion.remove(lista_Reproduccion);
			}
			return delete(lista_Reproduccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista_Reproduccion lista_Reproduccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Usuario[] lSeguidors = lista_Reproduccion.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguir.remove(lista_Reproduccion);
			}
			if (lista_Reproduccion.getAutor() != null) {
				lista_Reproduccion.getAutor().propietario.remove(lista_Reproduccion);
			}
			
			basededatos.Cancion[] lContiene_cancions = lista_Reproduccion.contiene_cancion.toArray();
			for(int i = 0; i < lContiene_cancions.length; i++) {
				lContiene_cancions[i].contendor_cancion.remove(lista_Reproduccion);
			}
			try {
				session.delete(lista_Reproduccion);
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
	
	public static boolean refresh(basededatos.Lista_Reproduccion lista_Reproduccion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(lista_Reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Lista_Reproduccion lista_Reproduccion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(lista_Reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_Reproduccion loadLista_ReproduccionByCriteria(Lista_ReproduccionCriteria lista_ReproduccionCriteria) {
		Lista_Reproduccion[] lista_Reproduccions = listLista_ReproduccionByCriteria(lista_ReproduccionCriteria);
		if(lista_Reproduccions == null || lista_Reproduccions.length == 0) {
			return null;
		}
		return lista_Reproduccions[0];
	}
	
	public static Lista_Reproduccion[] listLista_ReproduccionByCriteria(Lista_ReproduccionCriteria lista_ReproduccionCriteria) {
		return lista_ReproduccionCriteria.listLista_Reproduccion();
	}
}
