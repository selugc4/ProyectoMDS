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

public class HorasDAO {
	public static Horas loadHorasByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadHorasByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas getHorasByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getHorasByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas loadHorasByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadHorasByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas getHorasByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getHorasByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas loadHorasByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Horas) session.load(basededatos.Horas.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas getHorasByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Horas) session.get(basededatos.Horas.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas loadHorasByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Horas) session.load(basededatos.Horas.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas getHorasByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Horas) session.get(basededatos.Horas.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoras(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryHoras(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoras(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryHoras(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas[] listHorasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listHorasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas[] listHorasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listHorasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoras(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Horas as Horas");
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
	
	public static List queryHoras(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Horas as Horas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Horas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas[] listHorasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHoras(session, condition, orderBy);
			return (Horas[]) list.toArray(new Horas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas[] listHorasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHoras(session, condition, orderBy, lockMode);
			return (Horas[]) list.toArray(new Horas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas loadHorasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadHorasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas loadHorasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadHorasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas loadHorasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Horas[] horases = listHorasByQuery(session, condition, orderBy);
		if (horases != null && horases.length > 0)
			return horases[0];
		else
			return null;
	}
	
	public static Horas loadHorasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Horas[] horases = listHorasByQuery(session, condition, orderBy, lockMode);
		if (horases != null && horases.length > 0)
			return horases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHorasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateHorasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHorasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateHorasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHorasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Horas as Horas");
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
	
	public static java.util.Iterator iterateHorasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Horas as Horas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Horas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas createHoras() {
		return new basededatos.Horas();
	}
	
	public static boolean save(basededatos.Horas horas) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(horas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Horas horas) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(horas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Horas horas)throws PersistentException {
		try {
			if (horas.getCancion() != null) {
				horas.getCancion().horass.remove(horas);
			}
			
			if (horas.getUsuario() != null) {
				horas.getUsuario().horass.remove(horas);
			}
			
			return delete(horas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Horas horas, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (horas.getCancion() != null) {
				horas.getCancion().horass.remove(horas);
			}
			
			if (horas.getUsuario() != null) {
				horas.getUsuario().horass.remove(horas);
			}
			
			try {
				session.delete(horas);
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
	
	public static boolean refresh(basededatos.Horas horas) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(horas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Horas horas) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(horas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Horas loadHorasByCriteria(HorasCriteria horasCriteria) {
		Horas[] horases = listHorasByCriteria(horasCriteria);
		if(horases == null || horases.length == 0) {
			return null;
		}
		return horases[0];
	}
	
	public static Horas[] listHorasByCriteria(HorasCriteria horasCriteria) {
		return horasCriteria.listHoras();
	}
}
