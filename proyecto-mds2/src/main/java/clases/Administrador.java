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
	public Ver_perfil_propio vpp = new Ver_perfil_propio();
	public Administrador() {
    	this.getStyle().set("width", "100%");


		Reproductor_completo rc = Actor_comun.getRc();
		VerticalLayout vl = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		VerticalLayout v2 = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
		vl.replace(this.getCc(), cabadmin);

		
		cabadmin.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vl.removeAll();
				vl.add(cabadmin);	
				vl.add(cabadmin.getVer_perfil_propio());
				vl.add(cabadmin.getVer_perfil_propio().getContenedorAgregar_perfil_propio());
				v2.replace(getVaadinButton(), rc);
			}
		});
	/*	cucr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				vl.removeAll();
				vl.add(cabadmin);
				vl.add(cucr.getListaDeReproduccion());
				vl.add(cucr.getListaDeReproduccion().getCancionesLista());
				v2.replace(getVaadinButton(), rc);
			}
	});
		cr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v2.removeAll();
				vl.add(cabadmin);
				vl.add(cr.getListaDeReproduccion());
				vl.add(cr.getListaDeReproduccion().getCancionesLista());
				v2.add(rc);
			}
	});
		ccf.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v2.removeAll();
				vl.add(cabadmin);
				vl.add(ccf.getListaDeReproduccion());
				vl.add(ccf.getListaDeReproduccion().getCancionesLista());
				v2.add(rc);
			}
		});
	*/
	
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
				vl.add(rc);
				
				
				
			}
		});
		
		this.cabadmin.getBotonNotificaciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(cabadmin.getNotif());
				diag.setDraggable(true);
				diag.open();
				
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