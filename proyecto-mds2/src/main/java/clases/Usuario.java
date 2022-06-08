package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_Registrado;
import bds.BDPrincipal;
import bds.iAdministrador;

public class Usuario extends vistas.VistaUsuario{
//	private Button _modificar_UsuarioB;
//	private Button _eliminar_UsuarioB;
//	private Image _foto;
//	private Label _nombre_UsuarioL;
//	public Usuarios _usuarios;
//	public Ver_perfil_propio _ver_perfil_propio;

	public Ver_perfil_propio vpp = new Ver_perfil_propio();
	public Usuario(Usuario_Registrado usuario) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(usuario.getNombre());
		vpp = new Ver_perfil_propio_usuario_registrado(usuario.getID());
		this.getImg().setSrc("imagenes/" + usuario.getContiene_imagen().getUrl());
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
						Eliminar_usuario(usuario.getCorreo());
						diag.close();
						Notification.show("Usuario eliminado");
						
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
				Administrador.v1.removeAll();
				Administrador.v1.add(vpp);
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
	public void Eliminar_usuario(String correo) {
		iAdministrador iadmin = new BDPrincipal();
		iadmin.Eliminar_usuario(correo);
	}
}