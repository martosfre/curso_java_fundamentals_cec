/**
 * 
 */
package com.matoosfe.ecommerce.modelo;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoProducto [idTipPro=" + idTipPro + ", nombreTipPro=" + nombreTipPro + ", descripcionTipPro="
				+ descripcionTipPro + "]";
	}
	
	

}
