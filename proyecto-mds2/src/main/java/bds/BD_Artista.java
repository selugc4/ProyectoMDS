package bds;

import java.util.Vector;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Estilo;
import basededatos.Usuario;

public class BD_Artista {
	public BDPrincipal _bd_principal_artista;
	public Vector<ArtistaDAO> _contiene_artista = new Vector<ArtistaDAO>();

	public boolean consultar_Datos(String aNombre, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean validar_Datos(String aNombre, String aEmail) {
		throw new UnsupportedOperationException();
	}

	public boolean consultar_Correo(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void guardar_Contrasena(String aContrasena, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_Artistas_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_Artistas_Perfil(String aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void Darse_de_baja(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_foto(String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_correo(String aCorreoAntiguo, String aCorreoNuevo) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_Evento(String aCorreo, String aNombre, String aFecha/*, tipoEvento aTipoEvento*/) {
		throw new UnsupportedOperationException();
	}

	public void Dar_alta_artista(String aCorreo, String aNombre, String aContrasena, Estilo[] aEstilos, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_Usuarios(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_usuario(String aNombre, String aFoto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_artista(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Artista(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_artista(String aCorreoSeguidor, String aCorreoSeguido) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] obtener_Estadisticas(String aCorreo) {
		throw new UnsupportedOperationException();
	}
}