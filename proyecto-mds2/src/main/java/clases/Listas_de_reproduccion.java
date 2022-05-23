package clases;
//import java.util.Vector;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listas_de_reproduccion extends vistas.VistaListas_de_reproduccion {
//	public Vector<Lista_de_reproduccion> _lista_de_reproduccion = new Vector<Lista_de_reproduccion>();
//	public ContenedorListasReproduccion _contenedorListasReproduccion;
	
	public ArrayList<Lista_de_reproduccion> lista = new ArrayList<Lista_de_reproduccion>();
	
	public Listas_de_reproduccion() {
		Cargar_ListasReproduccion(0);
	}
	
//	public Listas_de_reproduccion() {
//		
//	}
	public Listas_de_reproduccion(int usuario) {
		this.getStyle().set("width", "100%");
		Cargar_ListasReproduccion(usuario);		
	}	
	
	public void Cargar_ListasReproduccion(int usuario) {
		VerticalLayout vl = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		//v1.removeAll();
		for(int i = 0; i < 5; i++) {	
			Lista_de_reproduccion lr = new Lista_de_reproduccion();
			lr.vldr = new Ver_lista_de_reproduccion_propia(usuario);
			vl.add(lr);
			
		}
	}
}