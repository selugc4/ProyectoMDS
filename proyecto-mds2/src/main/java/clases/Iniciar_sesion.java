package clases;
public class Iniciar_sesion extends vistas.VistaIniciar_sesion {
//	private Label _iniciar_SesionL;
//	private Label _nombre_UsuarioL;
//	private Label _contrasenaL;
//	private Label _olvidar_ContrasenaL;
//	private Label _no_CuentaL;
//	private TextField _nombre_UsuarioTF;
//	private TextField _contrasenaTF;
//	private Button _iniciar_SesionB;
//	private Button _recuperar_CuentaB;
//	private Button _registrarseB;
//	private Button _volverB;
//	private Button _boton_GoogleB;
//	private Button _boton_FacebookB;
//	private Button _boton_AppleB;
//	public Cabecera_cibernauta _cabecera_cibernauta;
//	public Bloqueo_inicio_sesion _bloqueo_inicio_sesion;
//	public Recuperar_contrasena _recuperar_contrase�a;
//	public Registro _registro;

//	public void Validar_contrasena() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Iniciar_sesion_con_terceros() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Validar_nombre_de_usuario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void iniciarSesion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void recuperarCuenta() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void registro() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
	
	public Bloqueo_inicio_sesion bis = new Bloqueo_inicio_sesion();
	public Recuperar_contrasena rc = new Recuperar_contrasena();
	public boolean comprobarUsuario(String usuario, String pass) {
		if(!usuario.isEmpty())
			return true;
		else
			return false;
		
		
	}
	
	public Bloqueo_inicio_sesion getBis() {
		return bis;
	}
	public Recuperar_contrasena getRc() {
		return rc;
	}
	
	
}