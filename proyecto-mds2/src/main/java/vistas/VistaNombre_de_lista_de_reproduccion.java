package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-nombre_de_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nombre_de_lista_de_reproduccion")
@JsModule("./vista-nombre_de_lista_de_reproduccion.ts")
public class VistaNombre_de_lista_de_reproduccion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;

	/**
     * Creates a new VistaNombre_de_lista_de_reproduccion.
     */
    public VistaNombre_de_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
