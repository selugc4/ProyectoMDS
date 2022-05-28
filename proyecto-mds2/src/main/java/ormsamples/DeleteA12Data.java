/**
 * Licensee: jesus(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteA12Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.A12PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Album baseDeDatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Delete the persistent object
			basededatos.AlbumDAO.delete(baseDeDatosAlbum);
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioDAO.delete(baseDeDatosUsuario);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(baseDeDatosAdministrador);
			basededatos.Artista baseDeDatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			basededatos.ArtistaDAO.delete(baseDeDatosArtista);
			basededatos.Cancion baseDeDatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Delete the persistent object
			basededatos.CancionDAO.delete(baseDeDatosCancion);
			basededatos.Lista_Reproduccion baseDeDatosLista_Reproduccion = basededatos.Lista_ReproduccionDAO.loadLista_ReproduccionByQuery(null, null);
			// Delete the persistent object
			basededatos.Lista_ReproduccionDAO.delete(baseDeDatosLista_Reproduccion);
			basededatos.Usuario_Registrado baseDeDatosUsuario_Registrado = basededatos.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Delete the persistent object
			basededatos.Usuario_RegistradoDAO.delete(baseDeDatosUsuario_Registrado);
			basededatos.Imagen baseDeDatosImagen = basededatos.ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			basededatos.ImagenDAO.delete(baseDeDatosImagen);
			basededatos.Estilo baseDeDatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Delete the persistent object
			basededatos.EstiloDAO.delete(baseDeDatosEstilo);
			basededatos.Evento baseDeDatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			basededatos.EventoDAO.delete(baseDeDatosEvento);
			basededatos.Horas baseDeDatosHoras = basededatos.HorasDAO.loadHorasByQuery(null, null);
			// Delete the persistent object
			basededatos.HorasDAO.delete(baseDeDatosHoras);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteA12Data deleteA12Data = new DeleteA12Data();
			try {
				deleteA12Data.deleteTestData();
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
