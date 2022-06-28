package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iAdministrador;

public class Vista_modificar_cancion extends vistas.VistaVista_modificar_cancion {
//	private Button _modificar_Archivo_MultimediaB;
//	private Button _modificar_CancionB;
//	private Label _compositores_CreditosL;
//	private TextField _compositores_CreditosTF;
//	private FileChooser _anadir_Archivo_Multimedia;
//	private Label _formato_ArchivoL;
//	private Label _interpretes_CreditosL;
//	private TextField _interpretes_CreditosTF;
//	private Label _productores_CreditosL;
//	private TextField _productores_CreditosTF;
//	private Label _titulo_Album_CreditosL;
//	private TextField _titulo_Album_CreditosTF;
//	private Label _titulo_ArchivoL;
//	private Label _titulo_Cancion_CreditosL;
//	private TextField _titulo_Cancion_CreditosTF;
//	private Label _titulo_CancionL;
//	private TextField _titulo_CancionTF;
//	private Button _volver_AtrasB;
//	private Label _titulo_Modificar_CancionL;
//	public Cancion_administrador _cancion_administrador;

	private String archivo;
	private InputStream fileData;
	private String fileName;
	public Vista_modificar_cancion(int idCancion) {
		String separator = System.getProperty("file.separator");
		String rutaArchivo = System.getProperty("user.dir")+ separator+ "src" + separator+ "main" +separator+ "resources" + separator + "META-INF" +separator+ "resources"+separator+"canciones"+separator;
		
		iAdministrador iadmin = new BDPrincipal();
		basededatos.Cancion cancion = iadmin.cargar_Datos_Cancion(idCancion);
		this.getVaadinTextField().setValue(cancion.getTitulo());
		this.getVaadinTextField1().setValue(cancion.getTituloCreditos());
		this.getVaadinTextField2().setValue(cancion.getCancion_de().getTitutloAlbum());
		this.getVaadinTextArea().setValue(cancion.getCompositores());
		this.getVaadinTextArea1().setValue(cancion.getProductores());
		this.getVaadinTextArea2().setValue(cancion.getIntepretes());
		MemoryBuffer mbuf = new MemoryBuffer();
		this.getStyle().set("width", "100%");
		
		this.getVaadinUpload().setReceiver(mbuf);	
		this.getVaadinUpload().addSucceededListener(event ->{

			
			fileData = mbuf.getInputStream();
		    fileName = event.getFileName();		    
		    
		});
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(getVaadinTextField().isEmpty()) {
					Notification.show("El campo titulo no puede ser vacío. El resto sí.");
				}else if(fileName == null || fileData == null ) {
					Notification.show("No se ha agregado el archivo");
				}else {
				File ruta = new File(rutaArchivo + fileName);
			    try {
					FileUtils.copyInputStreamToFile(fileData, ruta);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		  
			
				archivo = fileName; 
				anadirCancion();
				
				VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
				vl.removeAll();
				vl.add(new Menu_dar_alta());
				Notification.show("Cancion modificada con exito");
				
				
			}
			}
			private void anadirCancion() {
				String titulo = getVaadinTextField().getValue();
				String tituloC = getVaadinTextField1().getValue();
				String tituloAlbum = getVaadinTextField2().getValue();
				String compositores = getVaadinTextArea().getValue();
				String productores =  getVaadinTextArea1().getValue();
				String interpretes =  getVaadinTextArea().getValue();
				
				
				String archivomultimedia = archivo;
				iadmin.Modificar_Cancion(idCancion, archivomultimedia, interpretes, productores, compositores, titulo, tituloC, tituloAlbum);
			}
			
		
		});
	}
}