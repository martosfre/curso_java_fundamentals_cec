/**
 * 
 */
package com.matoosfe.ecommerce.vista;

import java.math.BigDecimal;

import com.matoosfe.ecommerce.control.ProductoTrs;
import com.matoosfe.ecommerce.control.TipoProductoTrs;
import com.matoosfe.ecommerce.control.util.UtilLectura;
import com.matoosfe.ecommerce.modelo.Producto;
import com.matoosfe.ecommerce.modelo.TipoProducto;

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
				try {
					/*
					 * En el bloque try va todo el bloque de código que puede ocasionar error, solo
					 * existe un solo bloque try
					 */
					for (Object tipPro : adminPro.consultarTodos()) {
						System.out.println(tipPro);
					}
				} catch (Exception e) {
					/*
					 * Se puede tener más de un bloque catch y sirve para controlar el error.
					 */
					// Solo ocuparse en desarrollo, imprime la pila de error
					// e.printStackTrace();
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos:");
				int id = 0;
				TipoProducto tipoProducto = null;
				try {
					System.out.print("Id:");
					id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Nombre:");
					nombre = UtilLectura.leerDesdeTeclado();
					System.out.println("Descripción:");
					descripcion = UtilLectura.leerDesdeTeclado();
					System.out.println("Precio:");
					precio = new BigDecimal(UtilLectura.leerDesdeTeclado());
					/******************************************************
					 * Bloque para relacionar el objeto
					 ********************************************************/
					System.out.print("Tipos de productos:");
					System.out.println(adminTiPro.imprimirListaFormateada());
					System.out.print("Ingreso el tipo de producto:");
					int idTipPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					tipoProducto = (TipoProducto) adminTiPro.consultarPorId(idTipPro);
					/*******************************************************************************/
					// 2.Crear un registro (objeto de TipoProducto)
					producto = new Producto(id, nombre, descripcion, precio, tipoProducto);
					
					// 3. Llamar al controlador (el tiene las operaciones)
					try {
						mensaje = adminPro.guardar(producto);
						// 4. Procesar la información
						System.out.println(mensaje);
					} catch (Exception e) {
						System.err.println("Error al guardar:" + e.getMessage());
					}
				} catch (NumberFormatException e1) {
					System.err.println("Datos númericos incorrectos!!!");
				} catch (Exception e1) {
					System.err.println(e1.getMessage());
				}



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
				producto = new Producto(idPro, nombre, descripcion, precio, null);

				// 4. Llamar al controlador (el tiene las operaciones)
				try {
					mensaje = adminPro.actualizar(producto);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 5. Procesar la información
				System.out.println(mensaje);
				break;
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				try {
					for (Object pro : adminPro.consultarTodos()) {
						System.out.println(pro);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					/*
					 * Existe o no existe error siempre se ejecuta, se puede utilizar para
					 * auditoria, logs, cierre de conexiones envio de alertas
					 */
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				try {
					Producto proEli = adminPro.consultarPorId(idProEli);

					// 3.Llamar al controlar para eliminar
					mensaje = adminPro.eliminar(proEli);
				} catch (Exception e) {
					System.err.println("Eror al consultor código:" + e.getMessage());
				}
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
