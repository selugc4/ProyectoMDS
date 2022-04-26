package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones extends vistas.VistaCanciones {
//	public Vector<Cancion__Vista_actor_comun_> _cancion__Vista_actor_comun_ = new Vector<Cancion__Vista_actor_comun_>();
	
	public ArrayList<Cancion__Vista_actor_comun_> _ver_lista_de_Reproduccion = new ArrayList<Cancion__Vista_actor_comun_>();
	public Canciones() {
		inicializar();
	}
	private void inicializar() {
	Cargar_Listas();
}
	public void Cargar_Listas() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout h1 = new HorizontalLayout();
		for(int i = 0; i < 5; i++) {	
			Cancion__Vista_actor_comun_ cancion = new Cancion__Vista_actor_comun_();
			_ver_lista_de_Reproduccion.add(cancion);
			h1.add(cancion);
		}
		vl.add(h1);
	}

		public Ver_lista_de_Reproduccion getListaDeReproduccion() {
		return new Ver_lista_de_Reproduccion();
	}
}
