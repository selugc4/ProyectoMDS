package clases;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.AlbumDAO;
import basededatos.CancionDAO;
import basededatos.Cancion;
import bds.BDPrincipal;
import bds.iAdministrador;

public class Canciones_buscadas extends vistas.VistaCanciones_buscadas {

//	public Buscador_cancion_administracion _buscador_cancion_administracion;
//	public Vector<Cancion_encontrada> _cancion_encontrada = new Vector<Cancion_encontrada>();
	
	public ArrayList<Cancion_encontrada> lista = new ArrayList<Cancion_encontrada>();
	
	public Canciones_buscadas() {
		inicializar();
//		buscarCanciones(value);
//		mostrarResultados();
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		
	}
	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for(int i = 0; i < lista.size(); i++) {
			vl.add(lista.get(i));
		}
		
	}
	private void buscarCanciones(String value) {
		this.getStyle().set("width", "100%");
		try {
			if(value != "") {
			Cancion[]canciones = CancionDAO.listCancionByQuery("Titulo='"+value+"'", null);
			for(Cancion cancion: canciones) {
				lista.add(new Cancion_encontrada(cancion));
			}
		}
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void actualizar(String value) {
		lista.clear();
		buscarCanciones(value);
		mostrarResultados();
	}
	public ArrayList<Cancion_encontrada> getLista() {
		return lista;
	}
}