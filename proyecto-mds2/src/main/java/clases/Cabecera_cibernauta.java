package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera_cibernauta extends vistas.VistaCabecera_cibernauta {
//	private Button _boton_Registrarse;
//	private Button _boton_IniciarSesion;
//	private Label _textoContacto;
//	private Image _imagen_Inicio;
//	public Cibernauta _cibernauta;
//	public Iniciar_sesion _iniciar_sesion;
//	public Registro _registro;

//	public void Inicio() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaRegistrarse() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaIniciarSesion() {
//		throw new UnsupportedOperationException();
//	}
	
	public Iniciar_sesion is = new Iniciar_sesion();

	public Registro reg = new Registro();
	
	public Cabecera_cibernauta() {
		this.getStyle().set("width", "100%");
		}
	
	void registrarse() {
		
	}
	public Registro getReg() {
		return reg;
	}

	public Iniciar_sesion getIs() {
		return is;
	}
	
	}

	