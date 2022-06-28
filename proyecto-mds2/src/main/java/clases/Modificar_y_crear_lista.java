package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;

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
	public static Canciones_modificar_y_crear cmc;
	public Buscador_cancion bc;
	
	public int idLista;
	
	private iActor_comun iac = new BDPrincipal();
	
	public Modificar_y_crear_lista() {
//		inicializar();
	}
	
	public Modificar_y_crear_lista(int usuario, int tipo) {
		cmc = new Canciones_modificar_y_crear(tipo);		
		bc = new Buscador_cancion(tipo);
		inicializar(usuario);
	}
	
	public Modificar_y_crear_lista(int usuario,int tipo, int iDlista) {
		cmc = new Canciones_modificar_y_crear(tipo);
		idLista = iDlista;
		
		bc = new Buscador_cancion(tipo);
		inicializar(usuario);
		
	}

	protected void inicializar(int usuario) {
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
						iac.eliminar_Lista_Reproduccion(idLista);
						diag.close();
						Actor_comun.v1.removeAll();
						if(usuario == 0) {
							VerticalLayout vl = Usuario_registrado.v1;
							Usuario_registrado.vpp = new Ver_perfil_propio_usuario_registrado(Usuario_registrado.ID);
							vl.removeAll();
							vl.add(Usuario_registrado.vpp);
						}else if(usuario == 1) {
							VerticalLayout vl = Artista.v1;
							Artista.vppa = new Ver_perfil_propio_de_artista(Actor_comun.ID);
							vl.removeAll();
							vl.add(Artista.vppa);
						}else if(usuario == 2) {
							VerticalLayout vl = Administrador.v1;
							Administrador.vpp = new Ver_perfil_propio(Actor_comun.ID);
							vl.removeAll();
							vl.add(Administrador.vpp);
						}
					
				
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