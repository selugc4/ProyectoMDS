package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;

public class Modificar_y_crear_lista extends vistas.VistaModificar_y_crear_lista{
//	private Dialog _anadir_Cancion;
//	private Button _anadir_CancionB;
//	private Label _titulo_ListaL;
//	private TextField _titulo_ListaTF;
//	private Label _lista_Canciones;
//	private Button _volver_AtrasB;
//	public Buscador_cancion _buscador_cancion;
//	public Canciones_modificar_y_crear _canciones_modificar_y_crear;
//
//	public void Anadir_cancion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Comprobar_titulo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
	public static Canciones_modificar_y_crear cmc;
	public Buscador_cancion bc;
	
	public int idLista;
	
	private iActor_comun iac = new BDPrincipal();
	
	public Modificar_y_crear_lista() {
//		inicializar();
	}
	
	public Modificar_y_crear_lista(int usuario, int tipo) {
		cmc = new Canciones_modificar_y_crear(tipo);		
		bc = new Buscador_cancion(tipo);
		inicializar(usuario);
	}
	
	public Modificar_y_crear_lista(int usuario,int tipo, int iDlista) {
		cmc = new Canciones_modificar_y_crear(tipo);
		idLista = iDlista;
		
		bc = new Buscador_cancion(tipo);
		inicializar(usuario);
		
	}

	protected void inicializar(int usuario) {
		this.getStyle().set("width", "100%");
		this.getVaadinHorizontalLayout5().add(cmc);
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(bc);
				diag.open();
	
			}
		});
		
	
			
	}
}