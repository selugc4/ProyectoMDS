package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorSus_Listas_Propio extends Contenedor_agregar {
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
//	public Sus_listas_de_reproduccion _sus_listas_de_reproduccion;
	
	public Listas_de_reproduccion_perfil_propio _listas_de_reproduccion_perfil_propio;
	private int tamano = 5;
	private int pagina = 0;
	
	
	public ContenedorSus_Listas_Propio(int usuario) {
		inicializar();
		this.cl= new Creacion_lista(Actor_comun.ID,usuario);
	this.getHorizontal5().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 5;
				pagina = 0;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano);
				if(_listas_de_reproduccion_perfil_propio.listas.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				} else
				getLabel4().setText("Página " +(pagina+1)+" de " + ((_listas_de_reproduccion_perfil_propio.listas.size()/tamano)+1));
				
			}
		});
		this.getHorizontal10().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 10;
				pagina = 0;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano);
				if(_listas_de_reproduccion_perfil_propio.listas.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				} else
				getLabel4().setText("Página " +(pagina+1)+" de " + ((_listas_de_reproduccion_perfil_propio.listas.size()/tamano)+1));
				
			}
		});
		this.getHorizontal15().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 15;
				pagina = 0;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano);
				if(_listas_de_reproduccion_perfil_propio.listas.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				} else
				getLabel4().setText("Página " +(pagina+1)+" de " + ((_listas_de_reproduccion_perfil_propio.listas.size()/tamano)+1));
			
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(pagina < _listas_de_reproduccion_perfil_propio.listas.size()/tamano) {
				++pagina;
				_listas_de_reproduccion_perfil_propio.mostrar(tamano, pagina);
				if(_listas_de_reproduccion_perfil_propio.listas.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				} else
				getLabel4().setText("Página " +(pagina+1)+" de " + ((_listas_de_reproduccion_perfil_propio.listas.size()/tamano)+1));
			}
		}});
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(pagina > 0) {
					--pagina;
					_listas_de_reproduccion_perfil_propio.mostrar(tamano, pagina);
					if(_listas_de_reproduccion_perfil_propio.listas.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					} else
					getLabel4().setText("Página " +(pagina+1)+" de " + ((_listas_de_reproduccion_perfil_propio.listas.size()/tamano)+1));
				}
			}});
	
	
	}

	private void inicializar() {
		this.getImg().setVisible(false);
		VerticalLayout vl = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
		this.getLabelContenedor().setText("Tus listas de reproducción");
		
		_listas_de_reproduccion_perfil_propio = new Listas_de_reproduccion_perfil_propio(Actor_comun.ID);
		
		vl.add(_listas_de_reproduccion_perfil_propio);
		
		if(_listas_de_reproduccion_perfil_propio.listas.size()/tamano == 0) {
			this.getLabel4().setText("Página 1 de 1");
		} else
			
			this.getLabel4().setText("Página 1 de " + ((_listas_de_reproduccion_perfil_propio.listas.size()/tamano)+1));
		
		
	}
}