package com.matoosfe.ecommerce.modelo;
/**
 * 
 * Clase que representa la tabla de producto
 * @author martosfre
 *
 * 21 feb. 2019 - 19:47:27
 * <a href="www.matoosfe.com">Soporte</a>
 */

import java.math.BigDecimal;

public class Producto {
	private int idPro;
	private String nombrePro;
	private String descripcionPro;
	private BigDecimal precioPro;
	// Se asocia con un atributo (Relación 1)
	private TipoProducto tipoProducto;

	/**
	 * @param idPro
	 * @param nombrePro
	 * @param descripcionPro
	 * @param precioPro
	 * @param tipoProducto
	 */
	public Producto(int idPro, String nombrePro, String descripcionPro, BigDecimal precioPro,
			TipoProducto tipoProducto) {
		super(); // No hace falta colocarle,xq todos los objetos heredan de Object
		this.idPro = idPro;
		this.nombrePro = nombrePro;
		this.descripcionPro = descripcionPro;
		this.precioPro = precioPro;
		this.tipoProducto = tipoProducto;
	}

	/**
	 * @return the idPro
	 */
	public int getIdPro() {
		return idPro;
	}

	/**
	 * @param idPro the idPro to set
	 */
	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	/**
	 * @return the nombrePro
	 */
	public String getNombrePro() {
		return nombrePro;
	}

	/**
	 * @param nombrePro the nombrePro to set
	 */
	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	/**
	 * @return the descripcionPro
	 */
	public String getDescripcionPro() {
		return descripcionPro;
	}

	/**
	 * @param descripcionPro the descripcionPro to set
	 */
	public void setDescripcionPro(String descripcionPro) {
		this.descripcionPro = descripcionPro;
	}

	/**
	 * @return the precioPro
	 */
	public BigDecimal getPrecioPro() {
		return precioPro;
	}

	/**
	 * @param precioPro the precioPro to set
	 */
	public void setPrecioPro(BigDecimal precioPro) {
		this.precioPro = precioPro;
	}

	/**
	 * @return the tipoProducto
	 */
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	/**
	 * @param tipoProducto the tipoProducto to set
	 */
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPro;
		result = prime * result + ((nombrePro == null) ? 0 : nombrePro.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (idPro != other.idPro)
			return false;
		if (nombrePro == null) {
			if (other.nombrePro != null)
				return false;
		} else if (!nombrePro.equals(other.nombrePro))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [idPro=" + idPro + ", nombrePro=" + nombrePro + ", descripcionPro=" + descripcionPro
				+ ", precioPro=" + precioPro + getTipoProducto().getNombreTipPro() + "]";
	}

}
