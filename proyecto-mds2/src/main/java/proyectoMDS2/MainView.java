package proyectoMDS2;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import clases.Administrador;
import clases.Artista;
import clases.Cibernauta;
import clases.Iniciar_sesion;
import clases.Usuario_registrado;

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
    public MainView() {
    	this.getStyle().set("width", "100%");
    /*	Cibernauta ciber = new Cibernauta();
    	add(ciber);
    	
    
    	Iniciar_sesion is = ciber.getCc().getIs();
    	is.getButtonLogin().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(is.comprobarUsuario(is.getTfUsuario().getValue(), is.getTfPass().getValue())) {
					if(is.getTfUsuario().getValue().equals("usuario")) {
						Usuario_registrado user = new Usuario_registrado();
						remove(ciber);
						add(user);
					}else if(is.getTfUsuario().getValue().equals("artista")) {
						Artista artista = new Artista();
						remove(ciber);
						add(artista);
					}else if(is.getTfUsuario().getValue().equals("admin")) {
						Administrador admin = new Administrador();
						remove(ciber);
						add(admin);
					}else
						Notification.show("Se ha producido un error");
				
					
				}else
					Notification.show("Se ha producido un error");
				
			}
		});
    }*/
    /*	Administrador admin = new Administrador();
    	add(admin);
		
		admin.getCc().getBotonLogout().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				remove(admin);
				add(new Cibernauta());
				
			}
			
		});
		*/
//     	Usuario_registrado usuario = new Usuario_registrado();
//    	add(usuario);    
    	
    	Artista artista = new Artista();
    	add(artista);
    }
		    	

}

