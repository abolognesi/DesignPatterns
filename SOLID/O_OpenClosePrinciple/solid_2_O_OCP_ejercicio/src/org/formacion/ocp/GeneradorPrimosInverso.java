package org.formacion.ocp;

import java.util.Comparator;

public class GeneradorPrimosInverso extends GeneradorPrimos{
	
	protected Comparator<Integer> getOrden(){
		return (a, b) -> a > b? -1: 1;
	}
}
