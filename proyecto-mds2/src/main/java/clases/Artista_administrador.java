package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import bds.BDPrincipal;
import bds.iAdministrador;

public class Artista_administrador extends ArtistaBuscador{
//	private Button _editarB;
//	private Button _eliminar_artistaB;
	public Artistas_administrador _artistas_administrador;
	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;

	public Artista_administrador(Artista artista) {
		super(artista);
		inicializar();
		super.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout v1 = Usuario_registrado.v1;
				v1.removeAll();
				_ver_perfil_propio_de_artista = new Ver_perfil_propio_de_artista();
				v1.add(_ver_perfil_propio_de_artista);
				Usuario_registrado.v2.setVisible(false);
			}
		});
		super.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>(){
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Eliminar_artista(artista.getCorreo());
			}
		});
	}

	public void Eliminar_artista(String correo) {
		iAdministrador iadmin = new BDPrincipal();
		iadmin.eliminar_Artista(correo);
	}

	public void ventanaEditarArtista() {
		throw new UnsupportedOperationException();
	}
	private void inicializar() {
		super.getVaadinButton().setVisible(true);
		super.getVaadinButton1().setVisible(true);
	}
}