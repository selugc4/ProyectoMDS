package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_modificar_y_crear extends vistas.VistaCanciones_modificar_y_crear{
//	public Modificar_y_crear_lista _modificar_y_crear_lista;
//	public Vista_dar_alta_album _vista_dar_alta_album;
//	public Vector<Cancion> _cancion = new Vector<Cancion>();
	
	public ArrayList<Cancion> _canciones = new ArrayList<Cancion>();
	
	public Canciones_modificar_y_crear() {
		this.getStyle().set("width", "100%");
	}

	public ArrayList<Cancion> get_canciones() {
		return _canciones;
	}
	
	public void actualizar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for(int i = 0; i < _canciones.size(); i++) {
			vl.add(_canciones.get(i));
		}
		
	}

	public void set_canciones(ArrayList<Cancion> _canciones) {
		this._canciones = _canciones;
	}
	
	public void agregarCancion(String nombre) {
		this._canciones.add(new Cancion(nombre));
		actualizar();
		
	}
	
}