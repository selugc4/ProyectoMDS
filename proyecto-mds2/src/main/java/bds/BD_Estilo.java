package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.ArtistaDAO;
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

	public void Anadir_estilo(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
		Estilo estilo = EstiloDAO.createEstilo();
		estilo.setNombre(aNombre);
		estilo.cantado_por.add(ArtistaDAO.getArtistaByORMID(2));
		EstiloDAO.save(estilo);
		t.commit();
		}catch (Exception e) {
			t.rollback();
		}
	}

	public void Modificar_Estilo(int aIdEstilo, String aNombre) {
		throw new UnsupportedOperationException();
	}
}