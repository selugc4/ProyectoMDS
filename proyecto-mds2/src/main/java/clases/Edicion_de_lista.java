package clases;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;
import bds.BDPrincipal;
import bds.iActor_comun;

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
	private iActor_comun iac = new BDPrincipal();
	private int usuario;
	
	public Edicion_de_lista() {
		
	}
	
	public Edicion_de_lista(int usuario, int tipo, int iD) {
		super(usuario,tipo);
		this.idLista = iD;
		this.getLabel().setText("Modificar");		
		mostrarTitulo(iD);
		this.usuario = usuario;
		this.getVaadinTextField().setReadOnly(true);
		
		this.getVaadinButton2().setText("Modificar lista");
		
		
		this.getVaadinButton3().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
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
			}
			
			});
		

		
		

	
		
	
	}
	private void mostrarTitulo(int iD) {
		Lista_Reproduccion lr;
		try {
			lr = Lista_ReproduccionDAO.getLista_ReproduccionByORMID(iD);
			this.getVaadinTextField().setValue(lr.getNombreLista());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Edicion_de_lista(int usuario, int tipo) {
		super(usuario,tipo);
		this.getLabel().setText("Modificar");
		
		this.getVaadinButton2().setText("Modificar lista");
		this.getVaadinTextField().setReadOnly(true);

		
		
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

	public void cargarLista(String nombreLista) {
		this.getVaadinTextField().setValue(nombreLista);
		basededatos.Cancion[] canciones = iac.cargar_Canciones_Modificar(idLista);
		for(basededatos.Cancion cancion : canciones) {
			Edicion_de_lista.cmc.agregarCancion(cancion.getTitulo(), cancion.getIdCancion());
		}
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
							Usuario_registrado.vpp = new Ver_perfil_propio_usuario_registrado(Actor_comun.ID);
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
		
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				//GUARDAR CAMBIOS
				iac.guardar_Modificacion_lista(idLista, getVaadinTextField().getValue(), cmc.get_canciones());
				Actor_comun.v1.removeAll();
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
						
				Notification.show("Cambios Guardados");
				
			}
		});
		
		
			
		
		
	}
	


}