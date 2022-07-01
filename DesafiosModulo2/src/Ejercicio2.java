import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Realizar un programa que permita al usuario ingresar por consola dos números
		  y realice las siguientes operaciones:
			
			1. El usuario debe poder ingresar la cantidad de
			decimales que desea ver en el resultado.
			
			2. Sacar la potencia de los números ingresados.*/
		
		//Creacion de variables 
		
		int cantDecimales;
		float exponente,base;
		Scanner teclado = new Scanner (System.in);
		double resultado = 0;
		
		
		System.out.println("Ingrese el valor de la base");
		base = teclado.nextFloat();
		
		System.out.println("Ingrese el valor del exponente");
		exponente = teclado.nextFloat();
		
		System.out.println("Ingrese la cantidad de decimales que desea ver en el resultado");
		cantDecimales = teclado.nextInt();
		
		//Calculo la potencia de los valores que inserta el usuario 
		
		resultado = Math.pow(base, exponente);
		
		System.out.println(
				String.format("La potencia con " + cantDecimales + " decimales: %." + cantDecimales + "f ", resultado)
				);
		
		teclado.close();
	}

}
