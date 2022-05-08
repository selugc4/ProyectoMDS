package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Albumes_buscador extends vistas.VistaAlbumes_buscador {
//	public Buscar_elementos _buscar_elementos;

	public ArrayList<Album> _album = new ArrayList<Album>();
	
	
	public Albumes_buscador() {
		inicializar();
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		Cargar_Listas();
		Mostrar_Lista(0);
	}
	public void Mostrar_Lista(int pagina) {
//		v1.removeAll();
		HorizontalLayout aux = this.getVaadinHorizontalLayout();
		aux.getStyle().set("width", "100%");
		aux.removeAll();
		for(int i = 3*pagina; i < 3*(pagina+1); i++) {
			aux.add(_album.get(i));
		}
	
	}
	
	private void Cargar_Listas() {
		for(int i = 0; i < 10; i++) {		
				_album.add(new Album("Album " + i));
			}
		}
}