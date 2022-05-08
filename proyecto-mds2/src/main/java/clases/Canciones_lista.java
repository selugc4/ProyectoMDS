package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Canciones_lista extends vistas.VistaCanciones_lista {

	//	public Ver_lista_de_Reproduccion _ver_lista_de_Reproduccion;
//	public Vista_album _vista_album;
//	public Vector<Cancion_vista_album> _cancion_vista_album = new Vector<Cancion_vista_album>();
	
	public ArrayList<Cancion_vista_album> _cancion_vista_album = new ArrayList<Cancion_vista_album>();
	public Canciones_lista(ArrayList<Cancion__Vista_actor_comun_> lista) {
		inicializar();		
		Cargar_Listas(lista);
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinVerticalLayout1().setVisible(false);
		
	}
	public Canciones_lista() {
		// TODO Auto-generated constructor stub
	}
	
	public void Cargar_Listas(ArrayList<Cancion__Vista_actor_comun_> lista) {
			VerticalLayout v3 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			if(lista.isEmpty()) {
				this.getVaadinVerticalLayout1().setVisible(true);
			}else
			for(int i = 0; i < lista.size(); i++) {		
				v3.add(new Cancion_vista_album());
			}
		}
}