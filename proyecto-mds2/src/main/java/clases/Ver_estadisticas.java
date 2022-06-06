package clases;

import bds.BDPrincipal;
import bds.iActor_comun;
import basededatos.Horas;
import basededatos.Usuario;

public class Ver_estadisticas extends vistas.VistaVer_estadisticas{
//	private Label _titulo_EstadisticasL;
//	private Label _titulo_EstiloL;
//	private Label _valor_EstiloL;
//	private Label _titulo_ArtistaL;
//	private Label _valor_ArtistaL;
//	private Label _titulo_CancionL;
//	private Label _valor_CancionL;
//	private Label _titulo_HorasL;
//	private Label _valor_HorasL;
//	private Button _volver_AtrasB;
//	public Actor_comun _actor_comun;
//	public void volverAtras() {
//		throw new UnsupportedOperationException();
//	}
	public static int horas;
	private iActor_comun iac = new BDPrincipal();
	
	public Ver_estadisticas() {
		basededatos.Cancion cancion = iac.obtener_Estadisticas(Actor_comun.ID);		
		basededatos.Artista[] artista = cancion.getCancion_de().autor.toArray();
		basededatos.Estilo[] estilos = artista[0].pertenece.toArray();
//		this.getLabel2().setText(estilos[0].getNombre());
		this.getLabel4().setText(artista[0].getNombre());
		this.getLabel6().setText(cancion.getTitulo());
		this.getLabel8().setText(Integer.toString(horas));

	}
	

	
}