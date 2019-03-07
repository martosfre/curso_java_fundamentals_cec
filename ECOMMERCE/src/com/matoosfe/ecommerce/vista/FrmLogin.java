/**
 * 
 */
package com.matoosfe.ecommerce.vista;

import com.matoosfe.ecommerce.control.UsuarioTrs;
import com.matoosfe.ecommerce.control.util.UtilLectura;
import com.matoosfe.ecommerce.modelo.Usuario;

/**
 * Clase que representa
 * 
 * @author martosfre
 *
 *         25 feb. 2019 - 20:31:02 <a href="www.matoosfe.com">Soporte</a>
 */
public class FrmLogin {
	
	public static Usuario usuarioSesion;
	
	public static void main(String[] args) {
		System.out.println("************************************");
		System.out.println("*           E-COMMERCE             *");
		System.out.println("************************************");
		System.out.println("\n");
		//1.Recuperar valores
		System.out.print("Usuario:");
		String usuario = UtilLectura.leerDesdeTeclado();
		System.out.print("Clave:");
		String clave = UtilLectura.leerDesdeTeclado();
		//2.Llamar a mi método de negocio, enviar la información para validación
		UsuarioTrs adminUsuario = new UsuarioTrs();
		usuarioSesion = adminUsuario.validarUsuario(usuario, clave);
		/*
		 * 3.Si el usuario es correcto se deberia ingresar a la aplicación
		 * y si no se encontró se debería emitir un mensaje de error
		 */
		if(usuarioSesion != null) {//Encontre
			FrmPrincipal frmPrincipal = new FrmPrincipal();
		}else {
			System.err.println("Usuario no encontrado!!!!");
		}
		
	}
}
