package clases;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_lista_de_reproduccion_ajena extends Ver_lista_de_Reproduccion {
//	private Button _seguir_ListaB;
//	public Lista_de_reproduccion_buscador _lista_de_reproduccion_buscador;
//	public Lista_de_reproduccion_perfil_ajeno _lista_de_reproduccion_perfil_ajeno;
//
//	public void Seguir_lista() {
//		throw new UnsupportedOperationException();
//	}
	
	public Ver_lista_de_reproduccion_ajena() {
		inicializar();
	}
	public Ver_lista_de_reproduccion_ajena(int idLista, String nombre) {
		inicializar();		
		this.getLabel().setText(nombre);
		cancionesLista = new Canciones_lista(idLista);
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.add(cancionesLista);
	}
	public void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout1().setVisible(true);
		this.getLabel1().setText("Autor: ARTISTA");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton2().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		this.cancionesLista.getVaadinButton().setVisible(false);
	}
}