package Ejercicio1;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class telefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Par�metros<Integer,String>> telefonos = new TreeSet<>();
		telefonos.add(new Par�metros <Integer,String>(54, "Argentina"));
		telefonos.add(new Par�metros <Integer,String>(32, "B�lgica"));
		telefonos.add(new Par�metros<Integer, String>(55, "Brasil"));
		telefonos.add(new Par�metros <Integer,String>(56, "Chile"));
		
		System.out.println("Lista de Documentos");
		Iterator<Par�metros<Integer,String>> iterador = telefonos.iterator();
		while(iterador.hasNext()) {
			Par�metros <Integer,String> telefono = iterador.next();
			System.out.println(telefono);
		}
		
		
		
		
		
		
		
	}

}
