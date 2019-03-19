/**
 * 
 */
package com.matoosfe.ecommerce.util;

import java.math.BigDecimal;
import java.util.HashMap;

import com.matoosfe.ecommerce.modelo.Producto;
import com.matoosfe.ecommerce.modelo.TipoProducto;

/**
 * Clase para ejemplificar el uso de mapas
 * - No permite duplicados, si envian un duplicado le actualiza al elemento
 * - Estructura de tipo key -value
 * @author martosfre
 * 18 mar. 2019 - 19:56:26
 */
public class MapTest {
	// 1. Declarar un mapa
	private HashMap<Integer, Producto> productos;
	
	public MapTest() {
		// 2. Inicializar la collection
		this.productos = new HashMap<Integer, Producto>();
	}
	
	/**
	 * Método para añadir un valor
	 * @param producto
	 */
	public void anadirValor(Producto producto) {
		this.productos.put(producto.getIdPro(), producto);
	}
	
	/**
	 * Método para remover un valor
	 * @param clavePro
	 */
	public void removerValor(int clavePro) {
		this.productos.remove(clavePro);
	}
	
	/**
	 * Método para obtener un valor
	 * @param clavePro
	 */
	public void recuperarValor(int clavePro) {
		Producto proRec = this.productos.get(clavePro);
		System.out.println(proRec);
	}
	
	/**
	 * Método para imprimir valores
	 */
	public void imprimirValores() {
		System.out.println("Valores Producto");
		for (Producto prod : productos.values()) {
			System.out.println(prod);
		}
		
		System.out.println("Claves Productos");
		for (Integer idTmp : productos.keySet()) {
			System.out.println(idTmp);
		}
	}
	
	public static void main(String[] args) {
		MapTest mapTes = new MapTest();
		TipoProducto tipPro = new TipoProducto();
		tipPro.setIdTipPro(1);
		tipPro.setNombreTipPro("Camisas");

		System.out.println("Añadir valor");
		Producto proA = new Producto(1, "A", "B", new BigDecimal(4.2), tipPro);
		mapTes.anadirValor(proA);
		mapTes.imprimirValores();
		
		System.out.println("Añadir valor duplicado igual");
		Producto proB = new Producto(1, "A", "B", new BigDecimal(4.2), tipPro);
		mapTes.anadirValor(proB);
		mapTes.imprimirValores();
		
		System.out.println("Añadir valor duplicado cambio");
		Producto proC = new Producto(1, "A", "C", new BigDecimal(4.2), tipPro);
		mapTes.anadirValor(proC);
		mapTes.imprimirValores();
	}
}
