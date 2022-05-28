package bds;

import java.util.Vector;

import basededatos.Cancion;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;

public class BD_Lista_Reproduccion {
	public BDPrincipal _bd_principal_lista_reproduccion;
	public Vector<Lista_ReproduccionDAO> _contiene_lista_reproduccion = new Vector<Lista_ReproduccionDAO>();

	public BD_Lista_Reproduccion[] cargar_Listas_Reproduccion(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Lista_Reproduccion[] cargar_Listas_Buscador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Favorita(int aIdCancion, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Seguidor(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Cancion_Favorita(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void anadir_Cancion_Lista(int aIdCancion, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void seguir_Lista(int aIdLista, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Lista_Reproduccion[] cargar_Listas_Propias() {
		throw new UnsupportedOperationException();
	}

	public Lista_Reproduccion[] cargar_Listas_Reproduccion_Ajenas() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_Canciones_Modificar(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Lista_Reproduccion(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void crear_Lista(String aNombre_Lista, Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public Lista_Reproduccion[] cargar_Listas_Sus_Canciones(String aCorreo) {
		throw new UnsupportedOperationException();
	}
}