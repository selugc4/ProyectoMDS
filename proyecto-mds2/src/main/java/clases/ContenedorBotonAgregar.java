package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorBotonAgregar extends vistas.VistaContenedorbotonagregar {
//	private button _agregarEvento;
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
//	public Agregar_evento _agregar_evento;
//	public Conciertos_y_festivales_propios _conciertos_y_festivales_propios;

//	public void ventanaAgregarEvento() {
//		throw new UnsupportedOperationException();
//	}
	
	public Conciertos_y_festivales_propios cfp = new Conciertos_y_festivales_propios();
	public Agregar_evento ae = new Agregar_evento();
	
	public ContenedorBotonAgregar() {
		this.getStyle().set("width", "100%");
		
		
		VerticalLayout vl2 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl2.add(cfp);
	
		
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Artista.v1;
				vl.removeAll();
				vl.add(ae);
			}
		});
	}

	public ContenedorBotonAgregar(int iD) {
		this.getStyle().set("width", "100%");
		
		cfp = new Conciertos_y_festivales_propios(iD);
		
		VerticalLayout vl2 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl2.add(cfp);
	
		
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Artista.v1;
				ae= new Agregar_evento();
				vl.removeAll();
				vl.add(ae);
			}
		});
	}
}