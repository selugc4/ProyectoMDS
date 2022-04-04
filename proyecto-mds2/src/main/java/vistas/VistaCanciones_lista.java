package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-canciones_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_lista")
@JsModule("./vista-canciones_lista.ts")
public class VistaCanciones_lista extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("vaadinButton")
	private Button vaadinButton;
	/**
     * Creates a new VistaCanciones_lista.
     */
    public VistaCanciones_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
