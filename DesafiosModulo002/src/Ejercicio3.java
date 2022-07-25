import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Se pide que ingrese por consola dos letras y realice la siguiente operación:
		 
		1. Mostrar la representación ASCII de las letras en minúsculas y mayúsculas */
		
		//Variables
		
		String letra1, letra2;
		char caracter1, caracter2;
		int ascii1, ascii2;
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Ingrese la primera letra");
		letra1 = teclado.nextLine();
		
		System.out.println("Ingrese la segunda letra");
		letra2 = teclado.nextLine();
		
		caracter1 = letra1.toLowerCase().charAt(0);
		ascii1 = caracter1;
		
		caracter2 = letra2.toLowerCase().charAt(0);
		ascii2 = caracter2;
		
		System.out.println("\nEn minúscula");
		System.out.println("La letra " + letra1 + " en ASCII corresponde al valor de  " + ascii1);
		System.out.println("La letra " + letra2 + " en ASCII corresponde al valor de  " + ascii2 + "\n");
		
		caracter1 = letra1.toUpperCase().charAt(0);
		ascii1 = caracter1;
		
		caracter2 = letra2.toUpperCase().charAt(0);
		System.out.println("En mayúscula ");
		System.out.println("La letra " + letra1 + " en ASCII corresponde al valor de  " + ascii1);
		System.out.println("La letra " + letra2 + " en ASCII corresponde al valor de  " + ascii2);
	
		
		teclado.close();
	}

}
