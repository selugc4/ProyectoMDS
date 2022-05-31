package clases;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.server.StreamResource;

import basededatos.ArtistaDAO;
import basededatos.CancionDAO;
import basededatos.UsuarioDAO;
import bds.BDPrincipal;
import bds.iAdministrador;

public class Vista_dar_alta_album extends vistas.VistaVista_dar_alta_album{
//	private Label _titulo_Anadir_AlbumL;
//	private Label _titulo_AlbumL;
//	private TextField _titulo_AlbumTF;
//	private Label _nombre_ArtistasL;
//	private TextField _nombre_ArtistasTF;
//	private Label _imagenL;
//	private FileChooser _elegir_Foto;
//	private Image _foto;
//	private Label _lista_CancionesL;
//	private Button _anadir_CancionB;
//	private Dialog _anadir_CancionD;
//	private Label _fecha_EdicionL;
//	private Image _asignar_Fecha;
//	private Button _asignar_FechaB;
//	private Button _anadir_AlbumB;
//	private Button _volver_AtrasB;
//	public Menu_dar_alta _menu_dar_alta;
//	public Buscador_cancion_para_album _buscador_cancion_para_album;
//	public Canciones_modificar_y_crear _canciones_modificar_y_crear;

//	public void Elegir_foto() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Dar_alta_album() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void asignarFecha() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void anadirCancion() {
//		throw new UnsupportedOperationException();
//	}
	
	public static Canciones_modificar_y_crear canciones = new Canciones_modificar_y_crear();
	public Buscador_cancion_para_album bcpa = new Buscador_cancion_para_album();
	private InputStream fileData;
	private String fileName;
	private File ruta;
	String separator = System.getProperty("file.separator");
	private String rutaArchivo = System.getProperty("user.dir")+ separator+ "src" + separator+ "webapp" +separator+ "imagenes" + separator;
	String rutaArchivoFinal;
	
	public Vista_dar_alta_album() {
		iAdministrador iadmin = new BDPrincipal();
		MemoryBuffer mbuf = new MemoryBuffer();
		VerticalLayout vertical = this.getVaadinVerticalLayout3().as(VerticalLayout.class);
		
		File imagenDefault = new File(rutaArchivo+"fotoalbum.png");
		InputStream aux ;
		StreamResource imageResource;
		try {
			aux = FileUtils.openInputStream(imagenDefault);
			imageResource = new StreamResource("fotoDefaultAlbum.png",() -> aux); 
			Image image = new Image(imageResource, "");
			image.getStyle().set("height", "125px");
			image.getStyle().set("width", "125px");
			vertical.add(image);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		rutaArchivoFinal = System.getProperty("user.dir")+ separator+ "src" + separator+ "webapp" +separator+ "imagenes" + separator +"fotoalbum.png";
		
		
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
				vertical.removeAll();
				vertical.add(image);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			rutaArchivoFinal = System.getProperty("user.dir")+ separator+ "src" + separator+ "webapp" +separator+ "imagenes" + separator + fileName;
		
		    
		});
		this.getStyle().set("width", "100%");		
		
		this.getBotonAdd().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(getVaadinTextField().getValue().isEmpty()||getFechaDeEdición().getValue() == null||getVaadinTextField1().getValue() == null||canciones._canciones.size()==0) {
					Notification.show("Debe rellenar todos los campos");
				}
				else {
				String titulo = getVaadinTextField().getValue();
				String fechaEdicion = getFechaDeEdición().getValue().toString();
				String[] NombreArtistas = getVaadinTextField1().getValue().split(",");
				basededatos.Cancion[] cancionesAlbum = new basededatos.Cancion[canciones._canciones.size()];
				for(Cancion cancion: canciones._canciones) {
				int i = 0;
				try {
					basededatos.Cancion cancion1= CancionDAO.loadCancionByQuery("Titulo='"+cancion.getLabel().toString()+"'", null);
					cancionesAlbum[i] = cancion1;
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
				}
				basededatos.Artista[] artistas = new basededatos.Artista[NombreArtistas.length];
				int j = 0;
				for(String artista: NombreArtistas) {
					try {
						basededatos.Artista artistaAlbum = ArtistaDAO.getArtistaByORMID(UsuarioDAO.loadUsuarioByQuery("Nombre='"+artista+"'", null).getID());
						artistas[j] = artistaAlbum;
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					j++;
				}
				iadmin.Dar_alta_album(titulo, cancionesAlbum, artistas, rutaArchivoFinal, fechaEdicion);
				}
			}
		});
		
		this.getBotonFecha().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			private String fechaedicion;

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// COGER DATO PARA GUARDAR
			 fechaedicion = getFechaDeEdición().getValue().toString();
			}
		});
		
		this.getBotonLista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(bcpa);
				diag.setWidth("100%");
				diag.open();
				
				Button boton = bcpa.cpa.canciones.get(0).getVaadinButton();
				boton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						diag.close();
						
					}
				});
	
			}
		});
	}
}