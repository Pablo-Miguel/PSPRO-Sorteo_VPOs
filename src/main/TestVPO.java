package main;

import modelo.enums.TipoPersona;
import modelo.enums.TipoVivienda;
import modelo.pojos.Ganador;
import modelo.pojos.Persona;
import modelo.pojos.Vivienda;

public class TestVPO {

	public static void main(String[] args) {
		Ganador<Persona, Vivienda> gan = new Ganador<Persona, Vivienda>(
				new Persona("", "", TipoPersona.CON_HIJOS), 
				new Vivienda("", "", TipoVivienda.CASA));
		

	}

}
