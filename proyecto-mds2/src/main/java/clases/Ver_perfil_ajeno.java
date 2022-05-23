package clases;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_ajeno extends  vistas.VistaVer_perfil_ajeno {
//	private Image _foto;
//	private Label _nombreL;
//	private Label _seguidoresL;
//	private Label _seguidosL;
//	private Label _numero_SeguidoresL;
//	private Label _numero_SeguidosL;
//	private Button _seguirB;
//	public Lista_de_reproduccion_buscador _lista_de_reproduccion_buscador;
//
//	public void seguirPerfil() {
//		throw new UnsupportedOperationException();
//	}
	public ContenedorSus_Listas csl; 

	public Ver_perfil_ajeno() {
		
	}
	
	public Ver_perfil_ajeno(int usuario) {
		inicializar();
		csl = new ContenedorSus_Listas(usuario);
	}


	
	private void inicializar() {
		this.getStyle().set("width", "100%");
		VerticalLayout vl = this.getVerticalSusListas().as(VerticalLayout.class);
		vl.add(csl);
		
	}
}