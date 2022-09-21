
public class mensaje {
	
	public static void ofertas (Clientes[] clientes , perecedero productos[]) {
		
		for(Clientes Clientes : clientes) {
			
			System.out.println();
			String mensaje =  "Hola: [nombre] : "  + "\n" + "Esta semana tenemos las siguientes ofertas para ti: \n";
			for (perecedero producto1 : productos) {
				
				if(producto1.vencimiento() <= 10) {
				
					String oferta = "\t - " + producto1.dame_Descripcion() +", Antes:[precio] Despues: [precio_oferta]. \n ";
					oferta = oferta.replace("[precio]", String.format("%.2f", (producto1.dame_precio())));
					oferta = oferta.replace("[precio_oferta]", String.format("%.2f",(producto1.precio_oferta())));
					mensaje += oferta;	
				}
			}
			System.out.println(mensaje);
		}
	}
}
