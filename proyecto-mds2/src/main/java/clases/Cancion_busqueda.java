package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cancion_busqueda extends vistas.VistaCancion_busqueda{
//	private Label _titulo_CancionL;
//	private Label _artistaL;
//	private Button _anadir_a_favoritosB;
//	private Button _reproducirB;
//	public Canciones_busqueda _canciones_busqueda;
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
	
	public Ver_perfil_del_artista_ajeno vpaj = new Ver_perfil_del_artista_ajeno();

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
	
	public Cancion_busqueda() {
		this.getStyle().set("width", "100%");
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Agregada a favoritos");
				
			}
	
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
//				Usuario_registrado.rc.setSource(null);
				Notification.show("Reproduciendo");
			
				
			}
		});
		
		this.getVaadinHorizontalLayout1().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				VerticalLayout v1 = Usuario_registrado.v1;
				v1.removeAll();
				v1.add(vpaj);
				 Usuario_registrado.v2.setVisible(false);
				
				
			}
		});
	}
	
}