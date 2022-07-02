
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  1. Informar la inflación anual.
			2. Informar la inflación más baja junto con el
			número de mes. Por ejemplo: Mes 2 = 0.1
			3. Informar la inflación más alta junto con el
			número de mes. Por ejemplo: Mes 12 = 0.9
			4. Informar el promedio de inflación
			(inflación total / 2)*/
		
		double inflacion [] = { 0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
		double inflacionAnual = 0, inflacionMin = inflacion[0], inflacionMax = inflacion[0], total = 0;
		int mesMax = 0, mesMin = 0;
		
		for(int i = 0; i < inflacion.length; i++) {
			
			inflacionAnual = inflacionAnual + inflacion[i];
			if (inflacion[i] < inflacionMin) {
				inflacionMin = inflacion[i];
				mesMin = i + 1;
			}
			if (inflacion[i] > inflacionMax) {
				inflacionMax = inflacion[i];
				mesMax = i + 1;
			}
			
			total = inflacionAnual / inflacion.length;
		}
		 
		
		System.out.println("La inflación Anual es: " + inflacionAnual);
		System.out.println("La inflación más baja fue del Mes " + mesMin + " = " + inflacionMin);
		System.out.println("La inflación más alta fue del Mes " + mesMax + " = " + inflacionMax);
		System.out.println("El promedio de la inflación es: " + total);
		
		
	}

}
