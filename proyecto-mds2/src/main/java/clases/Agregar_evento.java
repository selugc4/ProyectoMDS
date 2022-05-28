package clases;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Agregar_evento extends vistas.VistaAgregar_evento{
//	private Label _tituloAnadirEventoL;
//	private Label _tipoEventoL;
//	private ComboBox _dropdown_concierto_o_festival;
//	private Button _volverAtrasB;
//	public ContenedorBotonAgregar _contenedorBotonAgregar;

//	public Dropdown_concierto_o_festival drop = new Dropdown_concierto_o_festival();
	public Eleccion_evento ee = new Eleccion_evento();
	
		public Agregar_evento() {
		this.getStyle().set("width", "100%");
		this.getVaadinComboBox().setItems("Concierto","Festival");
		this.getVaadinComboBox().setPlaceholder("Seleccione");
		
		
		this.getVaadinComboBox().addValueChangeListener(event -> {
				VerticalLayout vl = Artista.v1;
			 if(event.getValue().equals("Concierto")) {
				 	 vl.remove(ee);
					 ee = new Eleccion_evento(1);
					 vl.add(ee);
				
			} else if (event.getValue().equals("Festival")) {
					vl.remove(ee);
					ee = new Eleccion_evento();
					vl.add(ee);
			}
			
		});

		

		
	}
}