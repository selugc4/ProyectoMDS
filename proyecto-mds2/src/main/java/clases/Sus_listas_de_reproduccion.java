package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Sus_listas_de_reproduccion extends vistas.VistaSus_listas_de_reproduccion{
//	public ContenedorSus_Listas _contenedorSus_Listas;
//	public ContenedorSus_Listas_Propio _contenedorSus_Listas_Propio;
//	public Vector<Lista_de_reproduccion> _lista_de_reproduccion = new Vector<Lista_de_reproduccion>();
	
	public ArrayList<Lista_de_reproduccion> ldr = new ArrayList<Lista_de_reproduccion>();
	private iActor_comun ia = new BDPrincipal();
	
	

	public Sus_listas_de_reproduccion(int usuario) {
		this.getStyle().set("width", "100%");
		Lista_Reproduccion[] lr = ia.cargar_Listas_Propias(usuario);
		if(lr != null) {
		for(Lista_Reproduccion aux : lr) {
			ldr.add(new Lista_de_reproduccion(aux, false));
		}		
		mostrar(5);
		}
	}

	public void mostrar(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = 0; i < tamano && i< ldr.size(); i++) {
			h1.add(ldr.get(i));
			
			
		}
		
	}
	
	public void mostrarBloques(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout arriba = new HorizontalLayout();
		HorizontalLayout abajo = new HorizontalLayout();
		h1.removeAll();
		for(int i = 0; i < tamano && i< ldr.size() ; i++) {
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
		for(int i = tamano*pagina; i < tamano*pagina+tamano && i< ldr.size(); i++) {
			h1.add(ldr.get(i));
			
			
		}
	}
	
	
	public void mostrarBloques(int tamano, int pagina) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout arriba = new HorizontalLayout();
		HorizontalLayout abajo = new HorizontalLayout();
		h1.removeAll();
		for(int i = tamano*pagina; i < tamano*pagina+tamano && i< ldr.size() ; i++) {
			if(i < tamano*pagina + 3) {
				arriba.add(ldr.get(i));
			}else
				abajo.add(ldr.get(i));
			
		}
		h1.add(arriba);
		h1.add(abajo);
	}
	
}