package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-cancion_mas_exitosa template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_mas_exitosa")
@JsModule("./vista-cancion_mas_exitosa.ts")
public class VistaCancion_mas_exitosa extends LitTemplate {

    @Id("label1")
	private Label label1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("img")
	private Image img;
	@Id("label")
	private Label label;
	/**
     * Creates a new VistaCancion_mas_exitosa.
     */
    public VistaCancion_mas_exitosa() {
        // You can initialise any data required for the connected UI components here.
    }

}
