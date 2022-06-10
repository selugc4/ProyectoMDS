package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iUsuario_registrado;

public class Ver_perfil_usuario_ajeno extends Ver_perfil_ajeno {
//	public ContenedorLista_perfil_ajeno _contenedorLista_perfil_ajeno;
	
	private iActor_comun iac = new BDPrincipal();
	private iUsuario_registrado iur = new BDPrincipal();

	public Ver_perfil_usuario_ajeno(int id) {

		super(id);
		this.getStyle().set("width", "100%");

			if(seguido(id)) {
				this.getVaadinButton().setVisible(false);
				
			}else {
				this.getVaadinButton1().setVisible(false);
			}

		basededatos.Usuario usuario = iac.cargar_Perfil(id);
		this.getImg().setSrc("imagenes/"+usuario.getContiene_imagen().getUrl());
		this.getLabel().setText(usuario.getNombre());
		this.getLabel1().setText("Seguidores: " +usuario.seguido.size());
		this.getLabel2().setText("Seguidos: " +usuario.seguidor_usuario.size());
		
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Seguir_usuario(id);
				getVaadinButton().setVisible(false);
				getVaadinButton1().setVisible(true);
				
			}
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dejar_de_seguir_usuario(id);
				getVaadinButton().setVisible(true);
				getVaadinButton1().setVisible(false);
				
			}
		});
	}

		private boolean seguido(int id) {
			if(iac.comprobar_Seguido(id)) {
				return true;
			}else
				return false;
			
			
	}

	

	public void Seguir_usuario(int id) {
		iur.Seguir_Usuario(Actor_comun.ID, id);
	}
	
	public void Dejar_de_seguir_usuario(int id) {
		iur.Dejar_de_seguir_usuario(Actor_comun.ID, id);
		
	}
}