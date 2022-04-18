package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatematicasTest {

	@Test
	void testRedondearalza() {
		int esperado=5;
		int  resultado= Matematicas.redondearalza(4.1);
		assertEquals(esperado, resultado,0) ;
	}

}
