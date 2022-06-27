package clases;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import basededatos.Lista_Reproduccion;
import basededatos.UsuarioDAO;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Ver_lista_de_reproduccion_propia extends Ver_lista_de_Reproduccion {
//	private Button _editarB;
//	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
//	public Ver_perfil_propio _ver_perfil_propio;
//	public Edicion_de_lista _edicion_de_lista;

	public Edicion_de_lista el;
	private iActor_comun iac = new BDPrincipal();
	
	public Ver_lista_de_reproduccion_propia(int usuario) {
	 inicializarFavoritos(usuario);	
	 el = new Edicion_de_lista(usuario,1);
	}
	
	private void inicializarFavoritos(int usuario) {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout1().setVisible(true);
		this.getLabel().setText("Favoritas");		
		this.getLabel1().setText("Autor: Tú");
		ArrayList<Cancion__Vista_actor_comun_> vlrp = new ArrayList<Cancion__Vista_actor_comun_>();
		Cancion[] canciones = iac.cargar_Canciones_Favoritas();
		for(int i = 0; i < canciones.length; i++) {	
			Cancion__Vista_actor_comun_ aux = new Cancion__Vista_actor_comun_(canciones[i]);
			vlrp.add(aux);

		}
		
		if(vlrp.isEmpty()) {
		this.cancionesLista.getVaadinButton().setVisible(false);
		this.cancionesLista.getLabel1().setText("No se han agregado favoritos");
		}else {		
			for(Cancion__Vista_actor_comun_ cvac : vlrp) {
				cancionesLista._cancion_vista_album.add(new Cancion_vista_album(cvac));
				cancionesLista.Cargar_Listas();
			}
		}
		
		
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton2().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		
		this.cancionesLista.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Actor_comun.v1.removeAll();
				el = new Edicion_de_lista(usuario, 1); 
				Actor_comun.v1.add(el);
				
			}
		});
		this.getVaadinButton4().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Actor_comun.v1.removeAll();
				try {
					basededatos.Usuario usuario = UsuarioDAO.loadUsuarioByORMID(Actor_comun.ID);
					if(usuario.getTipoUsuario() == 0) {
					Usuario_registrado.vpp = new Ver_perfil_propio_usuario_registrado(Actor_comun.ID);
					Actor_comun.v1.add(Usuario_registrado.vpp);
					}else if(usuario.getTipoUsuario() == 1) {
						Artista.vppa = new Ver_perfil_propio_de_artista(Actor_comun.ID);
						Actor_comun.v1.add(Artista.vppa);
					}else
						Administrador.vpp = new Ver_perfil_propio(Actor_comun.ID);
						Actor_comun.v1.add(Administrador.vpp);
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		});
		
	}

	public Ver_lista_de_reproduccion_propia(ArrayList<Cancion__Vista_actor_comun_> lista, String nombre) {
			inicializar();		
			this.getLabel().setText(nombre);
			cancionesLista = new Canciones_lista(lista);
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			v1.add(cancionesLista);
	
			this.getVaadinButton4().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					Actor_comun.v1.removeAll();
					try {
						basededatos.Usuario usuario = UsuarioDAO.loadUsuarioByORMID(Actor_comun.ID);
						if(usuario.getTipoUsuario() == 0) {
						Usuario_registrado.vpp = new Ver_perfil_propio_usuario_registrado(Actor_comun.ID);
						Actor_comun.v1.add(Usuario_registrado.vpp);
						}else if(usuario.getTipoUsuario() == 1) {
							Artista.vppa = new Ver_perfil_propio_de_artista(Actor_comun.ID);
							Actor_comun.v1.add(Artista.vppa);
						}else
							Administrador.vpp = new Ver_perfil_propio(Actor_comun.ID);
							Actor_comun.v1.add(Administrador.vpp);
						
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
				}
			});
			
		}
	
	public Ver_lista_de_reproduccion_propia(String nombre) {
		inicializar();
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.getLabel().setText(nombre);
		v1.add(cancionesLista);
	}
	
	public Ver_lista_de_reproduccion_propia(String string, int iD) {
		inicializar();
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.getLabel().setText(string);
		ArrayList<Cancion__Vista_actor_comun_> vlrp = new ArrayList<Cancion__Vista_actor_comun_>();
		Cancion[] canciones = iac.cargar_Canciones_Lista(iD);
		for(int i = 0; i < canciones.length; i++) {	
			Cancion__Vista_actor_comun_ aux = new Cancion__Vista_actor_comun_(canciones[i]);
			vlrp.add(aux);

		}
		for(Cancion__Vista_actor_comun_ cvac : vlrp) {
			cancionesLista._cancion_vista_album.add(new Cancion_vista_album(cvac));
			cancionesLista.Cargar_Listas();
		}
		v1.add(cancionesLista);
		
		this.cancionesLista.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				try {
					basededatos.Usuario usuario = UsuarioDAO.loadUsuarioByORMID(Actor_comun.ID);
					Actor_comun.v1.removeAll();
					el = new Edicion_de_lista(usuario.getTipoUsuario(), 1, iD); 
					el.cargarLista(string);
					Actor_comun.v1.add(el);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		this.getVaadinButton4().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Actor_comun.v1.removeAll();
				try {
					basededatos.Usuario usuario = UsuarioDAO.loadUsuarioByORMID(Actor_comun.ID);
					if(usuario.getTipoUsuario() == 0) {
					Usuario_registrado.vpp = new Ver_perfil_propio_usuario_registrado(Actor_comun.ID);
					Actor_comun.v1.add(Usuario_registrado.vpp);
					}else if(usuario.getTipoUsuario() == 1) {
						Artista.vppa = new Ver_perfil_propio_de_artista(Actor_comun.ID);
						Actor_comun.v1.add(Artista.vppa);
					}else
						Administrador.vpp = new Ver_perfil_propio(Actor_comun.ID);
						Actor_comun.v1.add(Administrador.vpp);
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		});
	}

	public void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout1().setVisible(true);
		this.getLabel1().setText("Autor: Tú");
		
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton2().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		
		
	}
	
//	public void ventanaEditar() {
//		throw new UnsupportedOperationException();
//	}
}