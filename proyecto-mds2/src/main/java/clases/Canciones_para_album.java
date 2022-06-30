package clases;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.CancionDAO;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Canciones_para_album extends vistas.VistaCanciones_para_album {
//	public Buscador_cancion_para_album _buscador_cancion_para_album;
//	public Vector<Cancion_para_album> _cancion_para_album = new Vector<Cancion_para_album>();
	
	public ArrayList<Cancion_para_album> canciones = new ArrayList<Cancion_para_album>();
	public int tipo;
	public Canciones_para_album(int tipo) {
		this.getStyle().set("width", "100%");
		this.tipo = tipo;
	}
	
	public Canciones_para_album(String texto, int tipo) throws PersistentException {
		this.getStyle().set("width", "100%");
		buscarCanciones(texto);
		
	}

	private void buscarCanciones(String texto) throws PersistentException {
		iActor_comun iac = new BDPrincipal();
		basededatos.Cancion[] cancioness = iac.cargar_Canciones_Buscador(texto);
		for(basededatos.Cancion cancion: cancioness) {
			canciones.add(new Cancion_para_album(cancion.getTitulo(), cancion.getIdCancion(), tipo));
		}
	}

	public void actualizar(String value) throws PersistentException {
		canciones.clear();
		buscarCanciones(value);
		mostrarResultados();
		
	}

	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for(int i = 0; i < canciones.size(); i++) {
			vl.add(canciones.get(i));
		}
		
	}
}