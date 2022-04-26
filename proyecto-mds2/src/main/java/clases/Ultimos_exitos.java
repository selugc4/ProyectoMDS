package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS2.MainView;


public class Ultimos_exitos extends vistas.VistaUltimos_exitos{
//	public Cibernauta _cibernauta;
//	public Vector<Cancion__Vista_Cibernauta_> _cancion__Vista_Cibernauta_ = new Vector<Cancion__Vista_Cibernauta_>();
	
	
	public static ArrayList<Cancion__Vista_Cibernauta_> canciones = new ArrayList<Cancion__Vista_Cibernauta_>();
	
	public Ultimos_exitos() {
		inicializar();
		
	}

	void inicializar() {
		Cargar_Ultimos_Exitos();
		this.getStyle().set("width", "100%");
		
	}

	public void Cargar_Ultimos_Exitos() {
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		HorizontalLayout h1 = new HorizontalLayout();
		h1.getStyle().set("justify-content","space-between");
		for(int i = 0; i < 5; i++) {		
			h1.add(new Cancion__Vista_Cibernauta_());
		}
		v1.add(h1);	
	}

	

	
}