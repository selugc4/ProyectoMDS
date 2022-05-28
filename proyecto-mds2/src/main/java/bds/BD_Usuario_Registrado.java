package bds;

import java.util.Vector;

import basededatos.Usuario;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;

public class BD_Usuario_Registrado {
	public BDPrincipal _bd_principal_usuario_registrado;
	public Vector<Usuario_RegistradoDAO> _contiene_usuario_registrado = new Vector<Usuario_RegistradoDAO>();

	public boolean consultar_Datos() {
		throw new UnsupportedOperationException();
	}

	public boolean consultar_Datos(String aNombre, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void guardar_Datos(String aEmail, String aNombre, String aContrasena, String aFoto) {
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