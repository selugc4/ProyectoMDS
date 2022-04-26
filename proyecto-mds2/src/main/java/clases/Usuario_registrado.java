package clases;

import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;import com.vaadin.flow.dom.DomEvent;
import com.vaadin.flow.dom.DomEventListener;

import vistas.VistaActor_comun;

public class Usuario_registrado extends Actor_comun {
	
	public Cabecera_usuario_registrado cur = new Cabecera_usuario_registrado();
	public Usuario_registrado() {	
		VerticalLayout v1 = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		VerticalLayout v2 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		v1.replace(cc, cur);
		cur.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				v1.removeAll();
				v1.add(cur); 
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
				//v2.add(rc);
				//v1.add(getVaadinButton());
			}
		}); 
		
		cur.getBotonNotificaciones().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(cur.getNotif());
				diag.setDraggable(true);
				diag.open();
			}
		});
		cur.getBotonPerfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cur);	
				v1.add(cur.getVer_perfil_propio());
				v1.add(cur.getVer_perfil_propio().getContenedorAgregar_perfil_propio());
				v2.replace(getVaadinButton(), rc);			}
		});
/*		cucr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cucr.getListaDeReproduccion());
				v1.add(new Canciones_lista());
				v2.add(rc);
			}
	});
		cr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cr.getListaDeReproduccion());
				v1.add(new Canciones_lista());
				v2.add(rc);
			}
	});
		ccf.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(ccf.getListaDeReproduccion());
				v1.add(new Canciones_lista());
				v2.add(rc);
			}
	});
		cc.getTfBusqueda().addBlurListener(new ComponentEventListener<BlurNotifier.BlurEvent<TextField>>(){
			@Override
			public void onComponentEvent(BlurEvent<TextField> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(new Canciones_busqueda());
				v1.add(new Lista_de_reproduccion_buscador());
				v1.add(new Artista());
				v1.add(new Albumes_buscador());
				v2.add(rc);
			}
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(new Ver_estadisticas());
				v2.add(rc);
			}
		});
		*/
		new Ver_estadisticas().getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>(){
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc); 
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
			}
		});
	}
}