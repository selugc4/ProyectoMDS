package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Menu_dar_alta extends vistas.VistaMenu_dar_alta {
//	private Label _titulo_Dar_AltaL;
//	private Button _cancionesB;
//	private Button _estilosB;
//	private Button _albumesB;
//	private Button _artistasB;
//	public Vista_administracion _vista_administracion;
//	public Vista_dar_alta_album _vista_dar_alta_album;
//	public Vista_dar_alta_artista _vista_dar_alta_artista;
//	public Vista_dar_alta_cancion _vista_dar_alta_cancion;
//	public Vista_dar_alta_estilo _vista_dar_alta_estilo;

//	public void ventanaDarAltaCanciones() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaDarAltaEstilos() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaDarAltaAlbumes() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaDarAltaArtistas() {
//		throw new UnsupportedOperationException();
	
	public Vista_dar_alta_album vdaa = new Vista_dar_alta_album();
	public Vista_dar_alta_artista vdaart = new Vista_dar_alta_artista();
	public Vista_dar_alta_cancion vdac = new Vista_dar_alta_cancion();
	public Vista_dar_alta_estilo vdae = new Vista_dar_alta_estilo();
	public Menu_dar_alta() {
		this.getVaadinVerticalLayout().getStyle().set("width", "1000px");
		
		this.getBotonCanciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
				vl.removeAll();
				vl.add(vdac);
				
			}
		});
	this.getBotonEstilos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
				vl.removeAll();
				vl.add(vdae);
				
			}
		});
	this.getBotonAlbumes().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.removeAll();
			vl.add(vdaa);
			
		}
	});
	this.getBotonArtistas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.removeAll();
			vl.add(vdaart);
			
		}
	});
	
	this.vdac.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.removeAll();
			vl.add(new Menu_dar_alta());
		}
	});
	
	
	this.vdae.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.removeAll();
			vl.add(new Menu_dar_alta());
		}
	});
	
	
	this.vdaart.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.removeAll();
			vl.add(new Menu_dar_alta());
		}
	});
	
	
	this.vdaa.getBotonVolver().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.removeAll();
			vl.add(new Menu_dar_alta());
		}
	});
	

	}
//	}
}