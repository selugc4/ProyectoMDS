package clases;
//import javax.swing.JScrollPane.ScrollBar;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorListasReproduccion extends vistas.VistaContenedorlistasreproduccion {
//	private ScrollBar _barra_Scroll;
//	public Actor_comun _actor_comun;
//	public Listas_de_reproduccion _listas_de_reproduccion;
	public Listas_de_reproduccion ldr;
	public ContenedorListasReproduccion(int usuario) {
		ldr = new Listas_de_reproduccion(usuario);
		inicializar();
		
		
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		VerticalLayout vl = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		vl.add(ldr);
		}
	


}