package com.matoosfe.ecommerce.modelo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * Clase que representa la tabla Cliente que hereda todos los miembros de clase
 * (atributos + metodos) de la clase Padre
 * 
 * @author martosfre
 *
 *         20 feb. 2019 - 19:47:44 <a href="www.matoosfe.com">Soporte</a>
 */
public class Cliente extends Persona {
	private BigDecimal cuotaVenCli;
	private MedioPago medioPago;

	public Cliente() {

	}

	/**
	 * @param cuotaVenCli
	 * @param medioPago
	 */
	public Cliente(BigDecimal cuotaVenCli, MedioPago medioPago) {
		// Siempre que se hereda la primera linea a llamar es el constructor del papa
		super();
		this.cuotaVenCli = cuotaVenCli;
		this.medioPago = medioPago;
	}

	/**
	 * @param nombrePer
	 * @param apellidoPer
	 * @param identificacionPer
	 * @param fechaNacPer
	 * @param direccionPer
	 * @param telefonoPer
	 * @param correoPer
	 * @param cuotaVenCli
	 * @param medioPago
	 */
	public Cliente(String nombrePer, String apellidoPer, String identificacionPer, Date fechaNacPer,
			String direccionPer, String telefonoPer, String correoPer, BigDecimal cuotaVenCli, MedioPago medioPago) {
		super(nombrePer, apellidoPer, identificacionPer, fechaNacPer, direccionPer, telefonoPer, correoPer);
		this.cuotaVenCli = cuotaVenCli;
		this.medioPago = medioPago;
	}

	/**
	 * @return the cuotaVenCli
	 */
	public BigDecimal getCuotaVenCli() {
		return cuotaVenCli;
	}

	/**
	 * @param cuotaVenCli the cuotaVenCli to set
	 */
	public void setCuotaVenCli(BigDecimal cuotaVenCli) {
		this.cuotaVenCli = cuotaVenCli;
	}

	/**
	 * @return the medioPago
	 */
	public MedioPago getMedioPago() {
		return medioPago;
	}

	/**
	 * @param medioPago the medioPago to set
	 */
	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}
	
	//Sobreescritura
	@Override
	public String getApellidoPer() {
		return super.getApellidoPer().toUpperCase();
	}
	
}
