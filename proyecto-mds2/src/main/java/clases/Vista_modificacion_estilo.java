package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.BD_Administrador;
import bds.iAdministrador;

public class Vista_modificacion_estilo extends vistas.VistaVista_modificacion_estilo{
//	private Label _titulo_Modificar_EstilosL;
//	private Label _estiloL;
//	private TextField _estiloTF;
//	private Button _modificar_EstiloB;
//	private Button _volver_AtrasB;
//	public Estilo _estilo;

	public Vista_modificacion_estilo(int idEstilo) {
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				iAdministrador iadmin = new BDPrincipal();
				iadmin.Modificar_Estilo(idEstilo, getVaadinTextField().getValue());
				Notification.show("Estilo modificado");
			}
		});
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
				vl.removeAll();
				vl.add(new Vista_administracion());
			}
		});
}
	public void Modificar_estilo() {
		throw new UnsupportedOperationException();
	}

	public void volverAtras() {
		throw new UnsupportedOperationException();
	}
}