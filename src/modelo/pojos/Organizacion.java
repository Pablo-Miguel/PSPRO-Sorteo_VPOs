package modelo.pojos;

import modelo.enums.TipoVecinal;

public class Organizacion extends Aspirante {
	private TipoVecinal tipoVecinal;
	
	public Organizacion(String nombre, String dni, TipoVecinal tipoVecinal) {
		super(nombre, dni);
		this.tipoVecinal = tipoVecinal;
	}

	public TipoVecinal getTipoVecinal() {
		return tipoVecinal;
	}

	public void setTipoVecinal(TipoVecinal tipoVecinal) {
		this.tipoVecinal = tipoVecinal;
	}

	@Override
	public String toString() {
		return "Organizacion [" + super.toString() + ", tipoVecinal=" + tipoVecinal + "]";
	}
	
}
