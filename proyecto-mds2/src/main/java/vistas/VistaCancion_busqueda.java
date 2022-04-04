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
	/**
     * Creates a new VistaCancion_busqueda.
     */
    public VistaCancion_busqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}
