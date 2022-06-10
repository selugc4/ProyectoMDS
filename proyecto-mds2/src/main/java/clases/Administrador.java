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
//		clr = new ContenedorListasReproduccion(2);

		crearElementos();
		vpp = new Ver_perfil_propio(iD);

//		this.v1.add(clr);

		Reproductor_completo rc = Actor_comun.getRc();
		this.getVaadinHorizontalLayout().add(cabadmin);

		
		cabadmin.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(vpp);
			}
		});

		cabadmin.getIconoBusqueda().addEventListener("click", e -> {
			v1.removeAll();			
			cabadmin.buscar(cabadmin.getTfBusqueda().getValue());
			v1.add(cabadmin.badmin);
			v2.setVisible(false);
			
		});
		this.cabadmin.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				v1.removeAll();
				crearElementos();
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
				v2.setVisible(true);  

			}
		});
	
		this.cabadmin.getBotonAdmin().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cabadmin.getVadmin());				
				
				
			}
		});
		
		this.cabadmin.getBotonNotificaciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(cabadmin.getNotif());
				diag.setDraggable(true);
				diag.open();
				
				cabadmin.getNotif()._notificacion.forEach(t -> t.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						VerticalLayout vl = cabadmin.getNotif().getVaadinVerticalLayout().as(VerticalLayout.class);
						cabadmin.getNotif()._notificacion.remove(t);
						vl.remove(t);
						cabadmin.getNotif().eliminarNotificacion();
						if(cabadmin.getNotif()._notificacion.size() == 0) {
							diag.close();
						}
						
						
					}
		}));
			}});
	
		this.cabadmin.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vpp = new Ver_perfil_propio(iD);
				v1.removeAll();
				v1.add(vpp);
				v2.setVisible(false);
				
			}
		});
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				ve.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						crearElementos();
						v1.removeAll();
						v1.add(cucr);
						v1.add(ccf);
						v1.add(cr);
						v1.add(clr);
						v2.setVisible(true);	
						
					}
				});
				v1.add(ve);
				v2.setVisible(false);	
				
				
			}
		});
		
	}
	
		
	
	 
}