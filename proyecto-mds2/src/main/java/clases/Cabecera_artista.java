package clases;
public class Cabecera_artista extends Cabecera_comun {
//	public Artista _artista;
//	public Buscar_elementos _buscar_elementos;
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
	
	public Buscar_elementos be = new Buscar_elementos();
	public Ver_perfil_propio vpp = new Ver_perfil_propio();
	
	public Cabecera_artista() {
		inicializar();
	}

	private void inicializar() {
		this.getBotonAdmin().setVisible(false);
		this.getStyle().set("width", "100%");
	}

	public void buscar(String value) {
		be = new Buscar_elementos(value);
	}
}