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
	
	public Cabecera_comun cc;
	public static Reproductor_completo rc = new Reproductor_completo();
	public ContenedorUltimas_canciones_reproducidas cucr;
	public ContenedorCanciones_favoritas ccf;
	public ContenedorRecomendaciones cr;
	public ContenedorListasReproduccion clr;
	public Ver_estadisticas ve;
	public static VerticalLayout v1;
	public static VerticalLayout v2;
	public static int ID;
	public static Button botonIrCancion = new Button("Ver canción");
	
	public Actor_comun() {
	};
	public Actor_comun(int iD) {
		this.v1 = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		this.v2 = this.getVaadinVerticalLayout2().as(VerticalLayout.class);
		this.ID = iD;
		
		botonIrCancion.getStyle().set("width", "10%");
		botonIrCancion.setVisible(false);
		botonIrCancion.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(rc._ir_a_cancion);
				v2.setVisible(false);	

				
			}
		});
	
		HorizontalLayout aux = new HorizontalLayout();
		aux.getStyle().set("width", "100%");
		aux.add(rc);
		aux.add(botonIrCancion);;
		VerticalLayout vl = this.getVaadinVerticalLayout3().as(VerticalLayout.class);
		vl.add(aux);
		
		
	
		
		cucr = new ContenedorUltimas_canciones_reproducidas();
		ccf = new ContenedorCanciones_favoritas();
		cr = new ContenedorRecomendaciones();
		ve = new Ver_estadisticas();
		
		clr = new ContenedorListasReproduccion(0);
		
		this.v1.add(cucr,ccf,cr,clr);
		this.getStyle().set("width", "100%");
		
	
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
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			v1.removeAll();
			v1.add(ve);
			v2.setVisible(false);	
			
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