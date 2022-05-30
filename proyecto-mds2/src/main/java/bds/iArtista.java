package bds;

public interface iArtista {

	public void cargar_Albumes_Artista(String aCorreo);

	public void cargar_Artistas_Perfil(Object aEstilo);

	public void cargar_Exitosas(String aCorreo);

	public void cargar_Listas_Sus_Canciones(String aCorreo);

	public void cargar_Eventos(String aCorreo);

	public void Darse_de_baja(String aCorreo);

	public void Modificar_foto(String aFoto, String aCorreo);

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo);

	public void Seguir_artista(String aCorreoSeguidor, String aCorreoSeguido);

	public void Anadir_Evento(String aCorreo, String aNombre, String aFecha, String aTipoEvento);
}