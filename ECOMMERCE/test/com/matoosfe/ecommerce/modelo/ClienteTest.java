/**
 * 
 */
package com.matoosfe.ecommerce.modelo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Clase que permitirá testear a la clase Cliente
 * 
 * @author martosfre
 *
 *         20 feb. 2019 - 20:33:06 <a href="www.matoosfe.com">Soporte</a>
 */
public class ClienteTest {
	public static void main(String[] args) {
		// Plantilla Objeto instanciacion a traves del constructor
		Cliente clienteA = new Cliente();
		clienteA.setNombrePer("Marco");
		clienteA.setApellidoPer("Toscano");
		clienteA.setCorreoPer("mtoscano@matoosfe.com");

		Cliente clienteB = new Cliente();
		clienteB.setNombrePer("Marco");
		clienteB.setApellidoPer("Toscano");
		clienteB.setCorreoPer("mtoscano@matoosfe.com");

		MedioPago medioPago = new MedioPago();
		//TODO Me falta imprimir la informacion del cliente C
		Cliente clienteC = new Cliente("Mario", "Romero", "1717865447", new Date(), "Vicentina", "022457896",
				"mromero@gmail.com", new BigDecimal("345"), medioPago);
		//Imprimir a consola
		System.out.println("Nombre:" + clienteC.getApellidoPer());
	}
}
