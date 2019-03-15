/**
 * 
 */
package com.matoosfe.ecommerce.modelo;

import java.util.List;

/**
 * Clase que representa la tabla tipo de producto
 * 
 * @author martosfre
 *
 *         28 feb. 2019 - 20:18:08 <a href="www.matoosfe.com">Soporte</a>
 */
public class TipoProducto {
	private int idTipPro;
	private String nombreTipPro;
	private String descripcionTipPro;
	// Relación de Muchos - N
	private List<Producto> productos;

	public TipoProducto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idTipPro
	 */
	public int getIdTipPro() {
		return idTipPro;
	}

	/**
	 * @param idTipPro the idTipPro to set
	 */
	public void setIdTipPro(int idTipPro) {
		this.idTipPro = idTipPro;
	}

	/**
	 * @return the nombreTipPro
	 */
	public String getNombreTipPro() {
		return nombreTipPro;
	}

	/**
	 * @param nombreTipPro the nombreTipPro to set
	 */
	public void setNombreTipPro(String nombreTipPro) {
		this.nombreTipPro = nombreTipPro;
	}

	/**
	 * @return the descripcionTipPro
	 */
	public String getDescripcionTipPro() {
		return descripcionTipPro;
	}

	/**
	 * @param descripcionTipPro the descripcionTipPro to set
	 */
	public void setDescripcionTipPro(String descripcionTipPro) {
		this.descripcionTipPro = descripcionTipPro;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoProducto [idTipPro=" + idTipPro + ", nombreTipPro=" + nombreTipPro + ", descripcionTipPro="
				+ descripcionTipPro + "]";
	}

}
