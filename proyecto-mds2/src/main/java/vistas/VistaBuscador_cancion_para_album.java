package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-buscador_cancion_para_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador_cancion_para_album")
@JsModule("./vista-buscador_cancion_para_album.ts")
public class VistaBuscador_cancion_para_album extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("ironIcon")
	private Element ironIcon;
	/**
     * Creates a new VistaBuscador_cancion_para_album.
     */
    public VistaBuscador_cancion_para_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
