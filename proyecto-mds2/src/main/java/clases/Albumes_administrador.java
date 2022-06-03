package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class Albumes_administrador extends Albumes_buscador {
//	public Buscador_administrador _buscador_administrador;
//	public Vector<Album_administrador> _album_administrador = new Vector<Album_administrador>();
	
	
	public ArrayList<Album_administrador> _album_administrador = new ArrayList<Album_administrador>();
	
	public Albumes_administrador() {
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