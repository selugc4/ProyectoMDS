package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorUltimas_canciones_reproducidas extends ContenedorListas {
//	public Actor_comun _actor_comun;
//	public Ultimas_canciones_reproducidas _ultimas_canciones_reproducidas;
	
	public Ultimas_canciones_reproducidas ucr = new Ultimas_canciones_reproducidas();
	public ContenedorUltimas_canciones_reproducidas() {
		this.getStyle().set("width", "100%");

		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vldr = new Ver_lista_de_Reproduccion(ucr._ver_lista_de_Reproduccion,ucr.getLabel().getText());
				Actor_comun.v1.removeAll();
				Actor_comun.v1.add(vldr);
				Actor_comun.v2.setVisible(false);	

				
			}
		});
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(ucr);
	}
}