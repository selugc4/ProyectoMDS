package clases;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

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
		String separator = System.getProperty("file.separator");
		File imagenDefault = new File(System.getProperty("user.dir")+ separator+ "src" + separator+ "webapp" +separator+ "imagenes" + separator+"logo-ual.png");
		InputStream aux ;
		StreamResource imageResource;
		try {
			aux = FileUtils.openInputStream(imagenDefault);
			imageResource = new StreamResource("logo-ual.png",() -> aux); 
			Image image = new Image(imageResource, "");
			image.getStyle().set("height", "125px");
			image.getStyle().set("width", "125px");
			this.getVaadinHorizontalLayout1().add(image);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		}
	
//	void registrarse() {
//		
//	}
	public Registro getReg() {
		return reg;
	}

	public Iniciar_sesion getIs() {
		return is;
	}
	
	}

	