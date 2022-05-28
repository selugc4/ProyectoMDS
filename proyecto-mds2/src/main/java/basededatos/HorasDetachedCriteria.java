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

public class HorasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression horas;
	public final IntegerExpression cancionId;
	public final AssociationExpression cancion;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public HorasDetachedCriteria() {
		super(basededatos.Horas.class, basededatos.HorasCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		horas = new IntegerExpression("horas", this.getDetachedCriteria());
		cancionId = new IntegerExpression("ORM_Cancion.null", this.getDetachedCriteria());
		cancion = new AssociationExpression("ORM_Cancion", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("ORM_Usuario.null", this.getDetachedCriteria());
		usuario = new AssociationExpression("ORM_Usuario", this.getDetachedCriteria());
	}
	
	public HorasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.HorasCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		horas = new IntegerExpression("horas", this.getDetachedCriteria());
		cancionId = new IntegerExpression("ORM_Cancion.null", this.getDetachedCriteria());
		cancion = new AssociationExpression("ORM_Cancion", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("ORM_Usuario.null", this.getDetachedCriteria());
		usuario = new AssociationExpression("ORM_Usuario", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createCancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("cancion"));
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public Horas uniqueHoras(PersistentSession session) {
		return (Horas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Horas[] listHoras(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Horas[]) list.toArray(new Horas[list.size()]);
	}
}

