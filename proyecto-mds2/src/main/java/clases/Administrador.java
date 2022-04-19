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

public class Administrador extends Actor_comun {
//	public Cabecera_administrador _cabecera_administrador;
	
	public Cabecera_administrador cabadmin = new Cabecera_administrador();
	public Administrador() {
		Reproductor_completo rc = this.getRc();
		inicializar();
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.replace(this.getCc(), cabadmin);
		
		
		this.cabadmin.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				vl.removeAll();
				vl.add(cc);
				vl.add(cucr);
				vl.add(ccf);
				vl.add(cr);
				vl.add(clr);
				vl.add(rc);
			}
		});
	
		this.cabadmin.getBotonAdmin().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vl.removeAll();
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
	
		
	}
	
	 
	private void inicializar() {
		
		this.getVaadinButton().setVisible(false);	
	}
}