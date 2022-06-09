package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iArtista;
import basededatos.Cancion;

public class Canciones_mas_exitosas extends vistas.VistaCanciones_mas_exitosas{
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
//	public Vector<Cancion_mas_exitosa> _cancion_mas_exitosa = new Vector<Cancion_mas_exitosa>();
	
	public ArrayList<Cancion_mas_exitosa> cme = new ArrayList<Cancion_mas_exitosa>();
	private iArtista ia = new BDPrincipal();
	
	public Canciones_mas_exitosas() {
		inicializar();
	}

	public Canciones_mas_exitosas(String correo) {
		inicializar();
		Cancion[] canciones =  ia.cargar_Exitosas(correo);
		for(int i = 0; i < canciones.length && i < 5; i++) {
			cme.add(new Cancion_mas_exitosa(canciones[i]));
		}
		mostrarLista();
	}

	private void inicializar() {
		this.getStyle().set("width", "100%");

	}

	private void mostrarLista() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		for(int i = 0; i < cme.size(); i++) {
			vl.add(cme.get(i));
			
		}
	}

}