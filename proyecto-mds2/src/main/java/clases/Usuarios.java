package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Usuarios extends vistas.VistaUsuarios {
//	public Buscador_administrador _buscador_administrador;
//	public Vista_buscador_usuarios _vista_buscador_usuarios;
//	public Vector<Usuario> _usuario = new Vector<Usuario>();
	
	public ArrayList<Usuario> _usuario = new ArrayList<Usuario>();
	
	public Usuarios() {
		
	}
	
	public Usuarios(String name) {
		buscarUsuarios(name);
		

	}

	private void mostrarResultados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout hl = new HorizontalLayout();
		vl.removeAll();
		for(int i = 0; i < _usuario.size(); i++) {
			hl.add(_usuario.get(i));
		}
		vl.add(hl);
		
	}
	private void buscarUsuarios(String value) {	
		for(int i = 0; i< 2; i++) {
			_usuario.add(new Usuario(value));
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