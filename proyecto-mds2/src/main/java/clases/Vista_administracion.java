package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;

import proyectoMDS2.MainView;

public class Vista_administracion extends vistas.VistaVista_administracion{
//	private Button _menu_Dar_AltaB;
//	private Button _menu_Buscador_UsuariosB;
//	private Button _modificar_Numero_Canciones_MostradasB;
//	private TextField _modificar_Numero_Canciones_MostradasTF;
//	private Label _modificar_Numero_Canciones_MostradasL;
//	private Button _modificar_Numero_Canciones_ReproduciblesB;
//	private TextField _modificar_Numero_Canciones_ReproduciblesTF;
//	private Label _modificar_Numero_Canciones_ReproduciblesL;
//	private Button _anadir_CancionB;
//	private TextField _buscador_EstilosTF;
//	private Label _buscador_EstilosL;
//	private Button _buscar_EstiloB;
//	private Label _modificar_CancionesL;
//	private Dialog _buscador_Cancion_Administracion;
//	private Dialog _buscador_Estilo;
//	public Cabecera_administrador _cabecera_administrador;
//	public Buscador_cancion_administracion _buscador_cancion_administracion;
//	public ContenedorUltimosExitos _contenedorUltimosExitos;
//	public Menu_dar_alta _menu_dar_alta;
//	public Vista_buscador_usuarios _vista_buscador_usuarios;
//	public Estilos_buscados _estilos_buscados;
//
//	public void Modificar_numero_de_canciones_reproducibles_por_el_cibernauta() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Modificar_el_numero_de_canciones_mostradas_al_cibernauta() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaMenuDarAlta() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ventanaMenuBuscadorUsuarios() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void modificarNumeroCancionesMostradas() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void modificarNumeroCancionesReproducibles() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void anadirCancion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void buscarEstilo() {
//		throw new UnsupportedOperationException();
//	}
	
	public ContenedorUltimosExitos cue = new ContenedorUltimosExitos();
	public Buscador_cancion_administracion bca = new Buscador_cancion_administracion();
	
	public Vista_administracion() {
		
		this.getBotonMostrar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(getTfMostrar().getValue().isEmpty() || Integer.valueOf(getTfMostrar().getValue()) < 0) {
					Notification.show("Este valor no es correcto para mostrar canciones");
				}else {
					Notification.show("Número de canciones mostradas cambiadas a " + getTfMostrar().getValue());
					getTfMostrar().clear();
//					Cibernauta.mostradas = Integer.valueOf(getTfMostrar().getValue());		
							
										
					
					
				}
				
			}
		});
		
		this.getBotonReproducibles().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
		
			public void onComponentEvent(ClickEvent<Button> event) {
				if(getTfReproducibles().getValue().isEmpty() || Integer.valueOf(getTfReproducibles().getValue()) < 0) {
					Notification.show("Este valor no es correcto para seleccionar las canciones reproducibles máximas");
				}else {
					Notification.show("Número de canciones reproducibles cambiadas a " + getTfReproducibles().getValue());
					getTfReproducibles().clear();
//					Cibernauta.reproducibles= Integer.valueOf(getTfReproducibles().getValue());				
					
				}
				
			}
		});
		
		this.getBotonAnadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog diag = new Dialog(bca);
				diag.setWidth("100%");
				diag.open();
				
			}
		});
	}
	
}