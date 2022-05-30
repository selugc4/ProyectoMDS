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

public class EventoDAO {
	public static Evento loadEventoByORMID(int idEvento) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadEventoByORMID(session, idEvento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(int idEvento) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getEventoByORMID(session, idEvento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadEventoByORMID(session, idEvento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getEventoByORMID(session, idEvento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(PersistentSession session, int idEvento) throws PersistentException {
		try {
			return (Evento) session.load(basededatos.Evento.class, Integer.valueOf(idEvento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(PersistentSession session, int idEvento) throws PersistentException {
		try {
			return (Evento) session.get(basededatos.Evento.class, Integer.valueOf(idEvento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(PersistentSession session, int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Evento) session.load(basededatos.Evento.class, Integer.valueOf(idEvento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(PersistentSession session, int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Evento) session.get(basededatos.Evento.class, Integer.valueOf(idEvento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryEvento(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryEvento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Evento as Evento");
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
	
	public static List queryEvento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Evento as Evento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvento(session, condition, orderBy);
			return (Evento[]) list.toArray(new Evento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvento(session, condition, orderBy, lockMode);
			return (Evento[]) list.toArray(new Evento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Evento[] eventos = listEventoByQuery(session, condition, orderBy);
		if (eventos != null && eventos.length > 0)
			return eventos[0];
		else
			return null;
	}
	
	public static Evento loadEventoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Evento[] eventos = listEventoByQuery(session, condition, orderBy, lockMode);
		if (eventos != null && eventos.length > 0)
			return eventos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Evento as Evento");
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
	
	public static java.util.Iterator iterateEventoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Evento as Evento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento createEvento() {
		return new basededatos.Evento();
	}
	
	public static boolean save(basededatos.Evento evento) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Evento evento) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Evento evento)throws PersistentException {
		try {
			if (evento.getCreado_por() != null) {
				evento.getCreado_por().crea.remove(evento);
			}
			
			basededatos.Usuario[] lGenera_notificacions = evento.genera_notificacion.toArray();
			for(int i = 0; i < lGenera_notificacions.length; i++) {
				lGenera_notificacions[i].recibe_notificacion.remove(evento);
			}
			return delete(evento);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Evento evento, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (evento.getCreado_por() != null) {
				evento.getCreado_por().crea.remove(evento);
			}
			
			basededatos.Usuario[] lGenera_notificacions = evento.genera_notificacion.toArray();
			for(int i = 0; i < lGenera_notificacions.length; i++) {
				lGenera_notificacions[i].recibe_notificacion.remove(evento);
			}
			try {
				session.delete(evento);
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
	
	public static boolean refresh(basededatos.Evento evento) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Evento evento) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByCriteria(EventoCriteria eventoCriteria) {
		Evento[] eventos = listEventoByCriteria(eventoCriteria);
		if(eventos == null || eventos.length == 0) {
			return null;
		}
		return eventos[0];
	}
	
	public static Evento[] listEventoByCriteria(EventoCriteria eventoCriteria) {
		return eventoCriteria.listEvento();
	}
}
