package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.DomEventListener;

import basededatos.Lista_Reproduccion;

public class Lista_de_reproduccion extends vistas.VistaLista_de_reproduccion {
//	private Label _texto_ListaL;
//	public Listas_de_reproduccion _listas_de_reproduccion;
//	public Sus_listas_de_reproduccion _sus_listas_de_reproduccion;
//	public Listas_de_reproduccion_con_sus_canciones _listas_de_reproduccion_con_sus_canciones;
//	public Ver_lista_de_Reproduccion _ver_lista_de_Reproduccion;

/*	public void irLista() {
		throw new UnsupportedOperationException();
	}
	*/
	public Ver_lista_de_Reproduccion vldr = new Ver_lista_de_Reproduccion();
		
	public Lista_de_reproduccion(String aux) {
		inicializar();
		this.getLabel().setText(aux);
	}


	public Lista_de_reproduccion(Lista_Reproduccion lista) {
		inicializar();
		this.getLabel().setText(lista.getNombreLista());
		//CLICKER VER LISTA		
		this.getVaadinHorizontalLayout2().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				VerticalLayout aux = Usuario_registrado.v1;
				vldr = new Ver_lista_de_Reproduccion(lista.getIdLista(), lista.getNombreLista());
				aux.removeAll();
				aux.add(vldr);
				Usuario_registrado.v2.setVisible(false);
			}
		});
	}

	public Lista_de_reproduccion(Lista_Reproduccion lista, boolean b) {
		inicializar();
		this.getLabel().setText(lista.getNombreLista());
		//CLICKER VER LISTA		
		this.getVaadinHorizontalLayout2().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				VerticalLayout aux = Usuario_registrado.v1;
				vldr = new Ver_lista_de_Reproduccion(lista.getIdLista(), lista.getNombreLista());		
				aux.removeAll();
				aux.add(vldr);
				Usuario_registrado.v2.setVisible(false);
			}
		});
	}


	private void inicializar() {
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton2().setVisible(false);
		this.getStyle().set("width", "100%");
	}
	public void cambiarVisibilidad() {
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(true);
		this.getVaadinButton2().setVisible(true);
	}
}