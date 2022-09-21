package Ejercicio1;

import java.util.*;

public class Documento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Set<Par�metros<String,String>> documentos = new HashSet<>();
		
		while(true) {
			System.out.println("Indic� el tipo de Documento: ");
			String tipo_doc = teclado.next().toUpperCase();
			System.out.println("Indic�  la descripcion del " + tipo_doc + ": ");
			String desc = teclado.next();
			Par�metros<String,String> doc = new Par�metros<> (tipo_doc,desc);
			boolean doc_agregado = documentos.add(doc);
			
			System.out.println((doc_agregado ? "Se ha " : "No se ha ") + " agregado el documento: " + doc);
			System.out.println("�Deseas agregar m�s documentos? (Si /No)");
			String continuacion = teclado.next();
			if(continuacion.equalsIgnoreCase("no")) {
				break;
			}
		}
			System.out.println("Lista de Documentos: ");
			Iterator<Par�metros<String,String>> iterador = documentos.iterator();
			
			while(iterador.hasNext()) {
				Par�metros<String,String> doc = iterador.next();
				System.out.println(doc);
			}
		teclado.close();
	}

}
