
public class productos {
	
	private String descripcion;
	private double precio;
	private int stock;
	private double precio_stock;
	
	public productos(String descripcion, double precio, int stock) {
		
		this.descripcion = descripcion;
		this.precio  = precio;
		this.stock = stock;
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
	
}
