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
@Table(name="Cancion")
public class Cancion implements Serializable {
	public Cancion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_CANCION_CONTENDOR_CANCION) {
			return ORM_contendor_cancion;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_HORASS) {
			return ORM_horass;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_ES_DE) {
			return ORM_es_de;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_FAVORITA_DE) {
			return ORM_favorita_de;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_CANCION_CANCION_DE) {
			this.cancion_de = (basededatos.Album) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_CANCION_ADMINISTRADO_POR) {
			this.Administrado_por = (basededatos.Usuario) owner;
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
	
	@Column(name="IdCancion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_CANCION_IDCANCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANCION_IDCANCION_GENERATOR", strategy="native")	
	private int idCancion;
	
	@OneToMany(mappedBy="cancion", targetEntity=basededatos.Horas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_horass = new java.util.HashSet();
	
	@ManyToOne(targetEntity=basededatos.Album.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AlbumIdAlbum", referencedColumnName="IdAlbum") }, foreignKey=@ForeignKey(name="FKCancion48941"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Album cancion_de;
	
	@Column(name="ArchivoMultimedia", nullable=true, length=255)	
	private String archivoMultimedia;
	
	@Column(name="Intepretes", nullable=true, length=255)	
	private String intepretes;
	
	@Column(name="Productores", nullable=true, length=255)	
	private String productores;
	
	@Column(name="Compositores", nullable=true, length=255)	
	private String compositores;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="TituloCreditos", nullable=true, length=255)	
	private String tituloCreditos;
	
	@ManyToMany(targetEntity=basededatos.Lista_Reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Lista_Reproduccion_Cancion", joinColumns={ @JoinColumn(name="CancionIdCancion") }, inverseJoinColumns={ @JoinColumn(name="Lista_ReproduccionIdLista") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contendor_cancion = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_tiene", targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_de = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_favorita", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_favorita_de = new java.util.HashSet();
	
	@ManyToOne(targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioID", referencedColumnName="ID") }, foreignKey=@ForeignKey(name="FKCancion71599"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario Administrado_por;
	
	private void setIdCancion(int value) {
		this.idCancion = value;
	}
	
	public int getIdCancion() {
		return idCancion;
	}
	
	public int getORMID() {
		return getIdCancion();
	}
	
	public void setArchivoMultimedia(String value) {
		this.archivoMultimedia = value;
	}
	
	public String getArchivoMultimedia() {
		return archivoMultimedia;
	}
	
	public void setIntepretes(String value) {
		this.intepretes = value;
	}
	
	public String getIntepretes() {
		return intepretes;
	}
	
	public void setProductores(String value) {
		this.productores = value;
	}
	
	public String getProductores() {
		return productores;
	}
	
	public void setCompositores(String value) {
		this.compositores = value;
	}
	
	public String getCompositores() {
		return compositores;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTituloCreditos(String value) {
		this.tituloCreditos = value;
	}
	
	public String getTituloCreditos() {
		return tituloCreditos;
	}
	
	public void setCancion_de(basededatos.Album value) {
		if (cancion_de != null) {
			cancion_de.contiene_cancion.remove(this);
		}
		if (value != null) {
			value.contiene_cancion.add(this);
		}
	}
	
	public basededatos.Album getCancion_de() {
		return cancion_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cancion_de(basededatos.Album value) {
		this.cancion_de = value;
	}
	
	private basededatos.Album getORM_Cancion_de() {
		return cancion_de;
	}
	
	private void setORM_Contendor_cancion(java.util.Set value) {
		this.ORM_contendor_cancion = value;
	}
	
	private java.util.Set getORM_Contendor_cancion() {
		return ORM_contendor_cancion;
	}
	
	@Transient	
	public final basededatos.Lista_ReproduccionSetCollection contendor_cancion = new basededatos.Lista_ReproduccionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_CONTENDOR_CANCION, basededatos.ORMConstants.KEY_LISTA_REPRODUCCION_CONTIENE_CANCION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public basededatos.Usuario[] getUsuarios() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = horass.getIterator();lIter.hasNext();) {
			lValues.add(((basededatos.Horas)lIter.next()).getUsuario());
		}
		return (basededatos.Usuario[])lValues.toArray(new basededatos.Usuario[lValues.size()]);
	}
	
	public void removeUsuario(basededatos.Usuario aUsuario) {
		basededatos.Horas[] lHorass = horass.toArray();
		for(int i = 0; i < lHorass.length; i++) {
			if(lHorass[i].getUsuario().equals(aUsuario)) {
				horass.remove(lHorass[i]);
			}
		}
	}
	
	public void addUsuario(basededatos.Horas aHoras, basededatos.Usuario aUsuario) {
		aHoras.setUsuario(aUsuario);
		horass.add(aHoras);
	}
	
	public basededatos.Horas getHorasByUsuario(basededatos.Usuario aUsuario) {
		basededatos.Horas[] lHorass = horass.toArray();
		for(int i = 0; i < lHorass.length; i++) {
			if(lHorass[i].getUsuario().equals(aUsuario)) {
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
	public final basededatos.HorasSetCollection horass = new basededatos.HorasSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_HORASS, basededatos.ORMConstants.KEY_HORAS_CANCION, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_de(java.util.Set value) {
		this.ORM_es_de = value;
	}
	
	private java.util.Set getORM_Es_de() {
		return ORM_es_de;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection es_de = new basededatos.ArtistaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_ES_DE, basededatos.ORMConstants.KEY_ARTISTA_TIENE, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Favorita_de(java.util.Set value) {
		this.ORM_favorita_de = value;
	}
	
	private java.util.Set getORM_Favorita_de() {
		return ORM_favorita_de;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection favorita_de = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_FAVORITA_DE, basededatos.ORMConstants.KEY_USUARIO_FAVORITA, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrado_por(basededatos.Usuario value) {
		if (Administrado_por != null) {
			Administrado_por.ultimo_exito.remove(this);
		}
		if (value != null) {
			value.ultimo_exito.add(this);
		}
	}
	
	public basededatos.Usuario getAdministrado_por() {
		return Administrado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Administrado_por(basededatos.Usuario value) {
		this.Administrado_por = value;
	}
	
	private basededatos.Usuario getORM_Administrado_por() {
		return Administrado_por;
	}
	
	public String toString() {
		return String.valueOf(getIdCancion());
	}
	
}
