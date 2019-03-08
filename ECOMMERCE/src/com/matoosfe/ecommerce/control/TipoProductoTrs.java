/**
 * 
 */
package com.matoosfe.ecommerce.control;

import com.matoosfe.ecommerce.modelo.MemoriaBdd;
import com.matoosfe.ecommerce.modelo.TipoProducto;

/**
 * Clase que tendr� las operaciones de negocio relacionadas con tipo de producto
 * 
 * @author martosfre
 *
 *         28 feb. 2019 - 19:54:01 <a href="www.matoosfe.com">Soporte</a>
 */
public class TipoProductoTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		if (registro != null) {
			if (MemoriaBdd.contadorTipPro <= 4) {
				MemoriaBdd.tipoProductos[MemoriaBdd.contadorTipPro] = (TipoProducto) registro;
				MemoriaBdd.contadorTipPro++;
				return "Tipo Producto guardado correctamente";
			} else {
				return "El tama�o m�ximo permitido es de 5 tipos de productos para la versi�n demo";
			}
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
		int posEnc = 0;
		boolean banEnc = false;
		for (TipoProducto tipPro : MemoriaBdd.tipoProductos) {
			if (tipPro != null && tipPro.getIdTipPro() == id) {
				// Recuperarme la posici�n donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}

		if (banEnc) {
			//Almacenando en un temporal la variable del contador final
			TipoProducto tipPrTmp = MemoriaBdd.tipoProductos[MemoriaBdd.contadorTipPro -1];
			//Registro encontrado le coloco el tmp
			MemoriaBdd.tipoProductos[posEnc] = tipPrTmp;
			//Al valor del contador almanenado le elimino
			MemoriaBdd.tipoProductos[MemoriaBdd.contadorTipPro - 1] = null;
			MemoriaBdd.contadorTipPro-=2;
			return "Registro eliminado correctamente";
		}else {
			return "No se encontr� registro";
		}
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
