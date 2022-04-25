package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-vista_buscador_usuarios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vista_buscador_usuarios")
@JsModule("./vista-vista_buscador_usuarios.ts")
public class VistaVista_buscador_usuarios extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	/**
     * Creates a new VistaVista_buscador_usuarios.
     */
    public VistaVista_buscador_usuarios() {
        // You can initialise any data required for the connected UI components here.
    }
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public TextField getVaadinTextField() {
		return vaadinTextField;
	}
	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}
	public Element getIronIcon() {
		return ironIcon;
	}
	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}


}
