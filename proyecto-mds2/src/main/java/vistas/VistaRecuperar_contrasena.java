package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-recuperar_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperar_contrasena")
@JsModule("./vista-recuperar_contrasena.ts")
public class VistaRecuperar_contrasena extends LitTemplate {

    @Id("vertical")
	private Element vertical;
	@Id("verticalCotenedor")
	private Element verticalCotenedor;
	@Id("horizontalTitulo")
	private HorizontalLayout horizontalTitulo;
	@Id("labelTitulo")
	private Label labelTitulo;
	@Id("horizontalCorreo")
	private HorizontalLayout horizontalCorreo;
	@Id("labelCorreo")
	private Label labelCorreo;
	@Id("tfCorreo")
	private TextField tfCorreo;
	@Id("horizontalBotones")
	private HorizontalLayout horizontalBotones;
	@Id("botonVolver")
	private Button botonVolver;
	@Id("botonConfirmar")
	private Button botonConfirmar;

	/**
     * Creates a new VistaRecuperar_contrasena.
     */
    public VistaRecuperar_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVertical() {
		return vertical;
	}

	public void setVertical(Element vertical) {
		this.vertical = vertical;
	}

	public Element getVerticalCotenedor() {
		return verticalCotenedor;
	}

	public void setVerticalCotenedor(Element verticalCotenedor) {
		this.verticalCotenedor = verticalCotenedor;
	}

	public HorizontalLayout getHorizontalTitulo() {
		return horizontalTitulo;
	}

	public void setHorizontalTitulo(HorizontalLayout horizontalTitulo) {
		this.horizontalTitulo = horizontalTitulo;
	}

	public Label getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(Label labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public HorizontalLayout getHorizontalCorreo() {
		return horizontalCorreo;
	}

	public void setHorizontalCorreo(HorizontalLayout horizontalCorreo) {
		this.horizontalCorreo = horizontalCorreo;
	}

	public Label getLabelCorreo() {
		return labelCorreo;
	}

	public void setLabelCorreo(Label labelCorreo) {
		this.labelCorreo = labelCorreo;
	}

	public TextField getTfCorreo() {
		return tfCorreo;
	}

	public void setTfCorreo(TextField tfCorreo) {
		this.tfCorreo = tfCorreo;
	}

	public HorizontalLayout getHorizontalBotones() {
		return horizontalBotones;
	}

	public void setHorizontalBotones(HorizontalLayout horizontalBotones) {
		this.horizontalBotones = horizontalBotones;
	}

	public Button getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(Button botonVolver) {
		this.botonVolver = botonVolver;
	}

	public Button getBotonConfirmar() {
		return botonConfirmar;
	}

	public void setBotonConfirmar(Button botonConfirmar) {
		this.botonConfirmar = botonConfirmar;
	}

	

}
