package clases;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Albumes_buscador extends vistas.VistaAlbumes_buscador {
//	public Buscar_elementos _buscar_elementos;
//	public Vector<Album> _album = new Vector<Album>();
	private void inicializar() {
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			for(int i = 0; i < 5; i++) {		
				v1.add(new Album());
			}
		}
}