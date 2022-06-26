package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;

public class Verificacion_registro extends Verificacion {
//	private Button _aceptar;
//	private Label _verificacion_RegistroL;
//	public Registro _registro;

//	public void Aceptar() {
//		throw new UnsupportedOperationException();
//	}
	public Verificacion_registro() {
		inicializar();
		
		this.getBotonVolverEnviar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Código enviado de nuevo");
				
			}
		});
	}
	
	public boolean comprobarCodigo() {
		return true;
	}

	
	
	void inicializar() {
		this.getStyle().set("width", "100%");
		this.getBotonCContrasena().setVisible(false);
		this.getLabelTitulo().setText("Confirmacion de registro");
		this.getLabelDesc1().setText("Se ha enviado un correo a su email con");
		this.getLabelDesc2().setText("un código para vereficar sus datos");
	}
}