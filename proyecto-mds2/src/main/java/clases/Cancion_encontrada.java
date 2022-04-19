package clases;
public class Cancion_encontrada extends vistas.VistaCancion_encontrada {
//	private Label _titulo_CancionL;
//	private Button _anadir_a_la_vista_de_cibernautaB;
//	public Canciones_buscadas _canciones_buscadas;

	public Cancion_encontrada(String value) {
		this.getStyle().set("width", "100%");
		this.getLabel().setText(value);
	}

//	public void Anadir_a_la_vista_de_cibernauta() {
//		throw new UnsupportedOperationException();
//	}
}