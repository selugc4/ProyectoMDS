package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;

import com.helger.commons.io.resource.FileSystemResource;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.server.InputStreamFactory;
import com.vaadin.flow.server.StreamResource;
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
	private String rutaArchivo;

	public Vista_dar_alta_artista() {
		iAdministrador iadmin = new BDPrincipal();
		MemoryBuffer mbuf = new MemoryBuffer();
		
		FileSystemResource file = new FileSystemResource(new File("/proyecto-mds2/fotousuarios/fotousuario.png"));	
	

		
		this.getImg().setSrc(file.getAsURL().toString());
		this.getImg().setWidth("100%");
		this.getVaadinUpload().setReceiver(mbuf);	
		this.getVaadinUpload().addSucceededListener(event ->{

			
			fileData = mbuf.getInputStream();
		    fileName = event.getFileName();		  
		    ruta = new File("/proyecto-mds2/fotousuarios/" + fileName);
		    try {
				FileUtils.copyInputStreamToFile(fileData, ruta);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			rutaArchivo = ruta.getPath();
			getImg().setSrc(rutaArchivo);
		    
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String email = getVaadinTextField().getValue();
				String nombre = getVaadinTextField().getValue();				
				String pass = getVaadinTextField().getValue();				
				String cpass = getVaadinTextField().getValue();
				String[] estilos = getVaadinTextField().getValue().split(",");
				
				
				basededatos.Estilo[] estilos1 = new basededatos.Estilo[estilos.length];
				
				for(int i = 0; i< estilos.length; i++) {
					Estilo estilo = new Estilo();
					estilo.setNombre(estilos[i]);
					estilos1[i] = estilo;
				}
				
				
				
				if (email.isEmpty() || nombre.isEmpty() || pass.isEmpty() || cpass.isEmpty() || estilos1.length == 0) {
					Notification.show("Debe rellenar todos los campos");
				} else if(rutaArchivo.isEmpty()) {
					rutaArchivo = "fotousuarios/fotousuario.png";
				}else if(!pass.equals(cpass)) {
					Notification.show("Contraseñas iguales");
				}else {
					iadmin.Dar_alta_artista(email, nombre, pass, estilos1, rutaArchivo);
				}
				
				
				

				
				
			}
		});
	}
}