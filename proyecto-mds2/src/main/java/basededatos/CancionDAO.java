/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jesus(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CancionDAO {
	public static Cancion loadCancionByORMID(int idCancion) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadCancionByORMID(session, idCancion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int idCancion) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getCancionByORMID(session, idCancion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadCancionByORMID(session, idCancion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getCancionByORMID(session, idCancion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int idCancion) throws PersistentException {
		try {
			return (Cancion) session.load(basededatos.Cancion.class, new Integer(idCancion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int idCancion) throws PersistentException {
		try {
			return (Cancion) session.get(basededatos.Cancion.class, new Integer(idCancion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.load(basededatos.Cancion.class, new Integer(idCancion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.get(basededatos.Cancion.class, new Integer(idCancion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
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
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy, lockMode);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy, lockMode);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
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
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion createCancion() {
		return new basededatos.Cancion();
	}
	
	public static boolean save(basededatos.Cancion cancion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Cancion cancion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cancion cancion)throws PersistentException {
		try {
			basededatos.Horas[] lHorasss = cancion.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setCancion(null);
			}
			if (cancion.getCancion_de() != null) {
				cancion.getCancion_de().contiene_cancion.remove(cancion);
			}
			
			if (cancion.getContendor_cancion() != null) {
				cancion.getContendor_cancion().contiene_cancion.remove(cancion);
			}
			
			basededatos.Artista[] lEs_des = cancion.es_de.toArray();
			for(int i = 0; i < lEs_des.length; i++) {
				lEs_des[i].tiene.remove(cancion);
			}
			basededatos.Usuario[] lFavorita_des = cancion.favorita_de.toArray();
			for(int i = 0; i < lFavorita_des.length; i++) {
				lFavorita_des[i].favorita.remove(cancion);
			}
			if (cancion.getAdministrado_por() != null) {
				cancion.getAdministrado_por().ultimo_exito.remove(cancion);
			}
			
			return delete(cancion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cancion cancion, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Horas[] lHorasss = cancion.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setCancion(null);
			}
			if (cancion.getCancion_de() != null) {
				cancion.getCancion_de().contiene_cancion.remove(cancion);
			}
			
			if (cancion.getContendor_cancion() != null) {
				cancion.getContendor_cancion().contiene_cancion.remove(cancion);
			}
			
			basededatos.Artista[] lEs_des = cancion.es_de.toArray();
			for(int i = 0; i < lEs_des.length; i++) {
				lEs_des[i].tiene.remove(cancion);
			}
			basededatos.Usuario[] lFavorita_des = cancion.favorita_de.toArray();
			for(int i = 0; i < lFavorita_des.length; i++) {
				lFavorita_des[i].favorita.remove(cancion);
			}
			if (cancion.getAdministrado_por() != null) {
				cancion.getAdministrado_por().ultimo_exito.remove(cancion);
			}
			
			try {
				session.delete(cancion);
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
	
	public static boolean refresh(basededatos.Cancion cancion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Cancion cancion) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByCriteria(CancionCriteria cancionCriteria) {
		Cancion[] cancions = listCancionByCriteria(cancionCriteria);
		if(cancions == null || cancions.length == 0) {
			return null;
		}
		return cancions[0];
	}
	
	public static Cancion[] listCancionByCriteria(CancionCriteria cancionCriteria) {
		return cancionCriteria.listCancion();
	}
}
