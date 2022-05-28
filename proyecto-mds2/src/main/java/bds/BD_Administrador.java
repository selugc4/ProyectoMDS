package bds;

import java.util.Vector;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Usuario;

public class BD_Administrador {
	public BDPrincipal _bd_principal_administrador;
	public Vector<AdministradorDAO> _contiene_administrador = new Vector<AdministradorDAO>();

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

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] obtener_Estadisticas(String aCorreo) {
		throw new UnsupportedOperationException();
	}
}