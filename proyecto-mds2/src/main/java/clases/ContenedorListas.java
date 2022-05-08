package clases;

import java.util.ArrayList;
import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorListas extends vistas.VistaContenedorlistas {
//	private Button _verMas
	public Ver_lista_de_Reproduccion vldr = new Ver_lista_de_Reproduccion();
//	public ArrayList<Cancion__Vista_actor_comun_> _ver_lista_de_Reproduccion = new ArrayList<Cancion__Vista_actor_comun_>();
//	public ContenedorListas() {
//		inicializar();
//	}
//	private void inicializar() {
//	Cargar_Listas();
//}
//	public void Cargar_Listas() {
//		HorizontalLayout h1 = this.getVaadinHorizontalLayout();
//		for(int i = 0; i < 5; i++) {	
//			Cancion__Vista_actor_comun_ cancion = new Cancion__Vista_actor_comun_();
//			_ver_lista_de_Reproduccion.add(cancion);
//			h1.add(cancion);
//		}
//	}
//		public Ver_lista_de_Reproduccion getListaDeReproduccion() {
//		return new Ver_lista_de_Reproduccion();
//	}
	
	public Ver_lista_de_Reproduccion verLista(ArrayList<Cancion__Vista_actor_comun_> lista, String nombre) {
		return new Ver_lista_de_Reproduccion(lista, nombre);
	}
}