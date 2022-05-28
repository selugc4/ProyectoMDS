package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_y_crear_lista extends vistas.VistaModificar_y_crear_lista{
//	private Dialog _anadir_Cancion;
//	private Button _anadir_CancionB;
//	private Label _titulo_ListaL;
//	private TextField _titulo_ListaTF;
//	private Label _lista_Canciones;
//	private Button _volver_AtrasB;
//	public Buscador_cancion _buscador_cancion;
//	public Canciones_modificar_y_crear _canciones_modificar_y_crear;
//
//	public void Anadir_cancion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Comprobar_titulo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
	public Canciones_modificar_y_crear cmc = new Canciones_modificar_y_crear();
	public Buscador_cancion bc = new Buscador_cancion();
	
	int usuario = 0; //UR = 0, ART = 1, ADMIN = 2
	
	public Modificar_y_crear_lista() {
		inicializar();
	}
	
	public Modificar_y_crear_lista(int usuario) {
		this.usuario = usuario;
	}

	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout5().add(cmc);
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog();
				VerticalLayout vl = new VerticalLayout();
				HorizontalLayout hl = new HorizontalLayout();
				Button botonsi = new Button("Si");
				Button botonno = new Button("No");
				hl.add(botonsi, botonno);
				vl.add("Está seguro de eliminar la lista? Lista: " +getVaadinTextField().getValue());
				vl.add(hl);
				
				diag.add(vl);
				diag.open();
				
				botonsi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						diag.close();
						Notification.show("Lista eliminada");
						
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
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(bc);
				diag.open();
			}
		});
		
	
			
	}
}