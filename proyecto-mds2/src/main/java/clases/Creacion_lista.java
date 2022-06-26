package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;

public class Creacion_lista extends Modificar_y_crear_lista {
//	private Label _titulo_CrearL;
//	private Button _crear_Lista;
//	public Contenedor_agregar _listas_de_reproduccion_perfil_propio;

//	public void Crear_lista() {
//		throw new UnsupportedOperationException();
//	}
	
	private iActor_comun iac = new BDPrincipal();
	public Creacion_lista() {
		
	}
	public Creacion_lista(int usuario, int tipo) {
		super(usuario,tipo);

		this.getLabel().setText("Crear lista");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton2().setText("Crear lista");
		
		
		this.getVaadinButton3().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(Ver_perfil_propio.tipoUsuario == 0) {
					VerticalLayout vl = Usuario_registrado.v1;
					vl.removeAll();
					vl.add(Usuario_registrado.vpp);
				}else if(Ver_perfil_propio.tipoUsuario == 1) {
					VerticalLayout vl = Artista.v1;
					vl.removeAll();
					vl.add(Artista.vppa);
				}else if(Ver_perfil_propio.tipoUsuario == 2) {
					VerticalLayout vl = Administrador.v1;
					vl.removeAll();
					vl.add(Administrador.vpp);
				}
					
					
				
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(getVaadinTextField().getValue().isEmpty()) {
					Notification.show("Por favor, inserte un nombre de lista");
				} else {
					// GUARDAR LISTA
					iac.crear_Lista(getVaadinTextField().getValue(), cmc.get_canciones());
					
					Notification.show("Lista creada");
				}
						
			}
		});
	}


}
