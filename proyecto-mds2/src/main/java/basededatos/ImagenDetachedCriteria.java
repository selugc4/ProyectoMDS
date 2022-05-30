/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ImagenDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idImagen;
	public final StringExpression url;
	public final IntegerExpression contenedor_imagen_albumId;
	public final AssociationExpression contenedor_imagen_album;
	public final IntegerExpression imagen_deId;
	public final AssociationExpression imagen_de;
	
	public ImagenDetachedCriteria() {
		super(basededatos.Imagen.class, basededatos.ImagenCriteria.class);
		idImagen = new IntegerExpression("idImagen", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		contenedor_imagen_albumId = new IntegerExpression("contenedor_imagen_album.idImagen", this.getDetachedCriteria());
		contenedor_imagen_album = new AssociationExpression("contenedor_imagen_album", this.getDetachedCriteria());
		imagen_deId = new IntegerExpression("imagen_de.idImagen", this.getDetachedCriteria());
		imagen_de = new AssociationExpression("imagen_de", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ImagenCriteria.class);
		idImagen = new IntegerExpression("idImagen", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		contenedor_imagen_albumId = new IntegerExpression("contenedor_imagen_album.idImagen", this.getDetachedCriteria());
		contenedor_imagen_album = new AssociationExpression("contenedor_imagen_album", this.getDetachedCriteria());
		imagen_deId = new IntegerExpression("imagen_de.idImagen", this.getDetachedCriteria());
		imagen_de = new AssociationExpression("imagen_de", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria createContenedor_imagen_albumCriteria() {
		return new AlbumDetachedCriteria(createCriteria("contenedor_imagen_album"));
	}
	
	public UsuarioDetachedCriteria createImagen_deCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("imagen_de"));
	}
	
	public Imagen uniqueImagen(PersistentSession session) {
		return (Imagen) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Imagen[] listImagen(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

