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
	public static String artista;
	public Artistas() {
		inicializar();
	}
	private void inicializar() {
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			iActor_comun actor = new BDPrincipal();
			Artista[]artistas = actor.cargar_Artistas_Buscador(artista);
			if(artistas != null) {
			for(int i = 0; i < 4 && i < artistas.length; i++) {	
				ArtistaBuscador artistaB = new ArtistaBuscador(artistas[i]);
				_artistaBuscador.add(artistaB);
			}
			}
		}
		public void mostrar() {
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			HorizontalLayout h1 = new HorizontalLayout();
			for(ArtistaBuscador artista: _artistaBuscador) {
				h1.add(artista);
			}
			v1.add(h1);
		}
}