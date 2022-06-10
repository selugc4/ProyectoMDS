/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import java.util.ArrayList;

import org.orm.*;

import basededatos.A12PersistentManager;
import basededatos.Administrador;
import basededatos.AdministradorDAO;
import basededatos.Album;
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
import basededatos.Imagen;
import basededatos.ImagenDAO;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import basededatos.Usuario;
import basededatos.UsuarioDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;
import bds.BDPrincipal;
import bds.iActor_comun;
import clases.Actor_comun;
import clases.Cancion__Vista_actor_comun_;
import clases.Cancion_administrador;
import clases.Estilos_buscados;
import clases.Ver_estadisticas;
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
	public static void main(String[] args) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("Correo='jesus@cambio.es'", null);
			Cancion[] cancionesf = usuario.favorita.toArray();
			for(Cancion cancion: cancionesf) {
				cancion.favorita_de.remove(usuario);
			}
			
			
			Horas[] horas = usuario.horass.toArray();
			for(Horas hora: horas) {
				usuario.horass.remove(hora);
				HorasDAO.delete(hora);
			}
			Lista_Reproduccion[]listas = usuario.propietario.toArray();
			for(Lista_Reproduccion lista: listas) {
				Usuario[]usuarios = lista.seguidor.toArray();
				for(Usuario usuario1: usuarios) {
					lista.seguidor.remove(usuario1);
				}
		
			Cancion[] cancionesl = lista.contiene_cancion.toArray();
			for(Cancion cancionl: cancionesl) {
				lista.contiene_cancion.remove(cancionl);
			}
			Lista_ReproduccionDAO.delete(lista);
			}
			Evento[]eventos = usuario.recibe_notificacion.toArray();
			for(Evento evento: eventos) {
				usuario.recibe_notificacion.remove(evento);
			}
			Usuario[]usuariosS=usuario.seguido.toArray();
			for(Usuario usuarioS:usuariosS) {
				usuario.seguido.remove(usuarioS);
			}
			Usuario[]usuariosU=usuario.seguidor_usuario.toArray();
			for(Usuario usuarioU:usuariosU) {
				usuario.seguidor_usuario.remove(usuarioU);
			}
			Cancion[] cancionesu = usuario.ultimo_exito.toArray();
			for(Cancion cancion: cancionesu) {
				usuario.ultimo_exito.remove(cancion);
			}
		
			Usuario_RegistradoDAO.delete(usuario);
			ImagenDAO.delete(usuario.getContiene_imagen());
			t.commit();
		}catch (PersistentException e) {
			t.rollback();
		}
	}

}
