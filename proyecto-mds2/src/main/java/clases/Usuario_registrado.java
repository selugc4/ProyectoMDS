package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.DomEventListener;


public class Usuario_registrado extends Actor_comun {
	
	public static Cabecera_usuario_registrado cur;
	public static  Ver_perfil_propio_usuario_registrado vpp;
	

	public Usuario_registrado() {
		
	}

	public Usuario_registrado(int iD) {	
		super(iD);

		crearElementos();
		cur = new Cabecera_usuario_registrado();
		vpp = new Ver_perfil_propio_usuario_registrado(Actor_comun.ID);
		
		this.getVaadinHorizontalLayout().add(cur);
		

		cur.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				crearElementos();
				
				v1.removeAll();
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
				v2.setVisible(true);	
			}
		}); 
		
		
		//NOTIFICACIONES
		cur.getBotonNotificaciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(cur.getNotif());
				diag.setDraggable(true);
				diag.open();
				
				cur.getNotif()._notificacion.forEach(t -> t.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						VerticalLayout vl = cur.getNotif().getVaadinVerticalLayout().as(VerticalLayout.class);
						cur.getNotif()._notificacion.remove(t);
						vl.remove(t);
						cur.getNotif().eliminarNotificacion();
						if(cur.getNotif()._notificacion.size() == 0) {
							diag.close();
						}
						
						
					}
				}));
			}
		});
		
		//PERFIL PROPIO
		cur.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vpp = new Ver_perfil_propio_usuario_registrado(Actor_comun.ID);
				v1.removeAll();	
				v1.add(vpp);
///				v1.add(cur.getVer_perfil_propio().getContenedorAgregar_perfil_propio());
				v2.setVisible(false);		
				}
		});

	
		cur.getIconoBusqueda().addEventListener("click", e -> {
			v1.removeAll();			
			cur.buscar(cur.getTfBusqueda().getValue());
			v1.add(cur.be);
			v2.setVisible(false);
			
		});
		

	
		ve.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
				v2.setVisible(true);	
				
			}
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			ve = new Ver_estadisticas();
			v1.removeAll();
			v1.add(ve);
			v2.setVisible(false);	
			
		}
	});
	}
	
	
}