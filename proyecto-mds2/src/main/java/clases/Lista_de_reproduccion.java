package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.DomEventListener;

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
	public Lista_de_reproduccion() {
		inicializar();
		
		//CLICKER VER LISTA		
	}
		

	private void inicializar() {
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton2().setVisible(false);
		this.getStyle().set("width", "100%");
	}
}