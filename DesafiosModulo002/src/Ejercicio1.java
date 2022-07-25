import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*generar un programa que permita al usuario ingresar por consola en la misma línea el primer nombre y
			primer apellido y realice las siguientes operaciones:
			1. Mostrar el nombre y apellido por separado.
			2. Mostrar las iniciales en mayúsculas.*/
		
		Scanner teclado = new Scanner (System.in);
		String nombre, apellido;
		char pLetra;
		
		System.out.println("Ingrese su primer nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Ingrese su primer apellido");
		apellido = teclado.nextLine();
		
		pLetra = nombre.charAt(0);
		
	}

	

}
