package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Estilos_buscados extends vistas.VistaEstilos_buscados {
//	public Vista_administracion _vista_administracion;
//	public Vector<Estilo> _estilo = new Vector<Estilo>();
	
	public ArrayList<Estilo> _estilo = new ArrayList<Estilo>();
	
	public Estilos_buscados() {
	}
	
	public Estilos_buscados(String estilo) {
		this.getStyle().set("width", "100%");
		_estilo.clear();
		_estilo.add(new Estilo(estilo));
		mostrarLista();
	}

	public void mostrarLista() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		vl.getStyle().set("width", "100%");
		for(Estilo estilo : _estilo) {
			vl.add(estilo);
		}
	}
}