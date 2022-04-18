package clases;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double esperado=5;
		 redondearalza s = new redondearalza(200,2) ;
		 double resultado = s.precioPorMes();
		 assertEquals(esperado, resultado,0) ;
	}

}
