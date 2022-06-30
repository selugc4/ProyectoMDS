package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_Registrado;
import bds.BDPrincipal;
import bds.iActor_comun;
import bds.iUsuario_registrado;
import proyectoMDS2.MainView;

public class Ver_perfil_propio_usuario_registrado extends Ver_perfil_propio {
//	private Button _darse_De_BajaB;
//	private Dialog _darse_De_Baja;
//	public Cabecera_usuario_registrado _cabecera_usuario_registrado;
	
	private iActor_comun iac = new BDPrincipal();
	private iUsuario_registrado iur = new BDPrincipal();
	
	public static Dialog darseBaja;
	public static Button botonsi = new Button("Si");


	
	public Ver_perfil_propio_usuario_registrado() {
		inicializar();
		
	}
	
	public Ver_perfil_propio_usuario_registrado(String nombre) {
		inicializar();
		this.getLabel().setText(nombre);
	}
	public Ver_perfil_propio_usuario_registrado(int id) {
		super(id);
		inicializar();
		
		
		
		
	}

	@Override
	protected void otrosClicks(int id) {
		ca.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_registrado.v1.removeAll();
				ca.cl = new Creacion_lista(id, 0);
				Usuario_registrado.v1.add(ca.cl);
				
			}
		});
		
		//FAVORITOS
		getVaadinButton5().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_registrado.v1.removeAll();
				Usuario_registrado.v1.add(vlpp);
				
			}
		});
	}
	private void inicializar() {
		this.getStyle().set("width", "100%");
		this.getVaadinButton().setVisible(true);
		this.getVaadinButton1().setVisible(false);
		this.getVaadinButton3().setVisible(false);
		this.getVaadinButton4().setVisible(false);
		this.getVaadinTextField().setReadOnly(true);
		
		
		VerticalLayout vl = this.getVerticalSusListas().as(VerticalLayout.class);
		vl.add(ca);

	
	  
		
		 
		 this.getVaadinButton2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					getVaadinTextField().setReadOnly(false);
					getVaadinButton1().setVisible(true);
				}
			});
			
		 
		 this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				darseBaja= new Dialog();
 				VerticalLayout vl = new VerticalLayout();
 				HorizontalLayout hl = new HorizontalLayout();
 			
 				Button botonno = new Button("No");
 				hl.add(botonsi, botonno);
 				vl.add("Está seguro de darse de baja?");
 				vl.add(hl);
 				
 				darseBaja.add(vl);
 				darseBaja.open();
 				iActor_comun iac = new BDPrincipal();
				if(iac.cargar_Perfil(Actor_comun.ID).getTipoUsuario() == 2) {
					botonsi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
						
						@Override
						public void onComponentEvent(ClickEvent<Button> event) {
							darseBaja.close();
							iUsuario_registrado iur = new BDPrincipal();
	 						iur.Darse_de_baja(correoantiguo);
							Actor_comun.v1.removeAll();
							Actor_comun.v1.add(new Vista_administracion());
	 						Notification.show("Dado de baja");
							
						}
					});
				}
 				
 				botonno.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
 					
 					@Override
 					public void onComponentEvent(ClickEvent<Button> event) {
 							darseBaja.close();
 							
 						
 					}
 				});
				
			}
		});
 	
	  
}
	
	@Override
	protected void clickCambiarCorreo() {
		 this.getVaadinButton1().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					if(comprobarCorreo(getVaadinTextField().getValue())) {
						iur.modificar_Correo(correoantiguo, getVaadinTextField().getValue());
						if(correoexistente) {
							Notification.show("Correo ya existente. Utilice otro.");
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
}