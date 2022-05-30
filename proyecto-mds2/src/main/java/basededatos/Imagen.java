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
@Table(name="Imagen")
public class Imagen implements Serializable {
	public Imagen() {
	}
	
	@Column(name="IdImagen", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_IMAGEN_IDIMAGEN_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_IMAGEN_IDIMAGEN_GENERATOR", strategy="native")	
	private int idImagen;
	
	@Column(name="Url", nullable=true, length=255)	
	private String url;
	
	@OneToOne(mappedBy="contiene_imagen", targetEntity=basededatos.Album.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Album contenedor_imagen_album;
	
	@OneToOne(mappedBy="contiene_imagen", targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario imagen_de;
	
	private void setIdImagen(int value) {
		this.idImagen = value;
	}
	
	public int getIdImagen() {
		return idImagen;
	}
	
	public int getORMID() {
		return getIdImagen();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setContenedor_imagen_album(basededatos.Album value) {
		if (this.contenedor_imagen_album != value) {
			basededatos.Album lcontenedor_imagen_album = this.contenedor_imagen_album;
			this.contenedor_imagen_album = value;
			if (value != null) {
				contenedor_imagen_album.setContiene_imagen(this);
			}
			if (lcontenedor_imagen_album != null && lcontenedor_imagen_album.getContiene_imagen() == this) {
				lcontenedor_imagen_album.setContiene_imagen(null);
			}
		}
	}
	
	public basededatos.Album getContenedor_imagen_album() {
		return contenedor_imagen_album;
	}
	
	public void setImagen_de(basededatos.Usuario value) {
		if (this.imagen_de != value) {
			basededatos.Usuario limagen_de = this.imagen_de;
			this.imagen_de = value;
			if (value != null) {
				imagen_de.setContiene_imagen(this);
			}
			if (limagen_de != null && limagen_de.getContiene_imagen() == this) {
				limagen_de.setContiene_imagen(null);
			}
		}
	}
	
	public basededatos.Usuario getImagen_de() {
		return imagen_de;
	}
	
	public String toString() {
		return String.valueOf(getIdImagen());
	}
	
}
