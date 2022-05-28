package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Eleccion_evento extends vistas.VistaEleccion_evento {
//	private Label _nombreEventoL;
//	private TextField _nombreEventoTF;
//	private Label _fechaEventoL;
//	private Image _asignar_Fecha;
//	private Button _boton_anadir_eventoB;
//	private Button _volver_AtrasB;
//	public Tipo_evento _tipo_evento;

	public Eleccion_evento() {
		inicializar();
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("La fecha es " +getVaadinDatePicker().getValue());
				
			}
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Artista.v1;
				vl.removeAll();
				vl.add(Artista.vppa);
				Notification.show("Festival creado");
				
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Artista.v1;
				vl.removeAll();
				vl.add(Artista.vppa);				
			}
		});
		
	}
	public Eleccion_evento(int tipo) {
		if(tipo == 1) {
			this.getLabel2().setText("Nombre del concierto");
			this.getLabel3().setText("Fecha del concierto");
		}
		inicializarConcierto();

	}
	private void inicializarConcierto() {
this.getStyle().set("width", "100%");
		
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("La fecha es " +getVaadinDatePicker().getValue());
				
			}
		});
		
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Artista.v1;
				vl.removeAll();
				vl.add(Artista.vppa);
				Notification.show("Concierto creado");
				
				
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = Artista.v1;
				vl.removeAll();
				vl.add(Artista.vppa);				
			}
		});
		
	}

//	public void Asignar_fecha() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Boton_anadir_evento() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
}