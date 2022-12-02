package modelo.pojos;

import java.util.Objects;

import modelo.enums.TipoPersona;

public class Persona extends Aspirante {
	private TipoPersona tipoPersona;
	
	public Persona(String nombre, String dni, TipoPersona tipoPersona) {
		super(nombre, dni);
		this.tipoPersona = tipoPersona;
	}
	
	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}
	
	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@Override
	public String toString() {
		return "Persona [" + super.toString() + ", tipoPersona=" + tipoPersona + "]";
	}
	
	
}
