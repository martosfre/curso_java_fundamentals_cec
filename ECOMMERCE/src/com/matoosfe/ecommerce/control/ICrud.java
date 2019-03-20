/**
 * 
 */
package com.matoosfe.ecommerce.control;

/**
 * Tipo de clase que representa el contrato de negocio para las operaciones de la bdd
 * @author martosfre
 *
 * 28 feb. 2019 - 19:59:52
 * <a href="www.matoosfe.com">Soporte</a>
 */
public interface ICrud {
	public String guardar(Object registro);
	
	public String actualizar(int id, Object registro);
	
	public String eliminar(int id);
	
	public Object[] listar();
	
	public Object consultarPorId(int id) throws Exception;
}
