package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-buscar_elementos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_elementos")
@JsModule("./vista-buscar_elementos.ts")
public class VistaBuscar_elementos extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	/**
     * Creates a new VistaBuscar_elementos.
     */
    public VistaBuscar_elementos() {
        // You can initialise any data required for the connected UI components here.
    }

}
