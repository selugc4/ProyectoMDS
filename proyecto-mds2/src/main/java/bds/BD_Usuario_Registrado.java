package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;
import clases.Cibernauta;
import basededatos.Imagen;
import basededatos.ImagenDAO;
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

	public Usuario_Registrado cargar_Perfil(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_usuario(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Usuario(String aCorreoSeguidor, String aCorreoSeguido) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado[] cargar_Usuarios(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_usuario(String aNombre, String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_usuarios(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] obtener_Estadisticas(String aCorreo) {
		throw new UnsupportedOperationException();
	}
}