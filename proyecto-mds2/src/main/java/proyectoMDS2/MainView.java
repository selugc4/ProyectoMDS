package proyectoMDS2;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.spring.annotation.EnableVaadin;

import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iArtista;
import bds.iUsuario_registrado;
import clases.Actor_comun;
import clases.Administrador;
import clases.Artista;
import clases.Cibernauta;
import clases.Iniciar_sesion;
import clases.Usuario_registrado;
import clases.Ver_perfil_propio_de_artista;
import clases.Ver_perfil_propio_usuario_registrado;
import clases.Vista_administracion;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")

public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
	public static int usuario = 0;
	public static int ID;
	private iUsuario_registrado iur = new BDPrincipal();
	private iArtista iar = new BDPrincipal();
	private iActor_comun iac = new BDPrincipal();
    public MainView() {
    	this.getStyle().set("width", "100%");
    	Cibernauta ciber = new Cibernauta();
    	add(ciber);

    
    	Iniciar_sesion is = ciber.getCc().getIs();
    	is.getButtonLogin().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
    		@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(is.comprobarUsuario(is.getTfUsuario().getValue(), is.getTfPass().getValue())) {
					ciber.iniciarSesion();
					if(usuario == 0) {
						Usuario_registrado user = new Usuario_registrado(ID);
						user.vpp.botonsi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		 					
		 					@Override
		 					public void onComponentEvent(ClickEvent<Button> event) {
		 						if(Actor_comun.ID != 1) {
		 						user.vpp.darseBaja.close();
								remove(user);
								add(ciber);
		 						iur.Darse_de_baja(Ver_perfil_propio_usuario_registrado.correoantiguo);
		 						Notification.show("Dado de baja");
		 						}
		 					}
		 				});
						user.cur.getBotonLogout().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								remove(user);
								add(ciber);
							}
						});
						remove(ciber);				
						add(user);
						
					}else if(usuario == 1) {
						Artista artista = new Artista(ID);
						artista.vppa.botonsi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								if(Actor_comun.ID != 1) {
								artista.vppa.darseBaja.close();			
								remove(artista);
								add(ciber);
		 						iar.Darse_de_baja(Ver_perfil_propio_de_artista.correoantiguo);		
		 						Notification.show("Dado de baja");
							}
						}
						});
						artista.ca.getBotonLogout().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								remove(artista);
								add(ciber);
							}
						});
						remove(ciber);
						add(artista);
						
					}else if(usuario == 2) {
						Administrador admin = new Administrador(ID);	
						admin.cabadmin.getBotonLogout().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							@Override
								public void onComponentEvent(ClickEvent<Button> event) {
								remove(admin);
								add(ciber);
								}		
							});
						remove(ciber);
						add(admin);
					}else
						Notification.show("Usuario o contraseña incorrectos");
				
					is.getTfUsuario().clear();
					is.getTfPass().clear();
					
				}else
					Notification.show("Usuario o contraseña incorrectos");
				
			}
    	});		
	
    
//    
//      	Artista artista = new Artista(15);
//    	add(artista);
//    	
//    	Administrador admin = new Administrador(1);
//    	add(admin);
    	
//     	Usuario_registrado usuario = new Usuario_registrado(17);
//    	add(usuario);    
//		
//     	Usuario_registrado usuario = new Usuario_registrado(11);
//    	add(usuario);  
    }
//    	
  
    
		    	

}

