
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Una persona desea invertir $1000 en un banco, el cual le otorga un 2% de inter�s mensual �Cu�l
		ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o?
		En el primer mes tendr� acumulado 1000 $ m�s 20 $ de inter�s ( 2% de 1000 ). En el segundo
		mes se le sumar� un 2% a la base de 1020 $ del mes anterior y as� sucesivamente.*/
		
		
		float dinero = 1000;
		int mes = 1;
		
		while(mes <= 12) {
			dinero += dinero * 0.02;
			mes++;
		}
		
		System.out.println("Total: " + dinero);
	}

}
