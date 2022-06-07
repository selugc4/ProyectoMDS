package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import basededatos.Cancion;

public class Cancion_administrador extends vistas.VistaCancion_administrador {
//	private Label _titulo_CancionL;
//	private Label _artistaL;
//	private Button _reproducirB;
//	private Button _anadir_a_inicioB;
//	private Button _eliminar_Cancion;
//	private Button _editar_CancionB;
//	public Canciones_administrador _canciones_administrador;
//	public Vista_modificar_cancion _vista_modificar_cancion;
	
	public Vista_modificar_cancion vmc = new Vista_modificar_cancion();
	
	public Cancion_administrador() {
		this.getStyle().set("width", "100%");
	}

	public Cancion_administrador(Cancion cancion) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(cancion.getTitulo());
		if(cancion.es_de.toArray().length>0) {
		this.getLabel1().setText(cancion.es_de.toArray()[0].getNombre());
		}
		else {
		this.getLabel1().setText("Artista desconocido");
		}
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Administrador.v1.removeAll();
				Administrador.v1.add(vmc);
				
			}
		});
	}

//	public void Boton_reproducir() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Anadir_a_la_vista_de_cibernauta() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Eliminar_cancion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Ventana_Modificar_Cancion() {
//		throw new UnsupportedOperationException();
//	}
}