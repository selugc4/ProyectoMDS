package clases;
//import java.util.Vector;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Listas_de_reproduccion extends vistas.VistaListas_de_reproduccion {
//	public Vector<Lista_de_reproduccion> _lista_de_reproduccion = new Vector<Lista_de_reproduccion>();
//	public ContenedorListasReproduccion _contenedorListasReproduccion;
	
	private iActor_comun iac = new BDPrincipal();
	public ArrayList<Lista_de_reproduccion> lista = new ArrayList<Lista_de_reproduccion>();
	
	public Listas_de_reproduccion(String valor) {
		this.getStyle().set("width", "100%");
		Cargar_ListasReproduccion(valor);		
	}	
	
	public void Cargar_ListasReproduccion(String valor) {
		Lista_Reproduccion[] listas = iac.cargar_Listas_Buscador(valor);
		if(listas != null) {
		for(Lista_Reproduccion lista : listas) {
			this.lista.add(new Lista_de_reproduccion(lista));
		}
		}
		mostrarLista();
	}

	private void mostrarLista() {
		VerticalLayout vl = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		for(Lista_de_reproduccion listaaux : this.lista) {
			vl.add(listaaux);
		}
		
		
	}
}