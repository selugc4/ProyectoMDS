package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;

public class BD_Administrador {
	public BDPrincipal _bd_principal_administrador;
	public Vector<AdministradorDAO> _contiene_administrador = new Vector<AdministradorDAO>();

	public boolean consultar_Datos(String aNombre, String aContrasena) {
		throw new UnsupportedOperationException();
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