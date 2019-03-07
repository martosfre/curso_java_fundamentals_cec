/**
 * 
 */
package com.matoosfe.ecommerce.control;

import com.matoosfe.ecommerce.modelo.MemoriaBdd;
import com.matoosfe.ecommerce.modelo.TipoProducto;

/**
 * Clase que tendrá las operaciones de negocio relacionadas con tipo de producto
 * 
 * @author martosfre
 *
 *         28 feb. 2019 - 19:54:01 <a href="www.matoosfe.com">Soporte</a>
 */
public class TipoProductoTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		if (registro != null) {
			MemoriaBdd.tipoProductos[0] =  (TipoProducto) registro;
			return "Tipo Producto guardado correctamente";
		} else {
			return "Debe llenar todos los datos!!!";
		}

	}

	@Override
	public String actualizar(int id, Object registro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] listar() {
		return MemoriaBdd.tipoProductos;
	}

	@Override
	public Object consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
