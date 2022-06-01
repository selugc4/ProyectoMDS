package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_modificar_y_crear extends vistas.VistaCanciones_modificar_y_crear{
//	public Modificar_y_crear_lista _modificar_y_crear_lista;
//	public Vista_dar_alta_album _vista_dar_alta_album;
//	public Vector<Cancion> _cancion = new Vector<Cancion>();
	
	public static ArrayList<Cancion> _canciones = new ArrayList<Cancion>();
	
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
		boolean nocontiene = true;

		for(Cancion cancion: _canciones) {
			if(cancion.getLabel().getText().equals(nombre)) {
				nocontiene = false;
				}
		}
		if(nocontiene == true) {
			this._canciones.add(new Cancion(nombre));
			actualizar();
		}else
			Notification.show("Cancion ya agregada");
		
	}
	
	
	
}