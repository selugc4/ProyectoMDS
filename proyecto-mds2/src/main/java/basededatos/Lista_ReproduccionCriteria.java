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

public class Lista_ReproduccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idLista;
	public final CollectionExpression seguidor;
	public final StringExpression nombreLista;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final CollectionExpression contiene_cancion;
	
	
	public Lista_ReproduccionCriteria(Criteria criteria) {
		super(criteria);
		idLista = new IntegerExpression("idLista", this);
		seguidor = new CollectionExpression("ORM_seguidor", this);
		nombreLista = new StringExpression("nombreLista", this);
		autorId = new IntegerExpression("autor.ID", this);
		autor = new AssociationExpression("autor", this);
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this);
	}
	
	public Lista_ReproduccionCriteria(PersistentSession session) {
		this(session.createCriteria(Lista_Reproduccion.class));
	}
	
	public Lista_ReproduccionCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public basededatos.UsuarioCriteria createSeguidorCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_seguidor"));
	}
	
	public UsuarioCriteria createAutorCriteria() {
		return new UsuarioCriteria(createCriteria("autor"));
	}
	
	public basededatos.CancionCriteria createContiene_cancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_contiene_cancion"));
	}
	
	public Lista_Reproduccion uniqueLista_Reproduccion() {
		return (Lista_Reproduccion) super.uniqueResult();
	}
	
	public Lista_Reproduccion[] listLista_Reproduccion() {
		java.util.List list = super.list();
		return (Lista_Reproduccion[]) list.toArray(new Lista_Reproduccion[list.size()]);
	}
}

