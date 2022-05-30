/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateA12Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.A12PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Album baseDeDatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AlbumDAO.save(baseDeDatosAlbum);
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioDAO.save(baseDeDatosUsuario);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.Artista baseDeDatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ArtistaDAO.save(baseDeDatosArtista);
			basededatos.Cancion baseDeDatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CancionDAO.save(baseDeDatosCancion);
			basededatos.Lista_Reproduccion baseDeDatosLista_Reproduccion = basededatos.Lista_ReproduccionDAO.loadLista_ReproduccionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Lista_ReproduccionDAO.save(baseDeDatosLista_Reproduccion);
			basededatos.Usuario_Registrado baseDeDatosUsuario_Registrado = basededatos.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Usuario_RegistradoDAO.save(baseDeDatosUsuario_Registrado);
			basededatos.Imagen baseDeDatosImagen = basededatos.ImagenDAO.loadImagenByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ImagenDAO.save(baseDeDatosImagen);
			basededatos.Estilo baseDeDatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EstiloDAO.save(baseDeDatosEstilo);
			basededatos.Evento baseDeDatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EventoDAO.save(baseDeDatosEvento);
			basededatos.Horas baseDeDatosHoras = basededatos.HorasDAO.loadHorasByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.HorasDAO.save(baseDeDatosHoras);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Album by AlbumCriteria");
		basededatos.AlbumCriteria baseDeDatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosAlbumCriteria.idAlbum.eq();
		System.out.println(baseDeDatosAlbumCriteria.uniqueAlbum());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		basededatos.UsuarioCriteria baseDeDatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioCriteria.ID.eq();
		System.out.println(baseDeDatosUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosAdministradorCriteria.ID.eq();
		System.out.println(baseDeDatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		basededatos.ArtistaCriteria baseDeDatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosArtistaCriteria.ID.eq();
		System.out.println(baseDeDatosArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving Cancion by CancionCriteria");
		basededatos.CancionCriteria baseDeDatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosCancionCriteria.idCancion.eq();
		System.out.println(baseDeDatosCancionCriteria.uniqueCancion());
		
		System.out.println("Retrieving Lista_Reproduccion by Lista_ReproduccionCriteria");
		basededatos.Lista_ReproduccionCriteria baseDeDatosLista_ReproduccionCriteria = new basededatos.Lista_ReproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosLista_ReproduccionCriteria.idLista.eq();
		System.out.println(baseDeDatosLista_ReproduccionCriteria.uniqueLista_Reproduccion());
		
		System.out.println("Retrieving Usuario_Registrado by Usuario_RegistradoCriteria");
		basededatos.Usuario_RegistradoCriteria baseDeDatosUsuario_RegistradoCriteria = new basededatos.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuario_RegistradoCriteria.ID.eq();
		System.out.println(baseDeDatosUsuario_RegistradoCriteria.uniqueUsuario_Registrado());
		
		System.out.println("Retrieving Imagen by ImagenCriteria");
		basededatos.ImagenCriteria baseDeDatosImagenCriteria = new basededatos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosImagenCriteria.idImagen.eq();
		System.out.println(baseDeDatosImagenCriteria.uniqueImagen());
		
		System.out.println("Retrieving Estilo by EstiloCriteria");
		basededatos.EstiloCriteria baseDeDatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosEstiloCriteria.idEstilo.eq();
		System.out.println(baseDeDatosEstiloCriteria.uniqueEstilo());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		basededatos.EventoCriteria baseDeDatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosEventoCriteria.idEvento.eq();
		System.out.println(baseDeDatosEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Horas by HorasCriteria");
		basededatos.HorasCriteria baseDeDatosHorasCriteria = new basededatos.HorasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosHorasCriteria.ID.eq();
		System.out.println(baseDeDatosHorasCriteria.uniqueHoras());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateA12Data retrieveAndUpdateA12Data = new RetrieveAndUpdateA12Data();
			try {
				retrieveAndUpdateA12Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateA12Data.retrieveByCriteria();
			}
			finally {
				basededatos.A12PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
