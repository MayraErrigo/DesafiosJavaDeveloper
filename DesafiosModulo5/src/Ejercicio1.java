
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Dado el vector {10,20,5,15,30,20}
		1. Informar el vector de la forma: "Índice: X, Valor: Y".
		2. Totalizar el vector e informar el total.
		3. Informar el contenido de las posiciones
		impares (por ejemplo, posiciones 1,3,5, etc.)
		4. Informar el mayor número.
		5. Informar cuántas veces aparece el
		número 20.
*/
		int vector [] = {10, 20, 5, 15, 30, 20};
		int total = 0;
		int max = vector [0] , cant20 = 0;
		
		for(int i = 0; i < vector.length; i++) {
		
			System.out.println("Indice: " + i + " Valor: " + vector[i]);
			total += total + vector[i];
			if (i % 2 == 1)System.out.println("En la posición " + i + " tiene el valor " + vector[i]);
			if (vector[i] > max)max = vector[i];
			if(vector [i] == 20) cant20++;
		}
		
		System.out.println("Total: " + total);
		System.out.println("El mayor es el : " + max);	
		System.out.println("El 20 aparece " + cant20 + " veces");
		
		
	}

}
