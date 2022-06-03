/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Estilo;
import basededatos.EstiloDAO;
import basededatos.EventoDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
import basededatos.Imagen;
import basededatos.ImagenDAO;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;
public class CreateA12Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.A12PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Album baseDeDatosAlbum = basededatos.AlbumDAO.createAlbum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : autor, contiene_imagen
			basededatos.AlbumDAO.save(baseDeDatosAlbum);
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seguidor_usuario, horass, favorita, recibe_notificacion, seguido, propietario, seguir, tipoUsuario, contiene_imagen
			basededatos.UsuarioDAO.save(baseDeDatosUsuario);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.Artista baseDeDatosArtista = basededatos.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece, crea, propietario_album, tiene
			basededatos.ArtistaDAO.save(baseDeDatosArtista);
			basededatos.Cancion baseDeDatosCancion = basededatos.CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : favorita_de, es_de, contendor_cancion, horass
			basededatos.CancionDAO.save(baseDeDatosCancion);
			basededatos.Lista_Reproduccion baseDeDatosLista_Reproduccion = basededatos.Lista_ReproduccionDAO.createLista_Reproduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_cancion, autor, seguidor
			basededatos.Lista_ReproduccionDAO.save(baseDeDatosLista_Reproduccion);
			basededatos.Usuario_Registrado baseDeDatosUsuario_Registrado = basededatos.Usuario_RegistradoDAO.createUsuario_Registrado();
			// Initialize the properties of the persistent object here
			basededatos.Usuario_RegistradoDAO.save(baseDeDatosUsuario_Registrado);
			basededatos.Imagen baseDeDatosImagen = basededatos.ImagenDAO.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : imagen_de, contenedor_imagen_album
			basededatos.ImagenDAO.save(baseDeDatosImagen);
			basededatos.Estilo baseDeDatosEstilo = basededatos.EstiloDAO.createEstilo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cantado_por
			basededatos.EstiloDAO.save(baseDeDatosEstilo);
			basededatos.Evento baseDeDatosEvento = basededatos.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : genera_notificacion, creado_por
			basededatos.EventoDAO.save(baseDeDatosEvento);
			basededatos.Horas baseDeDatosHoras = basededatos.HorasDAO.createHoras();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, cancion, horas
			basededatos.HorasDAO.save(baseDeDatosHoras);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	public static void main(String[] args) {
		try {
            Administrador admin = AdministradorDAO.getAdministradorByORMID(4);
            Cancion cancion = CancionDAO.loadCancionByORMID(1);
            admin.ultimo_exito.add(cancion);
            AdministradorDAO.save(admin);
        } catch (PersistentException e) {
            // TODO: handle exception
            e.printStackTrace();
	}



}
}
