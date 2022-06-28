package clases;

import java.awt.Label;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iAdministrador;

public class Estilo extends vistas.VistaEstilo{
//	private Label _nombre_EstiloL;
//	private Button _modificar_EstiloB;
//	private Button _eliminar_EstiloB;
//	public Estilos_buscados _estilos_buscados;
	public Vista_modificacion_estilo _vista_modificacion_estilo;

//	public void Eliminar_estilo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaModificarEstilo() {
//		throw new UnsupportedOperationException();
//	}
public static int idEstilo;
	public Estilo(String estilo) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(estilo);
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_vista_modificacion_estilo = new Vista_modificacion_estilo(idEstilo);
				Actor_comun.v1.removeAll();
				Actor_comun.v1.add(_vista_modificacion_estilo);
				Actor_comun.v2.setVisible(false);
			}
		});
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog();
				VerticalLayout vl = new VerticalLayout();
				HorizontalLayout hl = new HorizontalLayout();
				Button botonsi = new Button("Si");
				Button botonno = new Button("No");
				hl.add(botonsi, botonno);
				vl.add("Está seguro de eliminar el siguiente estilo? Estilo: " +getLabel().getText());
				vl.add(hl);
				
				diag.add(vl);
				diag.open();
				
				botonsi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						diag.close();
						iAdministrador iadmin = new BDPrincipal();
						iadmin.Eliminar_estilo(idEstilo);
						Notification.show("Estilo eliminado");
						for(Estilo estilo: Vista_administracion.eb._estilo) {
							if(estilo.idEstilo == idEstilo) {
								Vista_administracion.eb._estilo.remove(estilo);
								Vista_administracion.eb.mostrarLista();
							}
						}
					}
				});
				
				botonno.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
							diag.close();
						
					}
				});
				
			}
		});
	}

}
