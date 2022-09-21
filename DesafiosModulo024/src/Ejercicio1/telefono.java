package Ejercicio1;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class telefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Parámetros<Integer,String>> telefonos = new TreeSet<>();
		telefonos.add(new Parámetros <Integer,String>(54, "Argentina"));
		telefonos.add(new Parámetros <Integer,String>(32, "Bélgica"));
		telefonos.add(new Parámetros<Integer, String>(55, "Brasil"));
		telefonos.add(new Parámetros <Integer,String>(56, "Chile"));
		
		System.out.println("Lista de Documentos");
		Iterator<Parámetros<Integer,String>> iterador = telefonos.iterator();
		while(iterador.hasNext()) {
			Parámetros <Integer,String> telefono = iterador.next();
			System.out.println(telefono);
		}
		
		
		
		
		
		
		
	}

}
