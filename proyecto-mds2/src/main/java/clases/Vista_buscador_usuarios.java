package clases;

import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class Vista_buscador_usuarios extends vistas.VistaVista_buscador_usuarios {
//	private Label _buscador_UsuariosL;
//	private TextField _buscador_UsuariosTF;
//	private Button _buscador_UsuariosB;
//	public Vista_administracion _vista_administracion;
//	public Usuarios _usuarios;

//	public void buscar_Usuarios() {
//		throw new UnsupportedOperationException();
//	}
	public Usuarios usuarios = new Usuarios();
	public static VerticalLayout vl;
	public Vista_buscador_usuarios() {
		
		vl = getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(usuarios);
		this.getStyle().set("width", "100%");
		this.getVaadinTextField().addBlurListener(new ComponentEventListener<BlurNotifier.BlurEvent<TextField>>() {
			
			@Override
			public void onComponentEvent(BlurEvent<TextField> event) {
				usuarios.actualizar(getVaadinTextField().getValue());
	
				
			}
		
		});
	}
}

	
			
				
						
		
	

		
	


	
	
