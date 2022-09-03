package Ejercicio01;

public class Usuarios {
	
	private String usuario;
	private String clave;
	
	public Usuarios (String usuario, String clave) {
		
		this.usuario = usuario;
		this.clave = clave;
	}

	public Usuarios() {
		
	}
	
	public String get_usuario() {
		return usuario;
	}
	public void set_usuario(String usuario) {
		this.usuario = usuario;
		
	}
	public void  set_clave(String clave) {
		this.clave= clave;;
	}
	public String dame_clave() {
		return clave;
	}
	public String dame_datos() {
		return "Usuario: [" + usuario + ", clave: " + clave + "]";
	}
	
	
	
	
	
	
	
	
	
}
