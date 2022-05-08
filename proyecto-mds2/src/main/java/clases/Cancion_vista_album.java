package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cancion_vista_album extends Cancion__Vista_actor_comun_ {
//	private Button _boton_ReproducirB;
//	private Label _duracionL;
//	private Label _albumL;
//	public Canciones_lista _canciones_lista;
//	public void Boton_reproducir() {
//		throw new UnsupportedOperationException();
//	}
	
	public Cancion_vista_album() {
		inicializar();
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_registrado.rc.setSource("null");
				
			}
		});
	}
	@Override
	public void inicializar() {
		this.getLabelAlbum().setVisible(true);
		this.getLabelDchaArtista().setVisible(true);
		this.getLabelDchaTitulo().setVisible(true);
		this.getLabelDuracion().setVisible(true);
		this.getVaadinButton().setVisible(true);
		this.getLabelDebajoArtista().setVisible(false);
		this.getLabelDebajoTitulo().setVisible(false);
		this.getImg().setHeight("100px");
	}
}