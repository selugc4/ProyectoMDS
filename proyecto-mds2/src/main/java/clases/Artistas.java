package clases;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Artistas extends vistas.VistaArtistas {
//	public Buscar_elementos _buscar_elementos;
//	public Ver_perfil_propio_de_artista _ver_perfil_propio_de_artista;
//	public Ver_perfil_del_artista_ajeno _ver_perfil_del_artista_ajeno;
//	public Vector<ArtistaBuscador> _artistaBuscador = new Vector<ArtistaBuscador>();
	private void inicializar() {
		Cargar_Listas();
	}
		public void Cargar_Listas() {
			VerticalLayout v1 = this.getVaadinVerticalLayout().as(VerticalLayout.class);
			for(int i = 0; i < 5; i++) {		
				v1.add(new ArtistaBuscador());
			}
		}
}