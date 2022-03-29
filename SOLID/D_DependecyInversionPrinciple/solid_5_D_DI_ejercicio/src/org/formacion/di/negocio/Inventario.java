package org.formacion.di.negocio;

public interface Inventario {
	
	/**
	 * Funcion que retorna la cantidad del producto en la tienda
	 * @param tienda
	 * @param producto
	 * @return
	 */
	int numeroProductos(String tienda, String producto);
}
