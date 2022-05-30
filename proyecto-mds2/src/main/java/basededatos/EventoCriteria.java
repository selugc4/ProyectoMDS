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

public class EventoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEvento;
	public final IntegerExpression creado_porId;
	public final AssociationExpression creado_por;
	public final StringExpression nombre;
	public final StringExpression fecha;
	public final StringExpression tipoEvento;
	public final CollectionExpression genera_notificacion;
	
	public EventoCriteria(Criteria criteria) {
		super(criteria);
		idEvento = new IntegerExpression("idEvento", this);
		creado_porId = new IntegerExpression("creado_por.", this);
		creado_por = new AssociationExpression("creado_por", this);
		nombre = new StringExpression("nombre", this);
		fecha = new StringExpression("fecha", this);
		tipoEvento = new StringExpression("tipoEvento", this);
		genera_notificacion = new CollectionExpression("ORM_genera_notificacion", this);
	}
	
	public EventoCriteria(PersistentSession session) {
		this(session.createCriteria(Evento.class));
	}
	
	public EventoCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createCreado_porCriteria() {
		return new ArtistaCriteria(createCriteria("creado_por"));
	}
	
	public basededatos.UsuarioCriteria createGenera_notificacionCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_genera_notificacion"));
	}
	
	public Evento uniqueEvento() {
		return (Evento) super.uniqueResult();
	}
	
	public Evento[] listEvento() {
		java.util.List list = super.list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

