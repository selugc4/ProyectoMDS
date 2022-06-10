package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Evento;
import basededatos.EventoDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;
import clases.Actor_comun;
import clases.Cibernauta;
import clases.Ver_estadisticas;
import proyectoMDS2.MainView;
import basededatos.Administrador;
import basededatos.AdministradorDAO;

public class BD_Administrador {
	public BDPrincipal _bd_principal_administrador;
	public Vector<AdministradorDAO> _contiene_administrador = new Vector<AdministradorDAO>();

	public boolean consultar_Datos(String aNombre, String aContrasena) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();	
		try {
			Administrador user = AdministradorDAO.loadAdministradorByQuery("Nombre='"+aNombre+"' AND Contrasena='" + aContrasena+"'", null);
			if(user != null) {
				MainView.ID = user.getID();
				return true;
			}else
				return false;
		} catch (PersistentException e) {
			t.rollback();
			return false;
		}
	}

	public boolean validar_Datos(String aNombre, String aEmail) throws PersistentException {
		
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
	
		try {
			Administrador usuario = AdministradorDAO.loadAdministradorByQuery("Correo='"+aEmail+"'", null);
			Administrador usuario2 = AdministradorDAO.loadAdministradorByQuery("Nombre='" +aNombre+"'", null);
			t.commit();
			if(usuario == null && usuario2 == null) {
				return true;
			}else
				return false;
		
		} catch (PersistentException e) {
			t.rollback();
			return false;
		}
	}

	public boolean consultar_Correo(String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		
		try {
			Administrador usuario = AdministradorDAO.loadAdministradorByQuery("Correo='"+aCorreo+"'", null);
			t.commit();
			
			if(usuario != null) {
				Cibernauta.correo = usuario.getCorreo();
				return true;
			}else
				return false;
			
		} catch (PersistentException e) {
			t.rollback();
			return false;
		}
		
	}

	public void guardar_Contrasena(String aContrasena, String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		
		try {
			Administrador usuario = AdministradorDAO.loadAdministradorByQuery("Correo='"+aCorreo+"'", null);
			
			usuario.setContrasena(aContrasena);
			AdministradorDAO.save(usuario);
			t.commit();
			
		} catch (PersistentException e) {
			t.rollback();
		}
	}

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador usuario = AdministradorDAO.loadAdministradorByQuery("Correo='"+aCorreoAntiguo+"'", null);	
			usuario.setCorreo(aCorreoNuevo);
			AdministradorDAO.save(usuario);
			t.commit();
			
			
		} catch (PersistentException e) {
			t.rollback();
		}		
	}

	public Cancion obtener_Estadisticas(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador usuario = AdministradorDAO.getAdministradorByORMID(iD);
			Horas[] aux = usuario.horass.toArray();
			int horasId = 1;
			int horas = 0;;
			for(int i = 0; i < aux.length; i++) {
				if(aux[i].getHoras() > horas) {
					horasId = aux[i].getID();
					horas = aux[i].getHoras();
				}
			}
			Ver_estadisticas.horas = horas;
			Horas hora = HorasDAO.getHorasByORMID(horasId);
			Cancion cancion = null;
			if(hora != null) {
			 cancion = hora.getCancion();
			}
			t.commit();
			return cancion;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
		}
	}

	public Evento[] obtener_Notificaciones(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador usuario = AdministradorDAO.getAdministradorByORMID(iD);
			Evento[] eventos = usuario.recibe_notificacion.toArray();
			
			t.commit();
			return eventos;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
		}
	}

	public void eliminar_Notificacion(int iD, String artistaevento, String nombreevento) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador usuario = AdministradorDAO.getAdministradorByORMID(iD);
			Artista artista = ArtistaDAO.loadArtistaByQuery("Nombre='"+artistaevento+"'",null);
			Evento evento = EventoDAO.loadEventoByQuery("Nombre='"+nombreevento+"' AND ArtistaUsuarioID='"+ Integer.toString(artista.getID())+"'", null);
			usuario.recibe_notificacion.remove(evento);
			
			AdministradorDAO.save(usuario);
			t.commit();
		
			
		} catch (PersistentException e) {
			t.rollback();
	
		}
		
	}

	public Usuario cargar_Perfil(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador usuario = AdministradorDAO.getAdministradorByORMID(iD);
			t.commit();
			return usuario;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
		}
	}

	public boolean comprobar_Seguido(int idArtista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador usuario = AdministradorDAO.getAdministradorByORMID(Actor_comun.ID);
			if(usuario != null) {
				Artista artista = ArtistaDAO.getArtistaByORMID(idArtista);
				if(usuario.seguidor_usuario.contains(artista)) {
					return true;
				}else
					return false;
			}else
				t.commit();
				return false;
		
			
		} catch (PersistentException e) {
			t.rollback();
			return false;
		}
		
		
	}
}