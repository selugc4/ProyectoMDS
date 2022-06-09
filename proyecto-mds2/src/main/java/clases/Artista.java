package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Artista extends Actor_comun {
//	public Cabecera_artista _cabecera_artista;
	
	public static Cabecera_artista ca;
	public static Ver_perfil_propio_de_artista vppa;
	
	public Artista(int iD) {
		super(iD);
		
		crearElementos();
	
		ca = new Cabecera_artista();
		vppa = new Ver_perfil_propio_de_artista(iD);
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout().add(ca);
				
		//INICIO
		ca.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {					
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
		ca.getBotonNotificaciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					Dialog diag = new Dialog(ca.getNotif());
					diag.setDraggable(true);
					diag.open();
					
					ca.getNotif()._notificacion.forEach(t -> t.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
						
						@Override
						public void onComponentEvent(ClickEvent<Button> event) {
							VerticalLayout vl = ca.getNotif().getVaadinVerticalLayout().as(VerticalLayout.class);
							ca.getNotif()._notificacion.remove(t);
							vl.remove(t);
							ca.getNotif().eliminarNotificacion();
							if(ca.getNotif()._notificacion.size() == 0) {
								diag.close();
							}
							
							
						}
					}));
				}
			});
				
		//PERFIL PROPIO
		ca.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
					vppa = new Ver_perfil_propio_de_artista(iD);
					v1.removeAll();	
					v1.add(vppa);
					v2.setVisible(false);		
				}
			});

		ca.getIconoBusqueda().addEventListener("click", e -> {
			v1.removeAll();			
			ca.buscar(ca.getTfBusqueda().getValue());
			v1.add(ca.be);
			v2.setVisible(false);
					
		});
		

		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(ve);
				v2.setVisible(false);	
				
			}
		});
				
		
					
		}
	}
