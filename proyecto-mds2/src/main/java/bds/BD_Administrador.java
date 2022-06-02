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
import clases.Cibernauta;
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

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] obtener_Estadisticas(String aCorreo) {
		throw new UnsupportedOperationException();
	}
}