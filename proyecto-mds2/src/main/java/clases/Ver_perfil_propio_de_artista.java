package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

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
	
	
	public ContenedorListas_Con_Sus_Canciones clc = new ContenedorListas_Con_Sus_Canciones();
	public Canciones_mas_exitosas cme = new Canciones_mas_exitosas();
	public ContenedorSus_Listas_Propio cslp = new ContenedorSus_Listas_Propio();
	public Artistas artistas = new Artistas();
	public ContenedorAlbumes calb = new ContenedorAlbumes();
	public ContenedorBotonAgregar cba = new ContenedorBotonAgregar();
	
	public Ver_perfil_propio_de_artista() {
		inicializar();
		
	}
	
	public Ver_perfil_propio_de_artista(String nombre) {
		inicializar();
		this.getLabel().setText(nombre);
	}
	
	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(true);
		this.getVaadinButton4().setVisible(false);
		this.getVaadinTextField().setValue(this.getLabel().getText());
		this.getVaadinTextField().setReadOnly(true);

		VerticalLayout vl = this.getVerticalSusListas().as(VerticalLayout.class);
		VerticalLayout vl2 = this.getVerticalListasSusCanciones().as(VerticalLayout.class);
		HorizontalLayout hl = this.getHorizontalAlbumes();
		VerticalLayout vl3 = this.getVerticalExitosas().as(VerticalLayout.class);
		VerticalLayout vl4 = this.getVerticalConciertos().as(VerticalLayout.class);
		HorizontalLayout hl2 = this.getHorizontalArtistas();
		
		vl.add(ca);
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
	
  this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	
	@Override
	public void onComponentEvent(ClickEvent<Button> event) {
		if(comprobarCorreo(getVaadinTextField().getValue())) {
			Notification.show("Correo cambiado");
			getVaadinTextField().setPlaceholder(getVaadinTextField().getValue());
			getVaadinTextField().setReadOnly(true);
		}	
		
	}

	private boolean comprobarCorreo(String value) {
		return true;
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
		TextField tf = new TextField();
		tf.setValue(getLabel().getText());
		getVaadinHorizontalLayout4().add(tf);
		
		getVaadinButton4().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(nombreValido(tf.getValue())) {
					Notification.show("Nombre Cambiado");
				}else
					Notification.show("Error al cambiar el nombre");
				
				getVaadinHorizontalLayout4().remove(tf);
				getVaadinButton4().setVisible(false);
			}

			
			private boolean nombreValido(String value) {
				return true;
			}
		});
	
		
		
	}
});
  

	
}
}