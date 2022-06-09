package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.A12PersistentManager;
import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.Cancion;
import basededatos.Evento;
import basededatos.EventoDAO;
import basededatos.Lista_Reproduccion;
import basededatos.Lista_ReproduccionDAO;

public class BD_Evento {
	public BDPrincipal _bd_principal_evento;
	public Vector<EventoDAO> _contiene_evento = new Vector<EventoDAO>();

	public Evento[] cargar_Eventos(int idArtista) throws PersistentException {
		PersistentTransaction t = A12PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.loadArtistaByORMID(idArtista);
			Evento[] eventos = artista.crea.toArray();
			t.commit();
			return eventos;
			
		} catch (PersistentException e) {
			t.rollback();
			return null;
			
		}	
	}
}