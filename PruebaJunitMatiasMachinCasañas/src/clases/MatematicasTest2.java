package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatematicasTest2 {

	@Test
	void testAbsolutoDouble() {
		double esperado=6.7;
		double  resultado= Matematicas.absoluto(-6.7);
		assertEquals(esperado, resultado,0) ;
	}

}
