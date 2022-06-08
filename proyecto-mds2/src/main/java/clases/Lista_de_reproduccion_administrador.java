package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Lista_de_reproduccion_administrador extends Lista_de_reproduccion {
//	private Button _eliminar_ListaB;
//	private Button _modificar_ListaB;
//	public Listas_de_reproduccion_administrador _listas_de_reproduccion_administrador;
	public Edicion_de_lista _edicion_de_lista;
	public Lista_de_reproduccion_administrador(Lista_Reproduccion lista) {
		super(lista);
		super.cambiarVisibilidad();
		super.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout aux = Usuario_registrado.v1;
				_edicion_de_lista = new Edicion_de_lista(Administrador.ID, 1, lista.getIdLista());
				aux.removeAll();
				aux.add(_edicion_de_lista);
				Usuario_registrado.v2.setVisible(false);
			}
		});
		super.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Eliminar_lista(lista.getIdLista());
			}
		});
	}
	public void Eliminar_lista(int id) {
		iActor_comun ia = new BDPrincipal();
		ia.eliminar_Lista_Reproduccion(id);
	}

	public void modificar_liista() {
		throw new UnsupportedOperationException();
	}
}