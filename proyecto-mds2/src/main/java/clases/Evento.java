package clases;
public class Evento extends vistas.VistaEvento {
//	private Label _nombre_EventoL;
//	private Label _fechaL;
//	public Conciertos_y_festivales _conciertos_y_festivales;
	
	public Evento() {
		this.getStyle().set("width", "100%");
	}

	public Evento(basededatos.Evento evento) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(evento.getNombre());
		this.getLabel1().setText(evento.getFecha());
	}
}