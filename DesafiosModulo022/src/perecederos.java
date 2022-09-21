
public class perecederos extends productos {
	
	private int dias_vencimiento;
	
public perecederos(String descripcion, double precio, int stock, int vencimiento) {
	super(descripcion,precio,stock);
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
