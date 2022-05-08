package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Creacion_lista extends Modificar_y_crear_lista {
//	private Label _titulo_CrearL;
//	private Button _crear_Lista;
//	public Contenedor_agregar _listas_de_reproduccion_perfil_propio;

//	public void Crear_lista() {
//		throw new UnsupportedOperationException();
//	}
	
	public Creacion_lista() {
		inicializar();
		
		this.getVaadinButton3().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(admin == 0) {
					VerticalLayout vl = Usuario_registrado.v1;
					vl.removeAll();
					vl.add(Usuario_registrado.vpp);
				}
				
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// GUARDAR LISTA
				Notification.show("Lista creada");
				
			}
		});
	}

	private void inicializar() {
		this.getLabel().setText("Crear lista");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton2().setText("Crear lista");
		this.getStyle().set("width", "100%");
		
	}
}