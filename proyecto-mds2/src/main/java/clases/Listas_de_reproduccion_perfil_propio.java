package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listas_de_reproduccion_perfil_propio extends vistas.VistaListas_de_reproduccion_perfil_propio{
//	public ContenedorAgregar_perfil_propio _contenedorAgregar_perfil_propio;
//	public Vector<Lista_de_reproduccion_propia> _lista_de_reproduccion_propia = new Vector<Lista_de_reproduccion_propia>();
	
	public ArrayList<Lista_de_reproduccion_propia> listas = new ArrayList<Lista_de_reproduccion_propia>();
	
	public Listas_de_reproduccion_perfil_propio() {
		
	}
	public Listas_de_reproduccion_perfil_propio(int usuario) {
		this.getStyle().set("width", "100%");
		Cargar_Listas(usuario);
		mostrar(5);
	}
	
	public void mostrar(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = 0; i < tamano; i++) {
			h1.add(listas.get(i));
			
		}
		
	}
	
	public void mostrar(int tamano, int pagina) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = tamano*pagina; i < tamano*pagina+tamano; i++) {
			h1.add(listas.get(i));
			
		}
	}
	

	public void Cargar_Listas(int usuario) {
	for(int i = 0; i < 30; i++) {
		listas.add(new Lista_de_reproduccion_propia(String.valueOf(i), usuario));
	}
	}
}
