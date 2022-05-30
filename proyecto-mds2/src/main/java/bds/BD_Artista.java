package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
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

public class BD_Artista {
	public BDPrincipal _bd_principal_artista;
	public Vector<ArtistaDAO> _contiene_artista = new Vector<ArtistaDAO>();

	public boolean consultar_Datos(String aNombre, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean validar_Datos(String aNombre, String aEmail) {
		throw new UnsupportedOperationException();
	}

	public boolean consultar_Correo(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void guardar_Contrasena(String aContrasena, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_Artistas_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
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

	public void Modificar_usuario(String aNombre, String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_artista(String aCorreo) {
		throw new UnsupportedOperationException();
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