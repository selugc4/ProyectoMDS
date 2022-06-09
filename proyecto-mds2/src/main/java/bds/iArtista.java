package bds;

import basededatos.Album;
import basededatos.Artista;
import basededatos.Cancion;
import basededatos.Evento;
import basededatos.Lista_Reproduccion;

public interface iArtista {

	public Album[] cargar_Albumes_Artista(int iD);

	public Artista[] cargar_Artistas_Perfil(int idArtista);

	public Cancion[] cargar_Exitosas(String aCorreo);

	public Lista_Reproduccion[] cargar_Listas_Sus_Canciones(String aCorreo);

	public Evento[] cargar_Eventos(int idArtista);

	public void Darse_de_baja(String aCorreo);

	public void Modificar_foto(String aFoto, String aCorreo);

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo);

	public void Seguir_artista(int idUsuario, int idArtista);

	public void Anadir_Evento(String aCorreo, String aNombre, String aFecha, String aTipoEvento);

	public void dejar_de_seguir_artista(int idUsuario, int idArtista);

}