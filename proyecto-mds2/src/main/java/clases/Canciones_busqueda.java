package clases;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_busqueda extends vistas.VistaCanciones_busqueda {
//	public Buscar_elementos _buscar_elementos;
//	public Vector<Cancion_busqueda> _cancion_busqueda = new Vector<Cancion_busqueda>();
	private void inicializar() {
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			for(int i = 0; i < 5; i++) {		
				v1.add(new Cancion_busqueda());
			}
		}
}