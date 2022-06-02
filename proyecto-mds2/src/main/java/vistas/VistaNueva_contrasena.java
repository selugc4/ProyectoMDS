package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-nueva_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nueva_contrasena")
@JsModule("./vista-nueva_contrasena.ts")
public class VistaNueva_contrasena extends LitTemplate {

    @Id("vertical")
	private Element vertical;
	@Id("verticalContenedor")
	private Element verticalContenedor;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("labelTitulo")
	private Label labelTitulo;
	@Id("horizontalPass")
	private HorizontalLayout horizontalPass;
	@Id("labelPass")
	private Label labelPass;
	@Id("tfPass")
	private PasswordField tfPass;
	@Id("horizontalBarra")
	private HorizontalLayout horizontalBarra;
	@Id("vaadinProgressBar")
	private ProgressBar vaadinProgressBar;
	@Id("horizontalSec")
	private HorizontalLayout horizontalSec;
	@Id("labelSec1")
	private Label labelSec1;
	@Id("labelCC")
	private Label labelCC;
	@Id("horizontalCC")
	private HorizontalLayout horizontalCC;
	@Id("tfPassC")
	private PasswordField tfPassC;
	@Id("horizontalCaracteres")
	private HorizontalLayout horizontalCaracteres;
	@Id("verticalIzquierdo")
	private Element verticalIzquierdo;
	@Id("horizontalIzq1")
	private HorizontalLayout horizontalIzq1;
	@Id("labelIzq1")
	private Label labelIzq1;
	@Id("horizontalIzq2")
	private HorizontalLayout horizontalIzq2;
	@Id("labelIzq2")
	private Label labelIzq2;
	@Id("horizontalIzq3")
	private HorizontalLayout horizontalIzq3;
	@Id("verticalDcha")
	private Element verticalDcha;
	@Id("labelIzq3")
	private Label labelIzq3;
	@Id("horizontalDcha1")
	private HorizontalLayout horizontalDcha1;
	@Id("horizontalDcha2")
	private HorizontalLayout horizontalDcha2;
	@Id("labelDcha1")
	private Label labelDcha1;
	@Id("botonVolver")
	private Button botonVolver;
	@Id("horizontalBoton")
	private HorizontalLayout horizontalBoton;
	@Id("labelDcha2")
	private Label labelDcha2;
	@Id("botonConfirmar")
	private Button botonConfirmar;
	/**
     * Creates a new VistaNueva_contrasena.
     */
    public VistaNueva_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }
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
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Label getLabelTitulo() {
		return labelTitulo;
	}
	public void setLabelTitulo(Label labelTitulo) {
		this.labelTitulo = labelTitulo;
	}
	public HorizontalLayout getHorizontalPass() {
		return horizontalPass;
	}
	public void setHorizontalPass(HorizontalLayout horizontalPass) {
		this.horizontalPass = horizontalPass;
	}
	public Label getLabelPass() {
		return labelPass;
	}
	public void setLabelPass(Label labelPass) {
		this.labelPass = labelPass;
	}
	public PasswordField getTfPass() {
		return tfPass;
	}
	public void setTfPass(PasswordField tfPass) {
		this.tfPass = tfPass;
	}
	public HorizontalLayout getHorizontalBarra() {
		return horizontalBarra;
	}
	public void setHorizontalBarra(HorizontalLayout horizontalBarra) {
		this.horizontalBarra = horizontalBarra;
	}
	public ProgressBar getVaadinProgressBar() {
		return vaadinProgressBar;
	}
	public void setVaadinProgressBar(ProgressBar vaadinProgressBar) {
		this.vaadinProgressBar = vaadinProgressBar;
	}
	public HorizontalLayout getHorizontalSec() {
		return horizontalSec;
	}
	public void setHorizontalSec(HorizontalLayout horizontalSec) {
		this.horizontalSec = horizontalSec;
	}
	public Label getLabelSec1() {
		return labelSec1;
	}
	public void setLabelSec1(Label labelSec1) {
		this.labelSec1 = labelSec1;
	}
	public Label getLabelCC() {
		return labelCC;
	}
	public void setLabelCC(Label labelCC) {
		this.labelCC = labelCC;
	}
	public HorizontalLayout getHorizontalCC() {
		return horizontalCC;
	}
	public void setHorizontalCC(HorizontalLayout horizontalCC) {
		this.horizontalCC = horizontalCC;
	}
	public PasswordField getTfPassC() {
		return tfPassC;
	}
	public void setTfPassC(PasswordField tfPassC) {
		this.tfPassC = tfPassC;
	}
	public HorizontalLayout getHorizontalCaracteres() {
		return horizontalCaracteres;
	}
	public void setHorizontalCaracteres(HorizontalLayout horizontalCaracteres) {
		this.horizontalCaracteres = horizontalCaracteres;
	}
	public Element getVerticalIzquierdo() {
		return verticalIzquierdo;
	}
	public void setVerticalIzquierdo(Element verticalIzquierdo) {
		this.verticalIzquierdo = verticalIzquierdo;
	}
	public HorizontalLayout getHorizontalIzq1() {
		return horizontalIzq1;
	}
	public void setHorizontalIzq1(HorizontalLayout horizontalIzq1) {
		this.horizontalIzq1 = horizontalIzq1;
	}
	public Label getLabelIzq1() {
		return labelIzq1;
	}
	public void setLabelIzq1(Label labelIzq1) {
		this.labelIzq1 = labelIzq1;
	}
	public HorizontalLayout getHorizontalIzq2() {
		return horizontalIzq2;
	}
	public void setHorizontalIzq2(HorizontalLayout horizontalIzq2) {
		this.horizontalIzq2 = horizontalIzq2;
	}
	public Label getLabelIzq2() {
		return labelIzq2;
	}
	public void setLabelIzq2(Label labelIzq2) {
		this.labelIzq2 = labelIzq2;
	}
	public HorizontalLayout getHorizontalIzq3() {
		return horizontalIzq3;
	}
	public void setHorizontalIzq3(HorizontalLayout horizontalIzq3) {
		this.horizontalIzq3 = horizontalIzq3;
	}
	public Element getVerticalDcha() {
		return verticalDcha;
	}
	public void setVerticalDcha(Element verticalDcha) {
		this.verticalDcha = verticalDcha;
	}
	public Label getLabelIzq3() {
		return labelIzq3;
	}
	public void setLabelIzq3(Label labelIzq3) {
		this.labelIzq3 = labelIzq3;
	}
	public HorizontalLayout getHorizontalDcha1() {
		return horizontalDcha1;
	}
	public void setHorizontalDcha1(HorizontalLayout horizontalDcha1) {
		this.horizontalDcha1 = horizontalDcha1;
	}
	public HorizontalLayout getHorizontalDcha2() {
		return horizontalDcha2;
	}
	public void setHorizontalDcha2(HorizontalLayout horizontalDcha2) {
		this.horizontalDcha2 = horizontalDcha2;
	}
	public Label getLabelDcha1() {
		return labelDcha1;
	}
	public void setLabelDcha1(Label labelDcha1) {
		this.labelDcha1 = labelDcha1;
	}
	public Button getBotonVolver() {
		return botonVolver;
	}
	public void setBotonVolver(Button botonVolver) {
		this.botonVolver = botonVolver;
	}
	public HorizontalLayout getHorizontalBoton() {
		return horizontalBoton;
	}
	public void setHorizontalBoton(HorizontalLayout horizontalBoton) {
		this.horizontalBoton = horizontalBoton;
	}
	public Label getLabelDcha2() {
		return labelDcha2;
	}
	public void setLabelDcha2(Label labelDcha2) {
		this.labelDcha2 = labelDcha2;
	}
	public Button getBotonConfirmar() {
		return botonConfirmar;
	}
	public void setBotonConfirmar(Button botonConfirmar) {
		this.botonConfirmar = botonConfirmar;
	}
	

}
