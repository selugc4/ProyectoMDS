package clases;

import org.orm.PersistentException;

import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class Buscador_cancion_para_album extends vistas.VistaBuscador_cancion_para_album {
//	private TextField _buscador_CancionesTF;
//	private Button _buscador_CancionesB;
//	public Vista_dar_alta_album _vista_dar_alta_album;
//	public Vista_modificar_album _vista_modificar_album;
//	public Canciones_para_album _canciones_para_album;

//	public void buscarCanciones() {
//		throw new UnsupportedOperationException();
//	}
	
	public Canciones_para_album cpa;
	
	public Buscador_cancion_para_album(int tipo) {
		cpa =  new Canciones_para_album(tipo);
		VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(cpa);
		this.getStyle().set("width", "100%");
		this.getIronIcon().addEventListener("click", e -> {
			try {
				cpa.actualizar(getVaadinTextField().getValue());
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			
					
		});
//		this.getVaadinTextField().addBlurListener(new ComponentEventListener<BlurNotifier.BlurEvent<TextField>>() {
//			
//			@Override
//			public void onComponentEvent(BlurEvent<TextField> event) {
//				try {
//					cpa.actualizar(getVaadinTextField().getValue());
//				} catch (PersistentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	
//			}
//		});
			
	}
}