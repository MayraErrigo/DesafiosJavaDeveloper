
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Agregar los cambios que resulten necesarios al ejercicio anterior para que en los puntos B y C se
		informe la inflación junto con el nombre del mes. Por ejemplo: Mes FEBRERO = 0.1*/
		
		double inflacion [] = { 0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
		double inflacionAnual = 0, inflacionMin = inflacion[0], inflacionMax = inflacion[0], total = 0;
		String  mesMax = "", mesMin = "";
		String mes [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",  "Septiembre", "Octubre",
				"Noviembre", "Diciembre"};
		for(int i = 0; i < inflacion.length; i++) {
			
			inflacionAnual = inflacionAnual + inflacion[i];
			if (inflacion[i] < inflacionMin) {
				inflacionMin = inflacion[i];
				mesMin = mes[i] ;
			}
			if (inflacion[i] > inflacionMax) {
				inflacionMax = inflacion[i];
				mesMax = mes[i];
			}
			
			total = inflacionAnual / inflacion.length;
		}
		 
		
		System.out.println("La inflación Anual es: " + inflacionAnual);
		System.out.println("La inflación mínima: Mes " + mesMin + "= " + inflacionMin);
		System.out.println("La inflación mínima: Mes " + mesMax + "= " + inflacionMax);
		System.out.println("El promedio de la inflación es: " + total);
	}

}
