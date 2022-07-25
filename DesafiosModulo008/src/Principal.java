
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Elemento elem1 = new Elemento();
		
		elem1.setTipoDeElemento("Lata de gaseosa chica");
		elem1.setLongitud(7.63f);
		elem1.setAncho(3.82f);
		elem1.setPeso(3.63f);
		
		elem1.mostrarDatos();
		
		
		Recibo recibo = new Recibo ();
		recibo.setTipoDeElemento(elem1.getTipoDeElemento());
		recibo.setTotalDeElementos(200);
		recibo.setValor(15);;
		
		recibo.mostrarDatos();
		
		Elemento elem2 = new Elemento("Envase de gaseosa",32, 9, 10);
		Recibo recibo2 = new Recibo (elem2.getTipoDeElemento(),20, 100);
		elem2.mostrarDatos();
		recibo2.mostrarDatos();
	}

}
