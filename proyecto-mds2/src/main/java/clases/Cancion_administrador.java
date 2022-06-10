package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import bds.BDPrincipal;
import bds.iAdministrador;

public class Cancion_administrador extends vistas.VistaCancion_administrador {
//	private Label _titulo_CancionL;
//	private Label _artistaL;
//	private Button _reproducirB;
//	private Button _anadir_a_inicioB;
//	private Button _eliminar_Cancion;
//	private Button _editar_CancionB;
//	public Canciones_administrador _canciones_administrador;
//	public Vista_modificar_cancion _vista_modificar_cancion;	
	public Ver_perfil_del_artista_ajeno vpaj;
	public Vista_modificar_cancion vmc;
	
	public Cancion_administrador() {
		this.getStyle().set("width", "100%");
	}

	public Cancion_administrador(Cancion cancion) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(cancion.getTitulo());
		if(cancion.es_de.toArray().length>0) {
		this.getLabel1().setText(cancion.es_de.toArray()[0].getNombre());
		}
		else {
		this.getLabel1().setText("Artista desconocido");
		}
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Administrador.v1.removeAll();
				vmc = new Vista_modificar_cancion(cancion.getIdCancion());
				Administrador.v1.add(vmc);
				
			}
		});
		this.getVaadinButton3().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Eliminar_cancion(cancion.getIdCancion());
			}
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Actor_comun.rc.reproducir(cancion.getArchivoMultimedia());
				Notification.show("Reproduciendo");
			}
			});
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				iAdministrador iadmin = new BDPrincipal();
				iadmin.Anadir_a_la_vista_de_cibernauta(cancion.getIdCancion());
				Notification.show("Cancion anadida a inicio");
			}
			});
			this.getVaadinHorizontalLayout1().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				VerticalLayout v1 = Usuario_registrado.v1;
				vpaj = new Ver_perfil_del_artista_ajeno(cancion.es_de.toArray()[0].getID());
				v1.removeAll();
				v1.add(vpaj);
				 Usuario_registrado.v2.setVisible(false);
				
				
			}
		});
		}

//	public void Boton_reproducir() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Anadir_a_la_vista_de_cibernauta() {
//		throw new UnsupportedOperationException();
//	}
//
	public void Eliminar_cancion(int id) {
		iAdministrador iadmin = new BDPrincipal();
		iadmin.eliminar_Cancion(id);
	}
//
//	public void Ventana_Modificar_Cancion() {
//		throw new UnsupportedOperationException();
//	}
}