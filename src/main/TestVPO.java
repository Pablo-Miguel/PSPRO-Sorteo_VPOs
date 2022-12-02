package main;

import java.util.ArrayList;
import java.util.Collections;

import exceptions.NotNullDNI;
import modelo.enums.TipoPersona;
import modelo.enums.TipoVecinal;
import modelo.enums.TipoVivienda;
import modelo.pojos.Aspirante;
import modelo.pojos.Ganador;
import modelo.pojos.Organizacion;
import modelo.pojos.Persona;
import modelo.pojos.Vivienda;

public class TestVPO {
	
	public static final Integer CONST_CON_HIJOS = 3;
	public static final Integer CONST_MINUSVALIDO = 2;

	public static void main(String[] args) {
		try {
			ArrayList<ArrayList<Aspirante>> aspirantes = listaAspirantes();
			ArrayList<Vivienda> viviendas = listaViviendas();
			
			ArrayList<Ganador<Aspirante, Vivienda>> listaGanadores = new ArrayList<Ganador<Aspirante, Vivienda>>();
			ArrayList<Aspirante> cupo = new ArrayList<Aspirante>();
			
			for(int i = 0; i < aspirantes.size(); i++) {
				
				for(int j = 0; j < aspirantes.get(i).size(); j++) {
					
					if (aspirantes.get(i).get(j) instanceof Persona) {
						
						Persona pers = (Persona) aspirantes.get(i).get(j);
						
						if(pers.getTipoPersona().equals(TipoPersona.CON_HIJOS)) {
							for(int k = 0; k < CONST_CON_HIJOS; k++) {
								
								cupo.add(pers);
								
							}
						} else if (pers.getTipoPersona().equals(TipoPersona.MINUSVALIDO)) {
							for(int k = 0; k < CONST_MINUSVALIDO; k++) {
								
								cupo.add(pers);
								
							}
						} else {
							
							cupo.add(pers);
							
						}
					} else {
						
						cupo.add(aspirantes.get(i).get(j));
						
					}	
				}
			}
			
			while(viviendas.size() > 0) {
				Collections.shuffle(viviendas);
				Collections.shuffle(cupo);
				
				listaGanadores.add(new Ganador<Aspirante, Vivienda>(cupo.get(0), viviendas.get(0)));
				cupo.remove(0);
				viviendas.remove(0);
				
			}
			
			//Ganadores
			for(int i = 0; i < listaGanadores.size(); i++) {
				System.out.println(listaGanadores.get(i).toString());
			}
			
		} catch (NotNullDNI e) {
			
			System.out.println(e.getMessage());
			
		} catch (NullPointerException e) {
			
			System.out.println(e.getMessage());
			
		}
	}
	
	public static ArrayList<ArrayList<Aspirante>> listaAspirantes() throws NullPointerException, NotNullDNI{
		ArrayList<Aspirante> lista1 = new ArrayList<Aspirante>();
		
		lista1.add(new Persona("Pablo", "00000000A", TipoPersona.SIN_HIJOS));
		lista1.add(new Persona("Vicente", "00000000B", TipoPersona.MINUSVALIDO));
		lista1.add(new Persona("Fernando", "00000000C", TipoPersona.CON_HIJOS));
		lista1.add(new Organizacion("Juancho", "00000000D", TipoVecinal.BARRIADA_ESPANA));
		lista1.add(new Organizacion("Pepe", "00000000E", TipoVecinal.EL_PELIRON));
		
		ArrayList<Aspirante> lista2 = new ArrayList<Aspirante>();
		
		lista2.add(new Persona("Marta", "00000000F", TipoPersona.SIN_HIJOS));
		lista2.add(new Persona("Marcos", "00000000G", TipoPersona.MINUSVALIDO));
		lista2.add(new Persona("Geronimo", "00000000H", TipoPersona.CON_HIJOS));
		lista2.add(new Organizacion("Manu", "00000000I", TipoVecinal.BARRIADA_ESPANA));
		lista2.add(new Organizacion("Adrian", "00000000J", TipoVecinal.EL_PELIRON));
		
		ArrayList<ArrayList<Aspirante>> matriz = new ArrayList<ArrayList<Aspirante>>();
		
		matriz.add(lista1);
		matriz.add(lista2);
		
		return matriz;
		
	}
	
	public static ArrayList<Vivienda> listaViviendas(){
		ArrayList<Vivienda> lista = new ArrayList<Vivienda>();
		
		lista.add(new Vivienda("1", "C/ Calle1", TipoVivienda.CASA));
		lista.add(new Vivienda("2", "C/ Calle2", TipoVivienda.CASA));
		lista.add(new Vivienda("3", "C/ Calle3", TipoVivienda.PISO));
		lista.add(new Vivienda("4", "C/ Calle4", TipoVivienda.CASA));
		lista.add(new Vivienda("5", "C/ Calle5", TipoVivienda.PISO));
		
		return lista;
		
	}

}
