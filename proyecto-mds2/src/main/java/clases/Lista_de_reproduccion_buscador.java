package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Lista_de_reproduccion_buscador extends vistas.VistaLista_de_reproduccion_buscador{
//	private Label _nombre_ListaL;
//	private Label _autor;
//	private Button _seguir_ListaB;
//	public Listas_de_reproduccion_buscador _listas_de_reproduccion_buscador;
//	public Ver_lista_de_reproduccion_ajena _ver_lista_de_reproduccion_ajena;
//	public Ver_perfil_ajeno _ver_perfil_ajeno;
//
//	public void Seguir_lista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void irLista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_Perfil() {
//		throw new UnsupportedOperationException();
//	}
	
	public Ver_lista_de_reproduccion_ajena vlra; 
	
	public Lista_de_reproduccion_buscador() {
		this.getStyle().set("width", "100%");
		this.getVaadinVerticalLayout().addEventListener("click", e -> {
			VerticalLayout a = Actor_comun.v1;
			a.removeAll();
			a.add(vlra);
			Actor_comun.v2.setVisible(false);
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Seguido");
				
			}
			
		});
	}
	public Lista_de_reproduccion_buscador(Lista_Reproduccion lista) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(lista.getNombreLista());
		this.getLabel1().setText(lista.getAutor().getNombre());
		this.getVaadinVerticalLayout().addEventListener("click", e -> {
			VerticalLayout a = Actor_comun.v1;
			a.removeAll();
			vlra = new Ver_lista_de_reproduccion_ajena(lista.getIdLista(), lista.getNombreLista(), lista.getAutor().getNombre(), lista.getAutor().getID());
			a.add(vlra);
			Actor_comun.v2.setVisible(false);
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				iActor_comun iac = new BDPrincipal();
				iac.seguir_Lista(lista.getIdLista(), Actor_comun.ID);
				Notification.show("Seguido");
				
			}
			
		});
	}
}
