
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Tomando el siguiente c�digo:
	String usuario = �Pepito�, clave= �1234�;
	Informar los siguientes casos:
	1. Si el usuario es �pepito� y la clave es �1234�
	informar ��Bienvenido pepito!�.
	2. Si el usuario es �pepito� y la clave no es
	�1234� informar �Contrase�a incorrecta�.
	3. Si el usuario no es �pepito� y la clave es
	�1234� informar �Usuario incorrecto�.*/
		
		
		String usuario = "Pepito", clave = "1234";
		
		if (usuario.equals("Pepito") & clave.equals("1234")) {
			System.out.println("�Bienvenido Pepito!");
		}
		if (usuario.equals("Pepito") & !(clave.equals("1234"))) {
			System.out.println("Contrase�a incorrecta");
		}
		if (!(usuario.equals("Pepito")) & clave.equals("1234")) {
			System.out.println("Usuario Incorrecto");
		}
	}

}
