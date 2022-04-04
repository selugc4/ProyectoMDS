package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-agregar_evento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregar_evento")
@JsModule("./vista-agregar_evento.ts")
public class VistaAgregar_evento extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label1")
	private Label label1;
	@Id("vaadinSelect")
	private Select vaadinSelect;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;

	/**
     * Creates a new VistaAgregar_evento.
     */
    public VistaAgregar_evento() {
        // You can initialise any data required for the connected UI components here.
    }

}
