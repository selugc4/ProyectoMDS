package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_buscador extends vistas.VistaCanciones_buscador {
//	public Buscador_cancion _buscador_cancion;
//	public Vector<Cancion_buscada> _cancion_buscada = new Vector<Cancion_buscada>();
	
	public ArrayList<Cancion_buscada> lista = new ArrayList<Cancion_buscada>();
	
	public Canciones_buscador() {
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
		Cancion_buscada cancion = new Cancion_buscada(value);		
		Cancion_buscada cancion2 = new Cancion_buscada(value);
		
		lista.add(cancion);
		lista.add(cancion2);
		}
		
		
	}
	
	public void actualizar(String value) {
		lista.clear();
		buscarCanciones(value);
		mostrarResultados();
	}
	public ArrayList<Cancion_buscada> getLista() {
		return lista;
	}
	
	
	
}