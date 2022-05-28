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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Evento")
public class Evento implements Serializable {
	public Evento() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_EVENTO_GENERA_NOTIFICACION) {
			return ORM_genera_notificacion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_EVENTO_CREADO_POR) {
			this.creado_por = (basededatos.Artista) owner;
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
	
	@Column(name="IdEvento", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_EVENTO_IDEVENTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_EVENTO_IDEVENTO_GENERATOR", strategy="native")	
	private int idEvento;
	
	@ManyToOne(targetEntity=basededatos.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaUsuarioID", referencedColumnName="UsuarioID", nullable=false) }, foreignKey=@ForeignKey(name="FKEvento394184"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Artista creado_por;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	@Column(name="TipoEvento", nullable=true, length=255)	
	private String tipoEvento;
	
	@ManyToMany(mappedBy="ORM_recibe_notificacion", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_genera_notificacion = new java.util.HashSet();
	
	private void setIdEvento(int value) {
		this.idEvento = value;
	}
	
	public int getIdEvento() {
		return idEvento;
	}
	
	public int getORMID() {
		return getIdEvento();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setTipoEvento(String value) {
		this.tipoEvento = value;
	}
	
	public String getTipoEvento() {
		return tipoEvento;
	}
	
	public void setCreado_por(basededatos.Artista value) {
		if (creado_por != null) {
			creado_por.crea.remove(this);
		}
		if (value != null) {
			value.crea.add(this);
		}
	}
	
	public basededatos.Artista getCreado_por() {
		return creado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creado_por(basededatos.Artista value) {
		this.creado_por = value;
	}
	
	private basededatos.Artista getORM_Creado_por() {
		return creado_por;
	}
	
	private void setORM_Genera_notificacion(java.util.Set value) {
		this.ORM_genera_notificacion = value;
	}
	
	private java.util.Set getORM_Genera_notificacion() {
		return ORM_genera_notificacion;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection genera_notificacion = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_EVENTO_GENERA_NOTIFICACION, basededatos.ORMConstants.KEY_USUARIO_RECIBE_NOTIFICACION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdEvento());
	}
	
}
