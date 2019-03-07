/**
 * 
 */
package com.matoosfe.ecommerce.util;

/**
 * Clase para ejemplificar como realizar el Casting
 * Casting - Realizar una conversi�n de un tipo a otro.
 * @author martosfre
 * 6 mar. 2019 - 20:31:47
 */
public class CastingTest {

	/**
	 * M�todo para castear un tipo de dato primitivo a su Wrapper (Contenedor)
	 * de manera autom�tico, a partir de la versi�n 1.5
	 * Tipo Primitivos: byte, short, int, long, float, double, char, boolean
	 * Wrapper ->Tipo de Objeto del primitivo:Byte, Short, Integer, Long, Float, Double,
	 * Character, Boolean
	 */
	public void testearAuboxing() {
		System.out.println("Casting autom�tico de primitivo a Wrapper");
		int numeroA = 5;
		Integer numeroB = numeroA;
		System.out.println(numeroB.byteValue());
	}
	
	/**
	 * M�todo para castear un tipo de dato Wrappwer a su primitivo
	 * de manera autom�tico, a partir de la versi�n 1.5
	 * Tipo Primitivos: byte, short, int, long, float, double, char, boolean
	 * Wrapper ->Tipo de Objeto del primitivo:Byte, Short, Integer, Long, Float, Double,
	 * Character, Boolean
	 */
	public void testearInboxing() {
		System.out.println("Casting autom�tico de Wrapper a primitivo");
		Integer numeroB = new Integer(5);
		int numeroA = numeroB;
		System.out.println(numeroA);
	}
	
	/**
	 * M�todo para castear un tipo de dato primitivo o objeto de menor a mayor
	 * de manera autom�tica.
	 * Tipo Primitivos: byte, short, int, long, float, double, char, boolean
	 */
	public void testearCastingImplicito() {
		int numeroA = 6;
		double numeroB = numeroA;
		short numeroShortA = 2;
		float numeroFloatA = numeroShortA;
	}
	
	/**
	 * M�todo para castear un tipo de dato primitivo o objeto de mayor a menor
	 * de manera manual.
	 * Tipo Primitivos: byte, short, int, long, float, double, char, boolean
	 */
	public void testerCastingExplicito() {
		double numeroB = 5.3555555555555555d;
		double numeroC = 6.8;
		int numeroA = (int) numeroB;
		System.out.println(numeroA);
	}
}
