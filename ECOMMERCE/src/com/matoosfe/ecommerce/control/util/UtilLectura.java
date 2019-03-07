/**
 * 
 */
package com.matoosfe.ecommerce.control.util;

import java.util.Scanner;

/**
 * Clase que contendr� las operaciones utilitarias de lectura
 * @author martosfre
 *
 * 27 feb. 2019 - 19:30:07
 * <a href="www.matoosfe.com">Soporte</a>
 */
public class UtilLectura {
	
	/**
	 * M�todo para leer desde el teclado
	 * @return
	 */
	public static String leerDesdeTeclado() {
		String valorALeer = null;
		//Construyendo un lector que lee desde la entrada est�ndar
		Scanner lector = new Scanner(System.in);
		//Leyendo el valor ingresado en formato cadena
		valorALeer = lector.next();
		//TODO Cerrar el lector
		//lector.close();
		return valorALeer;
	}
}
