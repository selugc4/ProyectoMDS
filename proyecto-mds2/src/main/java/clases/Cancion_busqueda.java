package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Cancion_busqueda extends vistas.VistaCancion_busqueda{
//	private Label _titulo_CancionL;
//	private Label _artistaL;
//	private Button _anadir_a_favoritosB;
//	private Button _reproducirB;
//	public Canciones_busqueda _canciones_busqueda;
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
	
	public Ver_perfil_del_artista_ajeno vpaj;

//	public void Anadir_a_favoritos() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void reproducir() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void irArtista() {
//		throw new UnsupportedOperationException();
//	}
	
	public Cancion_busqueda(Cancion cancion) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(cancion.getTitulo());
		if(cancion.es_de.isEmpty()) {
			this.getLabel1().setText("Artistas No Asignados");
		}else
			this.getLabel1().setText(cancion.es_de.toArray()[0].getNombre());
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				iActor_comun iac = new BDPrincipal();
				iac.anadir_Cancion_Favorita(cancion.getIdCancion(), Actor_comun.ID);
				Notification.show("Cancion añadida a favoritos" );
			}
	
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Actor_comun.getRc().vcre = new Ver_creditos(cancion);
				Actor_comun.getRc()._ir_a_cancion = new Ir_a_cancion(cancion);
				iActor_comun iac = new BDPrincipal();
				iac.reproducir(Actor_comun.ID, cancion.getIdCancion());
				
				Actor_comun.rc.reproducir(cancion.getArchivoMultimedia());
			}
		});
		
		if(!this.getLabel1().getText().equals("Artistas No Asignados")) {
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
	}

}