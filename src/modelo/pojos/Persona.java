package modelo.pojos;

import exceptions.NotNullDNI;
import modelo.enums.TipoPersona;

public class Persona extends Aspirante {
	private TipoPersona tipoPersona;
	
	public Persona(String nombre, String dni, TipoPersona tipoPersona) throws NullPointerException, NotNullDNI {
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
