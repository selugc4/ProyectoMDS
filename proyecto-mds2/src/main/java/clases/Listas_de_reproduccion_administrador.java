package clases;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iAdministrador;

public class Listas_de_reproduccion_administrador extends Listas_de_reproduccion {
//	public Buscador_administrador _buscador_administrador;
	public Vector<Lista_de_reproduccion_administrador> _lista_de_reproduccion_administrador = new Vector<Lista_de_reproduccion_administrador>();
	private iActor_comun iac = new BDPrincipal();
	public Listas_de_reproduccion_administrador(String valor) {
		super(valor);
	}
	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout hl = new HorizontalLayout();
		for(int i = 0; i <_lista_de_reproduccion_administrador.size(); i++) {
			hl.add(_lista_de_reproduccion_administrador.get(i));
		}
		vl.add(hl);
		
	}
	private void buscarListas(String value) {	
		Lista_Reproduccion[] listas = iac.cargar_Listas_Buscador(value);
		for(int i = 0; i< 3 && i < super.lista.size(); i++) {
			_lista_de_reproduccion_administrador.add(new Lista_de_reproduccion_administrador(listas[i]));
		}
	}
	
	public void actualizar(String value) {
		_lista_de_reproduccion_administrador.clear();
		buscarListas(value);
		mostrarResultados();
	}
}