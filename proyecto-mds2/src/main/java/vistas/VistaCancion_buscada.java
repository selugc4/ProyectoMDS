package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-cancion_buscada template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_buscada")
@JsModule("./vista-cancion_buscada.ts")
public class VistaCancion_buscada extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label")
	private Label label;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinButton")
	private Button vaadinButton;
	/**
     * Creates a new VistaCancion_buscada.
     */
    public VistaCancion_buscada() {
        // You can initialise any data required for the connected UI components here.
    }
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public Element getIronIcon() {
		return ironIcon;
	}
	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}
	public Button getVaadinButton1() {
		return vaadinButton1;
	}
	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}
	public Button getVaadinButton() {
		return vaadinButton;
	}
	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

}
