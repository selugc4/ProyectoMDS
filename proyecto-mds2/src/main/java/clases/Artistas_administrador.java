package clases;

import java.util.Vector;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import basededatos.Artista;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Artistas_administrador extends Artistas {
//	public Buscador_administrador _buscador_administrador;
	public Vector<Artista_administrador> _artista_administrador = new Vector<Artista_administrador>();
	public Artistas_administrador() {
		inicializar();
	}
	private void inicializar() {
		Cargar_Listas_Admin();
	}
	public void Cargar_Listas_Admin() {
		iActor_comun actor = new BDPrincipal();
		Artista[]artistas = actor.cargar_Artistas_Buscador(artista);
		if(artistas != null) {
		for(int i = 0; i < 4 && i < artistas.length; i++) {		
			Artista_administrador artistaA = new Artista_administrador(artistas[i]);
			_artista_administrador.add(artistaA);
		}
		}
	}
	public void mostrarAdmin() {
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout h1 = new HorizontalLayout();
		for(Artista_administrador artistaA: _artista_administrador) {
			h1.add(artistaA);
		}
		v1.add(h1);
		}
}