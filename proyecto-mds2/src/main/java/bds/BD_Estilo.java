package bds;

import java.util.Vector;
import basededatos.Estilo;
import basededatos.EstiloDAO;

public class BD_Estilo {
	public BDPrincipal _bd_principal_estilo;
	public Vector<EstiloDAO> _contiene_estilo = new Vector<EstiloDAO>();

	public Estilo[] cargar_Estilos(String aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_estilo(int aIdEstilo) {
		throw new UnsupportedOperationException();
	}

	public void Anadir_estilo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_Estilo(int aIdEstilo, String aNombre) {
		throw new UnsupportedOperationException();
	}
}