package bds;

import java.util.ArrayList;

import basededatos.*;

public interface iActor_comun {

	public Cancion[] cargar_Ultimas_Canciones_Reproducidas();

	public Cancion[] cargar_Recomendaciones();

	public Cancion[] cargar_Canciones_Favoritas();

	public Cancion obtener_Estadisticas(int iD);

	public Lista_Reproduccion[] cargar_Listas_Reproduccion();

	public void cargar_Canciones_Busqueda(String aNombre);

	public Artista[] cargar_Artistas_Buscador(String aNombre);

	public Album[] cargar_Albumes_Buscador(String aNombre);

	public Lista_Reproduccion[] cargar_Listas_Buscador(String aNombre);

	public void anadir_Seguidor(int aIdLista);

	public void cargar_Datos_Cancion(int aIdCancion);

	public void anadir_Cancion_Favorita(int aIdCancion, int iD);

	public void anadir_Cancion_Lista(int aIdCancion, int aIdLista);

	public void cargar_Album(int aIdAlbum);

	public Cancion[] obtener_Canciones_Album(int aIdAlbum);

	public void seguir_Lista(int aIdLista, int iD);

	public Cancion[] cargar_Canciones_Lista(int aIdLista);

	public Lista_Reproduccion[] cargar_Listas_Propias(int id);

	public void cargar_Listas_Reproduccion_Ajenas(String aCorreo);

	public Cancion[] cargar_Canciones_Modificar(int aIdLista);

	public void eliminar_Cancion_Lista(int aIdLista, int aIdCancion);

	public void anadir_Lista(int aIdCancion, String listaaux);

	public Cancion[] cargar_Canciones_Buscador(String aNombre);

	public void eliminar_Lista_Reproduccion(int idLista);

	public void crear_Lista(String aNombre_Lista, ArrayList<clases.Cancion> arrayList);

	public Evento[] obtener_Notificaciones(int iD);

	public void eliminar_Notificacion(int iD, String artistaevento, String nombreevento);

	public void guardar_Modificacion_lista(int iD, String value, ArrayList<clases.Cancion> get_canciones);
	public Usuario cargar_Perfil(int id);

	public boolean comprobar_Seguido(int idArtista);
}