package clases;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.textfield.PasswordField;

import bds.BDPrincipal;
import bds.iCibernauta;

public class Nueva_contrasena extends vistas.VistaNueva_contrasena {
//	private Label _titulo_Nueva_ContrasenaL;
//	private Label _nueva_ContrasenaL;
//	private TextField _nueva_ContrasenaTF;
//	private Label _confirmar_nueva_ContrasenaL;
//	private TextField _confirmar_nueva_ContrasenaTF;
//	private Label _mensaje_malsonanteL;
//	private Label _mensaje_formato_ContrasenaL;
//	private Slider _barra_Seguridad;
//	private Label _nivel_seguridadL;
//	private Button _confirmar_ContrasenaB;
//	private Button _volver_atrasB;
//	public Verifcacion_de_recuperacion _verifcacion_de_recuperacion;

//	public void Validar_contrasena() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Confirmar_contrasena() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
	
	private iCibernauta iciber = new BDPrincipal();
	
	
	
	public Nueva_contrasena() {
		this.getStyle().set("width", "100%");
		
		this.getTfPass().addBlurListener(new ComponentEventListener<BlurNotifier.BlurEvent<PasswordField>>() {
			
			@Override
			public void onComponentEvent(BlurEvent<PasswordField> event) {
				validarContrasena();
				
			}
		});
		
	}

	public boolean passIguales() {
		if(this.getTfPass().getValue().equals(this.getTfPassC().getValue()))
			return true;
		else
			return false;
	
	}

	public void confirmar_contrasena() {
		iciber.guardar_Contrasena(this.getTfPass().getValue(), Cibernauta.correo );
	
	
	}
	
	
	
	public boolean validarContrasena() {
		String regExSpecialChars = "<([{\\^-=$!|]})?*+.>";
		String pass = this.getTfPass().getValue();
		int mayusculas =0;
		int minusculas = 0;
		int especiales = 0;
		if(pass.isEmpty() || pass.length() < 10) {
			this.getVaadinProgressBar().getStyle().set("background-color", "red");
			this.getLabelSec1().setText("Su contraseña tiene un nivel de seguridad débil");
			return false;
		}else if (!esMalsonante()){
			
			for(int i = 0; i < pass.length(); i++) {
				if(Character.isUpperCase(pass.charAt(i))){
					mayusculas++;
				}else if(Character.isLowerCase(pass.charAt(i))) {
					minusculas++;
				}else if(regExSpecialChars.contains(Character.toString(pass.charAt(i)))) {
					especiales++;
				}else if(Character.isDigit(pass.charAt(i))) {
					minusculas++;
				}
			
			}
		}
		
		if(mayusculas >= 1 && minusculas >= 1 && especiales >= 3 ) {
			this.getVaadinProgressBar().getStyle().set("background-color", "green");
			this.getLabelSec1().setText("Su contraseña tiene un nivel de seguridad fuerte");
			return true;
		}else {
			this.getVaadinProgressBar().getStyle().set("background-color", "red");
			this.getLabelSec1().setText("Su contraseña tiene un nivel de seguridad débil");
			return false;
		}
}

	private boolean esMalsonante() {
		return false;
	}
}