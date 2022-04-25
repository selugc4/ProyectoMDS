package clases;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ultimos_exitos_administracion extends vistas.VistaUltimos_exitos_administracion{
//	public Vector<Ultimo_exito> _ultimo_exito = new Vector<Ultimo_exito>();
//	public ContenedorUltimosExitos _contenedorUltimosExitos;
	
	public ArrayList<Ultimo_exito> lista = new ArrayList<Ultimo_exito>();
	
	public Ultimos_exitos_administracion() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		inicializar();
		
		lista.forEach(t -> t.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				lista.remove(t);
				vl.remove(t);
				
				
			}
		}));
		
		
		
	}

	private void inicializar() {
		obtenerLista();
		
	}
	
	public void agregar(String nombre, String artista) {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		Ultimo_exito aux = new Ultimo_exito(nombre, artista);
		lista.add(aux);
		vl.add(aux);
		
	}

	private void obtenerLista() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
//		String tamano = String.valueOf(Ultimos_exitos.canciones.size());
		for(int i = 0; i< 5; i++) {
			Ultimo_exito aux = new Ultimo_exito("Cancion","Artista");
//			Ultimo_exito aux = new Ultimo_exito(Ultimos_exitos.canciones.get(i).getLabel().getText(), Ultimos_exitos.canciones.get(i).getLabel1().getText());
			lista.add(aux);
			vl.add(aux);
			
		}
		
	}

	
	
	
	
}