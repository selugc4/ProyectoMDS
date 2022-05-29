/**
 * Licensee: jesus(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;

import basededatos.A12PersistentManager;
import basededatos.Album;
import basededatos.AlbumDAO;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.CancionDAO;
import basededatos.Estilo;
import basededatos.EstiloDAO;
import basededatos.Evento;
import basededatos.EventoDAO;
import basededatos.Horas;
import basededatos.HorasDAO;
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
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_cancion, autor
			basededatos.AlbumDAO.save(baseDeDatosAlbum);
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seguidor_usuario, horass, Ultimo_exito, favorita, recibe_notificacion, seguido, propietario, seguir, tipoUsuario
			basededatos.UsuarioDAO.save(baseDeDatosUsuario);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.Artista baseDeDatosArtista = basededatos.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece, crea, propietario_album, tiene
			basededatos.ArtistaDAO.save(baseDeDatosArtista);
			basededatos.Cancion baseDeDatosCancion = basededatos.CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Administrado_por, favorita_de, es_de, contendor_cancion, cancion_de, horass
			basededatos.CancionDAO.save(baseDeDatosCancion);
			basededatos.Lista_Reproduccion baseDeDatosLista_Reproduccion = basededatos.Lista_ReproduccionDAO.createLista_Reproduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_cancion, autor, seguidor
			basededatos.Lista_ReproduccionDAO.save(baseDeDatosLista_Reproduccion);
			basededatos.Usuario_Registrado baseDeDatosUsuario_Registrado = basededatos.Usuario_RegistradoDAO.createUsuario_Registrado();
			// Initialize the properties of the persistent object here
			basededatos.Usuario_RegistradoDAO.save(baseDeDatosUsuario_Registrado);
			basededatos.Imagen baseDeDatosImagen = basededatos.ImagenDAO.createImagen();
			// Initialize the properties of the persistent object here
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
	
	public static void main(String[] args) throws PersistentException {
//		try {
//			CreateA12Data createA12Data = new CreateA12Data();
//			try {
//				createA12Data.createTestData();
//			}
//			finally {
//				basededatos.A12PersistentManager.instance().disposePersistentManager();
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_cancion, autor
			//CREADOR ALBUM
//			Album album = AlbumDAO.createAlbum();
//			album.setTitutloAlbum("Prueba");
//			album.setFechaEdicion("29/05/2022");
//			album.contiene_cancion.add(CancionDAO.getCancionByORMID(2));
//			album.autor.add(ArtistaDAO.getArtistaByORMID(2));
//			AlbumDAO.save(album);						
//		
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seguidor_usuario, horass, Ultimo_exito, favorita, recibe_notificacion, seguido, propietario, seguir, tipoUsuario
			//CREADOR USUARIO - REGISTRADO O ARTISTA 	
		
//			int tipoUsuario = 1;			
//			if(tipoUsuario == 1) {
//				Usuario_Registrado usuario = Usuario_RegistradoDAO.createUsuario_Registrado();
//				usuario.setNombre("Jesus");
//				usuario.setContrasena("password");
//				usuario.setCorreo("jcg449@inlumine.ual.es");
//				usuario.setFoto("fotoDefault.jpg");
//				usuario.setTipoUsuario(1);
//				usuario.seguidor_usuario.add(usuario);
//				usuario.horass.add(HorasDAO.getHorasByORMID(2));
//				usuario.ultimo_exito.add(CancionDAO.getCancionByORMID(1));
//				usuario.favorita.add(CancionDAO.getCancionByORMID(1));
//				usuario.recibe_notificacion.add(EventoDAO.getEventoByORMID(2));
//				usuario.seguido.add(usuario);
//				Lista_Reproduccion lr = Lista_ReproduccionDAO.createLista_Reproduccion();
//				lr.seguidor.add(usuario);
//				lr.setAutor(usuario);
//				Lista_ReproduccionDAO.save(lr);
//				usuario.propietario.add(lr);
//				usuario.seguir.add(lr);
//				Usuario_RegistradoDAO.save(usuario);
//			}else if(tipoUsuario == 2) {
//				Artista usuario = ArtistaDAO.createArtista();
//				usuario.setNombre("Jesus");
//				usuario.setContrasena("password");
//				usuario.setCorreo("jcg449@inlumine.ual.es");
//				usuario.setFoto("fotoDefault.jpg");
//				usuario.setTipoUsuario(1);
//				usuario.seguidor_usuario.add(usuario);
//				usuario.horass.add(HorasDAO.getHorasByORMID(2));
//				usuario.ultimo_exito.add(CancionDAO.getCancionByORMID(1));
//				usuario.favorita.add(CancionDAO.getCancionByORMID(1));
//				usuario.recibe_notificacion.add(EventoDAO.getEventoByORMID(2));
//				usuario.seguido.add(usuario);
//				Lista_Reproduccion lr = Lista_ReproduccionDAO.createLista_Reproduccion();
//				
//				lr.seguidor.add(usuario);
//				lr.setAutor(usuario);
//				Lista_ReproduccionDAO.save(lr);
//				
//				usuario.propietario.add(lr);
//				usuario.seguir.add(lr);
				
		
			
			//LISTA DE REPRODUCCION
//			Lista_Reproduccion lr = Lista_ReproduccionDAO.createLista_Reproduccion();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_cancion, autor, seguidor
//
//			lr.setAutor(UsuarioDAO.getUsuarioByORMID(2));
//			lr.setNombreLista("Prueba");
//			lr.contiene_cancion.add(CancionDAO.getCancionByORMID(2));
//			lr.seguidor.add(UsuarioDAO.getUsuarioByORMID(2));
//			Lista_ReproduccionDAO.save(lr);
//			
			
		
			//ESTILO
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cantado_por
//
//			Estilo estilo = EstiloDAO.createEstilo();
//			estilo.setNombre("Pop");
//			estilo.cantado_por.add(ArtistaDAO.getArtistaByORMID(2));
//			EstiloDAO.save(estilo);
		
			//EVENTO
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : genera_notificacion, creado_por

			
//			Evento evento = EventoDAO.createEvento();
//			evento.setCreado_por(ArtistaDAO.getArtistaByORMID(2));
//			evento.genera_notificacion.add(UsuarioDAO.getUsuarioByORMID(2));
//			evento.setFecha("29/05/2022");
//			evento.setNombre("Prueba");
//			evento.setTipoEvento("Concierto");
//			EventoDAO.save(evento);
//		
			
			//CANCION
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Administrado_por, favorita_de, es_de, contendor_cancion, cancion_de, horass
//
//			Cancion cancion = CancionDAO.createCancion();
//			Usuario aux = UsuarioDAO.getUsuarioByORMID(2);
//			cancion.setTitulo("Prueba");
//			cancion.setTituloCreditos("Prueba" + "\n" + "Prueba");					
//			cancion.setCompositores("Prueba");
//			cancion.setIntepretes("Prueba");
//			cancion.setProductores("Prueba");
//			cancion.setArchivoMultimedia("Prueba");
//			cancion.setAdministrado_por(aux);
//			cancion.favorita_de.add(aux);
//			cancion.es_de.add(ArtistaDAO.getArtistaByORMID(2));
//			cancion.setContendor_cancion(Lista_ReproduccionDAO.getLista_ReproduccionByORMID(2));				
//			cancion.setCancion_de(AlbumDAO.getAlbumByORMID(2));			
//			
//			Horas h = HorasDAO.createHoras();		
//			cancion.horass.add(h);
//			h.setCancion(cancion);
//			h.setUsuario(aux);			
//			CancionDAO.save(cancion);
//			
//			
//			HorasDAO.save(h);
		
			
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}
