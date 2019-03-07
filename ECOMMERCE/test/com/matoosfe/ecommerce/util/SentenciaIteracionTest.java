/**
 * 
 */
package com.matoosfe.ecommerce.util;

/**
 * Clase que permitirá ejemplificar el uso de las sentencias de iteración for,
 * for each, while, do-while
 * 
 * @author martosfre
 *
 *         28 feb. 2019 - 19:21:26 <a href="www.matoosfe.com">Soporte</a>
 */
public class SentenciaIteracionTest {

	private int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	/**
	 * Método para testear el for Tiene 3 secciones: 1)Inicialización(donde comienza
	 * a iterar), 2) Condición (hasta donde itera), 3)Iteración (como itera)
	 */
	public void testearSentenciaFor() {
		System.out.println("Ejemplo de for");
		for (int i = 2; i < numeros.length - 1; i = i + 2) {
			System.out.println(numeros[i]);
		}
	}

	/**
	 * Método para testear el for each. Itera en toda la estructura
	 */
	public void testearSentenciaForEach() {
		System.out.println("Ejemplo for each");
		for (int i : numeros) {
			System.out.println(i);
		}
	}

	/**
	 * Método para testear el while. Itera hasta que se cumpla una condición, el tema de iteración es dentro
	 * del while
	 */
	public void testearSentenciaWhile() {
		System.out.println("Ejemplo while");
		int i = 0;
		while (numeros[i] != 5) {
			System.out.println(numeros[i]);
			i++;
		}
	}

	/**
	 * Método para testear el do while, es similar al while pero con la diferencia que se ejecuta al menos una
	 * vez cumpla o no la condición
	 */
	public void testearSentenciaDoWhile() {
		System.out.println("Ejemplo do while");
		int i = 0;
		do{
			System.out.println(numeros[i]);
			i++;
		}while (numeros[i-1] != 1);
	}

	public static void main(String[] args) {
		SentenciaIteracionTest senIte = new SentenciaIteracionTest();
		senIte.testearSentenciaFor();
		senIte.testearSentenciaForEach();
		senIte.testearSentenciaWhile();
		senIte.testearSentenciaDoWhile();
	}
}
