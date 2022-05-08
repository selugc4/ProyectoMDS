package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class ContenedorAlbumes extends vistas.VistaContenedoralbumes {
//	private Button _siguiente_Pagina;
//	private Button _anterior_Pagina;
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
//	public Albumes_perfil _albumes_perfil;

//	public void siguientePagina() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void anteriorPagina() {
//		throw new UnsupportedOperationException();
//	}
	
	public Albumes_perfil ap = new Albumes_perfil();
	
	private int tamano = 3;
	private int pagina = 0;
	public ContenedorAlbumes() {
		inicializar();
		
	}

	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout().add(ap);
		
		this.getLabel().setText("Página 1 de " +this.ap._album.size()/tamano);
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(pagina > 0) {
					--pagina;
					ap.Mostrar_Lista(pagina);			
					getLabel().setText("Página " +(pagina+1) + " de " +ap._album.size()/tamano);
					
				}
			}
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(pagina <  ap._album.size()/tamano-1) {
				++pagina;
				ap.Mostrar_Lista(pagina);
				getLabel().setText("Página " +(pagina+1)+" de " +  ap._album.size()/tamano);
				
			}
		}		
	
	});
}
}