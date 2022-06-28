package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iAdministrador;
import bds.iCibernauta;
import basededatos.Cancion;

public class Ultimos_exitos_administracion extends vistas.VistaUltimos_exitos_administracion{
//	public Vector<Ultimo_exito> _ultimo_exito = new Vector<Ultimo_exito>();
//	public ContenedorUltimosExitos _contenedorUltimosExitos;
	
	public ArrayList<Ultimo_exito> lista = new ArrayList<Ultimo_exito>();
	
	public Ultimos_exitos_administracion() {
		inicializar();
	}

	private void inicializar() {
		obtenerLista();
		
	}
	
	public void obtenerLista() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		iAdministrador iadmin = new BDPrincipal();
		Cancion[]canciones = iadmin.cargar_Ultimos_Exitos();
		if(canciones.length != 0) {
		for(Cancion cancion: canciones) {
			Ultimo_exito aux = new Ultimo_exito(cancion.getTitulo(), cancion.getCancion_de().autor.toArray()[0].getNombre(), cancion.getORMID());
			lista.add(aux);
		}
		for(Ultimo_exito exito: lista) {
			vl.add(exito);
		}
		}
		
	}
}