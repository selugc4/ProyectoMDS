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
 * A Designer generated component for the vista-lista_de_reproduccion_buscador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_buscador")
@JsModule("./vista-lista_de_reproduccion_buscador.ts")
public class VistaLista_de_reproduccion_buscador extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaLista_de_reproduccion_buscador.
     */
    public VistaLista_de_reproduccion_buscador() {
        // You can initialise any data required for the connected UI components here.
    }

}
