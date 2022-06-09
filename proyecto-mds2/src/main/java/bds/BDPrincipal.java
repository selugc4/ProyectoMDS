package bds;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

import basededatos.Album;
import basededatos.Artista;
import basededatos.Cancion;
import basededatos.Estilo;
import basededatos.Evento;
import basededatos.Imagen;
import basededatos.Lista_Reproduccion;
import basededatos.Usuario;
import basededatos.Usuario_Registrado;
import basededatos.UsuarioDAO;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_RegistradoDAO;
import clases.Actor_comun;
import clases.Ver_perfil_propio;
import proyectoMDS2.MainView;

public class BDPrincipal implements iUsuario_registrado, iCibernauta, iArtista, iActor_comun, iAdministrador {
	public BD_Administrador _bd_administrador = new BD_Administrador();
	public BD_Album _bd_album = new BD_Album();
	public BD_Artista _bd_artista = new BD_Artista();
	public BD_Imagen _bd_imagen = new BD_Imagen();
	public BD_Lista_Reproduccion _bd_lista_reproduccion = new BD_Lista_Reproduccion();
	public BD_Cancion _bd_cancion = new BD_Cancion();
	public BD_Usuario_Registrado _bd_usuario_registrado = new BD_Usuario_Registrado();
	public BD_Evento _bd_evento = new BD_Evento();
	public BD_Estilo _bd_estilo = new BD_Estilo();

