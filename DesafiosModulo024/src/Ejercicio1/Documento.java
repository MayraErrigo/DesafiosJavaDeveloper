package Ejercicio1;

import java.util.*;

public class Documento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Set<Parámetros<String,String>> documentos = new HashSet<>();
		
		while(true) {
			System.out.println("Indicá el tipo de Documento: ");
			String tipo_doc = teclado.next().toUpperCase();
			System.out.println("Indicá  la descripcion del " + tipo_doc + ": ");
			String desc = teclado.next();
			Parámetros<String,String> doc = new Parámetros<> (tipo_doc,desc);
			boolean doc_agregado = documentos.add(doc);
			
			System.out.println((doc_agregado ? "Se ha " : "No se ha ") + " agregado el documento: " + doc);
			System.out.println("¿Deseas agregar más documentos? (Si /No)");
			String continuacion = teclado.next();
			if(continuacion.equalsIgnoreCase("no")) {
				break;
			}
		}
			System.out.println("Lista de Documentos: ");
			Iterator<Parámetros<String,String>> iterador = documentos.iterator();
			
			while(iterador.hasNext()) {
				Parámetros<String,String> doc = iterador.next();
				System.out.println(doc);
			}
		teclado.close();
	}

}
