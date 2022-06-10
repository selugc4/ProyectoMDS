package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Album;
import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iAdministrador;

public class Albumes_buscador extends vistas.VistaAlbumes_buscador {
//	public Buscar_elementos _buscar_elementos;

	public ArrayList<clases.Album> _album = new ArrayList<clases.Album>();
	
	
	public Albumes_buscador() {
	}
	public Albumes_buscador(String valor) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText("Artistas");
		Cargar_Listas(valor);
		Mostrar_Lista();
	}
	public void actualizar() {
		this.getStyle().set("width", "100%");
	}
	public void Mostrar_Lista() {
		HorizontalLayout aux = this.getVaadinHorizontalLayout();
		aux.getStyle().set("width", "100%");
		aux.removeAll();
		for(int i = 0; i < 3 && i<_album.size(); i++) {
			aux.add(_album.get(i));
		}

	}
	public void Mostrar_Lista(int pagina) {
		HorizontalLayout aux = this.getVaadinHorizontalLayout();
        aux.getStyle().set("width", "100%");
        aux.removeAll();
        for(int i = 3*pagina; i < 3*(pagina+1) && i<_album.size(); i++) {
            aux.add(_album.get(i));
        }
	}
	
	private void Cargar_Listas(String valor) {
		iActor_comun iac = new BDPrincipal();
		Album[] albumes = iac.cargar_Albumes_Buscador(valor);
		for(int i = 0; i < 3 && i<albumes.length; i++) {		
				_album.add(new clases.Album(albumes[i]));
			}
		}
}