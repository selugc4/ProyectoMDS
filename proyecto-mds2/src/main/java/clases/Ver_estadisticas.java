package clases;

import bds.BDPrincipal;
import bds.iActor_comun;
import proyectoMDS2.MainView;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

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
		if(cancion != null) {		
			if(cancion.getCancion_de() == null) {
				basededatos.Artista[] artista = cancion.getCancion_de().autor.toArray();
				if(!artista[0].pertenece.isEmpty()) {
				basededatos.Estilo[] estilos = artista[0].pertenece.toArray();
				if(estilos.length != 0) {
					this.getLabel2().setText(estilos[0].getNombre());
					this.getLabel4().setText(artista[0].getNombre());
					this.getLabel6().setText(cancion.getTitulo());
					this.getLabel8().setText(Integer.toString(horas));
				}
				}
			
			
			}else {					
				this.getLabel2().setText("No se ha podido obtener");
				this.getLabel4().setText("No se ha podido obtener");
				this.getLabel6().setText("No se ha podido obtener");
				this.getLabel8().setText("No se ha podido obtener");
			}
		
			
		}else {
		this.getLabel2().setText("No se ha podido obtener");
		this.getLabel4().setText("No se ha podido obtener");
		this.getLabel6().setText("No se ha podido obtener");
		this.getLabel8().setText("No se ha podido obtener");
		}
	
		
	}

	
}