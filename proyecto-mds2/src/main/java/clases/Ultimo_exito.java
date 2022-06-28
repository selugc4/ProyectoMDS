package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iAdministrador;

public class Ultimo_exito extends vistas.VistaUltimo_exito {
//	private Button _eliminarB;
//	private Label _cancionL;
//	private Label _artistaL;
//	public Ultimos_exitos_administracion _ultimos_exitos_administracion;

//	public void Eliminar() {
//		throw new UnsupportedOperationException();
//	}
	public Ultimo_exito(String cancion, String artista, int id) {
		this.getLabel().setText(cancion);
		this.getLabel1().setText(artista);
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				iAdministrador iadmin = new BDPrincipal();
				iadmin.Eliminar_Ultimo_Exito(id);
				Actor_comun.v1.removeAll();
				Actor_comun.v1.add(new Vista_administracion());
				Actor_comun.v2.setVisible(false);
			}
		});	
	}
}