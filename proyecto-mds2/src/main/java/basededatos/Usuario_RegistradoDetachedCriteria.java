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

public class Usuario_RegistradoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Usuario_RegistradoDetachedCriteria() {
		super(basededatos.Usuario_Registrado.class, basededatos.Usuario_RegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contiene_imagenId = new IntegerExpression("contiene_imagen.idImagen", this.getDetachedCriteria());
		contiene_imagen = new AssociationExpression("contiene_imagen", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		tipoUsuario = new IntegerExpression("tipoUsuario", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		seguir = new CollectionExpression("ORM_seguir", this.getDetachedCriteria());
		propietario = new CollectionExpression("ORM_propietario", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		recibe_notificacion = new CollectionExpression("ORM_recibe_notificacion", this.getDetachedCriteria());
		favorita = new CollectionExpression("ORM_favorita", this.getDetachedCriteria());
		Ultimo_exito = new CollectionExpression("ORM_ultimo_exito", this.getDetachedCriteria());
		horass = new CollectionExpression("ORM_horass", this.getDetachedCriteria());
		seguidor_usuario = new CollectionExpression("ORM_seguidor_usuario", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Usuario_RegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contiene_imagenId = new IntegerExpression("contiene_imagen.idImagen", this.getDetachedCriteria());
		contiene_imagen = new AssociationExpression("contiene_imagen", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		tipoUsuario = new IntegerExpression("tipoUsuario", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		seguir = new CollectionExpression("ORM_seguir", this.getDetachedCriteria());
		propietario = new CollectionExpression("ORM_propietario", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		recibe_notificacion = new CollectionExpression("ORM_recibe_notificacion", this.getDetachedCriteria());
		favorita = new CollectionExpression("ORM_favorita", this.getDetachedCriteria());
		Ultimo_exito = new CollectionExpression("ORM_ultimo_exito", this.getDetachedCriteria());
		horass = new CollectionExpression("ORM_horass", this.getDetachedCriteria());
		seguidor_usuario = new CollectionExpression("ORM_seguidor_usuario", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria createContiene_imagenCriteria() {
		return new ImagenDetachedCriteria(createCriteria("contiene_imagen"));
	}
	
	public basededatos.Lista_ReproduccionDetachedCriteria createSeguirCriteria() {
		return new basededatos.Lista_ReproduccionDetachedCriteria(createCriteria("ORM_seguir"));
	}
	
	public basededatos.Lista_ReproduccionDetachedCriteria createPropietarioCriteria() {
		return new basededatos.Lista_ReproduccionDetachedCriteria(createCriteria("ORM_propietario"));
	}
	
	public basededatos.UsuarioDetachedCriteria createSeguidoCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_seguido"));
	}
	
	public basededatos.EventoDetachedCriteria createRecibe_notificacionCriteria() {
		return new basededatos.EventoDetachedCriteria(createCriteria("ORM_recibe_notificacion"));
	}
	
	public basededatos.CancionDetachedCriteria createFavoritaCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_favorita"));
	}
	
	public basededatos.CancionDetachedCriteria createUltimo_exitoCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_ultimo_exito"));
	}
	
	public basededatos.HorasDetachedCriteria createHorassCriteria() {
		return new basededatos.HorasDetachedCriteria(createCriteria("ORM_horass"));
	}
	
	public basededatos.UsuarioDetachedCriteria createSeguidor_usuarioCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_seguidor_usuario"));
	}
	
	public Usuario_Registrado uniqueUsuario_Registrado(PersistentSession session) {
		return (Usuario_Registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_Registrado[] listUsuario_Registrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
	}
}

