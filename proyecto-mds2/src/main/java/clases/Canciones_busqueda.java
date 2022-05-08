package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_busqueda extends vistas.VistaCanciones_busqueda {
//	public Buscar_elementos _buscar_elementos;

	public ArrayList<Cancion_busqueda> _cancion_busqueda = new ArrayList<Cancion_busqueda>();
	
	public Canciones_busqueda() {
		inicializar();
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		Cargar_Listas();
		mostrarLista();
	}
	
	public void Cargar_Listas() {
		for(int i = 0; i < 5; i++) {		
			Cancion_busqueda cb = new Cancion_busqueda();
			_cancion_busqueda.add(cb);
			
		}
	}
	
	private void mostrarLista() {
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		for (int i =0; i< _cancion_busqueda.size(); i++) {
			v1.add(_cancion_busqueda.get(i));
			
		}
	}
}