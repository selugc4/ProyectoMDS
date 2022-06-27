package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Listas_de_reproduccion_perfil_propio extends vistas.VistaListas_de_reproduccion_perfil_propio{
//	public ContenedorAgregar_perfil_propio _contenedorAgregar_perfil_propio;
//	public Vector<Lista_de_reproduccion_propia> _lista_de_reproduccion_propia = new Vector<Lista_de_reproduccion_propia>();
	
	private iActor_comun iac = new BDPrincipal();
	public ArrayList<Lista_de_reproduccion_propia> listas = new ArrayList<Lista_de_reproduccion_propia>();
	
	public Listas_de_reproduccion_perfil_propio() {
		
	}
	public Listas_de_reproduccion_perfil_propio(int usuario) {
		this.getStyle().set("width", "100%");
		this.getLabel().setVisible(false);
		cargar_Listas_Propias(usuario);
		mostrar(5);
	}
	
	private void cargar_Listas_Propias(int id) {
		listas.clear();
		Lista_Reproduccion[] aux = iac.cargar_Listas_Propias(id);
		for(Lista_Reproduccion a : aux) {
			listas.add(new Lista_de_reproduccion_propia(a.getNombreLista(), a.getAutor().getTipoUsuario(), a.getIdLista()));
		}
		
	}
	public void mostrar(int tamano) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = 0; i < tamano && i< listas.size(); i++) {
			h1.add(listas.get(i));
			
		}
		
	}
	
	public void mostrar(int tamano, int pagina) {
		VerticalLayout h1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		h1.removeAll();
		for(int i = tamano*pagina; i < tamano*pagina+tamano && i < listas.size(); i++) {
			h1.add(listas.get(i));
			
		}
	}
	

	
}
