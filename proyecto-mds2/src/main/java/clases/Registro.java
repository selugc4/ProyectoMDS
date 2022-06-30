package clases;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.digest.Sha2Crypt;
import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.upload.SucceededEvent;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.server.StreamResource;

import bds.BDPrincipal;
import bds.iCibernauta;

public class Registro extends vistas.VistaRegistro {
//	private Label _titulo_Registro;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _nombre_UsuarioL;
//	private TextField _nombre_UsuarioTF;
//	private Label _mensaje_malsonanteL;
//	private Label _nueva_ContrasenaL;
//	private TextField _nueva_ContrasenaTF;
//	private Label _mensaje_formato_ContrasenaL;
//	private Slider _barra_Seguridad;
//	private Label _nivel_seguridadL;
//	private Label _confirmar_nueva_ContrasenaL;
//	private TextField _confirmar_nueva_ContrasenaTF;
//	private FileChooser _elegir_Foto;
//	private Image _foto;
//	private Button _volver_atrasB;
//	private Button _registrarseB;
//	public Iniciar_sesion _iniciar_sesion;
//	public Cabecera_cibernauta _cabecera_cibernauta;
//	public Verificacion_registro _verificacion_registro;

//	public void Validar_correo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Registrarse() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Validar_contrasena() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Elegir_foto() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Validar_nombre_de_usuario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();

//	}
	
	public Verificacion_registro vr = new Verificacion_registro();
	
	iCibernauta iciber = new BDPrincipal();
	
	private InputStream fileData;
	private String fileName;
	private File ruta;
	String separator = System.getProperty("file.separator");
	private String rutaArchivo = System.getProperty("user.dir")+ separator+ "src" + separator+ "main" +separator+ "resources" + separator+ "META-INF" +separator+ "resources"+ separator+ "imagenes" + separator;
	String rutaArchivoFinal;
	
	public Verificacion_registro getVr() {
		return vr;
	}
	
	public Registro() {
		HorizontalLayout hl = this.getHorizontalimg();
		
		this.getStyle().set("width", "100%" );
		this.getImg().setSrc("imagenes/fotousuario.png");
		
		fileName = "fotousuario.png";
				
		MemoryBuffer mbuf = new MemoryBuffer();
		this.getVaadinUpload().setReceiver(mbuf);	
		this.getVaadinUpload().addSucceededListener(event ->{

		

			fileData = mbuf.getInputStream();
	
		    fileName = event.getFileName();		  
		    ruta = new File(rutaArchivo + fileName);
		    
		   
		    try {
				FileUtils.copyInputStreamToFile(fileData, ruta);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			StreamResource imageResource2;
			try {
				InputStream aux2 = FileUtils.openInputStream(ruta);
				imageResource2 = new StreamResource("fotoSubida.png",() -> aux2); 
				Image image = new Image(imageResource2, "");
				image.getStyle().set("height", "125px");
				image.getStyle().set("width", "125px");
				hl.removeAll();
				hl.add(image);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
		});
		
		
		this.getTfcontrasena1().addBlurListener(new ComponentEventListener<BlurNotifier.BlurEvent<PasswordField>>() {
			
			@Override
			public void onComponentEvent(BlurEvent<PasswordField> event) {
				validarContrasena(getTfcontrasena1().getValue());
				
			}
		});
			
		
		
	
	}


	public boolean validarContrasena(String pass) {
		String regExSpecialChars = "<([{\\^-=$!|]})?*+.>";
		int mayusculas =0;
		int minusculas = 0;
		int especiales = 0;
		if(pass.isEmpty() || pass.length() < 10) {
			this.getVaadinProgressBar().getStyle().set("background-color", "red");
			this.getNivelSec().setText("Nivel de Seguridad Débil");
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
			this.getNivelSec().setText("Nivel de Seguridad Fuerte");
			return true;
		}else {
			this.getVaadinProgressBar().getStyle().set("background-color", "red");
			this.getNivelSec().setText("Nivel de Seguridad Débil");
			return false;
		}
		
	
		
	}
	
	private boolean esMalsonante() {
		return false;
		}

	public void registrarse() {
		iciber.guardar_Datos(this.getTfemail().getValue(), this.getTfusuario().getValue(), getTfcontrasena1().getValue(), fileName);
	}
	
	private boolean validarCorreoInterno(String value) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		 
		  Matcher matcher = pattern.matcher(value);
		  return matcher.matches();
		 
	}

	public boolean validarDatosInternos() {
		if(validarContrasena(this.getTfcontrasena1().getValue()) && this.getTfccontrasena().getValue().equals(this.getTfcontrasena1().getValue()) && validarCorreoInterno(getTfemail().getValue()) && !getTfusuario().isEmpty())
			return true;
		else
			return false;
	}
	
	public boolean validarDatos() {
		if(iciber.validar_Datos(this.getTfusuario().getValue(),this.getTfemail().getValue())){
			return true;
		
		}else
			return false;
	}



	
	


}