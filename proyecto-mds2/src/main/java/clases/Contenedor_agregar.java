package clases;

public class Contenedor_agregar extends Contenedor_modificar_vista_de_lista {
//	private Button _creacionListaB;
//	public Vector<Creacion_lista> _creacion_lista = new Vector<Creacion_lista>();
	
	public Creacion_lista cl;


	public Contenedor_agregar() {
		cl = new Creacion_lista(0);
	}
	public Contenedor_agregar(int usuario){
		cl = new Creacion_lista(usuario);
		
	}
	
}