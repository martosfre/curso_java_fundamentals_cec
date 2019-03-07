/**
 * 
 */
package com.matoosfe.ecommerce.control;

import com.matoosfe.ecommerce.modelo.MemoriaBdd;
import com.matoosfe.ecommerce.modelo.Usuario;

/**
 * Clase que tendra las operaciones de negocio relacionadas con usuario
 * @author martosfre
 *
 * 26 feb. 2019 - 20:28:46
 * <a href="www.matoosfe.com">Soporte</a>
 */
public class UsuarioTrs {
	/**
	 * Método para validar un usuario a través de su nombre de usuario y clave
	 * @param usuario nombre del usuario
	 * @param clave nombre de clave 
	 * @return
	 */
	public Usuario validarUsuario(String usuario, String clave) {
		Usuario usuarioRec = null;
		//For each es para iterar en toda la estructura
		for (Usuario alias : MemoriaBdd.usuarios) {
			//Validación - Sentencias de Decisión
			if(alias != null && alias.getNombreUsu().equals(usuario) && alias.getClaveUsu().equals(clave)) {
				usuarioRec = alias;
				break; //Sentencia de ruptura, que rompe la sentencia de iteración
			}
		}
		return usuarioRec;
	}
}
