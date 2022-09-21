
public class Productos implements id {
	
	private String descripcion;
	private double precio;
	private int stock;
	private double precio_stock;
	private int id;
	public Productos(int id, String descripcion, double precio, int stock) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio  = precio;
		this.stock = stock;
	}
	
	public void set_id(int id) {
		this.id = id;
	}
	public int id() {
		return id;
	}
	public void set_descripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String dame_Descripcion() {
		return descripcion;
	}
	public double dame_precio() {
		return precio;
	}
	public int dame_stock() {
		return stock;
	}
	
	public void  precioStock() {
		
		double precio_Stock = precio * stock;
		this.precio_stock = precio_Stock;
	}
	
	public double dame_precioStock() {
		return precio_stock;
	}
	
	public String toString() {
		return "Producto:  ID: " + id() + " Descripcion: " + dame_Descripcion() + " Precio: " + dame_precio() + " Stock: " + dame_stock() ; 
	}
}
