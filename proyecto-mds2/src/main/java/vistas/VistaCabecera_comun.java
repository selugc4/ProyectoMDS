package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cabecera_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_comun")
@JsModule("./vista-cabecera_comun.ts")
public class VistaCabecera_comun extends LitTemplate {

	@Id("vertical")
	private Element vertical;
	@Id("horizontalContenedor")
	private HorizontalLayout horizontalContenedor;
	@Id("horizontalFoto")
	private HorizontalLayout horizontalFoto;
	@Id("img")
	private Image img;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("label1")
	private Label label1;
	@Id("label")
	private Label label;
	@Id("label2")
	private Label label2;
	@Id("horizontalExplorador")
	private HorizontalLayout horizontalExplorador;
	@Id("tfBusqueda")
	private TextField tfBusqueda;
	@Id("horizontalBusqueda")
	private HorizontalLayout horizontalBusqueda;
	@Id("iconoBusqueda")
	private Element iconoBusqueda;
	@Id("horizontalBotones")
	private HorizontalLayout horizontalBotones;
	@Id("botonAdmin")
	private Button botonAdmin;
	@Id("botonNotificaciones")
	private Button botonNotificaciones;
	@Id("ironIcon1")
	private Element ironIcon1;
	@Id("botonPerfil")
	private Button botonPerfil;
	@Id("ironIcon2")
	private Element ironIcon2;
	@Id("botonLogout")
	private Button botonLogout;
	/**
     * Creates a new VistaCabecera_comun.
     */
    public VistaCabecera_comun() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVertical() {
		return vertical;
	}
	public void setVertical(Element vertical) {
		this.vertical = vertical;
	}
	public HorizontalLayout getHorizontalContenedor() {
		return horizontalContenedor;
	}
	public void setHorizontalContenedor(HorizontalLayout horizontalContenedor) {
		this.horizontalContenedor = horizontalContenedor;
	}
	public HorizontalLayout getHorizontalFoto() {
		return horizontalFoto;
	}
	public void setHorizontalFoto(HorizontalLayout horizontalFoto) {
		this.horizontalFoto = horizontalFoto;
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}
	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}
	public Label getLabel1() {
		return label1;
	}
	public void setLabel1(Label label1) {
		this.label1 = label1;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public Label getLabel2() {
		return label2;
	}
	public void setLabel2(Label label2) {
		this.label2 = label2;
	}
	public HorizontalLayout getHorizontalExplorador() {
		return horizontalExplorador;
	}
	public void setHorizontalExplorador(HorizontalLayout horizontalExplorador) {
		this.horizontalExplorador = horizontalExplorador;
	}
	public TextField getTfBusqueda() {
		return tfBusqueda;
	}
	public void setTfBusqueda(TextField tfBusqueda) {
		this.tfBusqueda = tfBusqueda;
	}
	public HorizontalLayout getHorizontalBusqueda() {
		return horizontalBusqueda;
	}
	public void setHorizontalBusqueda(HorizontalLayout horizontalBusqueda) {
		this.horizontalBusqueda = horizontalBusqueda;
	}
	public Element getIconoBusqueda() {
		return iconoBusqueda;
	}
	public void setIconoBusqueda(Element iconoBusqueda) {
		this.iconoBusqueda = iconoBusqueda;
	}
	public HorizontalLayout getHorizontalBotones() {
		return horizontalBotones;
	}
	public void setHorizontalBotones(HorizontalLayout horizontalBotones) {
		this.horizontalBotones = horizontalBotones;
	}
	public Button getBotonAdmin() {
		return botonAdmin;
	}
	public void setBotonAdmin(Button botonAdmin) {
		this.botonAdmin = botonAdmin;
	}
	public Button getBotonNotificaciones() {
		return botonNotificaciones;
	}
	public void setBotonNotificaciones(Button botonNotificaciones) {
		this.botonNotificaciones = botonNotificaciones;
	}
	public Element getIronIcon1() {
		return ironIcon1;
	}
	public void setIronIcon1(Element ironIcon1) {
		this.ironIcon1 = ironIcon1;
	}
	public Button getBotonPerfil() {
		return botonPerfil;
	}
	public void setBotonPerfil(Button botonPerfil) {
		this.botonPerfil = botonPerfil;
	}
	public Element getIronIcon2() {
		return ironIcon2;
	}
	public void setIronIcon2(Element ironIcon2) {
		this.ironIcon2 = ironIcon2;
	}
	public Button getBotonLogout() {
		return botonLogout;
	}
	public void setBotonLogout(Button botonLogout) {
		this.botonLogout = botonLogout;
	}
	

}
