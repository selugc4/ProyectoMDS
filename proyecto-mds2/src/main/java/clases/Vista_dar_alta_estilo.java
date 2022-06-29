package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iAdministrador;

public class Vista_dar_alta_estilo extends vistas.VistaVista_dar_alta_estilo{
//	private Label _titulo_Anadir_EstilosL;
//	private Label _estiloL;
//	private TextField _estiloTF;
//	private Button _anadir_EstiloB;
//	private Button _volver_AtrasB;
//	public Menu_dar_alta _menu_dar_alta;

//	public void Anadir_estilo() {
//		throw new UnsupportedOperationException();
//	}
	
	public static boolean existente = false;
	
	public Vista_dar_alta_estilo() {
		this.getStyle().set("width", "100%");
		iAdministrador iadmin = new BDPrincipal();
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// Agregar Datos
				
				String nombre = getVaadinTextField().getValue();			
				if(nombre.isEmpty()) {
					Notification.show("El campo de estilo no puede estar vacío");
				}else {
					anadirEstilo(nombre);
					if(existente) {
						Notification.show("El estilo ya existe");
					}else {
					VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
					vl.removeAll();
					vl.add(new Menu_dar_alta());
					Notification.show("Estilo agregado con exito");
					}
				
			}
			
		};

			private void anadirEstilo(String nombre) {
				// TODO Auto-generated method stub
			
				iadmin.Anadir_estilo(nombre);
				
				}
			});
		}
	}