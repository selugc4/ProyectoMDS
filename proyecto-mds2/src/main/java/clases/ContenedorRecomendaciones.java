package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorRecomendaciones extends ContenedorListas {
//	public Actor_comun _actor_comun;
//	public Canciones_favoritas _canciones_favoritas;
	
	public Recomendaciones r = new Recomendaciones();
	public ContenedorRecomendaciones() {
		this.getStyle().set("width", "100%");
		
//		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				vldr = new Ver_lista_de_Reproduccion(r.getLabel(), r.getr)
//				
//			}
//		});
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(r);
		
		
	}
	
}