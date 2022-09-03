package Ejercicio02;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);
		int cant_personas; 
		Persona personas [];
		String nombre, apellido, tipo_doc,num_doc;
		int  indice_doc;
		String documentos [] = {"DNI", "LC","LE", "PAS","CI"};
		boolean persona_ingresada = false;
		
		
		System.out.println("Ingrese la cantidad de personas: ");
		cant_personas = teclado.nextInt();
		personas = new Persona [cant_personas]; 
		
		for(int i=0; i < personas.length;i++) {
			
			System.out.println("Personas [" + (i+1) + "]");
			
			System.out.println("Indique el nombre: ");
			nombre = teclado.next();
			
			System.out.println("Indique el apellido: ");
			apellido = teclado.next();
			do {
				persona_ingresada = false;
				System.out.println("Documentos de " + nombre + " " + apellido);
				System.out.println("1- Documento Nacional de Identidad - DNI" + "\n" + "2-Libreta Cívica - LC"
				+ "\n"+"3- Libreta de Enrolamiento - LE " + "4-Pasaporte - PAS " + "\n" + 
				"5-Cédula de Identidad - CI" );	
				
				System.out.println("Tipo: ");
				indice_doc = teclado.nextInt();
				tipo_doc = documentos [indice_doc - 1];
				System.out.println("Número: ");
				
				num_doc = teclado.next();
		
				for(int x=0; x < i;x++) {
					
					if(personas[x].dame_documento().dame_tipoDoc().equals(tipo_doc) &&
							personas[x].dame_documento().dame_numDoc().equals(num_doc)) {
						persona_ingresada = true;
						System.out.println("Ya haz ingresado esta persona. ");
						break;
					}
				}
		
			}while(persona_ingresada);

			Persona persona = new Persona();
			
			persona.set_nombre(nombre);
			persona.set_apellido(apellido);
			persona.set_documento(new Documento(tipo_doc, num_doc));
			
			personas[i] = persona;

		}
		
	
		for(int i=0; i<personas.length;i++) {
			System.out.println(personas[i].datos_persona());
		}
	
	
	
	
	
	}}

	
