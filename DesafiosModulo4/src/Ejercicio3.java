
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Imprimir la suma de los números pares del 1 al 25.
		//Requisito: se necesita tener conocimientos del operador RESTO (%).
		int suma = 0;
		int i = 1;
		
		while(i <= 25) {
			
			if (i % 2 == 0) {
				suma = suma + i ;				
			}
			
			i++;	
		}
			
		System.out.println("La suma de los números pares del 1  al 25 es: " + suma);	
		
	}

}
