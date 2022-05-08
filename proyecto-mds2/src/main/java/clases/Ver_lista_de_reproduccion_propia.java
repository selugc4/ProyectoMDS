package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_lista_de_reproduccion_propia extends Ver_lista_de_Reproduccion {
//	private Button _editarB;
//	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
//	public Ver_perfil_propio _ver_perfil_propio;
//	public Edicion_de_lista _edicion_de_lista;

	public Edicion_de_lista el = new Edicion_de_lista();
	
	public Ver_lista_de_reproduccion_propia() {
	 inicializar();	
	}
	
	public Ver_lista_de_reproduccion_propia(ArrayList<Cancion__Vista_actor_comun_> lista, String nombre) {
			inicializar();		
			this.getLabel().setText(nombre);
			cancionesLista = new Canciones_lista(lista);
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			v1.add(cancionesLista);
			
			
		}
	
	public Ver_lista_de_reproduccion_propia(String nombre) {
		inicializar();
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.getLabel().setText(nombre);
		v1.add(cancionesLista);
	}
	
	public void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout1().setVisible(true);
		this.getLabel1().setText("Autor: Tú");
		
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton2().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		
		this.cancionesLista.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_registrado.v1.removeAll();
				Usuario_registrado.v1.add(el);
				
			}
		});
	}
	
//	public void ventanaEditar() {
//		throw new UnsupportedOperationException();
//	}
}