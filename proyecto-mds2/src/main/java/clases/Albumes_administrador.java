package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import bds.BDPrincipal;
import bds.iAdministrador;
import basededatos.Album;
public class Albumes_administrador extends Albumes_buscador {
//	public Buscador_administrador _buscador_administrador;
//	public Vector<Album_administrador> _album_administrador = new Vector<Album_administrador>();
	
	
	public ArrayList<Album_administrador> _album_administrador = new ArrayList<Album_administrador>();
	
	public Albumes_administrador(String buscador) {
		inicializar(buscador);
	}
	protected void inicializar(String buscador) {
		this.getStyle().set("width", "100%");
		Mostrar_Lista(buscador);
	}
	public void Mostrar_Lista(String buscador) {
		HorizontalLayout aux = this.getVaadinHorizontalLayout();
		aux.getStyle().set("width", "100%");
		aux.removeAll();
		iAdministrador iadmin = new BDPrincipal();
		Album[] albumes = iadmin.cargar_Albumes_Admin(buscador);
		for(int i = 0; i < 3 && i<albumes.length; i++) {
			aux.add(new Album_administrador(albumes[i]));
		}	
	}
}