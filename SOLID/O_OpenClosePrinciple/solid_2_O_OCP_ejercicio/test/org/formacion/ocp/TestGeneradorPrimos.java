package org.formacion.ocp;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

public class TestGeneradorPrimos {
	
	@Test
	public void test_orden_natural() {
		
		GeneradorPrimos generador = new GeneradorPrimos();
		List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
		
		Assert.assertEquals(generador.primos(15), expected);
	}	

	@Test
	public void test_orden_inverso() {
		
		GeneradorPrimosInverso generador = new GeneradorPrimosInverso();
		List<Integer> expected = Arrays.asList(13,11,7,5,3,2);
		
		Assert.assertEquals(generador.primos(15), expected);
	}	

}
