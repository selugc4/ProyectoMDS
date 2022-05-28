package bds;

import java.util.Vector;
import basededatos.Evento;
import basededatos.EventoDAO;

public class BD_Evento {
	public BDPrincipal _bd_principal_evento;
	public Vector<EventoDAO> _contiene_evento = new Vector<EventoDAO>();

	public Evento[] cargar_Eventos(String aCorreo) {
		throw new UnsupportedOperationException();
	}
}