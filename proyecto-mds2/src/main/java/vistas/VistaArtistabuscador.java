package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-artistabuscador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistabuscador")
@JsModule("./vista-artistabuscador.ts")
public class VistaArtistabuscador extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("img")
	private Image img;
	@Id("label")
	private Label label;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;

	/**
     * Creates a new VistaArtistabuscador.
     */
    public VistaArtistabuscador() {
        // You can initialise any data required for the connected UI components here.
    }

}
