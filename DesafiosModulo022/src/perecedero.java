
public class perecedero extends Productos {
	
	private int dias_vencimiento;
	
public perecedero(int id, String descripcion, double precio, int stock, int vencimiento) {
	super(id, descripcion,precio,stock);
	this.dias_vencimiento = vencimiento;
	
}

public double vencimiento() {
	
	return dias_vencimiento;
}
	
public double precio_oferta() {
	
	double oferta = this.dame_precio() * 0.3 ;
	oferta = this.dame_precio() - oferta;
	return oferta;
}
}