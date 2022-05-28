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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AlbumCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAlbum;
	public final IntegerExpression contiene_imagenId;
	public final AssociationExpression contiene_imagen;
	public final StringExpression titutloAlbum;
	public final StringExpression fechaEdicion;
	public final CollectionExpression autor;
	public final CollectionExpression contiene_cancion;
	
	public AlbumCriteria(Criteria criteria) {
		super(criteria);
		idAlbum = new IntegerExpression("idAlbum", this);
		contiene_imagenId = new IntegerExpression("contiene_imagen.idImagen", this);
		contiene_imagen = new AssociationExpression("contiene_imagen", this);
		titutloAlbum = new StringExpression("titutloAlbum", this);
		fechaEdicion = new StringExpression("fechaEdicion", this);
		autor = new CollectionExpression("ORM_autor", this);
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this);
	}
	
	public AlbumCriteria(PersistentSession session) {
		this(session.createCriteria(Album.class));
	}
	
	public AlbumCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public ImagenCriteria createContiene_imagenCriteria() {
		return new ImagenCriteria(createCriteria("contiene_imagen"));
	}
	
	public basededatos.ArtistaCriteria createAutorCriteria() {
		return new basededatos.ArtistaCriteria(createCriteria("ORM_autor"));
	}
	
	public basededatos.CancionCriteria createContiene_cancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_contiene_cancion"));
	}
	
	public Album uniqueAlbum() {
		return (Album) super.uniqueResult();
	}
	
	public Album[] listAlbum() {
		java.util.List list = super.list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

