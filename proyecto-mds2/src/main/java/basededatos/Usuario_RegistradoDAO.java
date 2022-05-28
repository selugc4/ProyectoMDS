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

public class Usuario_RegistradoDAO {
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getUsuario_RegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getUsuario_RegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario_Registrado) session.load(basededatos.Usuario_Registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario_Registrado) session.get(basededatos.Usuario_Registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado) session.load(basededatos.Usuario_Registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado) session.get(basededatos.Usuario_Registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryUsuario_Registrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryUsuario_Registrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Registrado as Usuario_Registrado");
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
	
	public static List queryUsuario_Registrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Registrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_Registrado(session, condition, orderBy);
			return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_Registrado(session, condition, orderBy, lockMode);
			return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByQuery(session, condition, orderBy);
		if (usuario_Registrados != null && usuario_Registrados.length > 0)
			return usuario_Registrados[0];
		else
			return null;
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuario_Registrados != null && usuario_Registrados.length > 0)
			return usuario_Registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Registrado as Usuario_Registrado");
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
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Registrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado createUsuario_Registrado() {
		return new basededatos.Usuario_Registrado();
	}
	
	public static boolean save(basededatos.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_Registrado usuario_Registrado)throws PersistentException {
		try {
			if (usuario_Registrado.getContiene_imagen() != null) {
				usuario_Registrado.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = usuario_Registrado.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(usuario_Registrado);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = usuario_Registrado.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = usuario_Registrado.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(usuario_Registrado);
			}
			basededatos.Evento[] lRecibe_notificacions = usuario_Registrado.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(usuario_Registrado);
			}
			basededatos.Cancion[] lFavoritas = usuario_Registrado.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(usuario_Registrado);
			}
			basededatos.Cancion[] lUltimo_exitos = usuario_Registrado.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = usuario_Registrado.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = usuario_Registrado.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(usuario_Registrado);
			}
			return delete(usuario_Registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_Registrado usuario_Registrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (usuario_Registrado.getContiene_imagen() != null) {
				usuario_Registrado.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = usuario_Registrado.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(usuario_Registrado);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = usuario_Registrado.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = usuario_Registrado.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(usuario_Registrado);
			}
			basededatos.Evento[] lRecibe_notificacions = usuario_Registrado.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(usuario_Registrado);
			}
			basededatos.Cancion[] lFavoritas = usuario_Registrado.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(usuario_Registrado);
			}
			basededatos.Cancion[] lUltimo_exitos = usuario_Registrado.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = usuario_Registrado.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = usuario_Registrado.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(usuario_Registrado);
			}
			try {
				session.delete(usuario_Registrado);
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
	
	public static boolean refresh(basededatos.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByCriteria(Usuario_RegistradoCriteria usuario_RegistradoCriteria) {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByCriteria(usuario_RegistradoCriteria);
		if(usuario_Registrados == null || usuario_Registrados.length == 0) {
			return null;
		}
		return usuario_Registrados[0];
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByCriteria(Usuario_RegistradoCriteria usuario_RegistradoCriteria) {
		return usuario_RegistradoCriteria.listUsuario_Registrado();
	}
}
