/**
 * 
 */
package com.matoosfe.ecommerce.util;

/**
 * Tipo de clase para definir constantes con más de un valor.
 * @author martosfre
 * 6 mar. 2019 - 20:11:48
 */
public enum ConstanteEnumTest {
	EMPRESA("Matoosfe", "1789564213501"),
	COLOR_BLANCO("Blanco", "#ffffff"),
	DIRECTORIO_GIT("ProyectoGIT", "C:\\CURSO_JAVAI\\ProyectosGit");
	
	private String nombre;
	private String valor;
	
	//El constructor es necesario cuando se tiene valores
	private ConstanteEnumTest(String nombre, String valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	
}
