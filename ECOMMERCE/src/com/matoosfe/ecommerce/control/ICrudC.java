/**
 * 
 */
package com.matoosfe.ecommerce.control;

import java.util.List;

/**
 * Interface para definir los métodos CRUD utilizando Collections
 * @author martosfre
 * 12 mar. 2019 - 20:06:17
 */
public interface ICrudC {

	/**
	 * Definición de método para guardar
	 * @param registro
	 * @return
	 */
	public String guardar(Object registro);
	/**
	 * Definición de método para actualizar
	 * @param registro
	 * @return
	 */
	public String actualizar(Object registro);
	
	/**
	 * Definición de método para eliminar
	 * @param registro
	 * @return
	 */
	public String eliminar(Object registro);
	/**
	 * Definición de método para consultar
	 * @return
	 */
	/*
	 * Con el wildcard ? se devuelve cualquier lista de objetos de algún tipo
	 */
	public List<?> consultarTodos();
}
