
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Elemento elem1 = new Elemento();
		
		elem1.setTipoDeElemento("Lata de gaseosa chica");
		elem1.setLongitud(7.63f);
		elem1.setAncho(3.82f);
		elem1.setPeso(3.63f);
		
		System.out.println("DATOS DEL ELEMENTO INTRODUCIDO \n");
		System.out.println("Tipo: " + elem1.getTipoDeElemento());
		System.out.println("Alto: " + elem1.getLongitud() + "cm.");
		System.out.println("Ancho: " + elem1.getAncho() + "cm.");
		System.out.println("Peso: " + elem1.getPeso() + "grs. \n");
		
		
		Recibo recibo = new Recibo ();
		recibo.setTipoDeElemento(elem1.getTipoDeElemento());
		recibo.setTotalDeElementos(200);
		recibo.setTotalDeElementos(215);
		
		System.out.println("DATOS DEL RECIBO");
		System.out.println("Tipo de Elemento: " + recibo.getTipoDeElemento());
		System.out.println("Total Diario: " + recibo.getTotalDeElementos());
		System.out.println("Valor: $" + recibo.getValor());

}
}