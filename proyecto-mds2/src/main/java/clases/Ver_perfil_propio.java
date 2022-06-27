package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iAdministrador;

public class Ver_perfil_propio extends vistas.VistaVer_perfil_propio {
//	private Image _foto;
//	private Label _nombre_Usuario;
//	private Label _seguidores;
//	private Label _seguidos;
//	private Label _numero_SeguidoresL;
//	private Label _numero_SeguidosL;
//	private Label _correoL;
//	private TextField _correoTF;
//	private Button _ver_Lista_Favoritos;
//	private Button _modificar_CorreoB;
//	private Button _cambiar_CorreoB;
//	public Cabecera_administrador _cabecera_administrador;
//	public Usuario _usuario;
//	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	public ContenedorAgregar_perfil_propio ca;
	public Ver_lista_de_reproduccion_propia vlpp;
	public static boolean correoexistente;
	public static int tipoUsuario;
	public static String correoantiguo;
	private iActor_comun iac = new BDPrincipal();
	private iAdministrador iad = new BDPrincipal();

	public Ver_perfil_propio(String name) {
		
	}
	
	public Ver_perfil_propio() {
		
	};

	public Ver_perfil_propio(int id) {
		inicializar();
		
		basededatos.Usuario usuario = iac.cargar_Perfil(id);
		this.tipoUsuario = usuario.getTipoUsuario();
		this.getImg().setSrc("imagenes/"+usuario.getContiene_imagen().getUrl());
		this.getLabel().setText(usuario.getNombre());
		this.getLabel1().setText("Seguidores: " +usuario.seguido.size());
		this.getLabel2().setText("Seguidos: " +usuario.seguidor_usuario.size());
		this.getVaadinTextField().setValue(usuario.getCorreo());
		correoantiguo = usuario.getCorreo();	
		this.ca = new ContenedorAgregar_perfil_propio();
		this.vlpp = new Ver_lista_de_reproduccion_propia(id);
		
		VerticalLayout vl = this.getVerticalSusListas().as(VerticalLayout.class);
		vl.add(ca);
		

		
		
		otrosClicks(id);
		clickCambiarCorreo();
		
		
	}

	protected void otrosClicks(int id) {
		ca.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Administrador.v1.removeAll();
				ca.cl = new Creacion_lista(id, 0);
				Administrador.v1.add(ca.cl);
				
			}
		});
		
		//FAVORITOS
		getVaadinButton5().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Administrador.v1.removeAll();
				Administrador.v1.add(vlpp);
				
			}
		});
		
		this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				getVaadinTextField().setReadOnly(false);
				getVaadinButton1().setVisible(true);
			}
		});
		
		
	}

	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		this.getVaadinButton4().setVisible(false);
		this.getVaadinTextField().setReadOnly(true);
		
	}
	protected void clickCambiarCorreo() {
		this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(comprobarCorreo(getVaadinTextField().getValue())) {
					iad.Modificar_Correo(correoantiguo, getVaadinTextField().getValue());
					if(correoexistente) {
						Notification.show("Correo ya eistente. Utilice otro.");
					}else {
					Notification.show("Correo cambiado");
					correoantiguo = getVaadinTextField().getValue();
					getVaadinTextField().setReadOnly(true);
					getVaadinButton1().setVisible(false);
					}
					
				}else {
					Notification.show("Escriba un correo válido");
				}
				
			}

			private boolean comprobarCorreo(String value) {
				String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
				Pattern pattern = Pattern.compile(regex);
				 
				  Matcher matcher = pattern.matcher(value);
				  return matcher.matches();
				  
				
			}
		});
	
		
	}
	//	public void Modificar_correo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_lista_favoritos() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void verListaFavoritos() {
//		throw new UnsupportedOperationException();
//	}
	public ContenedorAgregar_perfil_propio getContenedorAgregar_perfil_propio() {
		return ca;
	}
}