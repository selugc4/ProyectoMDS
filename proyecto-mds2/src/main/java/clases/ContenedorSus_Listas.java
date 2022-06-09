package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorSus_Listas extends Contenedor_modificar_listados {
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
//	public Sus_listas_de_reproduccion _sus_listas_de_reproduccion;
	
	
	public Sus_listas_de_reproduccion slr;
	
	private int tamano = 5;
	private int pagina = 0;
	private boolean bloques = false;
	
	public ContenedorSus_Listas(int usuario) {
		slr = new Sus_listas_de_reproduccion(usuario);
		inicializar();
		
	this.getHorizontal5().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 5;
				pagina = 0;
				slr.mostrar(tamano);
				if(slr.ldr.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				}
				getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
			
			}
		});
		this.getHorizontal10().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 10;
				pagina = 0;
				slr.mostrar(tamano);
				if(slr.ldr.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				}
				getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
				
			}
			
			
		});
		this.getHorizontal15().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				tamano = 15;
				pagina = 0;
				slr.mostrar(tamano);
				if(slr.ldr.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				}
				getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
			
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(!bloques) {
				if(pagina <  slr.ldr.size()/tamano-1) {
				++pagina;
				slr.mostrar(tamano, pagina);
				if(slr.ldr.size()/tamano == 0) {
					getLabel4().setText("Página 1 de 1");
				}else
					getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
				}}else {
					if(pagina <  slr.ldr.size()/tamano-1) {
						++pagina;
						slr.mostrarBloques(tamano, pagina);
						if(slr.ldr.size()/tamano == 0) {
							getLabel4().setText("Página 1 de 1");
						}else
							getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
				}
				}
		}});
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(!bloques) {
				if(pagina > 0) {
					--pagina;
					slr.mostrar(tamano, pagina);
					if(slr.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else
					getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
				}}else {
					--pagina;
					slr.mostrarBloques(tamano, pagina);
					if(slr.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else
						getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
				}
			}});	
		

		
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				if(bloques) {		
					tamano = 5;
					slr.mostrar(tamano);
					if(slr.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else {
					getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
					}
					bloques = false;
				}else {
					tamano = 6;
					slr.mostrarBloques(tamano);
					if(slr.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else {
					getLabel4().setText("Página " +(pagina+1)+" de " + ((slr.ldr.size()/tamano)+1));
					}
					bloques = true;
					bloques = true;
				
			}
			}
		});
	}

	
	private void inicializar() {
		this.getStyle().set("width","100%");
		this.getLabelContenedor().setText("Sus listas de reproduccion");	
		this.getVaadinButton().setVisible(false);
		VerticalLayout vl = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
		vl.add(slr);
		if(slr.ldr.size()/tamano == 0) {
			this.getLabel4().setText("Página 1 de 1");
		} else
			
			this.getLabel4().setText("Página 1 de " + ((slr.ldr.size()/tamano)+1));
}
}