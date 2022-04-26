package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Actor_comun extends vistas.VistaActor_comun {
//	public Cabecera_comun _cabecera_comun;
//	public ContenedorListasReproduccion _contenedorListasReproduccion;
//	public Reproductor_completo _reproductor_completo;
//	public Ver_estadisticas _ver_estadisticas;
//	public ContenedorUltimas_canciones_reproducidas _contenedorUltimas_canciones_reproducidas;
//	public ContenedorRecomendaciones _contenedorRecomendaciones;
//	public ContenedorCanciones_favoritas _contenedorCanciones_favoritas;
	
	public Cabecera_comun cc = new Cabecera_comun();
	public static Reproductor_completo rc = new Reproductor_completo();
	public ContenedorUltimas_canciones_reproducidas cucr = new ContenedorUltimas_canciones_reproducidas();
	public ContenedorCanciones_favoritas ccf = new ContenedorCanciones_favoritas();
	public ContenedorRecomendaciones cr = new ContenedorRecomendaciones();
	public ContenedorListasReproduccion clr = new ContenedorListasReproduccion();
	public Actor_comun() {
		VerticalLayout v1 = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		VerticalLayout v2 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.add(cc);
		v1.add(cucr);
		v1.add(ccf);
		v1.add(cr);
		v1.add(clr);
		v2.add(rc);
		
	}
	
	public Cabecera_comun getCc() {
		return cc;
	}
	public static Reproductor_completo getRc() {
		return Actor_comun.rc;
	}
	public ContenedorUltimas_canciones_reproducidas getCucr() {
		return cucr;
	}
	public ContenedorCanciones_favoritas getCcf() {
		return ccf;
	}
	public ContenedorRecomendaciones getCr() {
		return cr;
	}
	public ContenedorListasReproduccion getClr() {
		return clr;
	}
	
}