package clases;
public class Usuario_registrado extends Actor_comun {
//	public Cabecera_usuario_registrado _cabecera_usuario_registrado;
	public Usuario_registrado() {
		VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		v1.add(cc);
		v1.add(rc);
		v1.add(cucr);
		v1.add(ccf);
		v1.add(cr);
		v1.add(clr);
		cc.getImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				v1.removeAll();
				v1.add(cc);
				v1.add(rc);
				v1.add(cucr);
				v1.add(ccf);
				v1.add(cr);
				v1.add(clr);
			}
		});
		cc.getVaadinButton3().addClickListener(null)
	}
}