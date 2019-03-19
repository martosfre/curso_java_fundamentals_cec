/**
 * 
 */
package com.matoosfe.ecommerce.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 * Clase que representa la base de datos en memoria
 * Base de datos
 * - Estructura de datos o información (estáticas o dinámicas)
 * - Varias tablas (contenedores de información de un cierto tipo)
 * - Relaciones Tablas (Forma se articula esos contenedores)
 * - Lenguaje para consultar esa información - SQL
 * - Operaciones CRUD se realizan sobre una o varias tablas - C (Create o insertar o guardar), R (Retrieve - consultar),
 *   U(Update - actualizar o modificar), D(Delete o eliminar o remover)
 * @author martosfre
 *
 * 26 feb. 2019 - 18:58:29
 * <a href="www.matoosfe.com">Soporte</a>
 */
public class MemoriaBdd {
	/*
	 * Cuando se coloca a una variable como static solamente se crea un espacio en memoria independientemente,
	 * si crean n objetos. Ejm. Contador de pagina
	 */
	private static Cliente[] clientes;
	public static Usuario[] usuarios;
	
	/************************************************/
	//1. Se utilizó un arreglo
	public static TipoProducto[] tipoProductos;
	// 2. Se utilizó una colección de tipo Lista
	public static ArrayList<Producto> productos;
	/*************************************************/
	
	public static int contadorTipPro = 0;
	
//	public MemoriaBdd() {
//		usuarios = new Usuario[3];
//		inicializarUsuarios(); //no static 
//	}
	
	/*
	 * Bloque static es un bloque automático que solo soporta temas static
	 */
	static {
		usuarios = new Usuario[4];
		/**************************************************/
		tipoProductos = new TipoProducto[5];
		productos = new ArrayList<Producto>();
		/**************************************************/
		inicializar(); //Solo se acepta métodos static
	}

	private static void inicializar() {
		usuarios[0] = new Usuario("mtoscano", "1234", new Date());
		usuarios[1] = new Usuario("lescobar", "1235", new Date());
		usuarios[2] = new Usuario("cbermeo", "1236", new Date());
	}
	
	/**
	 * Método para imprimir la información de la bdd, el cual marcado como static
	 * porque es un método que se utiliza con mucha frecuencia y seria desgastante en 
	 * recursos instanciar un objeto para utilizar el  método
	 */
	public static void imprimirInfoBdd() {
		System.out.println("MemoriaBdd V 1.0 - Marco Toscano - CEC-EPN");
	}
	
	public static void main(String[] args) {
		//1)Se debe crear un objeto para utilizar el método
		MemoriaBdd bddDes = new MemoriaBdd();
		bddDes.imprimirInfoBdd();
		
		//2)Utilizar el método directamente
		MemoriaBdd.imprimirInfoBdd();
		
		MemoriaBdd bddTes = new MemoriaBdd();
		
		
	}
	
}
