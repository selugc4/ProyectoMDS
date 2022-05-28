package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bds.BDPrincipal;
import bds.iAdministrador;

public class Vista_dar_alta_cancion extends vistas.VistaVista_dar_alta_cancion {

//	private Label _titulo_Anadir_CancionL;
//	private Label _titulo_CancionL;
//	private TextField _titulo_CancionTF;
//	private Label _titulo_Cancion_CreditosL;
//	private TextField _titulo_Cancion_CreditosTF;
//	private Label _titulo_Album_CreditosL;
//	private TextField _titulo_Album_CreditosTF;
//	private Label _compositores_CreditosL;
//	private TextField _compositores_CreditosTF;
//	private Label _productores_CreditosL;
//	private TextField _productores_CreditosTF;
//	private Label _interpretes_CreditosL;
//	private TextField _interpretes_CreditosTF;
//	private Label _titulo_ArchivoL;
//	private FileChooser _anadir_Archivo_Multimedia;
//	private Label _formato_ArchivoL;
//	private Button _anadir_CancionB;
//	private Button _volver_AtrasB;
//	public Menu_dar_alta _menu_dar_alta;

//	public void Anadir_archivo_multimedia() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Dar_alta_cancion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
	
	private String archivo;
	private InputStream fileData;
	private String fileName;
	public Vista_dar_alta_cancion() {
		
		iAdministrador iadmin = new BDPrincipal();
		
		this.getStyle().set("width", "100%");
		MemoryBuffer mbuf = new MemoryBuffer();
		
		this.getVaadinUpload().setReceiver(mbuf);	
		this.getVaadinUpload().addSucceededListener(event ->{

			
			fileData = mbuf.getInputStream();
		    fileName = event.getFileName();		    
		    
		});
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				anadirCancion();
				
			}
			private void anadirCancion() {
				String titulo = getVaadinTextField().getValue();
				String tituloC = getVaadinTextField1().getValue();
				String tituloAlbum = getVaadinTextField2().getValue();
				String compositores = getVaadinTextArea().getValue();
				String productores =  getVaadinTextArea1().getValue();
				String interpretes =  getVaadinTextArea().getValue();
				File ruta = new File("canciones/" + fileName);
			    try {
					FileUtils.copyInputStreamToFile(fileData, ruta);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		  
			
				archivo = "/proyecto-mds2/canciones/"+ fileName; 
				String archivomultimedia = archivo;
				iadmin.Dar_alta_cancion(titulo, tituloC, tituloAlbum, compositores, productores, interpretes, archivomultimedia);
				
			}
		
		});
	}
}