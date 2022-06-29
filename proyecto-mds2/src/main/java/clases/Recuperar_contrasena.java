package clases;

import bds.BDPrincipal;
import bds.iCibernauta;

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
	
	private iCibernauta iciber = new BDPrincipal();
	public Recuperar_contrasena() {
		this.getStyle().set("width", "100%");
			
		
	}

	public Verifcacion_de_recuperacion getVr() {
		return vr;
	}
	
	

	public boolean validar_correo() {
		return iciber.consultar_Correo(getTfCorreo().getValue());		
	}
	
}