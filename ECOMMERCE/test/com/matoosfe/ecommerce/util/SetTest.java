/**
 * 
 */
package com.matoosfe.ecommerce.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.matoosfe.ecommerce.modelo.Producto;
import com.matoosfe.ecommerce.modelo.TipoProducto;

/**
 * Clase para ejemplificar el uso de la collection Set - No permite duplicados,
 * siempre y cuando se realice la implementación de los métodos hashCode, equals
 * en la clase unitaria de la collection.
 * 
 * @author martosfre 18 mar. 2019 - 19:07:21
 */
public class SetTest {
	// 1. Declarar la collection
	private HashSet<Producto> productos;

	public SetTest() {
		// 2. Inicializar la collection
		this.productos = new HashSet<Producto>();
	}

	/**
	 * Método para añadir elemento
	 */
	public void anadirElemento(Producto producto) {
		this.productos.add(producto);
	}

	/**
	 * Método para obtener el elemento
	 * 
	 * @return
	 */
	public Producto obtenerElemento(int id) {
		Producto proRec = null;
		for (Producto pro : productos) {
			if (pro.getIdPro() == id) {
				proRec = pro;
			}
		}
		return proRec;
	}

	/**
	 * @return the productos
	 */
	public HashSet<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(HashSet<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * Método para imprimir elementos
	 */
	public void imprimirElementos(Collection valores) {
		for (Object producto : valores) {
			System.out.println(producto);
		}
	}

	/**
	 * Método para quitar duplicados
	 * 
	 * @param productos
	 */
	public void quitarDuplicados(List<Producto> productos) {
		System.out.println("Valores Lista");
		imprimirElementos(productos);
		HashSet<Producto> productosNoDuplicados = new HashSet<Producto>(productos);
		System.out.println("Valores Set");
		imprimirElementos(productosNoDuplicados);
	}

	public static void main(String[] args) {
		SetTest setTes = new SetTest();
		System.out.println("Lista Productos inicial");
		setTes.imprimirElementos(setTes.getProductos());

		TipoProducto tipPro = new TipoProducto();
		tipPro.setIdTipPro(1);
		tipPro.setNombreTipPro("Camisas");

		Producto proA = new Producto(1, "A", "B", new BigDecimal(4.2), tipPro);
		setTes.anadirElemento(proA);
		System.out.println("Lista Productos - Producto A");
		setTes.imprimirElementos(setTes.getProductos());

		Producto proB = new Producto(1, "A", "C", new BigDecimal(4.2), tipPro);
		setTes.anadirElemento(proB);
		System.out.println("Lista Productos - Producto B");
		setTes.imprimirElementos(setTes.getProductos());
		
		System.out.println("Convertir duplicados");
		ArrayList<Producto> productosDuplicados = new ArrayList<Producto>();
		productosDuplicados.add(proA);
		productosDuplicados.add(proB);
		setTes.quitarDuplicados(productosDuplicados);
	}

}
