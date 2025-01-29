package ups.edu.ec.pruebaServicios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="partido")
	private String partido;
	
	@Column(name="vicepresidente")
	private String vicepresidente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getVicepresidente() {
		return vicepresidente;
	}

	public void setVicepresidente(String vicepresidente) {
		this.vicepresidente = vicepresidente;
	}

	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", partido=" + partido
				+ ", vicepresidente=" + vicepresidente + "]";
	}
	
	
}
