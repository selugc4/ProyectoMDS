package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS2.MainView;

public class Ver_perfil_propio_usuario_registrado extends Ver_perfil_propio {
//	private Button _darse_De_BajaB;
//	private Dialog _darse_De_Baja;
//	public Cabecera_usuario_registrado _cabecera_usuario_registrado;
	
	Ver_lista_de_reproduccion_propia vlpp = new Ver_lista_de_reproduccion_propia("Favoritos");
	ContenedorAgregar_perfil_propio capp = new ContenedorAgregar_perfil_propio();

	
	public Ver_perfil_propio_usuario_registrado() {
		inicializar();
		
	}
	
	public Ver_perfil_propio_usuario_registrado(String nombre) {
		inicializar();
		this.getLabel().setText(nombre);
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(true);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		this.getVaadinButton4().setVisible(false);
		this.getVaadinTextField().setReadOnly(true);
		
		VerticalLayout vl = this.getVerticalLista().as(VerticalLayout.class);
		vl.add(capp);

		
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
	  
}
//	public void Darse_de_baja() {
//		throw new UnsupportedOperationException();
//	}
}