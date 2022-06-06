package clases;
import java.util.ArrayList;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iAdministrador;
import basededatos.Cancion;
public class Canciones_administrador extends vistas.VistaCanciones_administrador {
//	public Buscador_administrador _buscador_administrador;
//	public Vector<Cancion_administrador> _cancion_administrador = new Vector<Cancion_administrador>();
	
	
	public ArrayList<Cancion_administrador> _canciones_administrador = new ArrayList<Cancion_administrador>();
	public static String canciones;
	public Canciones_administrador() {
		this.getStyle().set("width", "100%");
	}
	
	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		for(int i = 0; i < _canciones_administrador.size(); i++) {
			vl.add(_canciones_administrador.get(i));
		}
		
	}
	private void buscarCanciones(String value) {
		_canciones_administrador.clear();
		iAdministrador iadmin= new BDPrincipal();
		Cancion[] canciones = iadmin.cargar_Canciones_Buscadas(value);
		for(int i = 0;i < 5 && i < canciones.length;i++) {
			_canciones_administrador.add(new Cancion_administrador(canciones[i]));
		}
		}
	
	public void actualizar(String value) {
		_canciones_administrador.clear();
		buscarCanciones(value);
		mostrarResultados();
	}
}