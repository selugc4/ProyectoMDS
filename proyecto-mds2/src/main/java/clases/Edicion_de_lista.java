package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public Edicion_de_lista() {
		
	}
	
	public Edicion_de_lista(int usuario, int tipo, int iD) {
		super(usuario,tipo);
		this.idLista = iD;
		this.getLabel().setText("Modificar");
		
		this.getVaadinButton2().setText("Modificar lista");

		
		
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
	public Edicion_de_lista(int usuario, int tipo) {
		super(usuario,tipo);
		this.getLabel().setText("Modificar");
		
		this.getVaadinButton2().setText("Modificar lista");

		
		
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
		this.getVaadinTextField().setReadOnly(true);
		basededatos.Cancion[] canciones = iac.cargar_Canciones_Modificar(idLista);
		for(basededatos.Cancion cancion : canciones) {
			Edicion_de_lista.cmc.agregarCancion(cancion.getTitulo(), cancion.getIdCancion());
		}
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				//GUARDAR CAMBIOS
				iac.guardar_Modificacion_lista(idLista, getVaadinTextField().getValue(), cmc.get_canciones());
				Notification.show("Cambios Guardados");
				
			}
		});
		
		
			
		
		
	}
	


}