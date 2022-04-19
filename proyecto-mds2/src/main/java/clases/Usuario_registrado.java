package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaActor_comun;

public class Usuario_registrado extends Actor_comun {
//	public Cabecera_usuario_registrado _cabecera_usuario_registrado;
	public Usuario_registrado() {	
		VerticalLayout v1 = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		VerticalLayout v2 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.add(cc);
		v1.add(cucr);
		v1.add(ccf);
		v1.add(cr);
		v1.add(clr);
		v2.add(rc);  
		cc.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				v1.removeAll();
				v1.add(cc); 
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
				//v2.add(getVaadinButton());
				v2.add(rc);
			}
		}); 
		cc.getBotonNotificaciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cc.getNotif());
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);	
				//v2.add(getVaadinButton());
				v2.add(rc);
			}
		});
		cc.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);	
				v1.add(cc.getVer_perfil_propio());
				v1.add(cc.getVer_perfil_propio().getContenedorAgregar_perfil_propio());
				v2.replace(getVaadinButton(), rc);
			}
		});
		cucr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cucr.getListaDeReproduccion());
				v1.add(cucr.getListaDeReproduccion().getCancionesLista());
				v2.replace(getVaadinButton(), rc);
			}
	});
		cr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v2.removeAll();
				v1.add(cc);
				v1.add(cr.getListaDeReproduccion());
				v1.add(cr.getListaDeReproduccion().getCancionesLista());
				v2.add(rc);
			}
	});
		ccf.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v2.removeAll();
				v1.add(cc);
				v1.add(ccf.getListaDeReproduccion());
				v1.add(ccf.getListaDeReproduccion().getCancionesLista());
				v2.add(rc);
			}
	});
	}
}