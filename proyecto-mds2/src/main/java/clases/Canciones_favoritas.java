package clases;
public class Canciones_favoritas extends Canciones {
//	public ContenedorRecomendaciones _contenedorRecomendaciones;
	
	public Canciones_favoritas() {
		this.getLabel().setText("Canciones Favoritas");
		
	}
	
	public Ver_lista_de_reproduccion_propia getListaDeReproduccion() {
		return new Ver_lista_de_reproduccion_propia();
	}
}