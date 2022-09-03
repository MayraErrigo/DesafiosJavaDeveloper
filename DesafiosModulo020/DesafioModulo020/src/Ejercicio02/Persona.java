package Ejercicio02;

public class Persona {
	
	
	private String nombre;
	private String apellido;
	private Documento documento;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, Documento documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	//Setters y Getters
	
	public void set_nombre(String nombre) {
		this.nombre=nombre;
	}
	public String dame_nombre() {
		return nombre;
	}
	
	public void set_apellido(String apellido) {
		this.apellido = apellido;
	}
	public String dame_apellido() {
		return apellido;
	}
	public String datos_persona() {
		return "[nombre: " + nombre + ", apellido: " + apellido + ", " + documento.dame_datos() + "]" ;
	}

	public void  set_documento (Documento documento) {
		this.documento = documento;
	}
	public Documento dame_documento() {
		return documento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
