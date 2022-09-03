import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear un programa que multiplique dos números, con las siguientes condiciones:
			1. Debe pedir ingresar dos números enteros.
			2. No debe usar el operador de multiplicación (*) ni la función Math.multiplyXXXXXX */
		
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el número a multiplicar: ");
		long numero = teclado.nextLong();
		System.out.println("Ingrese otro para multiplicar: ");
		long multiplicador = teclado.nextLong();
		
		long numAbs = Math.abs(numero);
		long multiplicadorAbs = Math.abs(multiplicador);
		long resultado = 0 ;
		
		// Suma el valor que insertaron en la variable numero la cantidad de veces que insertaron 
		//en la variable multiplicador.
		if(numAbs != 0 && multiplicador != 0) {
			
			for(int i = 0; i < multiplicadorAbs; i++) {
				resultado += numAbs;
			}	
		}
		
		//Regla de los signos 
		
		boolean numPositivo = numero >= 0;
		boolean multiplicadorPositivo = multiplicador >= 0;
		
		if((numPositivo & multiplicadorPositivo) || (!numPositivo & !multiplicadorPositivo)) {
			
			System.out.println("El resultado es: " + resultado);
		}
		else {
			System.out.println("El resultado es: -" + resultado);
		}
		
		
	}
	
	
}
