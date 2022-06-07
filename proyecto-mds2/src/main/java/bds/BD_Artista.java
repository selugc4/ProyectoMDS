package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Album;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.CancionDAO;
import basededatos.Estilo;
import basededatos.EstiloDAO;
import basededatos.EventoDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
import basededatos.Imagen;
import basededatos.ImagenDAO;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import clases.Cibernauta;
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

	public Artista[] cargar_Artistas_Perfil(String aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void Darse_de_baja(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_foto(String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_Evento(String aCorreo, String aNombre, String aFecha, String aTipoEvento) {
		throw new UnsupportedOperationException();
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

	public void Seguir_artista(String aCorreoSeguidor, String aCorreoSeguido) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] obtener_Estadisticas(String aCorreo) {
		throw new UnsupportedOperationException();
	}
}