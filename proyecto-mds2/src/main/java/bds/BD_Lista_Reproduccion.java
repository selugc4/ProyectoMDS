package bds;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import clases.Actor_comun;

public class BD_Lista_Reproduccion {
	public BDPrincipal _bd_principal_lista_reproduccion;
	public Vector<Lista_ReproduccionDAO> _contiene_lista_reproduccion = new Vector<Lista_ReproduccionDAO>();

	public Lista_Reproduccion[] cargar_Listas_Reproduccion() throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(Actor_comun.ID);
			Lista_Reproduccion[] listas = usuario.propietario.toArray();

			t.commit();
			return listas;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}		
	}

	public Lista_Reproduccion[] cargar_Listas_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Favorita(int aIdCancion, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Seguidor(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Cancion_Favorita(int aIdCancion, int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(iD);
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			usuario.favorita.add(cancion);
			UsuarioDAO.save(usuario);			

			t.commit();
			
		} catch (PersistentException e) {
			t.rollback();
			
		}		
	}

	public void anadir_Cancion_Lista(int aIdCancion, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void seguir_Lista(int aIdLista, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Lista_Reproduccion[] cargar_Listas_Propias(int iD) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(iD);
			Lista_Reproduccion[] lista = usuario.propietario.toArray();		

			t.commit();
			return lista;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}

	public Lista_Reproduccion[] cargar_Listas_Reproduccion_Ajenas() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Modificar(int aIdLista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
		
			Lista_Reproduccion lista = Lista_ReproduccionDAO.getLista_ReproduccionByORMID(aIdLista);
			Cancion[] canciones = lista.contiene_cancion.toArray();
			t.commit();
			return canciones;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}

	public void eliminar_Lista_Reproduccion(int idLista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Lista_Reproduccion lr = Lista_ReproduccionDAO.getLista_ReproduccionByORMID(idLista);
			for(Usuario seguidor : lr.seguidor.toArray()) {
				lr.seguidor.remove(seguidor);
			}
			for(Cancion cancion: lr.contiene_cancion.toArray()) {
				lr.contiene_cancion.remove(cancion);
			}
			
			Lista_ReproduccionDAO.delete(lr);

			t.commit();
			
		} catch (PersistentException e) {
			t.rollback();
	
			
		}	
	}

	public void crear_Lista(String aNombre_Lista, ArrayList<clases.Cancion> aCanciones) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(Actor_comun.ID);
			Lista_Reproduccion lr = Lista_ReproduccionDAO.createLista_Reproduccion();
			lr.setNombreLista(aNombre_Lista);
			for(clases.Cancion canciones: aCanciones) {
				Cancion cancion = CancionDAO.loadCancionByORMID(canciones.getIdCancion());
				lr.contiene_cancion.add(cancion);
			}
			lr.setAutor(usuario);
			Lista_ReproduccionDAO.save(lr);

			t.commit();
			
		} catch (PersistentException e) {
			t.rollback();
	
			
		}	
	}

	public Lista_Reproduccion[] cargar_Listas_Sus_Canciones(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void guardar_Modificacion_lista(int iD, String value, ArrayList<clases.Cancion> get_canciones) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Lista_Reproduccion lr = Lista_ReproduccionDAO.getLista_ReproduccionByORMID(iD);
			for(Cancion cancion : lr.contiene_cancion.toArray()) {
				lr.contiene_cancion.remove(cancion);
			}
			for(clases.Cancion canciones: get_canciones) {
				
				Cancion cancion = CancionDAO.loadCancionByORMID(canciones.getIdCancion());
				lr.contiene_cancion.add(cancion);
			}
	
			Lista_ReproduccionDAO.save(lr);

			t.commit();
			
		} catch (PersistentException e) {
			t.rollback();
	
			
		}	
	}
		
}