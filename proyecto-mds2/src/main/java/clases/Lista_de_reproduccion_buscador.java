package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_de_reproduccion_buscador extends vistas.VistaLista_de_reproduccion_buscador{
//	private Label _nombre_ListaL;
//	private Label _autor;
//	private Button _seguir_ListaB;
//	public Listas_de_reproduccion_buscador _listas_de_reproduccion_buscador;
//	public Ver_lista_de_reproduccion_ajena _ver_lista_de_reproduccion_ajena;
//	public Ver_perfil_ajeno _ver_perfil_ajeno;
//
//	public void Seguir_lista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void irLista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_Perfil() {
//		throw new UnsupportedOperationException();
//	}
	
	public Ver_lista_de_reproduccion_ajena vlra = new Ver_lista_de_reproduccion_ajena(); 
	
	public Lista_de_reproduccion_buscador() {
		this.getStyle().set("width", "100%");
		
		this.getVaadinVerticalLayout().addEventListener("click", e -> {
			VerticalLayout a = Usuario_registrado.v1;
			a.removeAll();
			a.add(vlra);
			Usuario_registrado.v2.setVisible(false);
		});
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Seguido");
				
			}
			
		});
	}
}
