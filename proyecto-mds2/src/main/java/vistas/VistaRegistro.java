package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registro")
@JsModule("./vista-registro.ts")
public class VistaRegistro extends LitTemplate {

  

	@Id("verticalPrincipal")
	private Element verticalPrincipal;
	@Id("verticalContenedor")
	private Element verticalContenedor;
	@Id("horizontalTitulo")
	private HorizontalLayout horizontalTitulo;
	@Id("tituloRegistro")
	private Label tituloRegistro;
	@Id("horizontalEmail")
	private HorizontalLayout horizontalEmail;
	@Id("labelEmail")
	private Label labelEmail;
	@Id("tfemail")
	private TextField tfemail;
	@Id("horizontalUsuario")
	private HorizontalLayout horizontalUsuario;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("tfusuario")
	private TextField tfusuario;
	@Id("vertticalMalsonantes")
	private Element vertticalMalsonantes;
	@Id("labelMalsonante1")
	private Label labelMalsonante1;
	@Id("labelMalsonante2")
	private Label labelMalsonante2;
	@Id("labelMalsonante3")
	private Label labelMalsonante3;
	@Id("horizontalcontrasena")
	private HorizontalLayout horizontalcontrasena;
	@Id("labelPass")
	private Label labelPass;
	@Id("verticalcaracteres")
	private Element verticalcaracteres;
	@Id("horizontalcarac1")
	private HorizontalLayout horizontalcarac1;
	@Id("tfcontrasena1")
	private PasswordField tfcontrasena1;
	@Id("labelcaracteres1")
	private Label labelcaracteres1;
	@Id("horizontalcarac2")
	private HorizontalLayout horizontalcarac2;
	@Id("labelcaracteres11")
	private Label labelcaracteres11;
	@Id("verticalSeguridad")
	private Element verticalSeguridad;
	@Id("horizontalbarra")
	private HorizontalLayout horizontalbarra;
	@Id("vaadinProgressBar")
	private ProgressBar vaadinProgressBar;
	@Id("horizontalNivel")
	private HorizontalLayout horizontalNivel;
	@Id("NivelSec")
	private Label nivelSec;
	@Id("horizontalccontrasena")
	private HorizontalLayout horizontalccontrasena;
	@Id("labelConfPass")
	private Label labelConfPass;
	@Id("tfccontrasena")
	private PasswordField tfccontrasena;
	@Id("horizontalFoto")
	private HorizontalLayout horizontalFoto;
	@Id("labelfoto")
	private Label labelfoto;
	@Id("horizontalUpload")
	private HorizontalLayout horizontalUpload;
	@Id("vaadinUpload")
	private Upload vaadinUpload;
	@Id("horizontalimg")
	private HorizontalLayout horizontalimg;
	@Id("img")
	private Image img;
	@Id("horizontalRegistrarse")
	private HorizontalLayout horizontalRegistrarse;
	@Id("botonRegistro")
	private Button botonRegistro;
	@Id("horizontalAtras")
	private HorizontalLayout horizontalAtras;
	@Id("botonVolver")
	private Button botonVolver;
	/**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalPrincipal() {
		return verticalPrincipal;
	}

	public void setVerticalPrincipal(Element verticalPrincipal) {
		this.verticalPrincipal = verticalPrincipal;
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

	public Label getTituloRegistro() {
		return tituloRegistro;
	}

	public void setTituloRegistro(Label tituloRegistro) {
		this.tituloRegistro = tituloRegistro;
	}

	public HorizontalLayout getHorizontalEmail() {
		return horizontalEmail;
	}

	public void setHorizontalEmail(HorizontalLayout horizontalEmail) {
		this.horizontalEmail = horizontalEmail;
	}

	public Label getLabelEmail() {
		return labelEmail;
	}

	public void setLabelEmail(Label labelEmail) {
		this.labelEmail = labelEmail;
	}

	public TextField getTfemail() {
		return tfemail;
	}

	public void setTfemail(TextField tfemail) {
		this.tfemail = tfemail;
	}

	public HorizontalLayout getHorizontalUsuario() {
		return horizontalUsuario;
	}

	public void setHorizontalUsuario(HorizontalLayout horizontalUsuario) {
		this.horizontalUsuario = horizontalUsuario;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public TextField getTfusuario() {
		return tfusuario;
	}

	public void setTfusuario(TextField tfusuario) {
		this.tfusuario = tfusuario;
	}

	public Element getVertticalMalsonantes() {
		return vertticalMalsonantes;
	}

	public void setVertticalMalsonantes(Element vertticalMalsonantes) {
		this.vertticalMalsonantes = vertticalMalsonantes;
	}

	public Label getLabelMalsonante1() {
		return labelMalsonante1;
	}

	public void setLabelMalsonante1(Label labelMalsonante1) {
		this.labelMalsonante1 = labelMalsonante1;
	}

	public Label getLabelMalsonante2() {
		return labelMalsonante2;
	}

	public void setLabelMalsonante2(Label labelMalsonante2) {
		this.labelMalsonante2 = labelMalsonante2;
	}

	public Label getLabelMalsonante3() {
		return labelMalsonante3;
	}

	public void setLabelMalsonante3(Label labelMalsonante3) {
		this.labelMalsonante3 = labelMalsonante3;
	}

	public HorizontalLayout getHorizontalcontrasena() {
		return horizontalcontrasena;
	}

	public void setHorizontalcontrasena(HorizontalLayout horizontalcontrasena) {
		this.horizontalcontrasena = horizontalcontrasena;
	}

	public Label getLabelPass() {
		return labelPass;
	}

	public void setLabelPass(Label labelPass) {
		this.labelPass = labelPass;
	}

	public Element getVerticalcaracteres() {
		return verticalcaracteres;
	}

	public void setVerticalcaracteres(Element verticalcaracteres) {
		this.verticalcaracteres = verticalcaracteres;
	}

	public HorizontalLayout getHorizontalcarac1() {
		return horizontalcarac1;
	}

	public void setHorizontalcarac1(HorizontalLayout horizontalcarac1) {
		this.horizontalcarac1 = horizontalcarac1;
	}

	public PasswordField getTfcontrasena1() {
		return tfcontrasena1;
	}

	public void setTfcontrasena1(PasswordField tfcontrasena1) {
		this.tfcontrasena1 = tfcontrasena1;
	}

	public Label getLabelcaracteres1() {
		return labelcaracteres1;
	}

	public void setLabelcaracteres1(Label labelcaracteres1) {
		this.labelcaracteres1 = labelcaracteres1;
	}

	public HorizontalLayout getHorizontalcarac2() {
		return horizontalcarac2;
	}

	public void setHorizontalcarac2(HorizontalLayout horizontalcarac2) {
		this.horizontalcarac2 = horizontalcarac2;
	}

	public Label getLabelcaracteres11() {
		return labelcaracteres11;
	}

	public void setLabelcaracteres11(Label labelcaracteres11) {
		this.labelcaracteres11 = labelcaracteres11;
	}

	public Element getVerticalSeguridad() {
		return verticalSeguridad;
	}

	public void setVerticalSeguridad(Element verticalSeguridad) {
		this.verticalSeguridad = verticalSeguridad;
	}

	public HorizontalLayout getHorizontalbarra() {
		return horizontalbarra;
	}

	public void setHorizontalbarra(HorizontalLayout horizontalbarra) {
		this.horizontalbarra = horizontalbarra;
	}

	public ProgressBar getVaadinProgressBar() {
		return vaadinProgressBar;
	}

	public void setVaadinProgressBar(ProgressBar vaadinProgressBar) {
		this.vaadinProgressBar = vaadinProgressBar;
	}

	public HorizontalLayout getHorizontalNivel() {
		return horizontalNivel;
	}

	public void setHorizontalNivel(HorizontalLayout horizontalNivel) {
		this.horizontalNivel = horizontalNivel;
	}

	public Label getNivelSec() {
		return nivelSec;
	}

	public void setNivelSec(Label nivelSec) {
		this.nivelSec = nivelSec;
	}

	public HorizontalLayout getHorizontalccontrasena() {
		return horizontalccontrasena;
	}

	public void setHorizontalccontrasena(HorizontalLayout horizontalccontrasena) {
		this.horizontalccontrasena = horizontalccontrasena;
	}

	public Label getLabelConfPass() {
		return labelConfPass;
	}

	public void setLabelConfPass(Label labelConfPass) {
		this.labelConfPass = labelConfPass;
	}

	public PasswordField getTfccontrasena() {
		return tfccontrasena;
	}

	public void setTfccontrasena(PasswordField tfccontrasena) {
		this.tfccontrasena = tfccontrasena;
	}

	public HorizontalLayout getHorizontalFoto() {
		return horizontalFoto;
	}

	public void setHorizontalFoto(HorizontalLayout horizontalFoto) {
		this.horizontalFoto = horizontalFoto;
	}

	public Label getLabelfoto() {
		return labelfoto;
	}

	public void setLabelfoto(Label labelfoto) {
		this.labelfoto = labelfoto;
	}

	public HorizontalLayout getHorizontalUpload() {
		return horizontalUpload;
	}

	public void setHorizontalUpload(HorizontalLayout horizontalUpload) {
		this.horizontalUpload = horizontalUpload;
	}

	public Upload getVaadinUpload() {
		return vaadinUpload;
	}

	public void setVaadinUpload(Upload vaadinUpload) {
		this.vaadinUpload = vaadinUpload;
	}

	public HorizontalLayout getHorizontalimg() {
		return horizontalimg;
	}

	public void setHorizontalimg(HorizontalLayout horizontalimg) {
		this.horizontalimg = horizontalimg;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	

	public HorizontalLayout getHorizontalRegistrarse() {
		return horizontalRegistrarse;
	}

	public void setHorizontalRegistrarse(HorizontalLayout horizontalRegistrarse) {
		this.horizontalRegistrarse = horizontalRegistrarse;
	}

	public Button getBotonRegistro() {
		return botonRegistro;
	}

	public void setBotonRegistro(Button botonRegistro) {
		this.botonRegistro = botonRegistro;
	}

	public HorizontalLayout getHorizontalAtras() {
		return horizontalAtras;
	}

	public void setHorizontalAtras(HorizontalLayout horizontalAtras) {
		this.horizontalAtras = horizontalAtras;
	}

	public Button getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(Button botonVolver) {
		this.botonVolver = botonVolver;
	}

	

}
