package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_de_reproduccion_propia extends vistas.VistaLista_de_reproduccion_propia{
//	private Label _nombre_Lista;
//	public Listas_de_reproduccion_perfil_propio _listas_de_reproduccion_perfil_propio;
//	public Edicion_de_lista _edicion_de_lista;
//	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;

	public Edicion_de_lista edl = new Edicion_de_lista();
	public Ver_lista_de_reproduccion_propia vlrp = new Ver_lista_de_reproduccion_propia();
//	public void modificarLista() {
//		throw new UnsupportedOperationException();
//	}
	public Lista_de_reproduccion_propia(String string) {
		this.getLabel().setText(string);
		inicializar();
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Usuario_registrado.v1;
				vl.removeAll();
				vl.add(edl);
			}
		});
		
		this.getVaadinHorizontalLayout1().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				VerticalLayout vl = Usuario_registrado.v1;
				vl.removeAll();
				vl.add(vlrp);
				
			}
		});
		
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
	}
	
}