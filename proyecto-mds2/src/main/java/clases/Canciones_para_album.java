package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_para_album extends vistas.VistaCanciones_para_album {
//	public Buscador_cancion_para_album _buscador_cancion_para_album;
//	public Vector<Cancion_para_album> _cancion_para_album = new Vector<Cancion_para_album>();
	
	public ArrayList<Cancion_para_album> canciones = new ArrayList<Cancion_para_album>();
	
	public Canciones_para_album() {
		
	}
	
	public Canciones_para_album(String texto) {
		buscarCanciones(texto);
	}

	private void buscarCanciones(String texto) {
		for(int i = 0; i< 5; i++) {
			canciones.add(new Cancion_para_album(texto));
		}
		
	}

	public void actualizar(String value) {
		canciones.clear();
		buscarCanciones(value);
		mostrarResultados();
		
	}

	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for(int i = 0; i < canciones.size(); i++) {
			vl.add(canciones.get(i));
		}
		
	}
}