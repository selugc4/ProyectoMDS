package clases;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorUltimas_canciones_reproducidas extends ContenedorListas {
//	public Actor_comun _actor_comun;
//	public Ultimas_canciones_reproducidas _ultimas_canciones_reproducidas;
	
	public Ultimas_canciones_reproducidas ucr = new Ultimas_canciones_reproducidas();
	public ContenedorUltimas_canciones_reproducidas() {
		this.getStyle().set("width", "100%");

		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(ucr);
	}
}