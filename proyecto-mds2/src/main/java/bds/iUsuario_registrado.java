package bds;

import basededatos.Usuario_Registrado;

public interface iUsuario_registrado {


	public void modificar_Correo(String aCorreoAntiguo, String aCorreoNuevo);

	public void Darse_de_baja(String aCorreo);

	public void Seguir_Usuario(int idUsuario, int idUsuarioAjeno);

	public void Dejar_de_seguir_usuario(int idUsuario, int idUsuarioAjeno);
}