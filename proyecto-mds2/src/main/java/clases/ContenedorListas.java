package clases;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContenedorListas extends vistas.VistaContenedorlistas {
//	private Button _verMas;
//	public Vector<Ver_lista_de_Reproduccion> _ver_lista_de_Reproduccion = new Vector<Ver_lista_de_Reproduccion>();
	public ContenedorListas() {
		inicializar();
	}
	private void inicializar() {
	Cargar_Listas();
	
}
	public void Cargar_Listas() {
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		//v1.removeAll();
		HorizontalLayout h1 = new HorizontalLayout();
		for(int i = 0; i < 5; i++) {		
			h1.add(new Cancion__Vista_actor_comun_());
		}
		//v1.add(getVaadinButton());
		v1.add(h1);		
	}
	public void verMas() {
		throw new UnsupportedOperationException();
	}
}