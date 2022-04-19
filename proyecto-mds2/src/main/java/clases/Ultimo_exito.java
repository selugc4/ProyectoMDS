package clases;
public class Ultimo_exito extends vistas.VistaUltimo_exito {
//	private Button _eliminarB;
//	private Label _cancionL;
//	private Label _artistaL;
//	public Ultimos_exitos_administracion _ultimos_exitos_administracion;

//	public void Eliminar() {
//		throw new UnsupportedOperationException();
//	}
	public Ultimo_exito(String cancion, String artista) {
		this.getLabel().setText(cancion);
		this.getLabel1().setText(artista);
	
	}
}