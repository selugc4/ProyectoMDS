package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;

public class Artista extends Actor_comun {
//	public Cabecera_artista _cabecera_artista;
	
	public static Cabecera_artista ca = new Cabecera_artista();
	public static Ver_perfil_propio_de_artista vppa = new Ver_perfil_propio_de_artista();
	
	public Artista() {
		clr= new ContenedorListasReproduccion(1);
		this.v1.add(clr);
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout().add(ca);
		
		
		//INICIO
		ca.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {					
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
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
				}
			});
				
		//PERFIL PROPIO
		ca.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
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
				
		//CREAR LISTA
		this.vppa.ca.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								v1.removeAll();
								v1.add(vppa.ca.cl);
								
							}
						});
						
		//FAVORITOS
		this.vppa.getVaadinButton5().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(vppa.vlpp);		
							}
						});
					
		}
	}
