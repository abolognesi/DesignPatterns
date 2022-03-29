package org.formacion.isp;

public interface IProcesarTextoBasico {
	
	/**
	 * Funcion para agregar palabras al texto
	 * @param palabra
	 */
	public void nueva (String palabra);
	
	/**
	 * Funcion para generar texto
	 * @return
	 */
	public String texto ();
}
