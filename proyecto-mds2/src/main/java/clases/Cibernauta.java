package clases;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cibernauta extends vistas.VistaCibernauta {
//	public Cabecera_cibernauta _cabecera_cibernauta;
//	public Reproductor_canciones_simple _reproductor_canciones_simple;
//	public Ultimos_exitos _ultimos_exitos;
	
	public Cabecera_cibernauta cc = new Cabecera_cibernauta();
	public Ultimos_exitos ue= new Ultimos_exitos();
	public static Reproductor_canciones_simple rcs = new Reproductor_canciones_simple();
	public Cibernauta() {
		this.getStyle().set("width", "100%");
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		v1.add(cc);
		v1.add(ue);
		v1.add(rcs);
		
		
		cc.getVaadinHorizontalLayout1().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(ue);
				v1.add(rcs);
				
			}
		}); 
			
		
		//REGISTRO
		cc.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cc.getReg());
				v1.addAndExpand(cc, cc.getReg());
				v1.add(rcs);
				
			}
		});
		
		//REGISTRARSE 
		cc.getReg().getBotonRegistro().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(cc.getReg().validarRegistro()) {
					v1.replace(cc.getReg(),cc.getReg().getVr());
				
					
			}else {
				Notification.show("Error: Revise algun campo");
			}}
		});
		
		
		//Volver ATRAS Registro
		cc.getReg().getBotonVolver().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
					v1.removeAll();
					v1.add(cc);
					v1.replace(cc.getReg(), ue);
					v1.add(rcs);
				
			}
				
		});
		
		
		
		//INICIAR SESION
		cc.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cc.getIs());
				v1.add(rcs);
				
			}
		});
		
	
		
		//VOLVER ATRAS VerificacionRegistro
		
		cc.getReg().getVr().getBotonVolver().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cc.getReg());
				v1.add(rcs);
				
			}
		});
		
		//ACEPTAR VerificacionRegistro
		cc.getReg().getVr().getBotonAceptar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(cc.getReg().getVr().comprobarCodigo()) {
					v1.removeAll();
					v1.add(cc);
					v1.add(ue);
					v1.add(rcs);
					Notification.show("Registro completado. Ya puede iniciar sesión");
					
			}else {
				Notification.show("Error: Fallo en el registro. Intente de nuevo");
			}}
		});
		
		
		//Registrate IniciarSesion
		
		cc.getIs().getBotonRegistro().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(cc.getReg());
				v1.add(rcs);				
			}
		});

		//VolverAtras Iniciar Sesion
		cc.getIs().getBotonVolver().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(ue);
				v1.add(rcs);
				
			}
		});
		
		//RecuperarCuenta
		
		cc.getIs().getBotonRecuperar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.replace(cc.getIs(), cc.getIs().getRc());
				
			}
		});
		
		//Volver-RecuperarCuenta
		
		cc.getIs().getRc().getBotonVolver().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.replace(cc.getIs().getRc(), cc.getIs());
				
			}
		});
		
		//ConfirmarCorreo
		cc.getIs().getRc().getBotonConfirmar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(cc.getIs().getRc().existeCorreo()) {
					v1.replace(cc.getIs().getRc(), cc.getIs().getRc().getVr());
				}else {
					Notification.show("Correo no existente");
				}
				
			}
		});
		
		
		//Recuperar cuenta- volver a enviar codigo
		
		cc.getIs().getRc().getVr().getBotonVolverEnviar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
					Notification.show("Código enviado de nuevo");
			}
		
		});
		
		//Recuperar cuenta- volver atras
		
		cc.getIs().getRc().getVr().getBotonVolver().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
					v1.replace(cc.getIs().getRc().getVr(), cc.getIs().getRc());
			}
			
		});
		
		//Recuperar cuenta- Cambiar contrasena
		cc.getIs().getRc().getVr().getBotonCContrasena().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(cc.getIs().getRc().getVr().comprobarCodigo()) {
					v1.replace(cc.getIs().getRc().getVr(), cc.getIs().getRc().getVr().getNc());
				}else
					Notification.show("Codigo incorrecto. Compruebelo");
					
			}
			
		});
		
		//NuevaContrasena- Volver atras
		
		cc.getIs().getRc().getVr().getNc().getBotonVolver().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				v1.replace(cc.getIs().getRc().getVr().getNc(), cc.getIs().getRc().getVr());
				
			}
		});
		
		//NuevaContrasena - ConfirmarCC
		cc.getIs().getRc().getVr().getNc().getBotonConfirmar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(cc.getIs().getRc().getVr().getNc().passValida() && cc.getIs().getRc().getVr().getNc().passIguales()) {
					v1.replace(cc.getIs().getRc().getVr().getNc(), ue);
					Notification.show("Contraseña cambiada");
				}else
					Notification.show("Contraseña no válida o no coinciden");
				
				
			}
		});
		
	}
	public Cabecera_cibernauta getCc() {
		return cc;
	}
	public Ultimos_exitos getUe() {
		return ue;
	}
	public static Reproductor_canciones_simple getRcs() {
		return rcs;
	}
	
	
	
	}
