package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-contenedoralbumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contenedoralbumes")
@JsModule("./vista-contenedoralbumes.ts")
public class VistaContenedoralbumes extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("label")
	private Label label;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("ironIcon1")
	private Element ironIcon1;

	/**
     * Creates a new VistaContenedoralbumes.
     */
    public VistaContenedoralbumes() {
        // You can initialise any data required for the connected UI components here.
    }

}
