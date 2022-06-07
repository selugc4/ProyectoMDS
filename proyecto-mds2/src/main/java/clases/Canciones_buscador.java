package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;

public class Canciones_buscador extends vistas.VistaCanciones_buscador {
//	public Buscador_cancion _buscador_cancion;
//	public Vector<Cancion_buscada> _cancion_buscada = new Vector<Cancion_buscada>();
	
	public ArrayList<Cancion_buscada> lista = new ArrayList<Cancion_buscada>();
	private iActor_comun iac = new BDPrincipal();
	private int tipo;
	
	public Canciones_buscador(int tipo) {
		inicializar();
		this.tipo = tipo;
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
	private void cargar_Canciones_Buscador(String nombre) {
		lista.clear();
		if(!nombre.isEmpty()) {		
			basededatos.Cancion[] canciones = iac.cargar_Canciones_Buscador(nombre);
			for(basededatos.Cancion cancion : canciones) {
				lista.add(new Cancion_buscada(cancion.getTitulo(), cancion.getIdCancion(),tipo));
			}
		}
		
		
	}
	
	public void actualizar(String value) {
		lista.clear();
		cargar_Canciones_Buscador(value);
		mostrarResultados();
	}
	public ArrayList<Cancion_buscada> getLista() {
		return lista;
	}
	
	
	
}