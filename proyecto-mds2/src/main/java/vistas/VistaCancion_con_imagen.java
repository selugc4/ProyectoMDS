package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cancion_con_imagen template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_con_imagen")
@JsModule("./vista-cancion_con_imagen.ts")
public class VistaCancion_con_imagen extends LitTemplate {

    @Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("img")
	private Image img;
	@Id("label3")
	private Label label3;
	@Id("label2")
	private Label label2;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon")
	private Element ironIcon;
	/**
     * Creates a new VistaCancion_con_imagen.
     */
    public VistaCancion_con_imagen() {
        // You can initialise any data required for the connected UI components here.
    }
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public Label getLabel1() {
		return label1;
	}
	public void setLabel1(Label label1) {
		this.label1 = label1;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public Label getLabel3() {
		return label3;
	}
	public void setLabel3(Label label3) {
		this.label3 = label3;
	}
	public Label getLabel2() {
		return label2;
	}
	public void setLabel2(Label label2) {
		this.label2 = label2;
	}
	public Button getVaadinButton() {
		return vaadinButton;
	}
	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
	public Element getIronIcon() {
		return ironIcon;
	}
	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}

}
