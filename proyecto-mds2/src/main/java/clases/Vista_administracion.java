package clases;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import bds.BDPrincipal;
import bds.iAdministrador;
import net.bytebuddy.asm.Advice.This;
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
	
	public ContenedorUltimosExitos cue;
	public Buscador_cancion_administracion bca;
	public static Estilos_buscados eb = new Estilos_buscados();
	public Menu_dar_alta mda = new Menu_dar_alta();
	public Vista_buscador_usuarios vbu = new Vista_buscador_usuarios();
	public VerticalLayout vgrLayout;
	public VerticalLayout vue;
	public Vista_administracion() {
		vgrLayout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cue = new ContenedorUltimosExitos();
		bca = new Buscador_cancion_administracion();
		inicializarUltimos(cue);
		iAdministrador iadmin = new BDPrincipal();
		this.getTfMostrar().setValue(Integer.toString(Ultimos_exitos.numeroUltimosExitos));
		this.getTfReproducibles().setValue(Integer.toString(Reproductor_canciones_simple.reproducibles));
		
		this.getBotonMostrar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(getTfMostrar().getValue().isEmpty() || Integer.valueOf(getTfMostrar().getValue()) < 0) {
					Notification.show("Este valor no es correcto para mostrar canciones");
				}else {
					iadmin.Modificar_Canciones_Mostradas(Integer.valueOf(getTfMostrar().getValue()));
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
					Reproductor_canciones_simple.reproducibles = Integer.valueOf(getTfReproducibles().getValue());
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
		
//		this.bca.getCb().getLista().forEach(t -> t.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				Notification.show("CLICK");
//				cue.getUea().agregar(t.getLabel().toString(), "Artista");
//			}
//		}));
		
		this.getBotonDarAlta().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
				vl.setAlignItems(Alignment.START);
				vl.removeAll();
				vl.add(mda);
				
			}
		});
		
		this.getBotonUsuarios().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = getVaadinVerticalLayout().as(VerticalLayout.class);
				vl.removeAll();
				vl.add(vbu);
				
			}
		});
		this.getIronIcon().addEventListener("click", e -> {
				VerticalLayout ve = this.getVerticalEstilos().as(VerticalLayout.class);
				ve.removeAll();
				for(int i = 0; i < eb._estilo.size();i++) {
					eb._estilo.remove(i);
				}
				iAdministrador iad = new BDPrincipal();
				basededatos.Estilo[] estilos = iad.cargar_Estilos(this.getTfBuscador().getValue());	
				if(estilos!= null) {
				for(basededatos.Estilo estilo: estilos) {
				Estilo Estilob = new clases.Estilo(estilo.getNombre());
				Estilob.idEstilo = estilo.getORMID();
				eb._estilo.add(Estilob);
				}
				}
				eb.mostrarLista();
				ve.add(eb);
		});
	}
	public void inicializarUltimos(ContenedorUltimosExitos cont) {
		vue = this.getVerticallUE().as(VerticalLayout.class);
		vue.removeAll();
		vue.add(cont);
	}
	
}