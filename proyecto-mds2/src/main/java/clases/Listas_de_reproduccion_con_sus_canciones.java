package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iArtista;

public class Listas_de_reproduccion_con_sus_canciones extends vistas.VistaListas_de_reproduccion_con_sus_canciones {
//	public ContenedorListas_Con_Sus_Canciones _contenedorListas_Con_Sus_Canciones;
//	public Contenedor_modificar_listados _contenedor_modificar_listados;
//	public Vector<Lista_de_reproduccion> _lista_de_reproduccion = new Vector<Lista_de_reproduccion>();
	

	public ArrayList<Lista_de_reproduccion> ldr = new ArrayList<Lista_de_reproduccion>();
	private iArtista ia = new BDPrincipal();
	
	public Listas_de_reproduccion_con_sus_canciones(String correoantiguo) {
		this.getStyle().set("width", "100%");
		Lista_Reproduccion[] lr = ia.cargar_Listas_Sus_Canciones(correoantiguo);
		if(lr != null) {
		for(Lista_Reproduccion aux : lr) {
			boolean contiene = false;
			for(Lista_de_reproduccion a : ldr) {
				
				if(a.idLista == aux.getIdLista()) {
					contiene = true;
				}
				
			}
			if(!contiene) {
				ldr.add(new Lista_de_reproduccion(aux));	
			}
			
		}		
		mostrar(5);
		}
	}
	
	public void mostrar(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = 0; i < tamano &&  i < ldr.size(); i++) {
			h1.add(ldr.get(i));
			
			
		}
		
	}
	
	public void mostrarBloques(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout arriba = new HorizontalLayout();
		HorizontalLayout abajo = new HorizontalLayout();
		h1.removeAll();
		for(int i = 0; i < tamano &&  i < ldr.size() ; i++) {
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
		for(int i = tamano*pagina; i < tamano*pagina+tamano &&  i < ldr.size(); i++) {
			h1.add(ldr.get(i));
			
			
		}
	}
	public void mostrarBloques(int tamano, int pagina) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout arriba = new HorizontalLayout();
		HorizontalLayout abajo = new HorizontalLayout();
		h1.removeAll();
		for(int i = tamano*pagina; i < tamano*pagina+tamano &&  i < ldr.size() ; i++) {
			if(i < tamano*pagina + 3) {
				arriba.add(ldr.get(i));
			}else
				abajo.add(ldr.get(i));
			
		}
		h1.add(arriba);
		h1.add(abajo);
	}
	
	
}