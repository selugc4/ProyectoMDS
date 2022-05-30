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

public class AdministradorDAO {
	public static Administrador loadAdministradorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Administrador) session.load(basededatos.Administrador.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Administrador) session.get(basededatos.Administrador.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.load(basededatos.Administrador.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.get(basededatos.Administrador.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Administrador as Administrador");
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
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy, lockMode);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Administrador as Administrador");
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
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador createAdministrador() {
		return new basededatos.Administrador();
	}
	
	public static boolean save(basededatos.Administrador administrador) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Administrador administrador) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Administrador administrador)throws PersistentException {
		try {
			if (administrador.getContiene_imagen() != null) {
				administrador.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = administrador.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(administrador);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = administrador.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = administrador.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(administrador);
			}
			basededatos.Evento[] lRecibe_notificacions = administrador.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(administrador);
			}
			basededatos.Cancion[] lFavoritas = administrador.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(administrador);
			}
			basededatos.Cancion[] lUltimo_exitos = administrador.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = administrador.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = administrador.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(administrador);
			}
			return delete(administrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Administrador administrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (administrador.getContiene_imagen() != null) {
				administrador.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = administrador.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(administrador);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = administrador.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = administrador.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(administrador);
			}
			basededatos.Evento[] lRecibe_notificacions = administrador.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(administrador);
			}
			basededatos.Cancion[] lFavoritas = administrador.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(administrador);
			}
			basededatos.Cancion[] lUltimo_exitos = administrador.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = administrador.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = administrador.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(administrador);
			}
			try {
				session.delete(administrador);
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
	
	public static boolean refresh(basededatos.Administrador administrador) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Administrador administrador) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		Administrador[] administradors = listAdministradorByCriteria(administradorCriteria);
		if(administradors == null || administradors.length == 0) {
			return null;
		}
		return administradors[0];
	}
	
	public static Administrador[] listAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		return administradorCriteria.listAdministrador();
	}
}
