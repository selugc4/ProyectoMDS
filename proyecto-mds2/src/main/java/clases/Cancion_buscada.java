package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class Cancion_buscada extends vistas.VistaCancion_buscada{
//	private Label _titulo_CancionL;
//	private Button _anadir_CancionLista;
//	public Canciones_buscador _canciones_buscador;

	private int ID;
	public Cancion_buscada() {
		
	}
	public Cancion_buscada(String value, int iD, int tipo) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(value);
		this.getVaadinButton().setVisible(false);
		this.ID = iD;
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(tipo == 0 ) {
					Creacion_lista.cmc.agregarCancion(getLabel().getText(), iD);
				}else
					Edicion_de_lista.cmc.agregarCancion(getLabel().getText(), iD);
				
			}
		});
		
	}
	
	
//	public void Anadir_a_lista() {
//		throw new UnsupportedOperationException();
//	}
}
