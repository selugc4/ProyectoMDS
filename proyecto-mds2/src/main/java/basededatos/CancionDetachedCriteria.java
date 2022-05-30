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

public class CancionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idCancion;
	public final CollectionExpression horass;
	public final IntegerExpression cancion_deId;
	public final AssociationExpression cancion_de;
	public final StringExpression archivoMultimedia;
	public final StringExpression intepretes;
	public final StringExpression productores;
	public final StringExpression compositores;
	public final StringExpression titulo;
	public final StringExpression tituloCreditos;
	public final CollectionExpression contendor_cancion;
	public final CollectionExpression es_de;
	public final CollectionExpression favorita_de;
	public final IntegerExpression Administrado_porId;
	public final AssociationExpression Administrado_por;
	
	public CancionDetachedCriteria() {
		super(basededatos.Cancion.class, basededatos.CancionCriteria.class);
		idCancion = new IntegerExpression("idCancion", this.getDetachedCriteria());
		horass = new CollectionExpression("ORM_horass", this.getDetachedCriteria());
		cancion_deId = new IntegerExpression("cancion_de.idAlbum", this.getDetachedCriteria());
		cancion_de = new AssociationExpression("cancion_de", this.getDetachedCriteria());
		archivoMultimedia = new StringExpression("archivoMultimedia", this.getDetachedCriteria());
		intepretes = new StringExpression("intepretes", this.getDetachedCriteria());
		productores = new StringExpression("productores", this.getDetachedCriteria());
		compositores = new StringExpression("compositores", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		tituloCreditos = new StringExpression("tituloCreditos", this.getDetachedCriteria());
		contendor_cancion = new CollectionExpression("ORM_contendor_cancion", this.getDetachedCriteria());
		es_de = new CollectionExpression("ORM_es_de", this.getDetachedCriteria());
		favorita_de = new CollectionExpression("ORM_favorita_de", this.getDetachedCriteria());
		Administrado_porId = new IntegerExpression("Administrado_por.ID", this.getDetachedCriteria());
		Administrado_por = new AssociationExpression("Administrado_por", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CancionCriteria.class);
		idCancion = new IntegerExpression("idCancion", this.getDetachedCriteria());
		horass = new CollectionExpression("ORM_horass", this.getDetachedCriteria());
		cancion_deId = new IntegerExpression("cancion_de.idAlbum", this.getDetachedCriteria());
		cancion_de = new AssociationExpression("cancion_de", this.getDetachedCriteria());
		archivoMultimedia = new StringExpression("archivoMultimedia", this.getDetachedCriteria());
		intepretes = new StringExpression("intepretes", this.getDetachedCriteria());
		productores = new StringExpression("productores", this.getDetachedCriteria());
		compositores = new StringExpression("compositores", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		tituloCreditos = new StringExpression("tituloCreditos", this.getDetachedCriteria());
		contendor_cancion = new CollectionExpression("ORM_contendor_cancion", this.getDetachedCriteria());
		es_de = new CollectionExpression("ORM_es_de", this.getDetachedCriteria());
		favorita_de = new CollectionExpression("ORM_favorita_de", this.getDetachedCriteria());
		Administrado_porId = new IntegerExpression("Administrado_por.ID", this.getDetachedCriteria());
		Administrado_por = new AssociationExpression("Administrado_por", this.getDetachedCriteria());
	}
	
	public basededatos.HorasDetachedCriteria createHorassCriteria() {
		return new basededatos.HorasDetachedCriteria(createCriteria("ORM_horass"));
	}
	
	public AlbumDetachedCriteria createCancion_deCriteria() {
		return new AlbumDetachedCriteria(createCriteria("cancion_de"));
	}
	
	public basededatos.Lista_ReproduccionDetachedCriteria createContendor_cancionCriteria() {
		return new basededatos.Lista_ReproduccionDetachedCriteria(createCriteria("ORM_contendor_cancion"));
	}
	
	public basededatos.ArtistaDetachedCriteria createEs_deCriteria() {
		return new basededatos.ArtistaDetachedCriteria(createCriteria("ORM_es_de"));
	}
	
	public basededatos.UsuarioDetachedCriteria createFavorita_deCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_favorita_de"));
	}
	
	public UsuarioDetachedCriteria createAdministrado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("Administrado_por"));
	}
	
	public Cancion uniqueCancion(PersistentSession session) {
		return (Cancion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cancion[] listCancion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

