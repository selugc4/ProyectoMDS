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
@Table(name="Lista_Reproduccion")
public class Lista_Reproduccion implements Serializable {
	public Lista_Reproduccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_SEGUIDOR) {
			return ORM_seguidor;
		}
		else if (key == basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_CONTIENE_CANCION) {
			return ORM_contiene_cancion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_AUTOR) {
			this.autor = (basededatos.Usuario) owner;
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
	
	@Column(name="IdLista", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_LISTA_REPRODUCCION_IDLISTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_LISTA_REPRODUCCION_IDLISTA_GENERATOR", strategy="native")	
	private int idLista;
	
	@ManyToMany(mappedBy="ORM_seguir", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor = new java.util.HashSet();
	
	@Column(name="NombreLista", nullable=true, length=255)	
	private String nombreLista;
	
	@ManyToOne(targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKLista_Repr869214"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario autor;
	
	@ManyToMany(mappedBy="ORM_contendor_cancion", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_cancion = new java.util.HashSet();
	
	public void setNombreLista(String value) {
		this.nombreLista = value;
	}
	
	public String getNombreLista() {
		return nombreLista;
	}
	
	private void setIdLista(int value) {
		this.idLista = value;
	}
	
	public int getIdLista() {
		return idLista;
	}
	
	public int getORMID() {
		return getIdLista();
	}
	
	private void setORM_Seguidor(java.util.Set value) {
		this.ORM_seguidor = value;
	}
	
	private java.util.Set getORM_Seguidor() {
		return ORM_seguidor;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection seguidor = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_SEGUIDOR, basededatos.ORMConstants.KEY_USUARIO_SEGUIR, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAutor(basededatos.Usuario value) {
		if (autor != null) {
			autor.propietario.remove(this);
		}
		if (value != null) {
			value.propietario.add(this);
		}
	}
	
	public basededatos.Usuario getAutor() {
		return autor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autor(basededatos.Usuario value) {
		this.autor = value;
	}
	
	private basededatos.Usuario getORM_Autor() {
		return autor;
	}
	
	private void setORM_Contiene_cancion(java.util.Set value) {
		this.ORM_contiene_cancion = value;
	}
	
	private java.util.Set getORM_Contiene_cancion() {
		return ORM_contiene_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection contiene_cancion = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_CONTIENE_CANCION, basededatos.ORMConstants.KEY_CANCION_CONTENDOR_CANCION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdLista());
	}
	
}
