package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iArtista;

public class Ver_perfil_del_artista_ajeno extends Ver_perfil_ajeno {
//	public Cancion_busqueda _cancion_busqueda;
//	public Ir_a_cancion _ir_a_cancion;
//	public Conciertos_y_festivales _conciertos_y_festivales;
//	public Canciones_mas_exitosas _canciones_mas_exitosas;
//	public Artistas _artistas;
//	public Albumes_perfil _albumes_perfil;
//	public ContenedorListas_Con_Sus_Canciones _contenedorListas_Con_Sus_Canciones;
//	public ContenedorSus_Listas _contenedorSus_Listas;

//	public void Seguir_artista() {
//		throw new UnsupportedOperationException();
//	}
	
	
	public ContenedorAlbumes ca;
	private iActor_comun iac = new BDPrincipal();
	private iArtista iart = new BDPrincipal();
	
	public Canciones_mas_exitosas cms;
	public Artistas artistas;
	public Conciertos_y_festivales cyf;
	public ContenedorListas_Con_Sus_Canciones clcsc;
	

	public Ver_perfil_del_artista_ajeno() {
		inicializar();
	}

	public Ver_perfil_del_artista_ajeno(int idArtista) {
		
		super(idArtista);
		inicializar();
		if(seguido(idArtista)) {
			this.getVaadinButton().setVisible(false);
			
		}else {
			this.getVaadinButton1().setVisible(false);
		}
		
		basededatos.Usuario usuario = iac.cargar_Perfil(idArtista);
		this.getImg().setSrc("imagenes/"+usuario.getContiene_imagen().getUrl());
		this.getLabel().setText(usuario.getNombre());
		this.getLabel1().setText("Seguidores: " +usuario.seguido.size());
		this.getLabel2().setText("Seguidos: " +usuario.seguidor_usuario.size());
	
		clcsc = new ContenedorListas_Con_Sus_Canciones(usuario.getCorreo());
		VerticalLayout vl2 = this.getVerticalListasSusCanciones().as(VerticalLayout.class);
		vl2.add(clcsc);		

		ca = new ContenedorAlbumes(idArtista);
		
		HorizontalLayout hl = this.getHorizontalAlbumes();
		hl.add(ca);
		
		cms = new Canciones_mas_exitosas(usuario.getCorreo());	
		VerticalLayout vl3 = this.getVerticalExitosas().as(VerticalLayout.class);
		vl3.add(cms);

		cyf = new Conciertos_y_festivales(idArtista);
		VerticalLayout vl4 = this.getVerticalConciertos().as(VerticalLayout.class);
		vl4.add(cyf);
		
		artistas = new Artistas(idArtista);

		HorizontalLayout hl2 = this.getHorizontalArtistas();
		hl2.add(artistas);
		
		
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				iart.Seguir_artista(Actor_comun.ID, idArtista);
				getVaadinButton().setVisible(false);
				getVaadinButton1().setVisible(true);
				
			}
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				iart.dejar_de_seguir_artista(Actor_comun.ID, idArtista);
				getVaadinButton().setVisible(true);
				getVaadinButton1().setVisible(false);
				
			}
		});
			
	}

	private void inicializar() {
	this.getStyle().set("width", "100%");

	}

	
	private boolean seguido(int idArtista) {
		if(iac.comprobar_Seguido(idArtista)) {
			return true;
		}else
			return false;
		
		
	}
}