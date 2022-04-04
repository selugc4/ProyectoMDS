package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-notificacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificacion")
@JsModule("./vista-notificacion.ts")
public class VistaNotificacion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label")
	private Label label;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon")
	private Element ironIcon;

	/**
     * Creates a new VistaNotificacion.
     */
    public VistaNotificacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
