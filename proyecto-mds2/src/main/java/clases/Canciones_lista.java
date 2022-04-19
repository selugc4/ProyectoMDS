package clases;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_lista extends vistas.VistaCanciones_lista {
//	public Ver_lista_de_Reproduccion _ver_lista_de_Reproduccion;
//	public Vista_album _vista_album;
//	public Vector<Cancion_vista_album> _cancion_vista_album = new Vector<Cancion_vista_album>();
	private void inicializar() {
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			VerticalLayout v3 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			for(int i = 0; i < 5; i++) {		
				v3.add(new Cancion_vista_album());
			}
		}
}