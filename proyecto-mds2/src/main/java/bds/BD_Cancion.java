package bds;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mysql.cj.jdbc.jmx.LoadBalanceConnectionGroupManager;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Album;
import basededatos.AlbumDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.CancionCriteria;
import basededatos.CancionDAO;
import basededatos.Estilo;
import basededatos.EstiloDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
import basededatos.HorasSetCollection;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import clases.Actor_comun;
import clases.Ultimos_exitos;
import clases.Usuario_registrado;


public class BD_Cancion {
	public BDPrincipal _bd_principal_cancion;
	public Vector<CancionDAO> _contiene_cancion = new Vector<CancionDAO>();

	public Cancion[] cargar_Ultimos_Exitos() throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		Cancion[] canciones;
		try {
			Administrador admin = AdministradorDAO.loadAdministradorByQuery("Nombre='Administrador'", null);
			canciones = CancionDAO.listCancionByQuery("UsuarioID='"+admin.getID()+"'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			canciones = null;
		}
	
		return canciones;
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

	public Cancion[] cargar_Recomendaciones() throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Cancion[] canciones = CancionDAO.listCancionByQuery(null, null);			
			List<Cancion> canc = Arrays.asList(canciones);
			Collections.shuffle(canc);
			
			if(canciones.length > 15) {				
				canc.subList(0, 14).toArray(canciones);
			}else
				canc.subList(0, canciones.length).toArray(canciones);
					
			t.commit();
			return canciones;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}		
	}

	public Cancion[] cargar_Canciones_Favoritas() throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(Actor_comun.ID);
			Cancion[] canciones = 	usuario.favorita.toArray();

			t.commit();
			return canciones;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}		
	}

	public Cancion[] cargar_Canciones_Busqueda(String aNombre)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public Cancion cargar_Datos_Cancion(int aIdCancion) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			t.commit();
			return cancion;
		}catch (PersistentException e) {
			t.rollback();
			return null;
		}
	}

	public Cancion[] obtener_Canciones_Album(int aIdAlbum) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Album album = AlbumDAO.getAlbumByORMID(aIdAlbum);
			Cancion[] cancion = album.contiene_cancion.toArray();
			t.commit();		
			return cancion;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}

	public Cancion[] cargar_Canciones_Lista(int aIdLista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Lista_Reproduccion lr = Lista_ReproduccionDAO.getLista_ReproduccionByORMID(aIdLista);			
			t.commit();		
			return lr.contiene_cancion.toArray();
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}

	public void eliminar_Cancion_Lista(int aIdLista, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Lista(int aIdCancion, String nombrelista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			Lista_Reproduccion lr = Lista_ReproduccionDAO.loadLista_ReproduccionByQuery("NombreLista='"+nombrelista+"'", null);
			cancion.contendor_cancion.add(lr);
			CancionDAO.save(cancion);
			
			t.commit();			
			
		} catch (PersistentException e) {
			t.rollback();
			
		}	
	}

	public Cancion[] cargar_Canciones_Buscador(String aNombre) throws PersistentException{
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
			CancionCriteria ccriteria = new CancionCriteria();
			ccriteria.titulo.like("%"+aNombre+"%");
			Cancion[] canciones = CancionDAO.listCancionByCriteria(ccriteria);
			
			t.commit();		
			return canciones;
		
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}

	public Cancion[] cargar_Exitosas(String aCorreo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
		Artista artista = ArtistaDAO.loadArtistaByQuery("Correo='"+aCorreo+"'", null);
		Album[] albumes = artista.propietario_album.toArray();
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		for(Album album : albumes) {
			Cancion[] cancion = album.contiene_cancion.toArray();
				for(Cancion can : cancion) {
					canciones.add(can);
				}
		}
		Collections.shuffle(canciones);
		Cancion[] masexitosas = new Cancion[canciones.size()];
		canciones.toArray(masexitosas);
		t.commit();
		
		return masexitosas;
		}catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}

	public Cancion[] cargar_Ultimos_Exitos_Admin() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Buscadas(String aNombre) throws PersistentException{
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
		CancionCriteria cc = new CancionCriteria();
		cc.titulo.like("%"+aNombre+"%");
		Cancion[] canciones = CancionDAO.listCancionByCriteria(cc);
		t.commit();
		return canciones;
		}catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}

	public void Modificar_Canciones_Mostradas(int aNumero_Canciones) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		Ultimos_exitos.numeroUltimosExitos = aNumero_Canciones;
		t.commit();
	}

	public void Anadir_a_la_vista_de_cibernauta(int aIdCancion) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador admin = AdministradorDAO.loadAdministradorByQuery("Nombre='Administrador'", null);
			admin.ultimo_exito.add(CancionDAO.getCancionByORMID(aIdCancion));
//			CancionDAO.save(CancionDAO.getCancionByORMID(aIdCancion));
//			AdministradorDAO.save(admin);
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}

	}

	public void Eliminar_Ultimo_Exito(int aIdCancion) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador admin = AdministradorDAO.loadAdministradorByQuery("Nombre='Administrador'", null);
			admin.ultimo_exito.remove(CancionDAO.getCancionByORMID(aIdCancion));
//			CancionDAO.save(CancionDAO.getCancionByORMID(aIdCancion));
//			AdministradorDAO.save(admin);
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
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

	public void eliminar_Cancion(int aIdCancion) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			cancion.contendor_cancion.clear();
			cancion.favorita_de.clear();
			cancion.horass.clear();
			Lista_Reproduccion[]listas = cancion.contendor_cancion.toArray();
			for(Lista_Reproduccion lista: listas) {
				lista.contiene_cancion.remove(cancion);
			}
			Artista[]artistas = cancion.es_de.toArray();
			for(Artista artista: artistas) {
				cancion.es_de.remove(artista);
			}
			CancionDAO.delete(cancion);
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
	}

	public void Modificar_cancion(int aIdCancion, String aArchivoMultimedia, String aInterpretes, String aProductores, String aCompositores, String aTitulo, String aTituloCredito, String aTitulo_Album) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion cancion = CancionDAO.loadCancionByORMID(aIdCancion);
			cancion.setArchivoMultimedia(aArchivoMultimedia);
			cancion.setCompositores(aCompositores);
			cancion.setIntepretes(aInterpretes);
			cancion.setProductores(aProductores);
			cancion.setTitulo(aTitulo);
			cancion.setTituloCreditos(aTituloCredito+ "\n" + aTitulo_Album);
			CancionDAO.save(cancion);
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
	}
}