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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_USUARIO_SEGUIR) {
			return ORM_seguir;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_PROPIETARIO) {
			return ORM_propietario;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_SEGUIDO) {
			return ORM_seguido;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_RECIBE_NOTIFICACION) {
			return ORM_recibe_notificacion;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_FAVORITA) {
			return ORM_favorita;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_ULTIMO_EXITO) {
			return ORM_ultimo_exito;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_HORASS) {
			return ORM_horass;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_SEGUIDOR_USUARIO) {
			return ORM_seguidor_usuario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_USUARIO_CONTIENE_IMAGEN) {
			this.contiene_imagen = (basededatos.Imagen) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_USUARIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(optional=false, targetEntity=basededatos.Imagen.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ImagenIdImagen", referencedColumnName="IdImagen", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario914266"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Imagen contiene_imagen;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@Column(name="TipoUsuario", nullable=false, length=10)	
	private int tipoUsuario;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@ManyToMany(targetEntity=basededatos.Lista_Reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Lista_Reproduccion_Usuario", joinColumns={ @JoinColumn(name="UsuarioID") }, inverseJoinColumns={ @JoinColumn(name="Lista_ReproduccionIdLista") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguir = new java.util.HashSet();
	
	@OneToMany(mappedBy="autor", targetEntity=basededatos.Lista_Reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_propietario = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario", joinColumns={ @JoinColumn(name="UsuarioID2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguido = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Evento_Usuario", joinColumns={ @JoinColumn(name="UsuarioID") }, inverseJoinColumns={ @JoinColumn(name="EventoIdEvento") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_recibe_notificacion = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Usuario", joinColumns={ @JoinColumn(name="UsuarioID") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_favorita = new java.util.HashSet();
	
	@OneToMany(mappedBy="Administrado_por", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ultimo_exito = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario", targetEntity=basededatos.Horas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_horass = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_seguido", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor_usuario = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setTipoUsuario(int value) {
		this.tipoUsuario = value;
	}
	
	public int getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	private void setORM_Seguir(java.util.Set value) {
		this.ORM_seguir = value;
	}
	
	private java.util.Set getORM_Seguir() {
		return ORM_seguir;
	}
	
	@Transient	
	public final basededatos.Lista_ReproduccionSetCollection seguir = new basededatos.Lista_ReproduccionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_SEGUIR, basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_SEGUIDOR, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Propietario(java.util.Set value) {
		this.ORM_propietario = value;
	}
	
	private java.util.Set getORM_Propietario() {
		return ORM_propietario;
	}
	
	@Transient	
	public final basededatos.Lista_ReproduccionSetCollection propietario = new basededatos.Lista_ReproduccionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_PROPIETARIO, basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_AUTOR, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setContiene_imagen(basededatos.Imagen value) {
		if (this.contiene_imagen != value) {
			basededatos.Imagen lcontiene_imagen = this.contiene_imagen;
			this.contiene_imagen = value;
			if (value != null) {
				contiene_imagen.setImagen_de(this);
			}
			if (lcontiene_imagen != null && lcontiene_imagen.getImagen_de() == this) {
				lcontiene_imagen.setImagen_de(null);
			}
		}
	}
	
	public basededatos.Imagen getContiene_imagen() {
		return contiene_imagen;
	}
	
	private void setORM_Seguido(java.util.Set value) {
		this.ORM_seguido = value;
	}
	
	private java.util.Set getORM_Seguido() {
		return ORM_seguido;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection seguido = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_SEGUIDO, basededatos.ORMConstants.KEY_USUARIO_SEGUIDOR_USUARIO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Recibe_notificacion(java.util.Set value) {
		this.ORM_recibe_notificacion = value;
	}
	
	private java.util.Set getORM_Recibe_notificacion() {
		return ORM_recibe_notificacion;
	}
	
	@Transient	
	public final basededatos.EventoSetCollection recibe_notificacion = new basededatos.EventoSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_RECIBE_NOTIFICACION, basededatos.ORMConstants.KEY_EVENTO_GENERA_NOTIFICACION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Favorita(java.util.Set value) {
		this.ORM_favorita = value;
	}
	
	private java.util.Set getORM_Favorita() {
		return ORM_favorita;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection favorita = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_FAVORITA, basededatos.ORMConstants.KEY_CANCION_FAVORITA_DE, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Ultimo_exito(java.util.Set value) {
		this.ORM_ultimo_exito = value;
	}
	
	private java.util.Set getORM_Ultimo_exito() {
		return ORM_ultimo_exito;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection ultimo_exito = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_ULTIMO_EXITO, basededatos.ORMConstants.KEY_CANCION_ADMINISTRADO_POR, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public basededatos.Cancion[] getCancions() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = horass.getIterator();lIter.hasNext();) {
			lValues.add(((basededatos.Horas)lIter.next()).getCancion());
		}
		return (basededatos.Cancion[])lValues.toArray(new basededatos.Cancion[lValues.size()]);
	}
	
	public void removeCancion(basededatos.Cancion aCancion) {
		basededatos.Horas[] lHorass = horass.toArray();
		for(int i = 0; i < lHorass.length; i++) {
			if(lHorass[i].getCancion().equals(aCancion)) {
				horass.remove(lHorass[i]);
			}
		}
	}
	
	public void addCancion(basededatos.Horas aHoras, basededatos.Cancion aCancion) {
		aHoras.setCancion(aCancion);
		horass.add(aHoras);
	}
	
	public basededatos.Horas getHorasByCancion(basededatos.Cancion aCancion) {
		basededatos.Horas[] lHorass = horass.toArray();
		for(int i = 0; i < lHorass.length; i++) {
			if(lHorass[i].getCancion().equals(aCancion)) {
				return lHorass[i];
			}
		}
		return null;
	}
	
	private void setORM_Horass(java.util.Set value) {
		this.ORM_horass = value;
	}
	
	private java.util.Set getORM_Horass() {
		return ORM_horass;
	}
	
	@Transient	
	public final basededatos.HorasSetCollection horass = new basededatos.HorasSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_HORASS, basededatos.ORMConstants.KEY_HORAS_USUARIO, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Seguidor_usuario(java.util.Set value) {
		this.ORM_seguidor_usuario = value;
	}
	
	private java.util.Set getORM_Seguidor_usuario() {
		return ORM_seguidor_usuario;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection seguidor_usuario = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_SEGUIDOR_USUARIO, basededatos.ORMConstants.KEY_USUARIO_SEGUIDO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
