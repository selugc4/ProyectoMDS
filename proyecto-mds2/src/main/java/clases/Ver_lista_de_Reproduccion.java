package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_lista_de_Reproduccion extends vistas.VistaVer_lista_de_reproduccion {
//	private Label _nombre_ListaL;
//	private Button _compartirB;
//	private Label _nombre_AutorL;
//	private Button _ver_PerfilB;
//	public ContenedorListas _contenedorListas;
//	public Lista_de_reproduccion _lista_de_reproduccion;
	public Canciones_lista cancionesLista = new Canciones_lista();
	
	
	public Ver_lista_de_Reproduccion(ArrayList<Cancion__Vista_actor_comun_> lista, String nombre) {
		inicializar();		
		this.getLabel().setText(nombre);
		cancionesLista = new Canciones_lista(lista);
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.add(cancionesLista);
		
		
	}
	
	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton2().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		this.getVaadinHorizontalLayout1().setVisible(false);
		
	}
	public Ver_lista_de_Reproduccion(String nombre) {
		inicializar();
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.getLabel().setText(nombre);
		v1.add(cancionesLista);
	}



	public Ver_lista_de_Reproduccion() {
		inicializar();
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.add(cancionesLista);	}

	//	public void Compartir() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Boton_perfil() {
//		throw new UnsupportedOperationException();
//	}
	public Canciones_lista getCancionesLista() {
		return cancionesLista;
	}
}