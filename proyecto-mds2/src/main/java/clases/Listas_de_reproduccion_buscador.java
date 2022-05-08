package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listas_de_reproduccion_buscador extends vistas.VistaListas_de_reproduccion_buscador {
//	public Buscar_elementos _buscar_elementos;

	public ArrayList<Lista_de_reproduccion_buscador> _lista_de_reproduccion_buscador = new ArrayList<Lista_de_reproduccion_buscador>();
	
	public Listas_de_reproduccion_buscador() {
		inicializar();
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			for(int i = 0; i < 5; i++) {		
				v1.add(new Lista_de_reproduccion_buscador());
			}
		}
}