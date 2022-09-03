package Ejercicio2;

public class Productos {
			
	private Integer banco;
	private Integer sucursal;
	private Integer num_producto;
	protected static Integer num_CC = 1;
	protected static Integer num_CA = 1;
	protected static Integer num_TC = 1;
	
	public Productos(Integer banco, Integer sucursal) {
		this.banco = banco;
		this.sucursal = sucursal;
	}

	public void set_banco(Integer banco) {
		this.banco = banco;
	}
	public Integer get_banco() {
		return banco;
	}
	
	public void set_sucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}
	public Integer get_sucursal() {
		return sucursal;
	}
	public void set_num_producto(Integer numero) {
		this.num_producto = numero;
	}
	
	public Integer  get_num_producto() {
		return num_producto;
	}
	
	public String toString() {
		return "Banco: " + banco + "Sucursal: " + sucursal + "Número: " + num_producto ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
