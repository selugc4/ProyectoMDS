package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorAgregar_perfil_propio extends Contenedor_agregar {
//	public Ver_perfil_propio _ver_perfil_propio;

	public Listas_de_reproduccion_perfil_propio _listas_de_reproduccion_perfil_propio = new Listas_de_reproduccion_perfil_propio();
	
	private int tamano = 5;
	private int pagina = 0;
	
	public ContenedorAgregar_perfil_propio() {
		inicializar();
		
		this.getHorizontal5().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 5;
				pagina = 0;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano);
				getLabel4().setText("Página " +(pagina+1)+" de " + _listas_de_reproduccion_perfil_propio.listas.size()/tamano);
				
			}
		});
		this.getHorizontal10().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 10;
				pagina = 0;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano);
				getLabel4().setText("Página " +(pagina+1)+" de " + _listas_de_reproduccion_perfil_propio.listas.size()/tamano);
				
			}
		});
		this.getHorizontal15().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 15;
				pagina = 0;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano);
				getLabel4().setText("Página " +(pagina+1)+" de " + _listas_de_reproduccion_perfil_propio.listas.size()/tamano);
			
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(pagina < _listas_de_reproduccion_perfil_propio.listas.size()/tamano-1) {
				++pagina;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano, pagina);
				getLabel4().setText("Página " +(pagina+1)+" de " + _listas_de_reproduccion_perfil_propio.listas.size()/tamano);
			}
		}});
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(pagina > 0) {
					--pagina;
					_listas_de_reproduccion_perfil_propio.mostrar(tamano, pagina);
					getLabel4().setText("Página " +(pagina+1)+" de " + _listas_de_reproduccion_perfil_propio.listas.size()/tamano);
				}
			}});
	
	
	}
	
	
	private void inicializar() {
		this.getImg().setVisible(false);
		VerticalLayout vl = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
		this.getLabelContenedor().setText("Tus listas de reproducción");
		vl.add(_listas_de_reproduccion_perfil_propio);
		
		this.getLabel4().setText("Página 1 de " + _listas_de_reproduccion_perfil_propio.listas.size()/tamano);
}

	
	
}
