package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;

public class Recomendaciones extends Canciones {
//	public ContenedorCanciones_favoritas _contenedorCanciones_favoritas;
	
	public Recomendaciones() {
		this.getLabel().setText("Para tí");
		this.cargar_Recomendaciones();
	}
		private void cargar_Recomendaciones() {
			ArrayList<Cancion__Vista_actor_comun_> vlrp = new ArrayList<Cancion__Vista_actor_comun_>();
			Cancion[] canciones = iac.cargar_Recomendaciones();
			for(int i = 0; i < canciones.length; i++) {	
				Cancion__Vista_actor_comun_ aux = new Cancion__Vista_actor_comun_(canciones[i]);
				vlrp.add(aux);

			}
			_ver_lista_de_Reproduccion = vlrp;
			
			mostrarLista();
			
		}
	}