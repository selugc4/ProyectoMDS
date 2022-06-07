package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;

public class Canciones_lista extends vistas.VistaCanciones_lista {

	//	public Ver_lista_de_Reproduccion _ver_lista_de_Reproduccion;
//	public Vista_album _vista_album;
//	public Vector<Cancion_vista_album> _cancion_vista_album = new Vector<Cancion_vista_album>();
	private iActor_comun iac = new BDPrincipal();

	public ArrayList<Cancion_vista_album> _cancion_vista_album = new ArrayList<Cancion_vista_album>();
	public Canciones_lista(ArrayList<Cancion__Vista_actor_comun_> lista) {
		inicializar();	
		rellenarLista(lista);
		Cargar_Listas();
		
	}
	private void rellenarLista(ArrayList<Cancion__Vista_actor_comun_> lista) {
		for(Cancion__Vista_actor_comun_ cvac : lista) {
			_cancion_vista_album.add(new Cancion_vista_album(cvac));
		}
		
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinVerticalLayout1().setVisible(false);
		
	}
	public Canciones_lista() {
	}
	
	public Canciones_lista(int idLista) {
		inicializar();
		basededatos.Cancion[] canciones = iac.cargar_Canciones_Lista(idLista);
		ArrayList<Cancion__Vista_actor_comun_> lista = new ArrayList<Cancion__Vista_actor_comun_>();
		for(basededatos.Cancion cancion : canciones) {
			lista.add(new Cancion__Vista_actor_comun_(cancion));
		}
		rellenarLista(lista);
		Cargar_Listas();
	}
	public void Cargar_Listas() {

			VerticalLayout v3 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			if(_cancion_vista_album.isEmpty()) {
				this.getVaadinVerticalLayout1().setVisible(true);
			}else {
				this.getVaadinVerticalLayout1().setVisible(false);
			for(int i = 0; i < _cancion_vista_album.size(); i++) {		
				v3.add(_cancion_vista_album.get(i));
			}
			}
		}
}