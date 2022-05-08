package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Conciertos_y_festivales extends vistas.VistaConciertos_y_festivales{
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
//	public Vector<Evento> _evento = new Vector<Evento>();
	
	public ArrayList<Evento> eventos = new ArrayList<Evento>();
	
	public Conciertos_y_festivales() {
		inicializar();
		cargarLista();
		mostrarLista();
	}

	private void mostrarLista() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		for(int i = 0; i < this.eventos.size(); i++) {
			vl.add(eventos.get(i));
			
		}
		
		
	}

	private void cargarLista() {
		for(int i = 0; i < 5; i++) {
			eventos.add(new Evento());
		}
	}

	private void inicializar() {
		this.getStyle().set("width", "100%");
		
	}
}