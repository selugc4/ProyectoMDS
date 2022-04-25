package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class Vista_dar_alta_estilo extends vistas.VistaVista_dar_alta_estilo{
//	private Label _titulo_Anadir_EstilosL;
//	private Label _estiloL;
//	private TextField _estiloTF;
//	private Button _anadir_EstiloB;
//	private Button _volver_AtrasB;
//	public Menu_dar_alta _menu_dar_alta;

//	public void Anadir_estilo() {
//		throw new UnsupportedOperationException();
//	}
	
	public Vista_dar_alta_estilo() {
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// Agregar Datos
				
			}
		});
	}
}