package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;
import basededatos.Cancion;

public class Canciones extends vistas.VistaCanciones {
//	public Vector<Cancion__Vista_actor_comun_> _cancion__Vista_actor_comun_ = new Vector<Cancion__Vista_actor_comun_>();
	
	public ArrayList<Cancion__Vista_actor_comun_> _ver_lista_de_Reproduccion = new ArrayList<Cancion__Vista_actor_comun_>();
	iActor_comun iac = new BDPrincipal();
	public Canciones() {
		inicializar();
	}
	private void inicializar() {
	this.getStyle().set("width", "100%");
}
	
	public void cargar_Ultimas_Canciones_Reproducidas() {
		ArrayList<Cancion__Vista_actor_comun_> vlrp = new ArrayList<Cancion__Vista_actor_comun_>();
		Cancion[] canciones = iac.cargar_Ultimas_Canciones_Reproducidas();
		for(int i = 0; i < canciones.length; i++) {	
			Cancion__Vista_actor_comun_ aux = new Cancion__Vista_actor_comun_(canciones[i]);
			//canciones[i].getTitulo(), canciones[i].es_de.toArray(), canciones[i].getCancion_de().getContiene_imagen().getUrl()
			vlrp.add(aux);

		}
		_ver_lista_de_Reproduccion = vlrp;
		
		mostrarLista();
	}
	
	protected void mostrarLista() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout h1 = new HorizontalLayout();
		for(int i =0; i< _ver_lista_de_Reproduccion.size() && i < 5; i++ ) {
			h1.add(_ver_lista_de_Reproduccion.get(i));
		}
		vl.add(h1);
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
