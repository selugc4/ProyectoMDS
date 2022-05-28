package bds;

public interface iUsuario_registrado {

	public void cargar_Perfil(String aCorreo);

	public void modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo);

	public void Darse_de_baja(String aCorreo);

	public void Seguir_Usuario(String aCorreoSeguidor, String aCorreoSeguido);
}