package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_buscadas extends vistas.VistaCanciones_buscadas {

//	public Buscador_cancion_administracion _buscador_cancion_administracion;
//	public Vector<Cancion_encontrada> _cancion_encontrada = new Vector<Cancion_encontrada>();
	
	public ArrayList<Cancion_encontrada> lista = new ArrayList<Cancion_encontrada>();
	
	public Canciones_buscadas() {
		inicializar();
//		buscarCanciones(value);
//		mostrarResultados();
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		
	}
	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for(int i = 0; i < lista.size(); i++) {
			vl.add(lista.get(i));
		}
		
	}
	private void buscarCanciones(String value) {
		lista.clear();
		if(value != "") {
		Cancion_encontrada cancion = new Cancion_encontrada(value);		
		Cancion_encontrada cancion2 = new Cancion_encontrada(value);
		
		lista.add(cancion);
		lista.add(cancion2);
		}
		
	}
	
	public void actualizar(String value) {
		lista.clear();
		buscarCanciones(value);
		mostrarResultados();
	}
}