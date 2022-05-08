package clases;

public class Cancion_buscada extends vistas.VistaCancion_buscada{
//	private Label _titulo_CancionL;
//	private Button _anadir_CancionLista;
//	public Canciones_buscador _canciones_buscador;

	public Cancion_buscada(String value) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(value);
		this.getVaadinButton().setVisible(false);
		
	}
	
	
	public void Anadir_a_lista() {
		throw new UnsupportedOperationException();
	}
}
