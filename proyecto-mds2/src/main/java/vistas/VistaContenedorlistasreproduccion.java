package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-contenedorlistasreproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contenedorlistasreproduccion")
@JsModule("./vista-contenedorlistasreproduccion.ts")
public class VistaContenedorlistasreproduccion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinScroller")
	private Scroller vaadinScroller;

	/**
     * Creates a new VistaContenedorlistasreproduccion.
     */
    public VistaContenedorlistasreproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
