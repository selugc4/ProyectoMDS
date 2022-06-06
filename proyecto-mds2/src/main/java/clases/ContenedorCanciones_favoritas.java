package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class ContenedorCanciones_favoritas extends ContenedorListas {
//	public Actor_comun _actor_comun;
//	public Recomendaciones _recomendaciones;
	
	public Canciones_favoritas cf = new Canciones_favoritas();
	public ContenedorCanciones_favoritas() {
		this.getStyle().set("width", "100%");
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vldr = new Ver_lista_de_Reproduccion(cf._ver_lista_de_Reproduccion,cf.getLabel().getText());
				Actor_comun.v1.removeAll();
				Actor_comun.v1.add(vldr);
				Actor_comun.v2.setVisible(false);	
				
			}
		});
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(cf);
		
	}
}