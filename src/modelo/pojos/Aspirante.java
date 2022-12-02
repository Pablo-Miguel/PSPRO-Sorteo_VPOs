package modelo.pojos;

import java.util.Objects;

import exceptions.NotNullDNI;

public abstract class Aspirante {
	private String nombre, dni;

	public Aspirante(String nombre, String dni) throws NotNullDNI, NullPointerException {
		super();
		
		if(!nombre.equals(null) && !nombre.equals("")) {
			this.nombre = nombre;
		} else {
			throw new NullPointerException("El nombre no puede ser null");
		}
		
		if(!dni.equals(null) && !dni.equals("")) {
			this.dni = dni;
		} else {
			throw new NotNullDNI();
		}
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
		Aspirante other = (Aspirante) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", dni=" + dni;
	}
	
}
