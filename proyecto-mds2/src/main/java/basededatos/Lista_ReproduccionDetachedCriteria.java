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

public class Lista_ReproduccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idLista;
	public final CollectionExpression seguidor;
	public final StringExpression nombreLista;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final CollectionExpression contiene_cancion;
	
	public Lista_ReproduccionDetachedCriteria() {
		super(basededatos.Lista_Reproduccion.class, basededatos.Lista_ReproduccionCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		nombreLista = new StringExpression("nombreLista", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.ID", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this.getDetachedCriteria());
	}
	
	public Lista_ReproduccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Lista_ReproduccionCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		nombreLista = new StringExpression("nombreLista", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.ID", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this.getDetachedCriteria());
	}
	
	public basededatos.UsuarioDetachedCriteria createSeguidorCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public UsuarioDetachedCriteria createAutorCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("autor"));
	}
	
	public basededatos.CancionDetachedCriteria createContiene_cancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_contiene_cancion"));
	}
	
	public Lista_Reproduccion uniqueLista_Reproduccion(PersistentSession session) {
		return (Lista_Reproduccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista_Reproduccion[] listLista_Reproduccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista_Reproduccion[]) list.toArray(new Lista_Reproduccion[list.size()]);
	}
}

