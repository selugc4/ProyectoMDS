package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;

import org.apache.catalina.webresources.FileResource;
import org.apache.catalina.webresources.FileResourceSet;
import org.apache.commons.io.FileUtils;
import org.hibernate.mapping.IdGenerator;

import com.helger.commons.io.resource.FileSystemResource;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.server.AbstractStreamResource;
import com.vaadin.flow.server.InputStreamFactory;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.server.StreamResourceWriter;
import com.vaadin.flow.server.VaadinService;

import basededatos.Estilo;
import bds.BDPrincipal;
import bds.iAdministrador;

public class Vista_dar_alta_artista extends vistas.VistaVista_dar_alta_artista {

//	private Label _titulo_Dar_Alta_ArtistaL;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _nombre_ArtistaL;
//	private TextField _nombre_ArtistaTF;
//	private Label _contrasenaL;
//	private TextField _contrasenaTF;
//	private Label _confirmar_ContrasenaL;
//	private TextField _confirmar_ContrasenaTF;
//	private Label _estilosL;
//	private TextField _estiloTF;
//	private Label _fotoL;
//	private FileChooser _elegir_Foto;
//	private Image _foto_Artista;
//	private Button _dar_Alta_ArtistaB;
//	private Button _volver_AtrasB;
//	public Menu_dar_alta _menu_dar_alta;

//	public void Elegir_foto() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Dar_alta_artista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
	
	private InputStream fileData;
	private String fileName;
	private File ruta;
	String separator = System.getProperty("file.separator");
	private String rutaArchivo = System.getProperty("user.dir")+ separator+ "src" + separator+ "webapp" +separator+ "imagenes" + separator;
	String rutaArchivoFinal;

	
	public Vista_dar_alta_artista() {
		iAdministrador iadmin = new BDPrincipal();
		MemoryBuffer mbuf = new MemoryBuffer();
		
		
		File imagenDefault = new File(rutaArchivo+"fotousuario.png");
		InputStream aux ;
		StreamResource imageResource;
		try {
			aux = FileUtils.openInputStream(imagenDefault);
			imageResource = new StreamResource("fotoDefault.png",() -> aux); 
			Image image = new Image(imageResource, "");
			image.getStyle().set("height", "100px");
			this.getVaadinHorizontalLayout19().add(image);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		rutaArchivoFinal = System.getProperty("user.dir")+ separator+ "src" + separator+ "webapp" +separator+ "imagenes" + separator +"fotousuario.png";
		
		
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
				image.getStyle().set("height", "100px");
				this.getVaadinHorizontalLayout19().removeAll();
				this.getVaadinHorizontalLayout19().add(image);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			rutaArchivoFinal = System.getProperty("user.dir")+ separator+ "src" + separator+ "webapp" +separator+ "imagenes" + separator + fileName;
		
		    
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String email = getVaadinTextField().getValue();
				String nombre = getVaadinTextField1().getValue();				
				String pass = getVaadinTextField2().getValue();				
				String cpass = getVaadinTextField3().getValue();
				String[] estilos = getVaadinTextField4().getValue().split(",");
				
				

				
				if (email.isEmpty() || nombre.isEmpty() || pass.isEmpty() || cpass.isEmpty() || estilos.length == 0) {
					Notification.show("Debe rellenar todos los campos");
				}else if(!pass.equals(cpass)) {
					Notification.show("Contraseñas iguales");
				}else {
					iadmin.Dar_alta_artista(email, nombre, pass, estilos, rutaArchivoFinal);
				}
				
				
				

				
				
			}
		});
	}
}