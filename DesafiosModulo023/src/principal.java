
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (Impresora impresora1 = new Impresora("Canon")){
			impresora1.imprimir();
			impresora1.imprimir(new String[] {"Tancacha, ", "Córdoba"});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
