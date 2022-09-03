
public class Clientes {
	
	private String nombre;
	private String tipo_doc;
	private int num_doc;
	
	
	public Clientes(String nombre, String tipo_doc, int num_doc) {
		
		this.nombre = nombre;
		this.tipo_doc = tipo_doc;
		this.num_doc = num_doc;
	}
	
	public void set_nombre(String nombre) {
		this.nombre = nombre;
	}
	public String dame_nombre() {
		return nombre;
	}
	
	public void set_tipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	public String dame_tipo_doc() {
		return tipo_doc;
	}
	
	public void set_num_doc(int num_doc) {
		this.num_doc = num_doc;
	}
	public int dame_num_doc() {
		return num_doc;
	}
	
	public String toString() {
		return 
				"Hola " + dame_nombre();
	}
	
	
	
	
	
	
	
}
