package bds;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Album;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.CancionDAO;
import basededatos.Estilo;
import basededatos.EstiloDAO;
import basededatos.Evento;
import basededatos.EventoDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
import basededatos.Imagen;
import basededatos.ImagenDAO;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;
import clases.Actor_comun;
import clases.Cibernauta;
import clases.Ver_estadisticas;
import proyectoMDS2.MainView;
import basededatos.Artista;
import basededatos.ArtistaDAO;

public class BD_Artista {
	public BDPrincipal _bd_principal_artista;
	public Vector<ArtistaDAO> _contiene_artista = new Vector<ArtistaDAO>();

	public boolean consultar_Datos(String aNombre, String aContrasena) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();	
		try {
			Artista user = ArtistaDAO.loadArtistaByQuery("Nombre='"+aNombre+"' AND Contrasena='" + aContrasena+"'", null);
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
			Artista usuario = ArtistaDAO.loadArtistaByQuery("Correo='"+aEmail+"'", null);
			Artista usuario2 = ArtistaDAO.loadArtistaByQuery("Nombre='" +aNombre+"'", null);
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
			Artista usuario = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'", null);
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
			Artista usuario = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'", null);
			
			usuario.setContrasena(aContrasena);
			ArtistaDAO.save(usuario);
			t.commit();
			
		} catch (PersistentException e) {
			t.rollback();
		}
	}

	public Artista[] cargar_Artistas_Buscador(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
		Artista []usuario = ArtistaDAO.listArtistaByQuery("Nombre='"+aNombre+"'", null);
		t.commit();
		return usuario;
		}
		catch (PersistentException e) {
			t.rollback();
			return null;
		}
		}

	public Artista[] cargar_Artistas_Perfil(int idArtista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
		Artista artista = ArtistaDAO.loadArtistaByORMID(idArtista);
		Estilo[] estilos = artista.pertenece.toArray();
		ArrayList<Artista> a = new ArrayList<Artista>();
		for(Estilo estilo : estilos) {
			Artista[] artistas = estilo.cantado_por.toArray();
			for(Artista art : artistas) {
				a.add(art);
			}
		}
		Artista[] fin = new Artista[a.size()];
		a.toArray(fin);
		t.commit();
		return fin;
		}
		catch (PersistentException e) {
			t.rollback();
			return null;
		}
	}

	public void Darse_de_baja(String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista usuario = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'", null);
//			
//			if(!usuario.favorita.isEmpty()) {
//				Cancion[] cancionesf = usuario.favorita.toArray();
//				for(Cancion cancion: cancionesf) {
//					cancion.favorita_de.remove(usuario);
//			}
//			}
//			
//			if(!usuario.crea.isEmpty()) {
//				for(Evento ev : usuario.crea.toArray()) {
//					usuario.crea.remove(ev);
//				}
//			}
//			if(!usuario.pertenece.isEmpty()) {
//				for(Estilo estilo : usuario.pertenece.toArray()) {
//					usuario.pertenece.remove(estilo);
//				}
//			}
//			if(!usuario.propietario_album.isEmpty()) {
//				for(Album album : usuario.propietario_album.toArray()) {
//					usuario.propietario_album.remove(album);
//				}
//			}
//			if(!usuario.tiene.isEmpty()){
//				for(Cancion can : usuario.tiene.toArray()) {
//					usuario.tiene.remove(can);
//				}
//			}
//			
//			if(!usuario.horass.isEmpty());{
//				for(Horas hora : usuario.horass.toArray()) {
//					usuario.horass.remove(hora);
//				}
//			}
//		
//			if(!usuario.propietario.isEmpty()) {
//			Lista_Reproduccion[]listas = usuario.propietario.toArray();
//			for(Lista_Reproduccion lista: listas) {
//				lista.seguidor.clear();
//				lista.contiene_cancion.clear();
//				Cancion[] cancionesl = lista.contiene_cancion.toArray();
//				for(Cancion cancionl: cancionesl) {
//					cancionl.contendor_cancion.remove(lista);
//				}
//				Lista_ReproduccionDAO.delete(lista);
//			}
//			}
//			
//			if(!usuario.recibe_notificacion.isEmpty()) {
//				for(Evento evento : usuario.recibe_notificacion.toArray()) {
//					usuario.recibe_notificacion.remove(evento);
//				}
//			}
//			if(!usuario.seguido.isEmpty()) {
//				for(Usuario user: usuario.seguido.toArray()) {
//					usuario.seguido.remove(user);
//				}
//			}
//
//			if(!usuario.seguidor_usuario.isEmpty()) {
//				for(Usuario user2 : usuario.seguidor_usuario.toArray()) {
//					usuario.seguidor_usuario.remove(user2);
//				}
//			}
//			if(!usuario.seguir.isEmpty()) {
//				for(Lista_Reproduccion list : usuario.seguir.toArray()) {
//					usuario.seguir.remove(list);
//				}
//			}
//			usuario.
			
			ArtistaDAO.delete(usuario);
			ImagenDAO.delete(usuario.getContiene_imagen());

			t.commit();
			}catch (PersistentException e) {
			t.rollback();
		}
	}

	public void Modificar_foto(String aFoto, String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
		Artista usuario = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'", null);
		usuario.getContiene_imagen().setUrl(aFoto);
		t.commit();
		}
		catch (PersistentException e) {
			t.rollback();
		}
		

	}

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista usuario = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreoAntiguo+"'", null);	
			usuario.setCorreo(aCorreoNuevo);
			ArtistaDAO.save(usuario);
			t.commit();
			
			
		} catch (PersistentException e) {
			t.rollback();
		}		
	}

	public void Anadir_Evento(String aCorreo, String aNombre, String aFecha, String aTipoEvento) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista usuario = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'", null);
			Evento evento = EventoDAO.createEvento();
			evento.setCreado_por(usuario);
			evento.setFecha(aFecha);
			evento.setTipoEvento(aTipoEvento);
			evento.setNombre(aNombre);	
			for(Usuario user: usuario.seguidor_usuario.toArray()) {
				user.recibe_notificacion.add(evento);
			}			
			EventoDAO.save(evento);
			
			
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
	}

	public void Dar_alta_artista(String aCorreo, String aNombre, String aContrasena, String[] aEstilos, String aFoto) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista usuario = ArtistaDAO.createArtista();
					
			usuario.setNombre(aNombre);
			usuario.setTipoUsuario(1);
			usuario.setContrasena(aContrasena);
			usuario.setCorreo(aCorreo);
			Imagen img = ImagenDAO.createImagen();
			img.setUrl(aFoto);
			ImagenDAO.save(img);
			usuario.setContiene_imagen(img);
			
			for(int i = 0; i< aEstilos.length; i++) {
				Estilo aux = EstiloDAO.loadEstiloByQuery("Nombre='"+aEstilos[i]+"'", null);
				if(aux == null) {
					continue;
				}else
					usuario.pertenece.add(aux);
			}
			UsuarioDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
	}

	public Artista[] cargar_Usuarios(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_usuario(String aNombre, String aFoto, String aCorreo) throws PersistentException {
		
	}

	public void Eliminar_artista(String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'",null);
			artista.crea.clear();
			artista.pertenece.clear();
			artista.propietario_album.clear();
			Album[] albumes = artista.propietario_album.toArray();
			for(Album album: albumes) {
				album.autor.remove(artista);
			}
			artista.favorita.clear();
			artista.horass.clear();
			artista.seguir.clear();
			artista.propietario.clear();
			Lista_Reproduccion[]listas = artista.propietario.toArray();
			for(Lista_Reproduccion lista: listas) {
				Lista_ReproduccionDAO.delete(lista);
			}
			ArtistaDAO.delete(artista);
//			Usuario usuario = UsuarioDAO.getUsuarioByORMID(artista.getID());
//			UsuarioDAO.delete(usuario);
			ImagenDAO.delete(artista.getContiene_imagen());
			t.commit();
		}
		catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void eliminar_Artista(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_artista(int idUsuario, int idArtista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.loadArtistaByORMID(idArtista);
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(idUsuario);
			artista.seguido.add(usuario);
			
			ArtistaDAO.save(artista);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
		
	}

	public Cancion obtener_Estadisticas(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista usuario = ArtistaDAO.getArtistaByORMID(iD);
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
			t.commit();
			}
			return cancion;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
		}
	}

	public Evento[] obtener_Notificaciones(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista usuario = ArtistaDAO.getArtistaByORMID(iD);
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
			Artista usuario = ArtistaDAO.getArtistaByORMID(iD);
			Artista artista = ArtistaDAO.loadArtistaByQuery("Nombre='"+artistaevento+"'",null);
			Evento evento = EventoDAO.loadEventoByQuery("Nombre='"+nombreevento+"' AND ArtistaUsuarioID='"+ Integer.toString(artista.getID())+"'", null);
			usuario.recibe_notificacion.remove(evento);
			
			ArtistaDAO.save(usuario);
			t.commit();
		
			
		} catch (PersistentException e) {
			t.rollback();
	
		}
		
	}

	public Usuario cargar_Perfil(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista usuario = ArtistaDAO.getArtistaByORMID(iD);
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
				Artista usuario = ArtistaDAO.getArtistaByORMID(Actor_comun.ID);
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

		public void dejar_de_seguir_artista(int idUsuario, int idArtista) throws PersistentException {
			PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
			try {
				Artista artista = ArtistaDAO.loadArtistaByORMID(idArtista);
				Usuario usuario = UsuarioDAO.loadUsuarioByORMID(idUsuario);
				artista.seguido.remove(usuario);
				
				ArtistaDAO.save(artista);
				t.commit();
				
			} catch (Exception e) {
				t.rollback();
			}
			
		}
}