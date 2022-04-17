package clases;
public class Recuperar_contrasena extends vistas.VistaRecuperar_contrasena{
//	private Label _recuperar_CuentaL;
//	private Label _correoL;
//	private Button _volverB;
//	private Button _confirmar_CorreoB;
//	private TextField _emailTF;
//	public Iniciar_sesion _iniciar_sesion;
//	public Verifcacion_de_recuperacion _verifcacion_de_recuperacion;

//	public void Validar_correo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void enviar_Correo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void confirmarCorreo() {
//		throw new UnsupportedOperationException();
//	}
	
	public Verifcacion_de_recuperacion vr = new Verifcacion_de_recuperacion();
	
	public Recuperar_contrasena() {
		
		
		
	}

	public Verifcacion_de_recuperacion getVr() {
		return vr;
	}
	
	
	public boolean existeCorreo() {
		if(this.getTfCorreo().getValue().equals("prueba"))
			return true;
		else
			return false;
	}
	
}