package clases;

import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorListas extends vistas.VistaContenedorlistas {
//	private Button _verMas;
	public Vector<Ver_lista_de_Reproduccion> _ver_lista_de_Reproduccion = new Vector<Ver_lista_de_Reproduccion>();
	public ContenedorListas() {
		inicializar();
	}
	private void inicializar() {
	Cargar_Listas();
}
	public void Cargar_Listas() {
		HorizontalLayout h1 = this.getVaadinHorizontalLayout();
		for(int i = 0; i < 5; i++) {		
			h1.add(new Cancion__Vista_actor_comun_());
		}
	}
	public void verMas() {
		throw new UnsupportedOperationException();
	}
	public Ver_lista_de_Reproduccion getListaDeReproduccion() {
		return new Ver_lista_de_Reproduccion();
	}
}