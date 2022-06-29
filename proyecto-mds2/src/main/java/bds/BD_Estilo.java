package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Estilo;
import basededatos.EstiloCriteria;
import basededatos.EstiloDAO;
import clases.Vista_dar_alta_estilo;

public class BD_Estilo {
	public BDPrincipal _bd_principal_estilo;
	public Vector<EstiloDAO> _contiene_estilo = new Vector<EstiloDAO>();

	public Estilo[] cargar_Estilos(String aEstilo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			EstiloCriteria ec = new EstiloCriteria();
			ec.nombre.like("%"+aEstilo+"%");
			t.commit();
			return EstiloDAO.listEstiloByCriteria(ec);
		}catch (Exception e) {
			t.rollback();
			return null;
		}
	}

	public void Eliminar_estilo(int aIdEstilo) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Estilo estilo = EstiloDAO.getEstiloByORMID(aIdEstilo);
			estilo.cantado_por.clear();
			Artista[] artistas = estilo.cantado_por.toArray();
			for(Artista artista:artistas) {
				artista.pertenece.remove(estilo);
			}
			EstiloDAO.delete(estilo);
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
	}

	public void Anadir_estilo(String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();

		try {
		Estilo existente = EstiloDAO.loadEstiloByQuery("Nombre='"+aNombre+"'", null);
		if(existente == null) {
			Vista_dar_alta_estilo.existente = false;
		Estilo estilo = EstiloDAO.createEstilo();
		estilo.setNombre(aNombre);
		estilo.cantado_por.add(ArtistaDAO.getArtistaByORMID(2));
		EstiloDAO.save(estilo);
		}else {
			Vista_dar_alta_estilo.existente = true;
			
		}
			
		t.commit();
		}catch (Exception e) {
			t.rollback();
		}
	}

	public void Modificar_Estilo(int aIdEstilo, String aNombre) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Estilo estilo = EstiloDAO.loadEstiloByORMID(aIdEstilo);
			estilo.setNombre(aNombre);
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
	}
}