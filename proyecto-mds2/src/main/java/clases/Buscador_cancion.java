package clases;

import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class Buscador_cancion extends vistas.VistaBuscador_cancion{
//	private TextField _buscador_Cancion;
//	private Button _icono_Busqueda;
//	public Modificar_y_crear_lista _modificar_y_crear_lista;
//	public Canciones_buscador _canciones_buscador;

	public Canciones_buscador cb;
	
	public Buscador_cancion(int tipo) {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cb = new Canciones_buscador(tipo);
		vl.add(cb);
		this.getStyle().set("width", "100%");
		this.getIronIcon().addEventListener("click", e->{
			cb.actualizar(this.getVaadinTextField().getValue());
				
			});
	}

	public Canciones_buscador getCb() {
		return cb;
	}


	
//	public void buscar_Cancion() {
//		throw new UnsupportedOperationException();
//	}
}