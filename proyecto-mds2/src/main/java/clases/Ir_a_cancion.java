package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import basededatos.Lista_Reproduccion;

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

	public Ir_a_cancion() {
		
	}
	public Ir_a_cancion(Cancion cancion) {
		this.vc = new Ver_creditos(cancion);
		this.getImg().setSrc("imagenes/"+cancion.getCancion_de().getContiene_imagen().getUrl());
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
				//AÑADIR A FAVORITOS
				
			}
		});
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {				
				Actor_comun.rc.reproducir(cancion.getArchivoMultimedia());
			
			}
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			private String listaaux;

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				getVaadinSelect().addValueChangeListener(lista -> {
					listaaux = lista.getValue().toString();
				});
				if(listaaux.isEmpty()) {
					Notification.show("Seleccione una lista");
				}else
				Notification.show("Añadido a la lista: " + listaaux);
				//AÑADIR CANCIÓN A LISTA
				
			}
		});
		
	}

	public void Anadir_a_lista() {
		throw new UnsupportedOperationException();
	}

	public void Anadir_a_favoritos() {
		throw new UnsupportedOperationException();
	}

	public void verCreditos() {
		throw new UnsupportedOperationException();
	}

	public void irArtista() {
		throw new UnsupportedOperationException();
	}

	public void reproducir() {
		throw new UnsupportedOperationException();
	}
}