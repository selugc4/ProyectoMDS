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

public class CancionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idCancion;
	public final CollectionExpression horass;
	public final IntegerExpression cancion_deId;
	public final AssociationExpression cancion_de;
	public final IntegerExpression contendor_cancionId;
	public final AssociationExpression contendor_cancion;
	public final StringExpression archivoMultimedia;
	public final StringExpression intepretes;
	public final StringExpression productores;
	public final StringExpression compositores;
	public final StringExpression titulo;
	public final StringExpression tituloCreditos;
	public final CollectionExpression es_de;
	public final CollectionExpression favorita_de;
	public final IntegerExpression Administrado_porId;
	public final AssociationExpression Administrado_por;
	
	public CancionCriteria(Criteria criteria) {
		super(criteria);
		idCancion = new IntegerExpression("idCancion", this);
		horass = new CollectionExpression("ORM_horass", this);
		cancion_deId = new IntegerExpression("cancion_de.idAlbum", this);
		cancion_de = new AssociationExpression("cancion_de", this);
		contendor_cancionId = new IntegerExpression("contendor_cancion.idLista", this);
		contendor_cancion = new AssociationExpression("contendor_cancion", this);
		archivoMultimedia = new StringExpression("archivoMultimedia", this);
		intepretes = new StringExpression("intepretes", this);
		productores = new StringExpression("productores", this);
		compositores = new StringExpression("compositores", this);
		titulo = new StringExpression("titulo", this);
		tituloCreditos = new StringExpression("tituloCreditos", this);
		es_de = new CollectionExpression("ORM_es_de", this);
		favorita_de = new CollectionExpression("ORM_favorita_de", this);
		Administrado_porId = new IntegerExpression("Administrado_por.ID", this);
		Administrado_por = new AssociationExpression("Administrado_por", this);
	}
	
	public CancionCriteria(PersistentSession session) {
		this(session.createCriteria(Cancion.class));
	}
	
	public CancionCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public basededatos.HorasCriteria createHorassCriteria() {
		return new basededatos.HorasCriteria(createCriteria("ORM_horass"));
	}
	
	public AlbumCriteria createCancion_deCriteria() {
		return new AlbumCriteria(createCriteria("cancion_de"));
	}
	
	public Lista_ReproduccionCriteria createContendor_cancionCriteria() {
		return new Lista_ReproduccionCriteria(createCriteria("contendor_cancion"));
	}
	
	public basededatos.ArtistaCriteria createEs_deCriteria() {
		return new basededatos.ArtistaCriteria(createCriteria("ORM_es_de"));
	}
	
	public basededatos.UsuarioCriteria createFavorita_deCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_favorita_de"));
	}
	
	public UsuarioCriteria createAdministrado_porCriteria() {
		return new UsuarioCriteria(createCriteria("Administrado_por"));
	}
	
	public Cancion uniqueCancion() {
		return (Cancion) super.uniqueResult();
	}
	
	public Cancion[] listCancion() {
		java.util.List list = super.list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

