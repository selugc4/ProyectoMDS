package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Album_administrador extends Album {
//	private Button _eliminar_AlbumB;
//	private Button _modificar_AlbumB;
//	public Albumes_administrador _albumes_administrador;
//	public Vista_modificar_album _vista_modificar_album;
	
	
	public Vista_modificar_album vma = new Vista_modificar_album();
	
	public Album_administrador() {
		// TODO Auto-generated constructor stub
	
		inicializar();
		
	}
	
	
	public Album_administrador (String string) {
		this.getLabel().setText(string);
		inicializar();
	}


	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinVerticalLayout().addEventListener("click", e -> {
			VerticalLayout a = Administrador.v1;
			a.removeAll();
			a.add(va);
			Administrador.v2.setVisible(false);
		});
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout a = Administrador.v1;
				a.removeAll();
				a.add(vma);
				Administrador.v2.setVisible(false);
				
			}
		});
	}
//	public void Eliminar_album() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void modificar_album() {
//		throw new UnsupportedOperationException();
//	}
}