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

public class HorasCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression horas;
	public final IntegerExpression cancionId;
	public final AssociationExpression cancion;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public HorasCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		horas = new IntegerExpression("horas", this);
		cancionId = new IntegerExpression("ORM_Cancion.null", this);
		cancion = new AssociationExpression("ORM_Cancion", this);
		usuarioId = new IntegerExpression("ORM_Usuario.null", this);
		usuario = new AssociationExpression("ORM_Usuario", this);
	}
	
	public HorasCriteria(PersistentSession session) {
		this(session.createCriteria(Horas.class));
	}
	
	public HorasCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public CancionCriteria createCancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_Cancion"));
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_Usuario"));
	}
	
	public Horas uniqueHoras() {
		return (Horas) super.uniqueResult();
	}
	
	public Horas[] listHoras() {
		java.util.List list = super.list();
		return (Horas[]) list.toArray(new Horas[list.size()]);
	}
}

