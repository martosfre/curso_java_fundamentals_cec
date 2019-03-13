/**
 * 
 */
package com.matoosfe.ecommerce.vista;

import java.math.BigDecimal;

import com.matoosfe.ecommerce.control.ProductoTrs;
import com.matoosfe.ecommerce.control.TipoProductoTrs;
import com.matoosfe.ecommerce.control.util.UtilLectura;
import com.matoosfe.ecommerce.modelo.Producto;

/**
 * Clase que representa
 * 
 * @author martosfre
 *
 *         27 feb. 2019 - 20:42:36 <a href="www.matoosfe.com">Soporte</a>
 */
public class FrmProducto {
	public FrmProducto() {
		crearMenuProducto();
	}

	/**
	 * Método para crear el menú de producto
	 */
	private void crearMenuProducto() {
		int opcion = 0;
		ProductoTrs adminPro = new ProductoTrs();
		TipoProductoTrs adminTiPro = new TipoProductoTrs();
		Object[] listaProductos = null;
		String mensaje = null;
		Producto producto = null;
		String nombre = null;
		String descripcion = null;
		BigDecimal precio = null;

		do {
			System.out.println("\n\n*************************************");
			System.out.println("* E-COMMERCE V 1.0 -> PRODUCTO *");
			System.out.println("*************************************");
			System.out.println("1. Listar");
			System.out.println("2. Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar");
			System.out.print("... Seleccione una opción:");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			switch (opcion) { 
			case 1:
				for (Object tipPro : adminPro.consultarTodos()) {
					System.out.println(tipPro);
				}
				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos:");
				System.out.print("Id:");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Nombre:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.println("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();
				System.out.println("Precio:");
				precio = new BigDecimal(UtilLectura.leerDesdeTeclado());

				// 2.Crear un registro (objeto de TipoProducto)
				producto = new Producto(id,nombre,descripcion, precio, null);

				// 3. Llamar al controlador (el tiene las operaciones)
				mensaje = adminPro.guardar(producto);

				// 4. Procesar la información
				System.out.println(mensaje);

				break;
			case 3:
				// 1. A que registro le van a actualizar
				System.out.print("Cuál registro se debe eliminar, colocar id:");
				int idPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 2.Recuperando los valores menos su id
				System.out.println("Ingresar los datos:");
				System.out.print("Nombre:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.println("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();
				System.out.println("Precio:");
				precio = new BigDecimal(UtilLectura.leerDesdeTeclado());

				// 3.Crear un registro para actualizar (objeto de TipoProducto)
				producto = new Producto(idPro,nombre,descripcion, precio, null);

				// 4. Llamar al controlador (el tiene las operaciones)
				mensaje = adminPro.actualizar(producto);

				// 5. Procesar la información
				System.out.println(mensaje);
				break;
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				for (Object pro : adminPro.consultarTodos()) {
					System.out.println(pro);
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idTipProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 3.Llamar al controlar para eliminar
				mensaje = adminPro.eliminar(idTipProEli);
				System.out.println(mensaje);
				break;
			case 5:
				FrmPrincipal frmPrincipal = new FrmPrincipal();
			default:
				System.err.println("Opción Incorrecta!!!");
				break;

			}
		} while (opcion != 5);
	}
}
