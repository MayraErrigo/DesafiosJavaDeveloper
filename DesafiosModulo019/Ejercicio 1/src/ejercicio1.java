import java.util.Scanner;
import java.util.Arrays;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un programa que genere números enteros aleatorios
			entre 1 y la cantidad de elementos y mostrar cuáles son
			divisibles entre 3 y 5, con las siguientes condiciones:
			1. Debe pedir ingresar la cantidad de
			elementos a generar.
			2. Si el número es divisible por 3
			mostrar Fizz.
			3. Si el número es divisible por 5
			mostrar Buzz.
			4. Si el número es divisible por 3 y 5
			mostrar FizzBuzz.
			5. De lo contrario, mostrar el número
		 
	*/
		System.out.println("Ingrese la cantidad de numeros a evaluar");
		Scanner teclado = new Scanner(System.in);
		int cantNum = teclado.nextInt();
		int [] numAleatorio = new int[cantNum];
			
		for(int i = 0; i < numAleatorio.length; i++) {
			
			numAleatorio[i] = (int) ((Math.random() * cantNum ) + 1);
		}
		
		System.out.println(Arrays.toString(numAleatorio));
		
		for(int i = 0; i < numAleatorio.length; i++) {
			
			int num = numAleatorio[i];
			if(num % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (num % 5 == 0) {
				System.out.println("Bizz");
			}
			else {
				System.out.println(num);
			}
		}
	
}
}