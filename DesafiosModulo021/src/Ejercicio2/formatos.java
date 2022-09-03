package Ejercicio2;

public class formatos {
	
	private static String formato_cuentas;
	private static String formato_tarjeta;
	private static String formato_banco;
	private static String formato_clave;
	
	static {
		formato_cuentas = "###-#-#####/#";
		formato_tarjeta = "#### #### #### ####";
		formato_banco = "####";
		formato_clave = "###";
	}
	
	private static int get_caracteres(String formato) {
		 int cant = 0;
		 for(int i = 0; i< formato.length(); i++) {
			 if(formato.charAt(i) == '#') {
				 cant++;
			 }
		 }
		 	return cant;
	}	
		
	private  static String dame_num(Integer num, String formato){
		int cant_0 = get_caracteres(formato);
		String num_string = String.format("%0" + cant_0 + "d", num);
		String ult_num = "";
		int indice = 0;
		for(int i = 0; i<formato.length();i++) {
			ult_num += formato.charAt(i);
			if(formato.charAt(i) == '#') {
				ult_num = ult_num.replace("#", String.valueOf(num_string.charAt(indice)));
				indice++;
			}
		}
		return ult_num;
	}
	public static String get_formato(Integer num, String tipo ) {
		String formato = "";
		switch(tipo.toUpperCase()) {
		case "CC": case "CA": 
			formato = dame_num(num, formato_cuentas);break;
		case "TC": 
			formato = dame_num(num, formato_tarjeta); break;
		case "BANCO": case "SUCURSAL":
			formato = dame_num(num, formato_banco); break;
		case "CLAVE":
			formato = dame_num(num,formato_clave);break;
		default:break;
		}	
		return formato;
	}
}
	
	
	
	
	
	
	
	

