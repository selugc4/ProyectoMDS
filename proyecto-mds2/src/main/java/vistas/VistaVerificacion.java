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
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-verificacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verificacion")
@JsModule("./vista-verificacion.ts")
public class VistaVerificacion extends LitTemplate {

	@Id("vertical")
	private Element vertical;
	@Id("verticalContenedor")
	private Element verticalContenedor;
	@Id("horizontalTitulo")
	private HorizontalLayout horizontalTitulo;
	@Id("labelTitulo")
	private Label labelTitulo;
	@Id("verticalDescripciones")
	private Element verticalDescripciones;
	@Id("horizontalDesc1")
	private HorizontalLayout horizontalDesc1;
	@Id("labelDesc1")
	private Label labelDesc1;
	@Id("horizontalDesc2")
	private HorizontalLayout horizontalDesc2;
	@Id("labelDesc2")
	private Label labelDesc2;
	@Id("horizontalCodigo")
	private HorizontalLayout horizontalCodigo;
	@Id("labelCodigo")
	private Label labelCodigo;
	@Id("tfCodigo")
	private TextField tfCodigo;
	@Id("botonVolverEnviar")
	private Button botonVolverEnviar;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("botonVolver")
	private Button botonVolver;
	@Id("botonAceptar")
	private Button botonAceptar;
	@Id("botonCContrasena")
	private Button botonCContrasena;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	public Element getVertical() {
		return vertical;
	}
	public void setVertical(Element vertical) {
		this.vertical = vertical;
	}
	public Element getVerticalContenedor() {
		return verticalContenedor;
	}
	public void setVerticalContenedor(Element verticalContenedor) {
		this.verticalContenedor = verticalContenedor;
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
	public Element getVerticalDescripciones() {
		return verticalDescripciones;
	}
	public void setVerticalDescripciones(Element verticalDescripciones) {
		this.verticalDescripciones = verticalDescripciones;
	}
	public HorizontalLayout getHorizontalDesc1() {
		return horizontalDesc1;
	}
	public void setHorizontalDesc1(HorizontalLayout horizontalDesc1) {
		this.horizontalDesc1 = horizontalDesc1;
	}
	public Label getLabelDesc1() {
		return labelDesc1;
	}
	public void setLabelDesc1(Label labelDesc1) {
		this.labelDesc1 = labelDesc1;
	}
	public HorizontalLayout getHorizontalDesc2() {
		return horizontalDesc2;
	}
	public void setHorizontalDesc2(HorizontalLayout horizontalDesc2) {
		this.horizontalDesc2 = horizontalDesc2;
	}
	public Label getLabelDesc2() {
		return labelDesc2;
	}
	public void setLabelDesc2(Label labelDesc2) {
		this.labelDesc2 = labelDesc2;
	}
	public HorizontalLayout getHorizontalCodigo() {
		return horizontalCodigo;
	}
	public void setHorizontalCodigo(HorizontalLayout horizontalCodigo) {
		this.horizontalCodigo = horizontalCodigo;
	}
	public Label getLabelCodigo() {
		return labelCodigo;
	}
	public void setLabelCodigo(Label labelCodigo) {
		this.labelCodigo = labelCodigo;
	}
	public TextField getTfCodigo() {
		return tfCodigo;
	}
	public void setTfCodigo(TextField tfCodigo) {
		this.tfCodigo = tfCodigo;
	}
	public Button getBotonVolverEnviar() {
		return botonVolverEnviar;
	}
	public void setBotonVolverEnviar(Button botonVolverEnviar) {
		this.botonVolverEnviar = botonVolverEnviar;
	}
	public HorizontalLayout getVaadinHorizontalLayout6() {
		return vaadinHorizontalLayout6;
	}
	public void setVaadinHorizontalLayout6(HorizontalLayout vaadinHorizontalLayout6) {
		this.vaadinHorizontalLayout6 = vaadinHorizontalLayout6;
	}
	public Button getBotonVolver() {
		return botonVolver;
	}
	public void setBotonVolver(Button botonVolver) {
		this.botonVolver = botonVolver;
	}
	public Button getBotonAceptar() {
		return botonAceptar;
	}
	public void setBotonAceptar(Button botonAceptar) {
		this.botonAceptar = botonAceptar;
	}
	public Button getBotonCContrasena() {
		return botonCContrasena;
	}
	public void setBotonCContrasena(Button botonCContrasena) {
		this.botonCContrasena = botonCContrasena;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	
    
}
