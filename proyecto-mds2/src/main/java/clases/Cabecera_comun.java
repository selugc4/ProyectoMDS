package clases;
public class Cabecera_comun extends vistas.VistaCabecera_comun {
//	private Image _imagen_Inicio;
//	private Label _textoContacto;
//	private TextField _buscador;
//	private Button _buscarB;
//	private Button _notificacionesB;
//	private Button _ver_PerfilB;
//	private Button _cerrar_SesionB;
//	private Dialog _popup_Notificacion;
//	public Actor_comun _actor_comun;
//	public Notificaciones _notificaciones;

	public Notificaciones notif = new Notificaciones();
/*	public void Inicio() {
		throw new UnsupportedOperationException();
	}

	public void Cerrar_Sesion() {
		throw new UnsupportedOperationException();
	}

	public void buscar() {
		throw new UnsupportedOperationException();
	}

	public void verNotificaciones() {
		throw new UnsupportedOperationException();
	}

	public void verPerfil() {
		throw new UnsupportedOperationException();
	}
	*/

	public Notificaciones getNotif() {
		return notif;
	}
	
}