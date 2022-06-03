package clases;
import java.util.ArrayList;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_administrador extends vistas.VistaCanciones_administrador {
//	public Buscador_administrador _buscador_administrador;
//	public Vector<Cancion_administrador> _cancion_administrador = new Vector<Cancion_administrador>();
	
	
	public ArrayList<Cancion_administrador> _canciones_administrador = new ArrayList<Cancion_administrador>();
	
	public Canciones_administrador() {
		this.getStyle().set("width", "100%");
	}
	
	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for(int i = 0; i < _canciones_administrador.size(); i++) {
			vl.add(_canciones_administrador.get(i));
		}
		
	}
	private void buscarCanciones(String value) {
		_canciones_administrador.clear();
		if(value != "") {
		Cancion_administrador cancion = new Cancion_administrador(value);		
		Cancion_administrador cancion2 = new Cancion_administrador(value);
		
		_canciones_administrador.add(cancion);
		_canciones_administrador.add(cancion2);
		}
		
		
	}
	
	public void actualizar(String value) {
		_canciones_administrador.clear();
		buscarCanciones(value);
		mostrarResultados();
	}
}