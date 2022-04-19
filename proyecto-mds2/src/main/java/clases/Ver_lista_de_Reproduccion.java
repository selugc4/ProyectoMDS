package clases;

import java.util.ArrayList;

public class Ver_lista_de_Reproduccion extends vistas.VistaVer_lista_de_reproduccion {
//	private Label _nombre_ListaL;
//	private Button _compartirB;
//	private Label _nombre_AutorL;
//	private Button _ver_PerfilB;
//	public ContenedorListas _contenedorListas;
//	public Lista_de_reproduccion _lista_de_reproduccion;
	public Canciones_lista _canciones_lista;
	
	public Ver_lista_de_Reproduccion(ArrayList<Cancion__Vista_actor_comun_> lista) {
		
	}
	public Ver_lista_de_Reproduccion() {
		
	}

//	public void Compartir() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Boton_perfil() {
//		throw new UnsupportedOperationException();
//	}
	public Canciones_lista getCancionesLista() {
		return _canciones_lista;
	}
}