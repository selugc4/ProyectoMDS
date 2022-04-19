package clases;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class Buscador_cancion_administracion extends vistas.VistaBuscador_cancion_administracion {
//	private TextField _buscador_CancionesTF;
//	private Button _buscador_CancionesB;
//	public Vista_administracion _vista_administracion;
//	public Canciones_buscadas _canciones_buscadas;

	public Canciones_buscadas cb = new Canciones_buscadas();
	
	public Buscador_cancion_administracion() {
		VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(cb);
		this.getStyle().set("width", "100%");
		this.getVaadinTextField().addBlurListener(new ComponentEventListener<BlurNotifier.BlurEvent<TextField>>() {
			
			@Override
			public void onComponentEvent(BlurEvent<TextField> event) {
				cb.actualizar(getVaadinTextField().getValue());
	
				
			}
		});
		
	}
	public void buscarCanciones() {
		throw new UnsupportedOperationException();
	}
}