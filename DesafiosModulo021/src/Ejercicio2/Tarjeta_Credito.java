package Ejercicio2;

public class Tarjeta_Credito extends Productos {
	
	private Integer clave;
	
	public Tarjeta_Credito(Integer banco, Integer sucursal,Integer clave) {
		super(banco,sucursal);
		this.clave = clave;
		generar_numero();
	}
	
	public void set_clave(Integer clave) {
		this.clave = clave;
	}
	public Integer get_clave() {
		return clave;
	}
	
	private void generar_numero() {
		Integer num = num_TC++;
		set_num_producto(num);
	} 
	public String toString() {
		 return "Banco: " + formatos.get_formato(get_banco(), "BANCO")+ " Sucursal: " + formatos.get_formato(get_sucursal(), "BANCO") +
				" Número: " + formatos.get_formato(get_num_producto(), "TC") + " Clave: " + formatos.get_formato(get_clave(), "CLAVE");
	}
	
}
