/**
 * 
 */
package com.matoosfe.ecommerce.vista;

import com.matoosfe.ecommerce.control.util.UtilLectura;
import com.matoosfe.ecommerce.modelo.Usuario;

/**
 * Clase que representa el formulario principal
 * @author martosfre
 *
 * 25 feb. 2019 - 20:36:36
 * <a href="www.matoosfe.com">Soporte</a>
 */
public class FrmPrincipal {
	public FrmPrincipal() {
		crearMenuPrincipal();
	}

	/**
	 * Método para crear el menú principal
	 */
	private void crearMenuPrincipal() {
		int opcion = 0;
		System.out.println("\n\n****************************");
		System.out.println("*     E-COMMERCE V 1.0     *");
		System.out.println("****************************");
		System.out.println("1. TIPO PRODUCTO");
		System.out.println("2. PRODUCTO");
		System.out.println("3. CLIENTE");
		System.out.println("4. PROVEEDOR");
		System.out.println("5. COMPRAR");
		System.out.println("6. SALIR");
		System.out.print("... Seleccione una opción:");
		opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
		//Sentencias de Decisión - switch
		switch (opcion) { //Entero o Cadena
		case 1:
			FrmTipoProducto frmTipPro = new FrmTipoProducto();
			break;
		case 2:
			FrmProducto frmProducto = new FrmProducto();
			break;
		case 3:
			FrmCliente frmCliente = new FrmCliente();
			break;
		case 4:
			FrmProveedor frmProveedor = new FrmProveedor();
			break;
		case 5:
			FrmCompras frmCompras = new FrmCompras();
			break;
		case 6:
			System.exit(0); //Acabar el programa
		default:
			System.err.println("Opción Incorrecta!!!");
			break;
		}
		
	}


}
