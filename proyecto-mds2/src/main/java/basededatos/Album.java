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
@Table(name="Album")
public class Album implements Serializable {
	public Album() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_ALBUM_AUTOR) {
			return ORM_autor;
		}
		else if (key == basededatos.ORMConstants.KEY_ALBUM_CONTIENE_CANCION) {
			return ORM_contiene_cancion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_ALBUM_CONTIENE_IMAGEN) {
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
	
	@Column(name="IdAlbum", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ALBUM_IDALBUM_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ALBUM_IDALBUM_GENERATOR", strategy="native")	
	private int idAlbum;
	
	@OneToOne(optional=false, targetEntity=basededatos.Imagen.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ImagenIdImagen", referencedColumnName="IdImagen", nullable=false) }, foreignKey=@ForeignKey(name="FKAlbum551520"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Imagen contiene_imagen;
	
	@Column(name="TitutloAlbum", nullable=true, length=255)	
	private String titutloAlbum;
	
	@Column(name="FechaEdicion", nullable=true, length=255)	
	private String fechaEdicion;
	
	@ManyToMany(targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Album", joinColumns={ @JoinColumn(name="AlbumIdAlbum") }, inverseJoinColumns={ @JoinColumn(name="ArtistaUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_autor = new java.util.HashSet();
	
	@OneToMany(mappedBy="cancion_de", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_cancion = new java.util.HashSet();
	
	public void setTitutloAlbum(String value) {
		this.titutloAlbum = value;
	}
	
	public String getTitutloAlbum() {
		return titutloAlbum;
	}
	
	private void setIdAlbum(int value) {
		this.idAlbum = value;
	}
	
	public int getIdAlbum() {
		return idAlbum;
	}
	
	public int getORMID() {
		return getIdAlbum();
	}
	
	public void setFechaEdicion(String value) {
		this.fechaEdicion = value;
	}
	
	public String getFechaEdicion() {
		return fechaEdicion;
	}
	
	private void setORM_Autor(java.util.Set value) {
		this.ORM_autor = value;
	}
	
	private java.util.Set getORM_Autor() {
		return ORM_autor;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection autor = new basededatos.ArtistaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ALBUM_AUTOR, basededatos.ORMConstants.KEY_ARTISTA_PROPIETARIO_ALBUM, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setContiene_imagen(basededatos.Imagen value) {
		if (this.contiene_imagen != value) {
			basededatos.Imagen lcontiene_imagen = this.contiene_imagen;
			this.contiene_imagen = value;
			if (value != null) {
				contiene_imagen.setContenedor_imagen_album(this);
			}
			if (lcontiene_imagen != null && lcontiene_imagen.getContenedor_imagen_album() == this) {
				lcontiene_imagen.setContenedor_imagen_album(null);
			}
		}
	}
	
	public basededatos.Imagen getContiene_imagen() {
		return contiene_imagen;
	}
	
	private void setORM_Contiene_cancion(java.util.Set value) {
		this.ORM_contiene_cancion = value;
	}
	
	private java.util.Set getORM_Contiene_cancion() {
		return ORM_contiene_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection contiene_cancion = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ALBUM_CONTIENE_CANCION, basededatos.ORMConstants.KEY_CANCION_CANCION_DE, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAlbum());
	}
	
}
