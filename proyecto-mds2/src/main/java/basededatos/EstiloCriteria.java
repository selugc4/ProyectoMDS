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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EstiloCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEstilo;
	public final StringExpression nombre;
	public final CollectionExpression cantado_por;
	
	public EstiloCriteria(Criteria criteria) {
		super(criteria);
		idEstilo = new IntegerExpression("idEstilo", this);
		nombre = new StringExpression("nombre", this);
		cantado_por = new CollectionExpression("ORM_cantado_por", this);
	}
	
	public EstiloCriteria(PersistentSession session) {
		this(session.createCriteria(Estilo.class));
	}
	
	public EstiloCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public basededatos.ArtistaCriteria createCantado_porCriteria() {
		return new basededatos.ArtistaCriteria(createCriteria("ORM_cantado_por"));
	}
	
	public Estilo uniqueEstilo() {
		return (Estilo) super.uniqueResult();
	}
	
	public Estilo[] listEstilo() {
		java.util.List list = super.list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

