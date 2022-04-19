package clases;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import javax.swing.JScrollPane.ScrollBar;

public class ContenedorUltimosExitos extends vistas.VistaContenedorultimosexitos {
//	private ScrollBar _scrollLista;
//	public Vista_administracion _vista_administracion;
//	public Ultimos_exitos_administracion _ultimos_exitos_administracion;
	public Ultimos_exitos_administracion uea = new Ultimos_exitos_administracion();
	
	public ContenedorUltimosExitos() {
		VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(uea);
	}
}