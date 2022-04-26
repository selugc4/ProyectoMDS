package clases;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorRecomendaciones extends ContenedorListas {
//	public Actor_comun _actor_comun;
//	public Canciones_favoritas _canciones_favoritas;
	
	public Recomendaciones r = new Recomendaciones();
	public ContenedorRecomendaciones() {
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(r);
	}
	
}