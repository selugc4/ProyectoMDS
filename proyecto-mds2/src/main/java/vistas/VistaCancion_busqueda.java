package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cancion_busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_busqueda")
@JsModule("./vista-cancion_busqueda.ts")
public class VistaCancion_busqueda extends LitTemplate {

    @Id("label")
	private Label label;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("label1")
	private Label label1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("ironIcon1")
	private Element ironIcon1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	/**
     * Creates a new VistaCancion_busqueda.
     */
    public VistaCancion_busqueda() {
        // You can initialise any data required for the connected UI components here.
    }
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public Button getVaadinButton() {
		return vaadinButton;
	}
	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
	public Label getLabel1() {
		return label1;
	}
	public void setLabel1(Label label1) {
		this.label1 = label1;
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
	public Element getIronIcon1() {
		return ironIcon1;
	}
	public void setIronIcon1(Element ironIcon1) {
		this.ironIcon1 = ironIcon1;
	}
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}
	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	
}
