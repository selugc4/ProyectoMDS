package bds;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.AdministradorDAO;
import basededatos.Album;
import basededatos.AlbumDAO;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
import basededatos.HorasSetCollection;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import clases.Actor_comun;
import clases.Usuario_registrado;


public class BD_Cancion {
	public BDPrincipal _bd_principal_cancion;
	public Vector<CancionDAO> _contiene_cancion = new Vector<CancionDAO>();

	public Cancion[] cargar_Ultimos_Exitos() throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		Cancion[] canciones;
		try {
			Usuario admin = UsuarioDAO.loadUsuarioByQuery("Nombre='Administrador'",null);
			canciones = admin.ultimo_exito.toArray();
			t.commit();
		
			
	
		} catch (Exception e) {
			t.rollback();
			canciones = null;
		}
	
		return canciones;
				
		
		
		
	}

	public Cancion cargar_Creditos(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Ultimas_Canciones_Reproducidas() throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		
		
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(Actor_comun.ID);
			Horas[] aux = usuario.horass.toArray();
			Cancion[] canciones = new Cancion[aux.length];
			for(int i = 0; i < aux.length; i++) {
				canciones[i]= aux[i].getCancion();
			}
			
			t.commit();
			return canciones;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}		
		
	}

	public Cancion[] cargar_Recomendaciones() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Favoritas(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Busqueda(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargar_Datos_Cancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] obtener_Canciones_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Cancion_Lista(int aIdLista, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Lista(int aIdCancion, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Exitosas(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Ultimos_Exitos_Admin() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Buscadas(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Canciones_Mostradas(int aNumero_Canciones) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_a_la_vista_de_cibernauta(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Ultimo_Exito(int aIdCancion) {
		throw new UnsupportedOperationException();
	}
	
	public void Dar_alta_cancion(String aTitulo, String aTitulo_Creditos, String aTitulo_Album, String aCompositores, String aProductores, String aInterpretes, String aArchivoMultimedia) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion cancion = CancionDAO.createCancion();
			
			cancion.setTitulo(aTitulo);
			cancion.setTituloCreditos(aTitulo_Creditos + "\n" + aTitulo_Album);					
			cancion.setCompositores(aCompositores);
			cancion.setIntepretes(aInterpretes);
			cancion.setProductores(aProductores);
			cancion.setArchivoMultimedia(aArchivoMultimedia);
			CancionDAO.save(cancion);

			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Cancion[] cargar_Canciones_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_cancion_a_album(int aIdCancion, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Cancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_cancion(int aIdCancion, String aArchivoMultimedia, String aInterpretes, String aProductores, String aCompositores, String aTitulo, String aTituloCreditos) {
		throw new UnsupportedOperationException();
	}
}