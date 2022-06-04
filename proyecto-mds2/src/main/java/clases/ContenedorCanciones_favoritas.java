package clases;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class ContenedorCanciones_favoritas extends ContenedorListas {
//	public Actor_comun _actor_comun;
//	public Recomendaciones _recomendaciones;
	
	public Canciones_favoritas cf = new Canciones_favoritas();
	public ContenedorCanciones_favoritas() {
		this.getStyle().set("width", "100%");
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(cf);
		
	}
}