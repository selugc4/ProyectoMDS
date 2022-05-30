/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListA12Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Album...");
		basededatos.Album[] baseDeDatosAlbums = basededatos.AlbumDAO.listAlbumByQuery(null, null);
		int length = Math.min(baseDeDatosAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		basededatos.Usuario[] baseDeDatosUsuarios = basededatos.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(baseDeDatosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] baseDeDatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(baseDeDatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		basededatos.Artista[] baseDeDatosArtistas = basededatos.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(baseDeDatosArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cancion...");
		basededatos.Cancion[] baseDeDatosCancions = basededatos.CancionDAO.listCancionByQuery(null, null);
		length = Math.min(baseDeDatosCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista_Reproduccion...");
		basededatos.Lista_Reproduccion[] baseDeDatosLista_Reproduccions = basededatos.Lista_ReproduccionDAO.listLista_ReproduccionByQuery(null, null);
		length = Math.min(baseDeDatosLista_Reproduccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosLista_Reproduccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Registrado...");
		basededatos.Usuario_Registrado[] baseDeDatosUsuario_Registrados = basededatos.Usuario_RegistradoDAO.listUsuario_RegistradoByQuery(null, null);
		length = Math.min(baseDeDatosUsuario_Registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuario_Registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		basededatos.Imagen[] baseDeDatosImagens = basededatos.ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(baseDeDatosImagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosImagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estilo...");
		basededatos.Estilo[] baseDeDatosEstilos = basededatos.EstiloDAO.listEstiloByQuery(null, null);
		length = Math.min(baseDeDatosEstilos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosEstilos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		basededatos.Evento[] baseDeDatosEventos = basededatos.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(baseDeDatosEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Horas...");
		basededatos.Horas[] baseDeDatosHorases = basededatos.HorasDAO.listHorasByQuery(null, null);
		length = Math.min(baseDeDatosHorases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosHorases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Album by Criteria...");
		basededatos.AlbumCriteria baseDeDatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosAlbumCriteria.idAlbum.eq();
		baseDeDatosAlbumCriteria.setMaxResults(ROW_COUNT);
		basededatos.Album[] baseDeDatosAlbums = baseDeDatosAlbumCriteria.listAlbum();
		int length =baseDeDatosAlbums== null ? 0 : Math.min(baseDeDatosAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		basededatos.UsuarioCriteria baseDeDatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioCriteria.ID.eq();
		baseDeDatosUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario[] baseDeDatosUsuarios = baseDeDatosUsuarioCriteria.listUsuario();
		length =baseDeDatosUsuarios== null ? 0 : Math.min(baseDeDatosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosAdministradorCriteria.ID.eq();
		baseDeDatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] baseDeDatosAdministradors = baseDeDatosAdministradorCriteria.listAdministrador();
		length =baseDeDatosAdministradors== null ? 0 : Math.min(baseDeDatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		basededatos.ArtistaCriteria baseDeDatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosArtistaCriteria.ID.eq();
		baseDeDatosArtistaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Artista[] baseDeDatosArtistas = baseDeDatosArtistaCriteria.listArtista();
		length =baseDeDatosArtistas== null ? 0 : Math.min(baseDeDatosArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing Cancion by Criteria...");
		basededatos.CancionCriteria baseDeDatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosCancionCriteria.idCancion.eq();
		baseDeDatosCancionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cancion[] baseDeDatosCancions = baseDeDatosCancionCriteria.listCancion();
		length =baseDeDatosCancions== null ? 0 : Math.min(baseDeDatosCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
		System.out.println("Listing Lista_Reproduccion by Criteria...");
		basededatos.Lista_ReproduccionCriteria baseDeDatosLista_ReproduccionCriteria = new basededatos.Lista_ReproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosLista_ReproduccionCriteria.idLista.eq();
		baseDeDatosLista_ReproduccionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Lista_Reproduccion[] baseDeDatosLista_Reproduccions = baseDeDatosLista_ReproduccionCriteria.listLista_Reproduccion();
		length =baseDeDatosLista_Reproduccions== null ? 0 : Math.min(baseDeDatosLista_Reproduccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosLista_Reproduccions[i]);
		}
		System.out.println(length + " Lista_Reproduccion record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Registrado by Criteria...");
		basededatos.Usuario_RegistradoCriteria baseDeDatosUsuario_RegistradoCriteria = new basededatos.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuario_RegistradoCriteria.ID.eq();
		baseDeDatosUsuario_RegistradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario_Registrado[] baseDeDatosUsuario_Registrados = baseDeDatosUsuario_RegistradoCriteria.listUsuario_Registrado();
		length =baseDeDatosUsuario_Registrados== null ? 0 : Math.min(baseDeDatosUsuario_Registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuario_Registrados[i]);
		}
		System.out.println(length + " Usuario_Registrado record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		basededatos.ImagenCriteria baseDeDatosImagenCriteria = new basededatos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosImagenCriteria.idImagen.eq();
		baseDeDatosImagenCriteria.setMaxResults(ROW_COUNT);
		basededatos.Imagen[] baseDeDatosImagens = baseDeDatosImagenCriteria.listImagen();
		length =baseDeDatosImagens== null ? 0 : Math.min(baseDeDatosImagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosImagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Estilo by Criteria...");
		basededatos.EstiloCriteria baseDeDatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosEstiloCriteria.idEstilo.eq();
		baseDeDatosEstiloCriteria.setMaxResults(ROW_COUNT);
		basededatos.Estilo[] baseDeDatosEstilos = baseDeDatosEstiloCriteria.listEstilo();
		length =baseDeDatosEstilos== null ? 0 : Math.min(baseDeDatosEstilos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosEstilos[i]);
		}
		System.out.println(length + " Estilo record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		basededatos.EventoCriteria baseDeDatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosEventoCriteria.idEvento.eq();
		baseDeDatosEventoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Evento[] baseDeDatosEventos = baseDeDatosEventoCriteria.listEvento();
		length =baseDeDatosEventos== null ? 0 : Math.min(baseDeDatosEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Horas by Criteria...");
		basededatos.HorasCriteria baseDeDatosHorasCriteria = new basededatos.HorasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosHorasCriteria.ID.eq();
		baseDeDatosHorasCriteria.setMaxResults(ROW_COUNT);
		basededatos.Horas[] baseDeDatosHorases = baseDeDatosHorasCriteria.listHoras();
		length =baseDeDatosHorases== null ? 0 : Math.min(baseDeDatosHorases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosHorases[i]);
		}
		System.out.println(length + " Horas record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListA12Data listA12Data = new ListA12Data();
			try {
				listA12Data.listTestData();
				//listA12Data.listByCriteria();
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
