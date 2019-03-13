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

	public String guardar(Object registro);
	public String actualizar(Object registro);
	public String eliminar(Object registro);
	/*
	 * Con el wildcard ? se devuelve cualquier lista de objetos de algún tipo
	 */
	public List<?> consultarTodos();
}
