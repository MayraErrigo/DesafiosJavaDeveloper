package Ejercicio2;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuentas cuenta_CC_01 = new Cuentas(12,3,"CC");
		Cuentas cuenta_CC_02 = new Cuentas(25,7,"CC");
		Cuentas cuenta_CC_03 = new Cuentas(11,2,"CC");
		Cuentas cuenta_CC_04 = new Cuentas(3,1,"CC");
		
		Cuentas cuenta_CA_01= new Cuentas(74,2,"CA");
		Cuentas cuenta_CA_02= new Cuentas(14,5,"CA");
		Cuentas cuenta_CA_03= new Cuentas(22,8,"CA");
		Cuentas cuenta_CA_04= new Cuentas(32,9,"CA");
		
		Tarjeta_Credito tarjeta_01 = new Tarjeta_Credito(120,8,125);
		Tarjeta_Credito tarjeta_02 = new Tarjeta_Credito(75,95,455);
		Tarjeta_Credito tarjeta_03 = new Tarjeta_Credito(12,25,633);
		Tarjeta_Credito tarjeta_04 = new Tarjeta_Credito(17,7,368);
		
		
		System.out.println(cuenta_CC_01 + "\n" + cuenta_CC_02  + "\n" + cuenta_CC_03 + "\n" + cuenta_CC_04 + "\n" );
		
		System.out.println(cuenta_CA_01 + "\n" + cuenta_CA_02 + "\n" + cuenta_CA_03 + "\n" + cuenta_CA_04 + "\n");
		
		System.out.println(tarjeta_01 + "\n" + tarjeta_02 + "\n" +tarjeta_03 + "\n" + tarjeta_04 + "\n" );
		
		
	}

}
