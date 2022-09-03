package Ejercicio01;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner teclado = new Scanner(System.in);
		String dominio_correcto = "educacionit.com";
		String [] simbolos_Clave = {"*",".","-","_"};
		String correo_ingresado, clave_ingresada;
		do {
			System.out.println("Ingrese el correo de usuario: ");
			 correo_ingresado = teclado.next();
			if(correo_ingresado.length() > dominio_correcto.length() && correo_ingresado.endsWith(dominio_correcto)) {
				break;
			}
			System.out.println("Correo inválido");
		}while(true);
		
		do {
			System.out.println("Ingrese la clave: ");
			 clave_ingresada = teclado.next();
			String primera_letra = clave_ingresada.substring(0,1);
			boolean letra_mayuscula = primera_letra.toUpperCase().equals(primera_letra);
			boolean contiene_simbolo = false;
			
			for(int i=0; i<simbolos_Clave.length;i++) {
				
				if(clave_ingresada.contains(simbolos_Clave[i])) {
					contiene_simbolo = true;
				}
			}
			
			if(letra_mayuscula && contiene_simbolo) {
				break;
			}
			
			System.out.println("Clave Incorrecta");
		}while(true);
			
		Usuarios usuario = new Usuarios ();
		usuario.set_usuario(correo_ingresado);
		usuario.set_clave(clave_ingresada);
		System.out.println(usuario.dame_datos());
		}

}
