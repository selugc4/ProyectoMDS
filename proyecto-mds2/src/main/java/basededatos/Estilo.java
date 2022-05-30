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
@Table(name="Estilo")
public class Estilo implements Serializable {
	public Estilo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_ESTILO_CANTADO_POR) {
			return ORM_cantado_por;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdEstilo", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ESTILO_IDESTILO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ESTILO_IDESTILO_GENERATOR", strategy="native")	
	private int idEstilo;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Estilo", joinColumns={ @JoinColumn(name="EstiloIdEstilo") }, inverseJoinColumns={ @JoinColumn(name="ArtistaUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cantado_por = new java.util.HashSet();
	
	private void setIdEstilo(int value) {
		this.idEstilo = value;
	}
	
	public int getIdEstilo() {
		return idEstilo;
	}
	
	public int getORMID() {
		return getIdEstilo();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Cantado_por(java.util.Set value) {
		this.ORM_cantado_por = value;
	}
	
	private java.util.Set getORM_Cantado_por() {
		return ORM_cantado_por;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection cantado_por = new basededatos.ArtistaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ESTILO_CANTADO_POR, basededatos.ORMConstants.KEY_ARTISTA_PERTENECE, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdEstilo());
	}
	
}
