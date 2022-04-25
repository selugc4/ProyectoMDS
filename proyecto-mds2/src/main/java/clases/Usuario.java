package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Usuario extends vistas.VistaUsuario{
//	private Button _modificar_UsuarioB;
//	private Button _eliminar_UsuarioB;
//	private Image _foto;
//	private Label _nombre_UsuarioL;
//	public Usuarios _usuarios;
//	public Ver_perfil_propio _ver_perfil_propio;

	public Ver_perfil_propio vpp = new Ver_perfil_propio();
	public Usuario(String name) {
		this.getLabel().setText(name);
		vpp = new Ver_perfil_propio(name);
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// Eliminar
				Dialog diag = new Dialog();
				VerticalLayout vl = new VerticalLayout();
				HorizontalLayout hl = new HorizontalLayout();
				Button botonsi = new Button("Si");
				Button botonno = new Button("No");
				hl.add(botonsi, botonno);
				vl.add("Está seguro de eliminar el siguiente usuario? Usuario: " +getLabel().getText());
				vl.add(hl);
				
				diag.add(vl);
				diag.open();
				
				botonsi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						diag.close();
						Notification.show("Estilo eliminado");
						
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
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Vista_buscador_usuarios.vl.removeAll();
				Vista_buscador_usuarios.vl.add(vpp);
			}
		});

	}
	public Ver_perfil_propio getVpp() {
		return vpp;
	}

//	public void Modificar_usuario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Eliminar_usuario() {
//		throw new UnsupportedOperationException();
//	}
	
	
}