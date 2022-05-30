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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression contiene_imagenId;
	public final AssociationExpression contiene_imagen;
	public final StringExpression nombre;
	public final StringExpression contrasena;
	public final IntegerExpression tipoUsuario;
	public final StringExpression correo;
	public final StringExpression foto;
	public final CollectionExpression seguir;
	public final CollectionExpression propietario;
	public final CollectionExpression seguido;
	public final CollectionExpression recibe_notificacion;
	public final CollectionExpression favorita;
	public final CollectionExpression Ultimo_exito;
	public final CollectionExpression horass;
	public final CollectionExpression seguidor_usuario;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		contiene_imagenId = new IntegerExpression("contiene_imagen.idImagen", this);
		contiene_imagen = new AssociationExpression("contiene_imagen", this);
		nombre = new StringExpression("nombre", this);
		contrasena = new StringExpression("contrasena", this);
		tipoUsuario = new IntegerExpression("tipoUsuario", this);
		correo = new StringExpression("correo", this);
		foto = new StringExpression("foto", this);
		seguir = new CollectionExpression("ORM_seguir", this);
		propietario = new CollectionExpression("ORM_propietario", this);
		seguido = new CollectionExpression("ORM_seguido", this);
		recibe_notificacion = new CollectionExpression("ORM_recibe_notificacion", this);
		favorita = new CollectionExpression("ORM_favorita", this);
		Ultimo_exito = new CollectionExpression("ORM_ultimo_exito", this);
		horass = new CollectionExpression("ORM_horass", this);
		seguidor_usuario = new CollectionExpression("ORM_seguidor_usuario", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(basededatos.A12PersistentManager.instance().getSession());
	}
	
	public ImagenCriteria createContiene_imagenCriteria() {
		return new ImagenCriteria(createCriteria("contiene_imagen"));
	}
	
	public basededatos.Lista_ReproduccionCriteria createSeguirCriteria() {
		return new basededatos.Lista_ReproduccionCriteria(createCriteria("ORM_seguir"));
	}
	
	public basededatos.Lista_ReproduccionCriteria createPropietarioCriteria() {
		return new basededatos.Lista_ReproduccionCriteria(createCriteria("ORM_propietario"));
	}
	
	public basededatos.UsuarioCriteria createSeguidoCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_seguido"));
	}
	
	public basededatos.EventoCriteria createRecibe_notificacionCriteria() {
		return new basededatos.EventoCriteria(createCriteria("ORM_recibe_notificacion"));
	}
	
	public basededatos.CancionCriteria createFavoritaCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_favorita"));
	}
	
	public basededatos.CancionCriteria createUltimo_exitoCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_ultimo_exito"));
	}
	
	public basededatos.HorasCriteria createHorassCriteria() {
		return new basededatos.HorasCriteria(createCriteria("ORM_horass"));
	}
	
	public basededatos.UsuarioCriteria createSeguidor_usuarioCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_seguidor_usuario"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

