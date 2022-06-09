package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Listas_de_reproduccion_buscador extends vistas.VistaListas_de_reproduccion_buscador {
//	public Buscar_elementos _buscar_elementos;
	private iActor_comun iac = new BDPrincipal();
	public ArrayList<Lista_de_reproduccion_buscador> _lista_de_reproduccion_buscador = new ArrayList<Lista_de_reproduccion_buscador>();
	
	public Listas_de_reproduccion_buscador() {
	}public Listas_de_reproduccion_buscador(String valor) {
		inicializar(valor);
	}
	private void inicializar(String valor) {
		this.getStyle().set("width", "100%");
		buscarElementos(valor);
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			for(int i = 0; i < 5 && i <_lista_de_reproduccion_buscador.size(); i++) {		
				v1.add(_lista_de_reproduccion_buscador.get(i));
			}
		}
		public void buscarElementos(String valor) {
			Lista_Reproduccion[] listas = iac.cargar_Listas_Buscador(valor);
			for(int i = 0; i< 3 && i < listas.length; i++) {
				_lista_de_reproduccion_buscador.add(new Lista_de_reproduccion_buscador(listas[i]));
			}
		}
}