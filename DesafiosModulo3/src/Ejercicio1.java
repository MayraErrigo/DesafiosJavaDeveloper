
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Dado el siguiente código: int nro1 = 100, nro2 = 500, nro3 = 250;
		Informar cuál de los tres números es mayor. */
		
		int num1 = 100, num2 = 500, num3 = 250;
		
		if (num1 > num2 &  num1 > num3 ) {
			System.out.println("El num1 es el mayor ");
		}
		if (num2 > num1 & num2 > num3){
			System.out.println("El num2 es el mayor");	
		}
		if(num3 > num1 & num3 > num2){
			System.out.println("El num3  es el mayor");
		}
	}

}
