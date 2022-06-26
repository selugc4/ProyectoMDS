package clases;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.SucceededEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.server.StreamResource;

import basededatos.Usuario_Registrado;
import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iArtista;

public class Ver_perfil_propio_de_artista extends Ver_perfil_propio {
//	private FileChooser _modificar_Foto;
//	private Button _darse_De_BajaB;
//	private Dialog _darse_De_Baja;
//	public Cabecera_artista _cabecera_artista;
//	public Artista_administrador _artista_administrador;
//	public ContenedorListas_Con_Sus_Canciones _contenedorListas_Con_Sus_Canciones;
//	public Canciones_mas_exitosas _canciones_mas_exitosas;
//	public ContenedorBotonAgregar _contenedorBotonAgregar;
//	public Artistas _artistas;
//	public ContenedorAlbumes _contenedorAlbumes;
//	public ContenedorSus_Listas_Propio _contenedorSus_Listas_Propio;

//	public void Modificar_foto() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Darse_de_baja() {
//		throw new UnsupportedOperationException();
//	}
	
	private iActor_comun iac = new BDPrincipal();
	private iArtista ia = new BDPrincipal();
	
	
	
	public ContenedorListas_Con_Sus_Canciones clc; 
	public Canciones_mas_exitosas cme;
	public ContenedorSus_Listas_Propio cslp;
	public Artistas artistas;
	public ContenedorAlbumes calb;
	public ContenedorBotonAgregar cba;
	

	private String rutaArchivoFinal;
	
	public Ver_perfil_propio_de_artista() {
		inicializar();
		
		
	}
	
	public Ver_perfil_propio_de_artista(String nombre) {
		inicializar();
		this.getLabel().setText(nombre);
		
	}
	
	public Ver_perfil_propio_de_artista(int iD) {
		super(iD);	
		
		artistas = new Artistas(iD);
		calb = new ContenedorAlbumes(iD);
		cba = new ContenedorBotonAgregar(iD);
		
		basededatos.Usuario usuario = iac.cargar_Perfil(iD);
		this.tipoUsuario = usuario.getTipoUsuario();
		this.vlpp = new Ver_lista_de_reproduccion_propia(tipoUsuario);		

		this.getImg().setSrc("imagenes/"+usuario.getContiene_imagen().getUrl());
		this.getLabel().setText(usuario.getNombre());
		this.getLabel1().setText("Seguidores: " +usuario.seguido.size());
		this.getLabel2().setText("Seguidos: " +usuario.seguidor_usuario.size());
		this.getVaadinTextField().setValue(usuario.getCorreo());
		correoantiguo = usuario.getCorreo();
		inicializar();
		
		//CREAR LISTA
		ca.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
									
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
		Artista.v1.removeAll();
		ca.cl = new Creacion_lista(iD, 0);
		Artista.v1.add(ca.cl);	
		}
		});
								
		//FAVORITOS
		getVaadinButton5().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Artista.v1.removeAll();
				Artista.v1.add(vlpp);		
				}
			});
	
		
	}

	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(true);
		this.getVaadinButton4().setVisible(false);
		
		this.getVaadinTextField().setReadOnly(true);

		VerticalLayout vl = this.getVerticalSusListas().as(VerticalLayout.class);
		VerticalLayout vl2 = this.getVerticalListasSusCanciones().as(VerticalLayout.class);
		HorizontalLayout hl = this.getHorizontalAlbumes();
		VerticalLayout vl3 = this.getVerticalExitosas().as(VerticalLayout.class);
		VerticalLayout vl4 = this.getVerticalConciertos().as(VerticalLayout.class);
		HorizontalLayout hl2 = this.getHorizontalArtistas();
		
		
		clc = new ContenedorListas_Con_Sus_Canciones(correoantiguo);
		cme = new Canciones_mas_exitosas(correoantiguo);
//		cslp = new ContenedorSus_Listas_Propio(1);
		
		
		vl2.add(clc);
		hl.add(calb);
		vl3.add(cme);
		vl4.add(cba);
		hl2.add(artistas);
	
	
	this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			getVaadinTextField().setReadOnly(false);
			getVaadinButton1().setVisible(true);
		}
	});
	

  
  this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	
	@Override
	public void onComponentEvent(ClickEvent<Button> event) {
		Dialog diag = new Dialog();
		VerticalLayout vl = new VerticalLayout();
		HorizontalLayout hl = new HorizontalLayout();
		Button botonsi = new Button("Si");
		Button botonno = new Button("No");
		hl.add(botonsi, botonno);
		vl.add("Está seguro de darse de baja?");
		vl.add(hl);
		
		diag.add(vl);
		diag.open();
		
		botonsi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				diag.close();
				ia.Darse_de_baja(correoantiguo);
				Notification.show("Dado de baja");
				
				
			}
		});
		
		botonno.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
					diag.close();
				
			}
		});
		
	}				
	
});
  
  this.getVaadinButton3().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	
	@Override
	public void onComponentEvent(ClickEvent<Button> event) {
		getVaadinButton4().setVisible(true);
		Upload upload = new Upload();
		MemoryBuffer mbuf = new MemoryBuffer();
		upload.setReceiver(mbuf);
		upload.addSucceededListener(new ComponentEventListener<SucceededEvent>() {
			

			@Override
			public void onComponentEvent(SucceededEvent event) {
				String separator = System.getProperty("file.separator");
				String rutaArchivo = System.getProperty("user.dir")+ separator+ "src" + separator+ "main" +separator+ "resources" + separator + "META-INF" +separator+ "resources"+separator+"imagenes"+separator;
				
			
				InputStream fileData = mbuf.getInputStream();	
			    String fileName = event.getFileName();		  
			    File ruta = new File(rutaArchivo+fileName);
			    
			   
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
					image.getStyle().set("width", "100%");
					image.getStyle().set("height", "100%");

					VerticalLayout vl = getVaadinVerticalLayout2().as(VerticalLayout.class);
					vl.removeAll();
					vl.add(image);
					vl.setWidth("15%");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rutaArchivoFinal =fileName;
			
			    
			}});
							
		getVaadinHorizontalLayout6().removeAll();
		getVaadinHorizontalLayout6().add(upload);
		
		getVaadinButton4().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				ia.Modificar_foto(rutaArchivoFinal , correoantiguo);
				getVaadinHorizontalLayout6().removeAll();
				getVaadinButton4().setVisible(false);
				
			}
			
			});

	}
}); 	}
	 @Override
	  protected void clickCambiarCorreo() {
		  this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					if(comprobarCorreo(getVaadinTextField().getValue())) {
						ia.Modificar_correo(correoantiguo, getVaadinTextField().getValue());
						if(correoexistente) {
							Notification.show("Correo ya existente. Utilice otro");
						}else {
						Notification.show("Correo cambiado");
						getVaadinTextField().setReadOnly(true);
						getVaadinButton1().setVisible(false);
						}
					}	
					
				}

				private boolean comprobarCorreo(String value) {
					String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
					Pattern pattern = Pattern.compile(regex);
					 
					  Matcher matcher = pattern.matcher(value);
					  return matcher.matches();
				}

			});
	  }
}