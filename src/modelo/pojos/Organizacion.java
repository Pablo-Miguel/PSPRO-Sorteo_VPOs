package modelo.pojos;

import java.util.Objects;

import modelo.enums.TipoVecinal;

public class Organizacion {
	private String nombre, dni;
	private TipoVecinal tipoVPO;
	
	public Organizacion(String nombre, String dni, TipoVecinal tipoVPO) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.tipoVPO = tipoVPO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public TipoVecinal getTipoVPO() {
		return tipoVPO;
	}

	public void setTipoVPO(TipoVecinal tipoVPO) {
		this.tipoVPO = tipoVPO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organizacion other = (Organizacion) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Organizacion [nombre=" + nombre + ", dni=" + dni + ", tipoVPO=" + tipoVPO + "]";
	}
	
}
