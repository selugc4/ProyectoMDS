package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_perfil_propio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_perfil_propio")
@JsModule("./vista-listas_de_reproduccion_perfil_propio.ts")
public class VistaListas_de_reproduccion_perfil_propio extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;

	/**
     * Creates a new VistaListas_de_reproduccion_perfil_propio.
     */
    public VistaListas_de_reproduccion_perfil_propio() {
        // You can initialise any data required for the connected UI components here.
    }

}
