/**
 * 
 */
package com.matoosfe.ecommerce.util;

import java.util.ArrayList;
import java.util.List;

import com.matoosfe.ecommerce.modelo.MedioPago;
import com.matoosfe.ecommerce.modelo.TipoProducto;

/**
 * Clase para ejemplificar el uso de collections - Estructura con tama�o
 * din�mico - Almacenar m�ltiples tipos de datos -> Mejora Generics - un solo
 * tipo - List, Set, Queue, las 3 son interfaces -> Especial no es colleccion
 * ->Map - java.util es el paquete - Para utilizar se utiliza las
 * implementaciones de cada
 * 
 * @author martosfre 11 mar. 2019 - 20:42:48
 */
public class ListTest {
	/*
	 * Caracteristicas Listas:
	 * - El orden no importa
	 * - Permite duplicados
	 * - Se accede por un �ndice
	 */
	// Declarando las listas
	private List<TipoProducto> listaTipoProductos;

	// 1. Declarando la lista
	private ArrayList listaValores;
	//Declarando listo de un solo tipo con generics
	private ArrayList<String> listaCadenas;
	private ArrayList<String> listaCadenasDos;

	public ListTest() {
		// 2.Inicializar
		this.listaValores = new ArrayList();
		this.listaCadenasDos = new ArrayList<String>();
		this.listaCadenas = new ArrayList<String>();
	}

	/**
	 * M�todo para a�adir valores
	 */
	public void anadirValores(String valor) {
		/*
		 * A�adir valores de diferentes tipos, pero en este escenario se dificulto
		 * el procesamiento de esta informaci�n xq requeria m�s capacidades y 
		 * existia errores de conversi�n
		 */
		this.listaValores.add(5);
		this.listaValores.add("Ecuador");
		this.listaValores.add(new MedioPago());
		
		
		// A�adir un valor de un mismo tipo a trav�s de generics
		this.listaCadenasDos.add(valor);
		//this.listaCadenas.add(5);//error
		// A�adir en una posici�n espec�fica
		this.listaCadenasDos.add(4, valor);
		// A�adir una lista de valores
		this.listaCadenasDos.addAll(listaCadenas);
		//Permite duplicados
		this.listaCadenasDos.add("Pepe");
		this.listaCadenasDos.add("Pepe");
	}
	
	public void actualizarValores(int pos, String valor) {
		this.listaCadenasDos.set(pos, valor);
	}
	
	public void eliminarValores(int pos) {
		this.listaCadenasDos.remove(pos);
	}
	
	public String consultarObjeto(String valor) {
		int pos = this.listaCadenasDos.indexOf(valor);
		return this.listaCadenasDos.get(pos);
	}

	public void inicializarInterfaz() {
		/*
		 * Las interfaces no se instancian, pero se puede instanciar una clase concreta
		 * y asociarle a una interfaz para garantizar la seguridad de la clase y mejorar
		 * el estilo de programaci�n
		 */

		this.listaCadenas = new ArrayList<String>();
		this.listaCadenas.add("Marco");
	}
}
