package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-contenedorbotonagregar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contenedorbotonagregar")
@JsModule("./vista-contenedorbotonagregar.ts")
public class VistaContenedorbotonagregar extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon")
	private Element ironIcon;

	/**
     * Creates a new VistaContenedorbotonagregar.
     */
    public VistaContenedorbotonagregar() {
        // You can initialise any data required for the connected UI components here.
    }

}