	public Usuario cargar_Perfil(int iD) {
		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(iD);
			if(usuario.getTipoUsuario() == 0) {
				return _bd_usuario_registrado.cargar_Perfil(iD);
			}else if(usuario.getTipoUsuario() == 1) { 	
			return _bd_artista.cargar_Perfil(iD);
			}else if(usuario.getTipoUsuario() == 2) {
				return _bd_administrador.cargar_Perfil(iD);
			}else
				return null;
			
		
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

	public void modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo) {
		try {
			if(consultar_Correo(aCorreoNuevo)) {
				Ver_perfil_propio.correoexistente = true;
			}else {
				Ver_perfil_propio.correoexistente = false;
				_bd_usuario_registrado.modificar_Correo(aCorreoAntiguo, aCorreoNuevo);
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Darse_de_baja(String aCorreo) {
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByQuery("Correo='"+aCorreo+"'", null);
			if(usuario.getTipoUsuario() == 0) {
			_bd_usuario_registrado.Eliminar_usuario(aCorreo);
			}else if(usuario.getTipoUsuario() == 2) {
				_bd_artista.Darse_de_baja(aCorreo);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Seguir_Usuario(String aCorreoSeguidor, String aCorreoSeguido) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Ultimos_Exitos() {

		try {
			return _bd_cancion.cargar_Ultimos_Exitos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void consultar_Datos(String aNombre, String aContrasena) {
		try {			
			if(_bd_usuario_registrado.consultar_Datos(aNombre, aContrasena)){
				MainView.usuario = 0;
			}else if(_bd_artista.consultar_Datos(aNombre, aContrasena)) {
				MainView.usuario = 1;			
			}else if(_bd_administrador.consultar_Datos(aNombre, aContrasena)) {
				MainView.usuario = 2;
			}else
				MainView.usuario = -1;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

	public void guardar_Datos(String aNombre, String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void registrar_Usuario() {
		throw new UnsupportedOperationException();
	}

	public void guardar_Datos(String aEmail, String aNombre, String aContrasena, String aFoto) {
		try {
			_bd_usuario_registrado.guardar_Datos(aEmail, aNombre, aContrasena, aFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean validar_Datos(String aNombre, String aEmail) {
		
		try {
			if(_bd_usuario_registrado.validar_Datos(aNombre, aEmail) && _bd_artista.validar_Datos(aNombre, aEmail) && _bd_administrador.validar_Datos(aNombre, aEmail)){
				return true;
			} else
				return false;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

	public boolean consultar_Correo(String aCorreo) {
		try {
			if(_bd_administrador.consultar_Correo(aCorreo) || _bd_artista.consultar_Correo(aCorreo) || _bd_usuario_registrado.consultar_Correo(aCorreo)) {
				return true;
			}else
				return false;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void guardar_Contrasena(String aContrasena, String aCorreo) {
	
		try {
			Usuario user = UsuarioDAO.loadUsuarioByQuery("Correo='" +aCorreo+"'",null);
			if(user.getTipoUsuario() == 0) {
				_bd_usuario_registrado.guardar_Contrasena(aContrasena, aCorreo);
			}else if(user.getTipoUsuario() == 1) {
				_bd_artista.guardar_Contrasena(aContrasena, aCorreo);
			}else if(user.getTipoUsuario() == 2) {
				_bd_administrador.guardar_Contrasena(aContrasena, aCorreo);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void cargar_Creditos(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Albumes_Artista(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Artistas_Perfil(Object aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Exitosas(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Listas_Sus_Canciones(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Eventos(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_foto(String aFoto, String aCorreo) {
		try {
			_bd_artista.Modificar_foto(aFoto, aCorreo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_artista(String aCorreoSeguidor, String aCorreoSeguido) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_Evento(String aCorreo, String aNombre, String aFecha, String aTipoEvento) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Ultimas_Canciones_Reproducidas() {
		try {
			return _bd_cancion.cargar_Ultimas_Canciones_Reproducidas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Cancion[] cargar_Recomendaciones() {
		try {
			return _bd_cancion.cargar_Recomendaciones();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Cancion[] cargar_Canciones_Favoritas() {
		try {
			return _bd_cancion.cargar_Canciones_Favoritas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Cancion obtener_Estadisticas(int iD) {	
		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(iD);
			if(usuario.getTipoUsuario() == 0) {
				return _bd_usuario_registrado.obtener_Estadisticas(iD);
			}else if(usuario.getTipoUsuario() == 1) {
				return _bd_artista.obtener_Estadisticas(iD);
			}else
				return _bd_administrador.obtener_Estadisticas(iD);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

	public Lista_Reproduccion[] cargar_Listas_Reproduccion() {
		try {
			return _bd_lista_reproduccion.cargar_Listas_Reproduccion();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	public void cargar_Canciones_Busqueda(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_Artistas_Buscador(String aNombre) {
		try {
			return _bd_artista.cargar_Artistas_Buscador(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void cargar_Albumes_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Lista_Reproduccion[] cargar_Listas_Buscador(String aNombre) {
		try {
			return _bd_lista_reproduccion.cargar_Listas_Buscador(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void anadir_Favorita(int aIdCancion, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Seguidor(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Datos_Cancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Cancion_Favorita(int aIdCancion, int iD) {
			try {
				_bd_lista_reproduccion.anadir_Cancion_Favorita(aIdCancion, iD);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
	}

	public void anadir_Cancion_Lista(int aIdCancion, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void obtener_Canciones_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void seguir_Lista(int aIdLista, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Lista(int aIdLista) {
		try {
			return _bd_cancion.cargar_Canciones_Lista(aIdLista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Lista_Reproduccion[] cargar_Listas_Propias(int id) {
		try {
			return _bd_lista_reproduccion.cargar_Listas_Propias(id);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void cargar_Listas_Reproduccion_Ajenas(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Modificar(int aIdLista) {
		try {
			return _bd_lista_reproduccion.cargar_Canciones_Modificar(aIdLista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void eliminar_Cancion_Lista(int aIdLista, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Lista(int aIdCancion, String nombrelista) {
		try {
			_bd_cancion.anadir_Lista(aIdCancion, nombrelista);
		} catch (PersistentException e) {
			Notification.show("La lista ya contiene esta canción");
		}
	}

	public Cancion[] cargar_Canciones_Buscador(String aNombre) {
		try {
			return _bd_cancion.cargar_Canciones_Buscador(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void eliminar_Lista_Reproduccion(int idLista) {
		try {
			_bd_lista_reproduccion.eliminar_Lista_Reproduccion(idLista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void cargar_Ultimos_Exitos_Admin() {
		throw new UnsupportedOperationException();
	}

	public Estilo[] cargar_Estilos(String aNombre) {
		try{
			return _bd_estilo.cargar_Estilos(aNombre);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Cancion[] cargar_Canciones_Buscadas(String aNombre) {
		try {
			return _bd_cancion.cargar_Canciones_Buscadas(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void Modificar_Canciones_Mostradas(int aNumero_Canciones) {
		try {
			_bd_cancion.Modificar_Canciones_Mostradas(aNumero_Canciones);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Eliminar_estilo(int aIdEstilo) {
		try {
			_bd_estilo.Eliminar_estilo(aIdEstilo);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Anadir_a_la_vista_de_cibernauta(int aIdCancion) {
		try {
			this._bd_cancion.Anadir_a_la_vista_de_cibernauta(aIdCancion);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Eliminar_Ultimo_Exito(int aIdCancion) {
		try {
			this._bd_cancion.Eliminar_Ultimo_Exito(aIdCancion);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Dar_alta_artista(String aCorreo, String aNombre, String aContrasena, String[] aEstilos, String aFoto) {
		try {
			_bd_artista.Dar_alta_artista(aCorreo, aNombre, aContrasena, aEstilos, aFoto);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Dar_alta_cancion(String aTitulo, String aTitulo_Creditos, String aTitulo_Album, String aCompositores, String aProductores, String aInterpretes, String aArchivoMultimedia) {
		try {
			 _bd_cancion.Dar_alta_cancion(aTitulo, aTitulo_Creditos, aTitulo_Album, aCompositores, aProductores, aInterpretes, aArchivoMultimedia);;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void Anadir_estilo(String aNombre) {
		try {
			_bd_estilo.Anadir_estilo(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargar_Canciones_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_cancion_a_album(int aIdCancion, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Dar_alta_album(String aNombre, Cancion[] aCanciones, Artista[] aArtistas, String aImagen, String fechaedicion) {
		try {
			_bd_album.Dar_alta_album(aNombre, aCanciones, aArtistas, aImagen, fechaedicion);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado[] cargar_Usuarios(String aNombre) {
		try {
			return _bd_usuario_registrado.cargar_Usuarios(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void Modificar_usuario(String aNombre, String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_usuario(String aCorreo) {
		try {
			_bd_usuario_registrado.Eliminar_usuario(aCorreo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_Album(int aIdAlbum) {
			try {
				_bd_album.eliminar_Album(aIdAlbum);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void eliminar_Artista(String aCorreo) {
		try {
			_bd_artista.Eliminar_artista(aCorreo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_Cancion(int aIdCancion) {
		try {
			_bd_cancion.eliminar_Cancion(aIdCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Eliminar_lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Cancion(int aIdCancion, String aArchivoMultimedia, String aInterpretes, String aProductores, String aCompositores, String aTitulo, String aTituloCreditos, String aTitulo_Album) {
		try {
			_bd_cancion.Modificar_cancion(aIdCancion, aArchivoMultimedia, aInterpretes, aProductores, aCompositores, aTitulo, aTituloCreditos, aTitulo_Album);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Modificar_album(int aIdAlbum, String aTituloAlbum, Cancion[] aCanciones, String aImagen, Artista[] aArtistas) {
		try {
			_bd_album.Modificar_Album(aIdAlbum, aTituloAlbum, aCanciones, aImagen, aArtistas);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Modificar_Estilo(int aIdEstilo, String aNombre) {
		try {
			_bd_estilo.Modificar_Estilo(aIdEstilo, aNombre);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Album[] cargar_Albumes_Admin(String aNombre) {
		try {
			return _bd_album.cargar_Albumes_Admin(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Evento[] obtener_Notificaciones(int iD) {
		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(iD);
			if(usuario.getTipoUsuario() == 0) {
				return _bd_usuario_registrado.obtener_Notificaciones(iD);
			}else if(usuario.getTipoUsuario() == 1) {
				return _bd_artista.obtener_Notificaciones(iD);
			}else
				return _bd_administrador.obtener_Notificaciones(iD);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

	public void eliminar_Notificacion(int iD, String artistaevento, String nombreevento) {
		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(iD);
			if(usuario.getTipoUsuario() == 0) {
				_bd_usuario_registrado.eliminar_Notificacion(iD, artistaevento, nombreevento);
			}else if(usuario.getTipoUsuario() == 1) {
				_bd_artista.eliminar_Notificacion(iD, artistaevento, nombreevento);
			}else
				_bd_administrador.eliminar_Notificacion(iD, artistaevento, nombreevento);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
		}
		
	}

	public void crear_Lista(String aNombre_Lista, ArrayList<clases.Cancion> arrayList) {
		try {
			_bd_lista_reproduccion.crear_Lista(aNombre_Lista, arrayList);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public void guardar_Modificacion_lista(int iD, String value, ArrayList<clases.Cancion> get_canciones) {
		try {
			_bd_lista_reproduccion.guardar_Modificacion_lista(iD,value,get_canciones);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}