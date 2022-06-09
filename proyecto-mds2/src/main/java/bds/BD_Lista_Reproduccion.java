package bds;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Album;
import basededatos.Artista;
import basededatos.ArtistaDAO;
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

	public Lista_Reproduccion[] cargar_Listas_Buscador(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
		Lista_Reproduccion[] listas = Lista_ReproduccionDAO.listLista_ReproduccionByQuery("NombreLista='"+aNombre+"'", null);
		t.commit();
		return listas;
		}catch (PersistentException e) {
			t.rollback();
			return null;
		}
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
	public void eliminar_Lista_Reproduccion(int aIdLista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Lista_Reproduccion lista = Lista_ReproduccionDAO.loadLista_ReproduccionByORMID(aIdLista);
			lista.contiene_cancion.clear();
			Cancion[]canciones = lista.contiene_cancion.toArray();
			for(Cancion cancion: canciones) {
				cancion.contendor_cancion.remove(lista);
			}
			lista.seguidor.clear();
			Usuario[]usuarios = lista.seguidor.toArray();
			for(Usuario usuario: usuarios) {
				usuario.seguir.remove(lista);
			}
			Lista_ReproduccionDAO.delete(lista);
			t.commit();
		}catch (PersistentException e) {
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

	public Lista_Reproduccion[] cargar_Listas_Sus_Canciones(String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Artista artista = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'", null);
			ArrayList<Cancion> canciones = new ArrayList<Cancion>();
			Album[] album = artista.propietario_album.toArray();
			for(Album alb: album) {
				for(Cancion can : alb.contiene_cancion.toArray()) {
					canciones.add(can);
				}
			}
			ArrayList<Lista_Reproduccion> listas = new ArrayList<Lista_Reproduccion>();
			for(Cancion c : canciones) {
				Lista_Reproduccion[] lr = c.contendor_cancion.toArray();
				if(lr != null) {
					for(Lista_Reproduccion lista : lr) {
						listas.add(lista);
					}
				}
			}
			
			Lista_Reproduccion[] definitiva = new Lista_Reproduccion[listas.size()];
			listas.toArray(definitiva);
			t.commit();			
			if(definitiva != null) {
			return definitiva;
			}else
				return null;
			

			
		} catch (PersistentException e) {
			t.rollback();
			return null;
	
			
		}	
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