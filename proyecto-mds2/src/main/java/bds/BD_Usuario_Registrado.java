package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Evento;
import basededatos.EventoDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoCriteria;
import basededatos.Usuario_RegistradoDAO;
import clases.Actor_comun;
import clases.Cibernauta;
import clases.Ver_estadisticas;
import basededatos.Imagen;
import basededatos.ImagenDAO;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;
import proyectoMDS2.MainView;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;

public class BD_Usuario_Registrado {
	public BDPrincipal _bd_principal_usuario_registrado;
	public Vector<Usuario_RegistradoDAO> _contiene_usuario_registrado = new Vector<Usuario_RegistradoDAO>();

	public boolean consultar_Datos() {
		throw new UnsupportedOperationException();
	}

	public boolean consultar_Datos(String aNombre, String aContrasena) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();	
		try {
			Usuario_Registrado user = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Nombre='"+aNombre+"' AND Contrasena='" + aContrasena+"'", null);
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

	public void guardar_Datos(String aEmail, String aNombre, String aContrasena, String aFoto) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();	
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.createUsuario_Registrado();
			usuario.setCorreo(aEmail);
			usuario.setNombre(aNombre);
			usuario.setContrasena(aContrasena);
			Imagen img = ImagenDAO.createImagen();
			img.setUrl(aFoto);
			ImagenDAO.save(img);
			usuario.setContiene_imagen(img);
			UsuarioDAO.save(usuario);
			t.commit();
			
		
		} catch (PersistentException e) {
			t.rollback();
		}
	}
	

	public boolean validar_Datos(String aNombre, String aEmail) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();	
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Correo='"+aEmail+"'", null);
			Usuario_Registrado usuario2 = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Nombre='" +aNombre+"'", null);
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
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Correo='"+aCorreo+"'", null);
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
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Correo='"+aCorreo+"'", null);
			
			usuario.setContrasena(aContrasena);
			Usuario_RegistradoDAO.save(usuario);
			t.commit();
			
		} catch (PersistentException e) {
			t.rollback();
		}
	}

	public Usuario_Registrado cargar_Perfil(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(iD);
			t.commit();
			return usuario;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
		}		
	}

	public void modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Correo='"+aCorreoAntiguo+"'", null);	
			usuario.setCorreo(aCorreoNuevo);
			Usuario_RegistradoDAO.save(usuario);
			t.commit();
			
			
		} catch (PersistentException e) {
			t.rollback();
		}		
	}

	public void Eliminar_usuario(String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Correo='"+aCorreo+"'", null);
			Cancion[] cancionesf = usuario.favorita.toArray();
			for(Cancion cancion: cancionesf) {
				cancion.favorita_de.remove(usuario);
			}
			
			
			Horas[] horas = usuario.horass.toArray();
			for(Horas hora: horas) {
				usuario.horass.remove(hora);
				HorasDAO.delete(hora);
			}
			Lista_Reproduccion[]listas = usuario.propietario.toArray();
			for(Lista_Reproduccion lista: listas) {
				Usuario[]usuarios = lista.seguidor.toArray();
				for(Usuario usuario1: usuarios) {
					lista.seguidor.remove(usuario1);
				}
		
			Cancion[] cancionesl = lista.contiene_cancion.toArray();
			for(Cancion cancionl: cancionesl) {
				lista.contiene_cancion.remove(cancionl);
			}
			Lista_ReproduccionDAO.delete(lista);
			}
			Evento[]eventos = usuario.recibe_notificacion.toArray();
			for(Evento evento: eventos) {
				usuario.recibe_notificacion.remove(evento);
			}
			Usuario[]usuariosS=usuario.seguido.toArray();
			for(Usuario usuarioS:usuariosS) {
				usuario.seguido.remove(usuarioS);
			}
			Usuario[]usuariosU=usuario.seguidor_usuario.toArray();
			for(Usuario usuarioU:usuariosU) {
				usuario.seguidor_usuario.remove(usuarioU);
			}
			Cancion[] cancionesu = usuario.ultimo_exito.toArray();
			for(Cancion cancion: cancionesu) {
				usuario.ultimo_exito.remove(cancion);
			}
		
			Usuario_RegistradoDAO.delete(usuario);
			ImagenDAO.delete(usuario.getContiene_imagen());
			t.commit();
		}catch (PersistentException e) {
			t.rollback();
		}
	}

	public void Seguir_Usuario(int idUsuario, int idUsuarioAjeno) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(idUsuarioAjeno);
			Usuario_Registrado usuarioseguidor = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(idUsuario);
			usuario.seguido.add(usuarioseguidor);
			t.commit();
		}catch (PersistentException e) {
			t.rollback();
		}
	}

	public Usuario_Registrado[] cargar_Usuarios(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_RegistradoCriteria urc = new Usuario_RegistradoCriteria();
			urc.nombre.like("%"+aNombre+"%");
			Usuario_Registrado [] usuarios = Usuario_RegistradoDAO.listUsuario_RegistradoByCriteria(urc);
			t.commit();
			return usuarios;
		}catch (PersistentException e) {
			t.rollback();
			return null;
		}
	}

	public void Modificar_usuario(String aNombre, String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Cancion obtener_Estadisticas(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(iD);
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
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(iD);
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
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(iD);
			Artista artista = ArtistaDAO.loadArtistaByQuery("Nombre='"+artistaevento+"'",null);
			Evento evento = EventoDAO.loadEventoByQuery("Nombre='"+nombreevento+"' AND ArtistaUsuarioID='"+ Integer.toString(artista.getID())+"'", null);
			usuario.recibe_notificacion.remove(evento);
			
			Usuario_RegistradoDAO.save(usuario);
			t.commit();
		
			
		} catch (PersistentException e) {
			t.rollback();
	
		}
	}

	public boolean comprobar_Seguido(int idArtista) throws PersistentException {
			PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
			try {
				Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(Actor_comun.ID);
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

	public void Dejar_de_seguir_usuario(int idUsuario, int idUsuarioAjeno) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(idUsuarioAjeno);
			Usuario_Registrado usuarioseguidor = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(idUsuario);
			usuario.seguido.remove(usuarioseguidor);
			t.commit();
		}catch (PersistentException e) {
			t.rollback();
		}
		
	}

	public void reproducir(int iD, int idCancion) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(iD);
			Cancion cancion = CancionDAO.loadCancionByORMID(idCancion);
			Horas horas = HorasDAO.loadHorasByQuery("UsuarioID='"+iD+"'AND CancionIdCancion='"+idCancion+"'", null);
			if(horas == null) {
				horas = HorasDAO.createHoras();
				horas.setCancion(cancion);
				horas.setUsuario(usuario);
				horas.setHoras(1);
			}else {
				horas.setHoras(horas.getHoras()+1);
			}
			HorasDAO.save(horas);
			t.commit();
		}catch (PersistentException e) {
			t.rollback();
		}
		
	}
}