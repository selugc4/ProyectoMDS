package clases;
//import javax.swing.JScrollPane.ScrollBar;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorListasReproduccion extends vistas.VistaContenedorlistasreproduccion {
//	private ScrollBar _barra_Scroll;
//	public Actor_comun _actor_comun;
//	public Listas_de_reproduccion _listas_de_reproduccion;
	public ContenedorListasReproduccion() {
		inicializar();
	}
	private void inicializar() {
	Cargar_ListasReproduccion();
	
}
	public void Cargar_ListasReproduccion() {
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		//v1.removeAll();
		for(int i = 0; i < 5; i++) {		
			v1.add(new Lista_de_reproduccion());
		}
		//v1.add(getVaadinButton());	
	}
	public void verMas() {
		throw new UnsupportedOperationException();
	}
}