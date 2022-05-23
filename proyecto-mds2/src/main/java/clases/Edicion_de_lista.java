package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Edicion_de_lista extends Modificar_y_crear_lista {
//	private Label _titulo_modificarL;
//	private Button _eliminar_ListaB;
//	private Button _boton_EditarB;
//	private Button _eliminar_CancionB;
//	private Dialog _confirmar_Eliminacion;
//	public Lista_de_reproduccion_administrador _lista_de_reproduccion_administrador;
//	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
//	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;

//	public void Eliminar_lista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Eliminar_cancion_lista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Boton_editar() {
//		throw new UnsupportedOperationException();
//	}
	
	public Edicion_de_lista(int usuario) {
		inicializar(usuario);
	}

	
	private void inicializar(int usuario) {
	this.getStyle().set("width", "100%");
	this.getLabel().setText("Modificar");
	this.getVaadinButton2().setText("Modificar lista");
	
	this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			//GUARDAR CAMBIOS
			Notification.show("Cambios Guardados");
			
		}
	});
	
	this.getVaadinButton3().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			if(usuario == 0) {
				VerticalLayout vl = Usuario_registrado.v1;
				vl.removeAll();
				vl.add(Usuario_registrado.vpp);
			}else if(usuario == 1) {
				VerticalLayout vl = Artista.v1;
				vl.removeAll();
				vl.add(Artista.vppa);
			}else if(usuario == 2) {
				VerticalLayout vl = Administrador.v1;
				vl.removeAll();
				vl.add(Administrador.vpp);
			}
		}
		});
	}
}