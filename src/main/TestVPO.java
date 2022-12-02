package main;

import java.util.ArrayList;

import modelo.enums.TipoPersona;
import modelo.enums.TipoVecinal;
import modelo.enums.TipoVivienda;
import modelo.pojos.Aspirante;
import modelo.pojos.Ganador;
import modelo.pojos.Organizacion;
import modelo.pojos.Persona;
import modelo.pojos.Vivienda;

public class TestVPO {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Aspirante>> aspirantes = listaAspirantes();
		
		
		
	}
	
	public static ArrayList<ArrayList<Aspirante>> listaAspirantes(){
		ArrayList<Aspirante> lista1 = new ArrayList<Aspirante>();
		
		lista1.add(new Persona("Pablo Miguel", "00000000A", TipoPersona.SIN_HIJOS));
		lista1.add(new Persona("Vicente", "00000000B", TipoPersona.MINUSVALIDO));
		lista1.add(new Persona("Fernando", "00000000C", TipoPersona.CON_HIJOS));
		lista1.add(new Organizacion("Juancho", "00000000D", TipoVecinal.BARRIADA_ESPANA));
		lista1.add(new Organizacion("Pepe", "00000000E", TipoVecinal.EL_PELIRON));
		
		ArrayList<Aspirante> lista2 = new ArrayList<Aspirante>();
		
		lista2.add(new Persona("Marta", "00000000F", TipoPersona.SIN_HIJOS));
		lista2.add(new Persona("Pepa", "00000000G", TipoPersona.MINUSVALIDO));
		lista2.add(new Persona("Gerónimo", "00000000H", TipoPersona.CON_HIJOS));
		lista2.add(new Organizacion("Juancho", "00000000I", TipoVecinal.BARRIADA_ESPANA));
		lista2.add(new Organizacion("Pepe", "00000000J", TipoVecinal.EL_PELIRON));
		
		ArrayList<ArrayList<Aspirante>> matriz = new ArrayList<ArrayList<Aspirante>>();
		
		matriz.add(lista1);
		matriz.add(lista2);
		
		return matriz;
		
	}

}
