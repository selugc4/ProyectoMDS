package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;

public class Canciones_favoritas extends Canciones {
//	public ContenedorRecomendaciones _contenedorRecomendaciones;
	
	public Canciones_favoritas() {
		this.getStyle().set("width", "100%");
		this.getLabel().setText("Canciones Favoritas");
		this.cargar_Canciones_Favoritas();
		
	}

	private void cargar_Canciones_Favoritas() {
		ArrayList<Cancion__Vista_actor_comun_> vlrp = new ArrayList<Cancion__Vista_actor_comun_>();
		Cancion[] canciones = iac.cargar_Canciones_Favoritas();
		for(int i = 0; i < canciones.length; i++) {	
			Cancion__Vista_actor_comun_ aux = new Cancion__Vista_actor_comun_(canciones[i]);
			vlrp.add(aux);

		}
		_ver_lista_de_Reproduccion = vlrp;
		
		mostrarLista();
		
	}
	
	
}