package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-cancion_para_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_para_album")
@JsModule("./vista-cancion_para_album.ts")
public class VistaCancion_para_album extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label")
	private Label label;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("img")
	private Image img;

	/**
     * Creates a new VistaCancion_para_album.
     */
    public VistaCancion_para_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
