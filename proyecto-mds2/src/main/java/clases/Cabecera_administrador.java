package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera_administrador extends Cabecera_comun {
//	private Button _administracion;
//	public Administrador _administrador;
//	public Buscador_administrador _buscador_administrador;
//	public Ver_perfil_propio _ver_perfil_propio;
//	public Vista_administracion _vista_administracion;

	public Vista_administracion vadmin = new Vista_administracion();
	public Buscador_administrador badmin = new Buscador_administrador(this.getTfBusqueda().getValue());
//	public void ventanaAdministracion() {
//		throw new UnsupportedOperationException();
	
	public Cabecera_administrador() {
    	this.getStyle().set("width", "100%");

	
	}

	public Vista_administracion getVadmin() {
		vadmin = new Vista_administracion();
		return vadmin;
	}

	public Buscador_administrador getBadmin() {
		return badmin;
	}
	public void buscar(String value) {
		badmin = new Buscador_administrador(value);
	}
	
	

//	}
}