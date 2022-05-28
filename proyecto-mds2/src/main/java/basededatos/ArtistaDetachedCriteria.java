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

public class ArtistaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression tiene;
	public final CollectionExpression propietario_album;
	public final CollectionExpression crea;
	public final CollectionExpression pertenece;
	
	public ArtistaDetachedCriteria() {
		super(basededatos.Artista.class, basededatos.ArtistaCriteria.class);
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
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		propietario_album = new CollectionExpression("ORM_propietario_album", this.getDetachedCriteria());
		crea = new CollectionExpression("ORM_crea", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ArtistaCriteria.class);
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
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		propietario_album = new CollectionExpression("ORM_propietario_album", this.getDetachedCriteria());
		crea = new CollectionExpression("ORM_crea", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
	}
	
	public basededatos.CancionDetachedCriteria createTieneCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public basededatos.AlbumDetachedCriteria createPropietario_albumCriteria() {
		return new basededatos.AlbumDetachedCriteria(createCriteria("ORM_propietario_album"));
	}
	
	public basededatos.EventoDetachedCriteria createCreaCriteria() {
		return new basededatos.EventoDetachedCriteria(createCriteria("ORM_crea"));
	}
	
	public basededatos.EstiloDetachedCriteria createPerteneceCriteria() {
		return new basededatos.EstiloDetachedCriteria(createCriteria("ORM_pertenece"));
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
	
	public Artista uniqueArtista(PersistentSession session) {
		return (Artista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Artista[] listArtista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

