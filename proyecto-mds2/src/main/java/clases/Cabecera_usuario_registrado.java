package clases;

import com.vaadin.flow.component.Component;

public class Cabecera_usuario_registrado extends Cabecera_comun {
//	public Usuario_registrado _usuario_registrado;
//	public Buscar_elementos _buscar_elementos;
//	public Ver_perfil_propio_usuario_registrado _ver_perfil_propio_usuario_registrado;
	
	public Buscar_elementos be = new Buscar_elementos();
	public Ver_perfil_propio vpp = new Ver_perfil_propio();
	
	public Cabecera_usuario_registrado() {
		inicializar();
	}

	private void inicializar() {
		this.getBotonAdmin().setVisible(false);
		this.getStyle().set("width", "100%");
	}

	public void buscar(String value) {
		be = new Buscar_elementos(value);
	}



}