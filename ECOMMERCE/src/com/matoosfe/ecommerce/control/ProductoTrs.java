/**
 * 
 */
package com.matoosfe.ecommerce.control;

import java.util.List;

import com.matoosfe.ecommerce.modelo.MemoriaBdd;
import com.matoosfe.ecommerce.modelo.Producto;

/**
 * @author martosfre 12 mar. 2019 - 20:33:51
 */
public class ProductoTrs implements ICrudC {

	@Override
	public String guardar(Object registro) {
		if (registro != null) {
			/*
			 * Para evitar duplicados se implementa los método hashCode/equals en la clase
			 * (tabla)
			 */
			boolean banIng = MemoriaBdd.productos.add((Producto) registro);
			if (banIng) {
				return "Registro guardado correctamente";
			} else {
				return "Registro duplicado";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String actualizar(Object registro) {
		if (registro != null) {
			/*
			 * Encontrar la posición basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontró el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posición; es decir se reemplaza
				MemoriaBdd.productos.set(pos, (Producto) registro);
				return "Registro actualizado correctamente";
			} else {
				return "No se encontró el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String eliminar(Object registro) {

		if (registro != null) {
			/*
			 * Encontrar la posición basada en el objeto, no interesa el id xq viene
			 * incluido
			 */
			int pos = MemoriaBdd.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontró el valor es mayor o igual a 0 caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posición; es decir se reemplaza
				MemoriaBdd.productos.remove(pos);
				return "Registro eliminado correctamente";
			} else {
				return "No se encontró el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	@Override
	public List<?> consultarTodos() {
		return MemoriaBdd.productos;
	}

	/**
	 * Método para consultar por id
	 * @param idProEli
	 * @return
	 */
	public Producto consultarPorId(int idProEli) {
		Producto proEnc = null;
		for (Producto proTmp : MemoriaBdd.productos) {
			if(proTmp.getIdPro() == idProEli) {
				proEnc = proTmp;
			}
		}
		return proEnc;
	}

}
