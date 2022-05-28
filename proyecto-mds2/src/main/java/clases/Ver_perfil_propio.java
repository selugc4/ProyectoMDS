package clases;
public class Ver_perfil_propio extends vistas.VistaVer_perfil_propio {
//	private Image _foto;
//	private Label _nombre_Usuario;
//	private Label _seguidores;
//	private Label _seguidos;
//	private Label _numero_SeguidoresL;
//	private Label _numero_SeguidosL;
//	private Label _correoL;
//	private TextField _correoTF;
//	private Button _ver_Lista_Favoritos;
//	private Button _modificar_CorreoB;
//	private Button _cambiar_CorreoB;
//	public Cabecera_administrador _cabecera_administrador;
//	public Usuario _usuario;
//	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	public ContenedorAgregar_perfil_propio ca = new ContenedorAgregar_perfil_propio();
	Ver_lista_de_reproduccion_propia vlpp = new Ver_lista_de_reproduccion_propia("Favoritos");

	public Ver_perfil_propio(String name) {
		
	}
	
	public Ver_perfil_propio() {
		
	};

//	public void Modificar_correo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_lista_favoritos() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void verListaFavoritos() {
//		throw new UnsupportedOperationException();
//	}
	public ContenedorAgregar_perfil_propio getContenedorAgregar_perfil_propio() {
		return ca;
	}
}