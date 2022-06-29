package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Buscador_administrador extends vistas.VistaBuscador_administrador{

	
//	private Label _titulo_Resultados_AdministradorL;
//	public Cabecera_administrador _cabecera_administrador;
//	public Albumes_administrador _albumes_administrador;
//	public Artistas_administrador _artistas_administrador;
//	public Canciones_administrador _canciones_administrador;
//	public Listas_de_reproduccion_administrador _listas_de_reproduccion_administrador;
//	public Usuarios _usuarios;
	
	
	
	
	
	public Canciones_administrador ca = new Canciones_administrador();
	public Usuarios usuarios = new Usuarios();
	
	
	public Buscador_administrador(String value) {
		inicializar();
		HorizontalLayout canciones = this.getHorizontalCanciones();
		HorizontalLayout listas = this.getHorizontalListas();
		HorizontalLayout artistas = this.getHorizontalArtistas();
		HorizontalLayout albumes = this.getHorizontalAlbumes();
		HorizontalLayout users = this.getHorizontalUsuarios();
		VerticalLayout sinresultados = this.getVaadinVerticalLayout1().as(VerticalLayout.class);		
		canciones.removeAll();
		listas.removeAll();
		artistas.removeAll();
		albumes.removeAll();
		users.removeAll();
		if(!value.isEmpty()) {
			Artistas_administrador.artista = value;
			Artistas_administrador aa = new Artistas_administrador();
			aa.mostrarAdmin();
			ca.actualizar(value);
			Listas_de_reproduccion_administrador ldra = new Listas_de_reproduccion_administrador(value);
			Albumes_administrador alba= new Albumes_administrador(value);
			usuarios.actualizar(value);
			sinresultados.setVisible(false);
			if(ca._canciones_administrador.isEmpty() && aa._artistaBuscador.isEmpty() && ldra._lista_de_reproduccion_administrador.isEmpty() && alba._album_administrador.isEmpty()&& usuarios._usuario.isEmpty()) {
				sinresultados.setVisible(true);
		}else {	
			artistas.add(aa);
			canciones.add(ca);
			listas.add(ldra);
			albumes.add(alba);
			users.add(usuarios);
		sinresultados.setVisible(false);
		}
		}
		else {
		sinresultados.setVisible(true);
		
		}
		
	}
	
	

	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Actor_comun.v1.removeAll();
				Vista_administracion aux = new Vista_administracion();
				Actor_comun.v1.add(aux);
				
			}
		});
		
	}
}