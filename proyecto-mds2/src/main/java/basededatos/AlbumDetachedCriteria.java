/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jesus(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AlbumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAlbum;
	public final IntegerExpression contiene_imagenId;
	public final AssociationExpression contiene_imagen;
	public final StringExpression titutloAlbum;
	public final StringExpression fechaEdicion;
	public final CollectionExpression autor;
	public final CollectionExpression contiene_cancion;
	
	public AlbumDetachedCriteria() {
		super(basededatos.Album.class, basededatos.AlbumCriteria.class);
		idAlbum = new IntegerExpression("idAlbum", this.getDetachedCriteria());
		contiene_imagenId = new IntegerExpression("contiene_imagen.idImagen", this.getDetachedCriteria());
		contiene_imagen = new AssociationExpression("contiene_imagen", this.getDetachedCriteria());
		titutloAlbum = new StringExpression("titutloAlbum", this.getDetachedCriteria());
		fechaEdicion = new StringExpression("fechaEdicion", this.getDetachedCriteria());
		autor = new CollectionExpression("ORM_autor", this.getDetachedCriteria());
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AlbumCriteria.class);
		idAlbum = new IntegerExpression("idAlbum", this.getDetachedCriteria());
		contiene_imagenId = new IntegerExpression("contiene_imagen.idImagen", this.getDetachedCriteria());
		contiene_imagen = new AssociationExpression("contiene_imagen", this.getDetachedCriteria());
		titutloAlbum = new StringExpression("titutloAlbum", this.getDetachedCriteria());
		fechaEdicion = new StringExpression("fechaEdicion", this.getDetachedCriteria());
		autor = new CollectionExpression("ORM_autor", this.getDetachedCriteria());
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria createContiene_imagenCriteria() {
		return new ImagenDetachedCriteria(createCriteria("contiene_imagen"));
	}
	
	public basededatos.ArtistaDetachedCriteria createAutorCriteria() {
		return new basededatos.ArtistaDetachedCriteria(createCriteria("ORM_autor"));
	}
	
	public basededatos.CancionDetachedCriteria createContiene_cancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_contiene_cancion"));
	}
	
	public Album uniqueAlbum(PersistentSession session) {
		return (Album) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Album[] listAlbum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

