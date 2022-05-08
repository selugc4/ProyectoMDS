package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
	public Ver_estadisticas ve = new Ver_estadisticas();
	public static VerticalLayout v1;
	public static VerticalLayout v2;
	public Actor_comun() {
		this.v1 = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		this.v2 = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
		this.v1.add(cucr,ccf, cr,clr);
		VerticalLayout vl = this.getVaadinVerticalLayout3().as(VerticalLayout.class);
		vl.add(rc);
			
		//ULTIMAS CANCIONES
		cucr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();				
				v1.add(cucr.verLista(cucr.ucr._ver_lista_de_Reproduccion, cucr.ucr.getLabel().getText()));
				v2.setVisible(false);	
			}
		});
		
		
		//RECOMENDADAS
		cr.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();				
				v1.add(cr.verLista(cr.r._ver_lista_de_Reproduccion, cr.r.getLabel().getText()));
				v2.setVisible(false);	
				
			}
	});
		
		//FAVORITAS
		ccf.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();				
				v1.add(ccf.verLista(ccf.cf._ver_lista_de_Reproduccion, ccf.cf.getLabel().getText()));
				v2.setVisible(false);	
			}
	});
		
		//ESTADISTICAS
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>(){
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(ve);
				v2.setVisible(false);
			}
		});
		
		//volver atrás ESTADISTICAS
		ve.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
				v2.setVisible(true);	
				
			}
		});
		
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