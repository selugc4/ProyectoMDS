package bds;

import basededatos.Cancion;

public interface iActor_comun {

	public void cargar_Ultimas_Canciones_Reproducidas();

	public void cargar_Recomendaciones();

	public void cargar_Canciones_Favoritas(String aCorreo);

	public void obtener_Estadisticas(String aCorreo);

	public void cargar_Listas_Reproduccion(String aCorreo);

	public void cargar_Canciones_Busqueda(String aNombre);

	public void cargar_Artistas_Buscador(String aNombre);

	public void cargar_Albumes_Buscador(String aNombre);

	public void cargar_Listas_Buscador(String aNombre);

	public void anadir_Favorita(int aIdCancion, String aCorreo);

	public void anadir_Seguidor(int aIdLista);

	public void cargar_Datos_Cancion(int aIdCancion);

	public void anadir_Cancion_Favorita(int aIdCancion, String aCorreo);

	public void anadir_Cancion_Lista(int aIdCancion, int aIdLista);

	public void cargar_Album(int aIdAlbum);

	public void obtener_Canciones_Album(int aIdAlbum);

	public void seguir_Lista(int aIdLista, String aCorreo);

	public void cargar_Canciones_Lista(int aIdLista);

	public void cargar_Listas_Propias();

	public void cargar_Listas_Reproduccion_Ajenas(String aCorreo);

	public void cargar_Canciones_Modificar(int aIdLista);

	public void eliminar_Cancion_Lista(int aIdLista, int aIdCancion);

	public void anadir_Lista(int aIdCancion, int aIdLista);

	public void cargar_Canciones_Buscador(String aNombre);

	public void eliminar_Lista_Reproduccion(int aIdLista);

	public void crear_Lista(String aNombre_Lista, Cancion[] aCanciones);
}