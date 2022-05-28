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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario) session.load(basededatos.Usuario.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario) session.get(basededatos.Usuario.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(basededatos.Usuario.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(basededatos.Usuario.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.A12PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new basededatos.Usuario();
	}
	
	public static boolean save(basededatos.Usuario usuario) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Usuario usuario) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario usuario)throws PersistentException {
		if (usuario instanceof basededatos.Administrador) {
			return basededatos.AdministradorDAO.deleteAndDissociate((basededatos.Administrador) usuario);
		}
		
		if (usuario instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuario);
		}
		
		if (usuario instanceof basededatos.Usuario_Registrado) {
			return basededatos.Usuario_RegistradoDAO.deleteAndDissociate((basededatos.Usuario_Registrado) usuario);
		}
		
		try {
			if (usuario.getContiene_imagen() != null) {
				usuario.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = usuario.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(usuario);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = usuario.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = usuario.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(usuario);
			}
			basededatos.Evento[] lRecibe_notificacions = usuario.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(usuario);
			}
			basededatos.Cancion[] lFavoritas = usuario.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(usuario);
			}
			basededatos.Cancion[] lUltimo_exitos = usuario.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = usuario.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = usuario.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(usuario);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		if (usuario instanceof basededatos.Administrador) {
			return basededatos.AdministradorDAO.deleteAndDissociate((basededatos.Administrador) usuario, session);
		}
		
		if (usuario instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuario, session);
		}
		
		if (usuario instanceof basededatos.Usuario_Registrado) {
			return basededatos.Usuario_RegistradoDAO.deleteAndDissociate((basededatos.Usuario_Registrado) usuario, session);
		}
		
		try {
			if (usuario.getContiene_imagen() != null) {
				usuario.getContiene_imagen().setImagen_de(null);
			}
			
			basededatos.Lista_Reproduccion[] lSeguirs = usuario.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguidor.remove(usuario);
			}
			basededatos.Lista_Reproduccion[] lPropietarios = usuario.propietario.toArray();
			for(int i = 0; i < lPropietarios.length; i++) {
				lPropietarios[i].setAutor(null);
			}
			basededatos.Usuario[] lSeguidos = usuario.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor_usuario.remove(usuario);
			}
			basededatos.Evento[] lRecibe_notificacions = usuario.recibe_notificacion.toArray();
			for(int i = 0; i < lRecibe_notificacions.length; i++) {
				lRecibe_notificacions[i].genera_notificacion.remove(usuario);
			}
			basededatos.Cancion[] lFavoritas = usuario.favorita.toArray();
			for(int i = 0; i < lFavoritas.length; i++) {
				lFavoritas[i].favorita_de.remove(usuario);
			}
			basededatos.Cancion[] lUltimo_exitos = usuario.ultimo_exito.toArray();
			for(int i = 0; i < lUltimo_exitos.length; i++) {
				lUltimo_exitos[i].setAdministrado_por(null);
			}
			basededatos.Horas[] lHorasss = usuario.horass.toArray();
			for(int i = 0; i < lHorasss.length; i++) {
				lHorasss[i].setUsuario(null);
			}
			basededatos.Usuario[] lSeguidor_usuarios = usuario.seguidor_usuario.toArray();
			for(int i = 0; i < lSeguidor_usuarios.length; i++) {
				lSeguidor_usuarios[i].seguido.remove(usuario);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(basededatos.Usuario usuario) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Usuario usuario) throws PersistentException {
		try {
			basededatos.A12PersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
