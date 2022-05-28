package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-agregar_evento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregar_evento")
@JsModule("./vista-agregar_evento.ts")
public class VistaAgregar_evento extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label1")
	private Label label1;
	@Id("vaadinComboBox")
	private ComboBox<String> vaadinComboBox;
	/**
     * Creates a new VistaAgregar_evento.
     */
    public VistaAgregar_evento() {
        // You can initialise any data required for the connected UI components here.
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

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public ComboBox<String> getVaadinComboBox() {
		return vaadinComboBox;
	}

	public void setVaadinComboBox(ComboBox<String> vaadinComboBox) {
		this.vaadinComboBox = vaadinComboBox;
	}

	

	
}
