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
 * A Designer generated component for the vista-lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion")
@JsModule("./vista-lista_de_reproduccion.ts")
public class VistaLista_de_reproduccion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinButton2")
	private Button vaadinButton2;

	/**
     * Creates a new VistaLista_de_reproduccion.
     */
    public VistaLista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
