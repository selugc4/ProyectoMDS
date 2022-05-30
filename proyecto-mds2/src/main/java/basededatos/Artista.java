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
@Table(name="Artista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioID", referencedColumnName="ID")
public class Artista extends basededatos.Usuario implements Serializable {
	public Artista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_ARTISTA_TIENE) {
			return ORM_tiene;
		}
		else if (key == basededatos.ORMConstants.KEY_ARTISTA_PROPIETARIO_ALBUM) {
			return ORM_propietario_album;
		}
		else if (key == basededatos.ORMConstants.KEY_ARTISTA_CREA) {
			return ORM_crea;
		}
		else if (key == basededatos.ORMConstants.KEY_ARTISTA_PERTENECE) {
			return ORM_pertenece;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Artista", joinColumns={ @JoinColumn(name="ArtistaUsuarioID") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_autor", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_propietario_album = new java.util.HashSet();
	
	@OneToMany(mappedBy="creado_por", targetEntity=basededatos.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cantado_por", targetEntity=basededatos.Estilo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece = new java.util.HashSet();
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection tiene = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_TIENE, basededatos.ORMConstants.KEY_CANCION_ES_DE, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Propietario_album(java.util.Set value) {
		this.ORM_propietario_album = value;
	}
	
	private java.util.Set getORM_Propietario_album() {
		return ORM_propietario_album;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection propietario_album = new basededatos.AlbumSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_PROPIETARIO_ALBUM, basededatos.ORMConstants.KEY_ALBUM_AUTOR, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Crea(java.util.Set value) {
		this.ORM_crea = value;
	}
	
	private java.util.Set getORM_Crea() {
		return ORM_crea;
	}
	
	@Transient	
	public final basededatos.EventoSetCollection crea = new basededatos.EventoSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_CREA, basededatos.ORMConstants.KEY_EVENTO_CREADO_POR, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Pertenece(java.util.Set value) {
		this.ORM_pertenece = value;
	}
	
	private java.util.Set getORM_Pertenece() {
		return ORM_pertenece;
	}
	
	@Transient	
	public final basededatos.EstiloSetCollection pertenece = new basededatos.EstiloSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_PERTENECE, basededatos.ORMConstants.KEY_ESTILO_CANTADO_POR, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
