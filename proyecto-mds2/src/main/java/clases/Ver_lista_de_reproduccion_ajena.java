package clases;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Ver_lista_de_reproduccion_ajena extends Ver_lista_de_Reproduccion {
//	private Button _seguir_ListaB;
//	public Lista_de_reproduccion_buscador _lista_de_reproduccion_buscador;
//	public Lista_de_reproduccion_perfil_ajeno _lista_de_reproduccion_perfil_ajeno;
//
//	public void Seguir_lista() {
//		throw new UnsupportedOperationException();
//	}
	
	public Ver_perfil_ajeno vpa;

	
	public Ver_lista_de_reproduccion_ajena() {
		inicializar();
	}
	public Ver_lista_de_reproduccion_ajena(int idLista, String nombre) {
		inicializar();		
		this.getLabel().setText(nombre);
		
		cancionesLista = new Canciones_lista(idLista);
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.add(cancionesLista);
	}
	public Ver_lista_de_reproduccion_ajena(int idLista, String nombreLista, String nombre, int id) {
	
		inicializar();		
		this.getLabel().setText(nombreLista);
		this.getLabel1().setText("Autor: " +nombre);
		
		this.getVaadinButton4().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				try {
					basededatos.Usuario usuario = basededatos.UsuarioDAO.loadUsuarioByORMID(id);
					if(usuario.getTipoUsuario() == 0) {
						Actor_comun.v1.removeAll();
						vpa = new Ver_perfil_usuario_ajeno(id);						
						Actor_comun.v1.add(vpa);
					}else if(usuario.getTipoUsuario() == 1) {
						Actor_comun.v1.removeAll();
						vpa = new Ver_perfil_del_artista_ajeno(id);					
						Actor_comun.v1.add(vpa);
					}else if(usuario.getTipoUsuario() == 2) {
						Actor_comun.v1.removeAll();
						vpa = new Ver_perfil_ajeno(id);						
						Actor_comun.v1.add(vpa);
					}
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.remove(cancionesLista);
		cancionesLista = new Canciones_lista(idLista);
		

		v1.add(cancionesLista);
		
	}
	public void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout1().setVisible(true);

		this.getVaadinButton().setVisible(false);

		this.getVaadinButton2().setVisible(false);
		this.getVaadinButton3().setVisible(false);
	}
}