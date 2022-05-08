package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Sus_listas_de_reproduccion extends vistas.VistaSus_listas_de_reproduccion{
//	public ContenedorSus_Listas _contenedorSus_Listas;
//	public ContenedorSus_Listas_Propio _contenedorSus_Listas_Propio;
//	public Vector<Lista_de_reproduccion> _lista_de_reproduccion = new Vector<Lista_de_reproduccion>();
	
	public ArrayList<Lista_de_reproduccion> ldr = new ArrayList<Lista_de_reproduccion>();
	
	private int propio = 0;
	
	public Sus_listas_de_reproduccion() {
		this.getStyle().set("width", "100%");
		Cargar_ListasReproduccion();
		mostrar(5);
	}
	
	public Sus_listas_de_reproduccion(Boolean propio) {
		if(propio)
			this.propio= 1;
		this.getStyle().set("width", "100%");
		Cargar_ListasReproduccion();
		mostrar(5);
	}
	
	public void mostrar(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = 0; i < tamano; i++) {
			h1.add(ldr.get(i));
			
			
		}
		
	}
	
	public void mostrarBloques(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout arriba = new HorizontalLayout();
		HorizontalLayout abajo = new HorizontalLayout();
		h1.removeAll();
		for(int i = 0; i < tamano ; i++) {
			if(i < 3) {
				arriba.add(ldr.get(i));
			}else
				abajo.add(ldr.get(i));
			
		}
		h1.add(arriba);
		h1.add(abajo);
	}
	
	public void mostrar(int tamano, int pagina) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = tamano*pagina; i < tamano*pagina+tamano; i++) {
			h1.add(ldr.get(i));
			
			
		}
	}
	
	
	public void mostrarBloques(int tamano, int pagina) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout arriba = new HorizontalLayout();
		HorizontalLayout abajo = new HorizontalLayout();
		h1.removeAll();
		for(int i = tamano*pagina; i < tamano*pagina+tamano ; i++) {
			if(i < tamano*pagina + 3) {
				arriba.add(ldr.get(i));
			}else
				abajo.add(ldr.get(i));
			
		}
		h1.add(arriba);
		h1.add(abajo);
	}
	
	public void Cargar_ListasReproduccion() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		//v1.removeAll();		
	
		for(int i = 0; i < 30; i++) {
			Lista_de_reproduccion lr = new Lista_de_reproduccion();
			if(propio == 0) {
			lr.vldr = new Ver_lista_de_reproduccion_ajena();
			}else {
				lr.vldr = new Ver_lista_de_reproduccion_propia();
			}
			ldr.add(lr);
			
		}
			
	}
	
}