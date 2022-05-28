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

public class EventoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEvento;
	public final IntegerExpression creado_porId;
	public final AssociationExpression creado_por;
	public final StringExpression nombre;
	public final StringExpression fecha;
	public final StringExpression tipoEvento;
	public final CollectionExpression genera_notificacion;
	
	public EventoDetachedCriteria() {
		super(basededatos.Evento.class, basededatos.EventoCriteria.class);
		idEvento = new IntegerExpression("idEvento", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		tipoEvento = new StringExpression("tipoEvento", this.getDetachedCriteria());
		genera_notificacion = new CollectionExpression("ORM_genera_notificacion", this.getDetachedCriteria());
	}
	
	public EventoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EventoCriteria.class);
		idEvento = new IntegerExpression("idEvento", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		tipoEvento = new StringExpression("tipoEvento", this.getDetachedCriteria());
		genera_notificacion = new CollectionExpression("ORM_genera_notificacion", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createCreado_porCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("creado_por"));
	}
	
	public basededatos.UsuarioDetachedCriteria createGenera_notificacionCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_genera_notificacion"));
	}
	
	public Evento uniqueEvento(PersistentSession session) {
		return (Evento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evento[] listEvento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

