package clases;

import java.util.ArrayList;

public class Ultimos_exitos_administracion extends vistas.VistaUltimos_exitos_administracion{
//	public Vector<Ultimo_exito> _ultimo_exito = new Vector<Ultimo_exito>();
//	public ContenedorUltimosExitos _contenedorUltimosExitos;
	
	public ArrayList<Ultimo_exito> lista = new ArrayList<Ultimo_exito>();
	
	public Ultimos_exitos_administracion() {
		obtenerLista();
	}

	private void obtenerLista() {
		for(int i = 0; i< Ultimos_exitos.canciones.size(); i++) {
			lista.add(new Ultimo_exito(Ultimos_exitos.canciones.get(i).getLabel().getText(), Ultimos_exitos.canciones.get(i).getLabel1().getText()));
		}
		
	}
}