package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Artistas extends vistas.VistaArtistas {
//	public Buscar_elementos _buscar_elementos;
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;

	public ArrayList<ArtistaBuscador> _artistaBuscador = new ArrayList<ArtistaBuscador>();
	public String artista;
	public Artistas() {
		inicializar();
	}
	private void inicializar() {
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			HorizontalLayout hl = new HorizontalLayout();
			iActor_comun actor = new BDPrincipal();
			Artista[]artistas = actor.cargar_Artistas_Buscador(artista);
			for(int i = 0; i < 4 && i < artistas.length; i++) {		
				hl.add(new ArtistaBuscador());
			}
			v1.add(hl);
		}
}