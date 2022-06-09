package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorListas_Con_Sus_Canciones extends Contenedor_modificar_listados {
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
//	public Listas_de_reproduccion_con_sus_canciones _listas_de_reproduccion_con_sus_canciones;
	
	public Listas_de_reproduccion_con_sus_canciones lrsc;
	

	private int tamano = 5;
	private int pagina = 0;
	private boolean bloques = false;
		
	public ContenedorListas_Con_Sus_Canciones(String correoantiguo) {
		lrsc = new Listas_de_reproduccion_con_sus_canciones(correoantiguo);
		inicializar();
		
		this.getHorizontal5().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
					tamano = 5;
					pagina = 0;
					lrsc.mostrar(tamano);
					if(lrsc.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else {
					getLabel4().setText("Página " +(pagina+1)+" de " + ((lrsc.ldr.size()/tamano)+1));
					}
				}
			});
			this.getHorizontal10().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
					tamano = 10;
					pagina = 0;
					lrsc.mostrar(tamano);
					if(lrsc.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else {
					getLabel4().setText("Página " +(pagina+1)+" de " + ((lrsc.ldr.size()/tamano)+1));
					
				}
				}
			});
			this.getHorizontal15().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
				@Override
				public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
					tamano = 15;
					pagina = 0;
					lrsc.mostrar(tamano);
					if(lrsc.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else {
					getLabel4().setText("Página " +(pagina+1)+" de " +  ((lrsc.ldr.size()/tamano)+1));
				
				}
				}
			});
			
			
			this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					
					if(!bloques) {
					if(pagina <  lrsc.ldr.size()/tamano) {
					++pagina;
					lrsc.mostrar(tamano, pagina);
					if(lrsc.ldr.size()/tamano == 0) {
						getLabel4().setText("Página 1 de 1");
					}else {
					getLabel4().setText("Página " +(pagina+1)+" de " +  ((lrsc.ldr.size()/tamano)+1));
					}}else {
						if(pagina <  lrsc.ldr.size()/tamano) {
							++pagina;
							lrsc.mostrarBloques(tamano, pagina);
							getLabel4().setText("Página " +(pagina+1)+" de " +  ((lrsc.ldr.size()/tamano)+1));
					}
					}
					}}});
			this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					if(!bloques) {
					if(pagina > 0) {
						--pagina;
						lrsc.mostrar(tamano, pagina);
						if(lrsc.ldr.size()/tamano == 0) {
							getLabel4().setText("Página 1 de 1");
						}else {
						getLabel4().setText("Página " +(pagina+1)+" de " +  ((lrsc.ldr.size()/tamano)+1));
						}
					}}else {
						--pagina;
						lrsc.mostrarBloques(tamano, pagina);
						if(lrsc.ldr.size()/tamano == 0) {
							getLabel4().setText("Página 1 de 1");
						}else {
						getLabel4().setText("Página " +(pagina+1)+" de " + ((lrsc.ldr.size()/tamano)+1));
						}
					}
				}});	
			

			
			this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Image> event) {
					
					if(bloques) {		
						tamano = 5;
						pagina= 0;
						lrsc.mostrar(tamano);
						if(lrsc.ldr.size()/tamano == 0) {
							getLabel4().setText("Página 1 de 1");
						}else {
						getLabel4().setText("Página " +(pagina+1)+" de " + ((lrsc.ldr.size()/tamano)+1));
						}
						bloques = false;
					}else {
						tamano = 6;
						pagina= 0;
						lrsc.mostrarBloques(tamano);
						if(lrsc.ldr.size()/tamano == 0) {
							getLabel4().setText("Página 1 de 1");
						}else {
						getLabel4().setText("Página " +(pagina+1)+" de " + ((lrsc.ldr.size()/tamano)+1));
						}
						bloques = true;
					
				}
				}
			});
		}
	

	





private void inicializar() {
	this.getStyle().set("width", "100%");
	this.getLabelContenedor().setText("Listas de reproduccion con sus canciones");
	this.getVaadinButton().setVisible(false);

	VerticalLayout vl = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
	vl.add(lrsc);
	if(lrsc.ldr.size()/tamano == 0) {
		getLabel4().setText("Página 1 de 1");
	}else {
	this.getLabel4().setText("Página 1 de " +  ((lrsc.ldr.size()/tamano)+1));
	}
}
}
