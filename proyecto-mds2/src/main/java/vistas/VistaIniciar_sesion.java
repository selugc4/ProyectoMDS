package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion")
@JsModule("./vista-iniciar_sesion.ts")
public class VistaIniciar_sesion extends LitTemplate {

	@Id("verticalContenedor")
	private Element verticalContenedor;
	@Id("vertical")
	private Element vertical;
	@Id("horizontalTitulo")
	private HorizontalLayout horizontalTitulo;
	@Id("labelTitulo")
	private Label labelTitulo;
	@Id("tfUsuario")
	private TextField tfUsuario;
	@Id("horizontalPass")
	private HorizontalLayout horizontalPass;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("horizontalLogin")
	private HorizontalLayout horizontalLogin;
	@Id("imgGoogle")
	private Image imgGoogle;
	@Id("imgFace")
	private Image imgFace;
	@Id("imgApple")
	private Image imgApple;
	@Id("buttonLogin")
	private Button buttonLogin;
	@Id("horizontalRecuperar")
	private HorizontalLayout horizontalRecuperar;
	@Id("labelRecuperar")
	private Label labelRecuperar;
	@Id("botonRecuperar")
	private Button botonRecuperar;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("labelRegistro")
	private Label labelRegistro;
	@Id("botonRegistro")
	private Button botonRegistro;
	@Id("botonVolver")
	private Button botonVolver;
	@Id("tfPass")
	private PasswordField tfPass;
	@Id("labelPass")
	private Label labelPass;
	public Element getVerticalContenedor() {
		return verticalContenedor;
	}
	public Element getVertical() {
		return vertical;
	}
	public HorizontalLayout getHorizontalTitulo() {
		return horizontalTitulo;
	}
	public Label getLabelTitulo() {
		return labelTitulo;
	}
	public Label getLabelPass() {
		return labelPass;
	}
	public TextField getTfUsuario() {
		return tfUsuario;
	}
	public HorizontalLayout getHorizontalPass() {
		return horizontalPass;
	}
	public Label getLabelUsuario() {
		return labelUsuario;
	}
	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}
	public HorizontalLayout getHorizontalLogin() {
		return horizontalLogin;
	}
	public Image getImgGoogle() {
		return imgGoogle;
	}
	public Image getImgFace() {
		return imgFace;
	}
	public Image getImgApple() {
		return imgApple;
	}
	public Button getButtonLogin() {
		return buttonLogin;
	}
	public HorizontalLayout getHorizontalRecuperar() {
		return horizontalRecuperar;
	}
	public Label getLabelRecuperar() {
		return labelRecuperar;
	}
	public Button getBotonRecuperar() {
		return botonRecuperar;
	}
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public Label getLabelRegistro() {
		return labelRegistro;
	}
	public Button getBotonRegistro() {
		return botonRegistro;
	}
	public Button getBotonVolver() {
		return botonVolver;
	}
	public PasswordField getTfPass() {
		return tfPass;
	}
	public void setTfPass(PasswordField tfPass) {
		this.tfPass = tfPass;
	}

	
	

}
