package clases;

import java.awt.Frame;
import java.awt.Window;

import javax.swing.Popup;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ch.qos.logback.core.Layout;

public class Administrador extends Actor_comun {
//	public Cabecera_administrador _cabecera_administrador;
	
	public Cabecera_administrador cabadmin = new Cabecera_administrador();
	public static Ver_perfil_propio vpp;
	public Administrador(int iD) {
		super(iD);
		vpp = new Ver_perfil_propio(iD);
//		clr = new ContenedorListasReproduccion(2);

		

//		this.v1.add(clr);
    	this.getStyle().set("width", "100%");


		Reproductor_completo rc = Actor_comun.getRc();
		VerticalLayout vl = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		VerticalLayout v2 = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
		this.getVaadinHorizontalLayout().add(cabadmin);

		
		cabadmin.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vl.removeAll();
				vl.add(cabadmin.getVer_perfil_propio());
				vl.add(cabadmin.getVer_perfil_propio().getContenedorAgregar_perfil_propio());
				v2.replace(getVaadinButton(), rc);
			}
		});

		cabadmin.getIconoBusqueda().addEventListener("click", e -> {
			vl.removeAll();			
			cabadmin.buscar(cabadmin.getTfBusqueda().getValue());
			vl.add(cabadmin.badmin);
			v2.setVisible(false);
			
		});
		this.cabadmin.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				vl.removeAll();
				v2.removeAll();
				vl.add(cabadmin);
				vl.add(cucr);
				vl.add(ccf);
				vl.add(cr);
				vl.add(clr);
				v2.add(rc);  

			}
		});
	
		this.cabadmin.getBotonAdmin().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vl.removeAll();
				v2.removeAll();
				vl.add(cabadmin);
				vl.add(cabadmin.getVadmin());
				v2.add(rc);
				
				
				
			}
		});
		
		this.cabadmin.getBotonNotificaciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
//				Dialog diag = new Dialog(cabadmin.getNotif());
//				diag.setDraggable(true);
//				diag.open();
				
			}
		});
	
		this.cabadmin.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vl.removeAll();
				vl.add(cabadmin);
				vl.add(vpp);
				vl.add(rc);
				
			}
		});
		
	}
	
		
	
	 
}