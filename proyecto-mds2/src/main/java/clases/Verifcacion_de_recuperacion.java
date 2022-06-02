package clases;
public class Verifcacion_de_recuperacion extends Verificacion {
//	private Label _verificacion_RecuperacionL;
//	private Button _cambiar_ContrasenaB;
//	public Recuperar_contrasena _recuperar_contrase�a;
//	public Nueva_contrasena _nueva_contrasena;

	/*public void Aceptar_recuperacion() {
		throw new UnsupportedOperationException();
	}*/
	
	public Nueva_contrasena nc = new Nueva_contrasena();
	
	public Nueva_contrasena getNc() {
		return nc;
	}

	public Verifcacion_de_recuperacion() {
		inicializar();
	}
	

	void inicializar() {
		this.getBotonAceptar().setVisible(false);
		this.getStyle().set("width", "100%");
		this.getLabelTitulo().setText("Recuperar cuenta");
		this.getLabelDesc1().setText("Se ha enviado un correo a su email");
		this.getLabelDesc2().setText("código para poder modificar su contraseña");
	}
	
	public boolean comprobarCodigo() {
		if(this.getTfCodigo().getValue().equals("1234"))
			return true;
		else
			return false;
	}
}