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

public class EstiloDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEstilo;
	public final StringExpression nombre;
	public final CollectionExpression cantado_por;
	
	public EstiloDetachedCriteria() {
		super(basededatos.Estilo.class, basededatos.EstiloCriteria.class);
		idEstilo = new IntegerExpression("idEstilo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cantado_por = new CollectionExpression("ORM_cantado_por", this.getDetachedCriteria());
	}
	
	public EstiloDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EstiloCriteria.class);
		idEstilo = new IntegerExpression("idEstilo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cantado_por = new CollectionExpression("ORM_cantado_por", this.getDetachedCriteria());
	}
	
	public basededatos.ArtistaDetachedCriteria createCantado_porCriteria() {
		return new basededatos.ArtistaDetachedCriteria(createCriteria("ORM_cantado_por"));
	}
	
	public Estilo uniqueEstilo(PersistentSession session) {
		return (Estilo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estilo[] listEstilo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

