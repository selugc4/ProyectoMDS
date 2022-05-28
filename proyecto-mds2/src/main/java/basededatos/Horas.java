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
@Table(name="Horas")
public class Horas implements Serializable {
	public Horas() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_HORAS_USUARIO) {
			this.usuario = (basededatos.Usuario) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_HORAS_CANCION) {
			this.cancion = (basededatos.Cancion) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_HORAS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_HORAS_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Horas", nullable=false, length=10)	
	private int horas;
	
	@ManyToOne(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CancionIdCancion", referencedColumnName="IdCancion", nullable=false) })	
	private basededatos.Cancion cancion;
	
	@ManyToOne(targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UsuarioID", referencedColumnName="ID", nullable=false) })	
	private basededatos.Usuario usuario;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setHoras(int value) {
		this.horas = value;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public void setUsuario(basededatos.Usuario value) {
		if (usuario != null) {
			usuario.horass.remove(this);
		}
		if (value != null) {
			value.horass.add(this);
		}
	}
	
	public basededatos.Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario(basededatos.Usuario value) {
		this.usuario = value;
	}
	
	private basededatos.Usuario getORM_Usuario() {
		return usuario;
	}
	
	public void setCancion(basededatos.Cancion value) {
		if (cancion != null) {
			cancion.horass.remove(this);
		}
		if (value != null) {
			value.horass.add(this);
		}
	}
	
	public basededatos.Cancion getCancion() {
		return cancion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cancion(basededatos.Cancion value) {
		this.cancion = value;
	}
	
	private basededatos.Cancion getORM_Cancion() {
		return cancion;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
