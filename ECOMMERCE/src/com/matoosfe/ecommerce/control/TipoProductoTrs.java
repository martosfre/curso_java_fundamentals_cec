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
		boolean banIng = false;
		if (registro != null) {
			for (int i = 0; i < MemoriaBdd.tipoProductos.length; i++) {
				if (MemoriaBdd.tipoProductos[i] == null) {
					MemoriaBdd.tipoProductos[i] = (TipoProducto) registro;
					banIng = true;
					break;
				}
			}
			if (banIng) {
				return "Tipo Producto guardado correctamente";
			} else {
				return "El tamaño máximo permitido es de 5 tipos de productos para la versión demo";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}

	}

	@Override
	public String actualizar(int id, Object registro) {
		/*****************************************************
		 * BLOQUE PARA BUSCAR
		 *******************************************************/
		int posEnc = 0;
		boolean banEnc = false;
		for (TipoProducto tipPro : MemoriaBdd.tipoProductos) {
			if (tipPro != null && tipPro.getIdTipPro() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/************************************************************/

		if (banEnc) {
			MemoriaBdd.tipoProductos[posEnc] = (TipoProducto) registro;
			return "Registro actualizado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public String eliminar(int id) {
		int posEnc = 0;
		boolean banEnc = false;
		for (TipoProducto tipPro : MemoriaBdd.tipoProductos) {
			if (tipPro != null && tipPro.getIdTipPro() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}

		if (banEnc) {
			MemoriaBdd.tipoProductos[posEnc] = null;
			return "Registro eliminado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public Object[] listar() {
		return MemoriaBdd.tipoProductos;
	}

	@Override
	public Object consultarPorId(int id) throws Exception {
		TipoProducto tipProEnc = null;
		try {
			for (int i = 0; i < MemoriaBdd.tipoProductos.length; i++) {
				if (MemoriaBdd.tipoProductos[i].getIdTipPro() == id) {
					tipProEnc = MemoriaBdd.tipoProductos[i];
					break;
				}
			}
		} catch (Exception e) {
			throw new Exception("Tipo de producto no existe");
		}
		return tipProEnc;
	}

	/**
	 * Método para imprimir los tipos de productos
	 * 
	 * @return
	 */
	public String imprimirListaFormateada() {
		StringBuilder tipoProLis = new StringBuilder();
		for (TipoProducto tipProTmp : MemoriaBdd.tipoProductos) {
			if (tipProTmp != null) {
				tipoProLis.append(tipProTmp.getIdTipPro()).append("-").append(tipProTmp.getNombreTipPro())
						.append(" !! ");
			}
		}
		return tipoProLis.toString();
	}

}
