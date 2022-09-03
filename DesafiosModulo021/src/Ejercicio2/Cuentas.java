package Ejercicio2;

public class Cuentas extends Productos {
	

	private String tipo;
	
	public Cuentas(Integer banco, Integer sucursal, String tipo) {
		super(banco, sucursal);
		this.tipo = tipo;
		generar_numero();
	}
	
	
	public void set_tipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String get_tipo() {
		return tipo;
	}
	
	private void generar_numero() {
		
		Integer num = 0;
		switch(tipo.toUpperCase()) {
		
		case "CC": num = num_CC++;break;
		case "CA": num = num_CA++;break;
		default:break;
		}set_num_producto(num);
		} 
	
	public String toString() {
		return "Banco: " + formatos.get_formato(get_banco(), "BANCO")+ " Sucursal: " + formatos.get_formato(get_sucursal(), "BANCO") +
		" Número: " + formatos.get_formato(get_num_producto(), tipo) + " Tipo: " + tipo;
	}	
	}
	
	
	

