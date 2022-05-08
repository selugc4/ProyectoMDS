package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listas_de_reproduccion_con_sus_canciones extends vistas.VistaListas_de_reproduccion_con_sus_canciones {
//	public ContenedorListas_Con_Sus_Canciones _contenedorListas_Con_Sus_Canciones;
//	public Contenedor_modificar_listados _contenedor_modificar_listados;
//	public Vector<Lista_de_reproduccion> _lista_de_reproduccion = new Vector<Lista_de_reproduccion>();
	

	public ArrayList<Lista_de_reproduccion> ldr = new ArrayList<Lista_de_reproduccion>();
	
	public Listas_de_reproduccion_con_sus_canciones() {
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
			ldr.add(new Lista_de_reproduccion(String.valueOf(i)));
		}
	}
}