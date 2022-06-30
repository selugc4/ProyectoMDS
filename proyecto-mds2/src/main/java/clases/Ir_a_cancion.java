package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import basededatos.Lista_Reproduccion;
import bds.BDPrincipal;
import bds.iActor_comun;

public class Ir_a_cancion extends vistas.VistaIr_a_cancion {
//	private Image _imagen;
//	private Label _titulo_CancionL;
//	private Label _artistaL;
//	private Label _duracionL;
//	private Button _reproducirB;
//	private ComboBox _listas_de_Reproduccion;
//	private Button _anadir_ListaB;
//	private Button _anadir_favoritosB;
//	private Button _ver_CreditosB;
//	public Reproductor_completo _reproductor_completo;
//	public Dropdown_Listas_de_reproduccion _dropdown_Listas_de_reproduccion;
//	public Ver_creditos _ver_creditos;
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
	
	public Ver_creditos vc = new Ver_creditos();

	private iActor_comun iac = new BDPrincipal();
	private String listaaux;
	public Ir_a_cancion() {
		
	}
	@SuppressWarnings("unchecked")
	public Ir_a_cancion(Cancion cancion) {
		this.getStyle().set("width", "100%");
//		MOSTRAR LISTAS EN EL SELECT
		Lista_Reproduccion[] lista = iac.cargar_Listas_Reproduccion();
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Seleccione una lista de reproducción");
		for(Lista_Reproduccion l : lista) {
			arraylist.add(l.getNombreLista());
		}

		this.getVaadinSelect().setItems(arraylist);	
		this.getVaadinSelect().setPlaceholder("Seleccione una lista de reproducción");
		this.getVaadinButton1().setEnabled(false);
		getVaadinSelect().addValueChangeListener(listaux -> {
			listaaux = listaux.getValue().toString();
			getVaadinButton1().setEnabled(true);
			
		});
		this.vc = new Ver_creditos(cancion);
		if(cancion.getCancion_de() != null) {
		this.getImg().setSrc("imagenes/"+cancion.getCancion_de().getContiene_imagen().getUrl());
		}
		else {
			this.getImg().setSrc("imagenes/fotoalbum.png");
		}
		this.getLabel().setText(cancion.getTitulo());
		if(cancion.es_de.isEmpty()) {
			this.getLabel1().setVisible(false);
		}else {
			this.getLabel1().setVisible(true);
			String cadena = "";
			for(int i = 0; i < cancion.getCancion_de().autor.toArray().length; i++) {
			
				if(cancion.es_de.toArray().length == 1 ) {
					this.getLabel1().setText(cancion.es_de.toArray()[0].getNombre());
				}else if (i == cancion.es_de.toArray().length-1) {
					cadena+=  cancion.es_de.toArray()[i].getNombre();
					
				}else {
					cadena+= cancion.es_de.toArray()[i].getNombre() + ", ";
				}
				
			
			}
			
			
		}
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Actor_comun.v1;
				vl.removeAll();
				vl.add(vc);
				
			}
		});
		
		this.getVaadinButton3().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Añadido a favoritos");
				iac.anadir_Cancion_Favorita(cancion.getIdCancion(), Actor_comun.ID);
				
			}
		});
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {				
				Actor_comun.rc.reproducir(cancion.getArchivoMultimedia());
			
			}
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(listaaux.equals("Seleccione una lista de reproducción")) {
					Notification.show("Seleccione una lista");
				}else {
				Notification.show("Añadido a la lista: " + listaaux);
				iac.anadir_Lista(cancion.getIdCancion(), listaaux);
				}
				
			}
		});
		
	}

//	public void Anadir_a_lista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Anadir_a_favoritos() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void verCreditos() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void irArtista() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void reproducir() {
//		throw new UnsupportedOperationException();
//	}
}