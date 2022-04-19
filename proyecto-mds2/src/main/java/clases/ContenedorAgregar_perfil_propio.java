package clases;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class ContenedorAgregar_perfil_propio extends Contenedor_agregar {
//	public Ver_perfil_propio _ver_perfil_propio;
//	public Listas_de_reproduccion_perfil_propio _listas_de_reproduccion_perfil_propio;
	
	public ContenedorAgregar_perfil_propio() {
		inicializar();
	}
	private void inicializar() {
	Cargar_Listas();
}
	public void Cargar_Listas() {
		HorizontalLayout h1 = this.getVaadinHorizontalLayout();
		for(int i = 0; i < 5; i++) {		
			h1.add(new Lista_de_reproduccion_propia());
		}
}
}