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

public class ImagenCriteria extends AbstractORMCriteria {
	public final IntegerExpression idImagen;
	public final StringExpression url;
	public final IntegerExpression contenedor_imagen_albumId;
	public final AssociationExpression contenedor_imagen_album;
	public final IntegerExpression imagen_deId;
	public final AssociationExpression imagen_de;
	
	public ImagenCriteria(Criteria criteria) {
		super(criteria);
		idImagen = new IntegerExpression("idImagen", this);
		url = new StringExpression("url", this);
		contenedor_imagen_albumId = new IntegerExpression("contenedor_imagen_album.idImagen", this);
		contenedor_imagen_album = new AssociationExpression("contenedor_imagen_album", this);
		imagen_deId = new IntegerExpression("imagen_de.idImagen", this);
		imagen_de = new AssociationExpression("imagen_de", this);
	}
	
	public ImagenCriteria(PersistentSession session) {
		this(session.createCriteria(Imagen.class));
	}
	
	public ImagenCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public AlbumCriteria createContenedor_imagen_albumCriteria() {
		return new AlbumCriteria(createCriteria("contenedor_imagen_album"));
	}
	
	public UsuarioCriteria createImagen_deCriteria() {
		return new UsuarioCriteria(createCriteria("imagen_de"));
	}
	
	public Imagen uniqueImagen() {
		return (Imagen) super.uniqueResult();
	}
	
	public Imagen[] listImagen() {
		java.util.List list = super.list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

