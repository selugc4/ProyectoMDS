package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_Registrado;
import bds.BDPrincipal;
import bds.iAdministrador;

public class Usuarios extends vistas.VistaUsuarios {
//	public Buscador_administrador _buscador_administrador;
//	public Vista_buscador_usuarios _vista_buscador_usuarios;
//	public Vector<Usuario> _usuario = new Vector<Usuario>();
	
	public ArrayList<Usuario> _usuario = new ArrayList<Usuario>();
	
	public Usuarios() {
		
	}

	private void mostrarResultados() {
		HorizontalLayout hl = new HorizontalLayout();
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);	
		vl.remove(hl);
		for(int i = 0; i < _usuario.size(); i++) {
			hl.add(_usuario.get(i));
		}	
		vl.add(hl);
	}
	private void buscarUsuarios(String value) {	
		iAdministrador iAdmin = new BDPrincipal();
		_usuario.clear();
		Usuario_Registrado[] usuarios = iAdmin.cargar_Usuarios(value);
		for(int i = 0; i< 3 && i < usuarios.length; i++) {
			_usuario.add(new Usuario(usuarios[i]));
		}
	}
	
	public void actualizar(String value) {
		_usuario.clear();
		buscarUsuarios(value);
		mostrarResultados();
	}

	public ArrayList<Usuario> get_usuario() {
		return _usuario;
	}

	public void set_usuario(ArrayList<Usuario> _usuario) {
		this._usuario = _usuario;
	}
	
	

}