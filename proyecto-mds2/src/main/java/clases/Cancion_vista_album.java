package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import bds.BDPrincipal;
import bds.iActor_comun;

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
	public Cancion_vista_album(Cancion__Vista_actor_comun_ cancion__Vista_actor_comun_) {
		inicializar();
		this.getLabelDchaTitulo().setText(cancion__Vista_actor_comun_.getLabelDebajoTitulo().getText());
		this.getLabelDchaArtista().setText(cancion__Vista_actor_comun_.getLabelDebajoArtista().getText());
		this.getLabelAlbum().setText(cancion__Vista_actor_comun_.getLabelAlbum().getText());
		this.getLabelDuracion().setVisible(false);
		this.getImg().setSrc(cancion__Vista_actor_comun_.getImg().getSrc());
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				rcs.vcre = new Ver_creditos(cancion__Vista_actor_comun_.getCancion());
				rcs._ir_a_cancion = new Ir_a_cancion(cancion__Vista_actor_comun_.getCancion());
				rcs.reproducir(cancion__Vista_actor_comun_.getCancion().getArchivoMultimedia());
				iActor_comun iac = new BDPrincipal();
				iac.reproducir(Actor_comun.ID, cancion__Vista_actor_comun_.getCancion().getIdCancion());
			}
		});
		
		this.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				rcs.vcre = new Ver_creditos(cancion__Vista_actor_comun_.getCancion());
				rcs._ir_a_cancion = new Ir_a_cancion(cancion__Vista_actor_comun_.getCancion());
				rcs.reproducir(cancion__Vista_actor_comun_.getCancion().getArchivoMultimedia());
				iActor_comun iac = new BDPrincipal();
				iac.reproducir(Actor_comun.ID, cancion__Vista_actor_comun_.getCancion().getIdCancion());
				
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