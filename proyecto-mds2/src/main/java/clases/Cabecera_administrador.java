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
	public Buscador_administrador badmin = new Buscador_administrador();
//	public void ventanaAdministracion() {
//		throw new UnsupportedOperationException();
	
	public Cabecera_administrador() {
	
	
	}

	public Vista_administracion getVadmin() {
		return vadmin;
	}

	public Buscador_administrador getBadmin() {
		return badmin;
	}
	
	
	

//	}
}