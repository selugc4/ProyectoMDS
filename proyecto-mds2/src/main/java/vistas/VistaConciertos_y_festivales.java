package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-conciertos_y_festivales template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-conciertos_y_festivales")
@JsModule("./vista-conciertos_y_festivales.ts")
public class VistaConciertos_y_festivales extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;

	/**
     * Creates a new VistaConciertos_y_festivales.
     */
    public VistaConciertos_y_festivales() {
        // You can initialise any data required for the connected UI components here.
    }

}
