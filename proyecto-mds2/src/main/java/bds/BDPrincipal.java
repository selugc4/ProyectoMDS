package bds;

import org.orm.PersistentException;

import basededatos.Artista;
import basededatos.Cancion;
import basededatos.Estilo;
import basededatos.Imagen;

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

	public void cargar_Perfil(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public void Darse_de_baja(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Usuario(String aCorreoSeguidor, String aCorreoSeguido) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Ultimos_Exitos() {
		throw new UnsupportedOperationException();
	}

	public void consultar_Datos(String aNombre, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void guardar_Datos(String aNombre, String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void registrar_Usuario() {
		throw new UnsupportedOperationException();
	}

	public void guardar_Datos(String aEmail, String aNombre, String aContrasena, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void validar_Datos(String aNombre, String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void consultar_Correo(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void guardar_Contrasena(String aContrasena, String aCorreo) {
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_artista(String aCorreoSeguidor, String aCorreoSeguido) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_Evento(String aCorreo, String aNombre, String aFecha/*, tipoEvento aTipoEvento*/) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Ultimas_Canciones_Reproducidas() {
		throw new UnsupportedOperationException();
	}

	public void cargar_Recomendaciones() {
		throw new UnsupportedOperationException();
	}

	public void cargar_Canciones_Favoritas(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void obtener_Estadisticas(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Listas_Reproduccion(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Canciones_Busqueda(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Artistas_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Albumes_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Listas_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
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

	public void anadir_Cancion_Favorita(int aIdCancion, String aCorreo) {
		throw new UnsupportedOperationException();
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

	public void cargar_Canciones_Lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Listas_Propias() {
		throw new UnsupportedOperationException();
	}

	public void cargar_Listas_Reproduccion_Ajenas(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Canciones_Modificar(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Cancion_Lista(int aIdLista, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Lista(int aIdCancion, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Canciones_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Lista_Reproduccion(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void crear_Lista(String aNombre_Lista, Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Ultimos_Exitos_Admin() {
		throw new UnsupportedOperationException();
	}

	public void cargar_Estilos(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Canciones_Buscadas(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Canciones_Mostradas(int aNumero_Canciones) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_estilo(int aIdEstilo) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_a_la_vista_de_cibernauta(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Ultimo_Exito(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void Dar_alta_artista(String aCorreo, String aNombre, String aContrasena, Estilo[] aEstilos, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void Dar_alta_cancion(String aTitulo, String aTitulo_Creditos, String aTitulo_Album, String aCompositores, String aProductores, String aInterpretes, String aArchivoMultimedia) {
		int idcancion;
		try {
			_bd_cancion.Dar_alta_cancion(aTitulo, aTitulo_Creditos, aTitulo_Album, aCompositores, aProductores, aInterpretes, aArchivoMultimedia);;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void Anadir_estilo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Canciones_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_cancion_a_album(int aIdCancion, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Dar_alta_album(String aNombre, Cancion[] aCanciones, Artista[] aArtistas, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Usuarios(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_usuario(String aNombre, String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_usuario(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Artista(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Cancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Cancion(int aIdCancion, String aArchivoMultimedia, String aInterpretes, String aProductores, String aCompositores, String aTitulo, String aTituloCreditos) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_album(int aIdAlbum, String aTituloAlbum, Cancion[] aCanciones, Imagen aImagen, Artista[] aArtistas) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Estilo(int aIdEstilo, String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void cargar_Albumes_Admin(String aNombre) {
		throw new UnsupportedOperationException();
	}
}