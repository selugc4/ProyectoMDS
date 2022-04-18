package clases;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Actor_comun {
//	public Cabecera_administrador _cabecera_administrador;
	
	public Cabecera_administrador cabadmin = new Cabecera_administrador();
	public Administrador() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(cabadmin);
	}
}