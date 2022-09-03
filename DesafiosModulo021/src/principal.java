
public class principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clientes cliente[] = new Clientes [3];
		
		cliente[0] = new Clientes("María Martinez" , "DNI", 32658987);
		cliente[1] = new Clientes("José Ríos" , "DNI", 12456365);
		cliente[2] = new Clientes("Mario Ortiz", "DNI" , 11236547);
		
		
		perecederos producto []= new perecederos [6];
		
		producto[0] = new perecederos ("Leche" , 160.15, 7,8);
		producto[1] = new perecederos ("Queso" , 275.60, 15,5);
		producto[2] = new perecederos ("Atún" , 155.60, 25,6);
		producto[3] = new perecederos ("Bife de Chorizo" , 565.80, 4,25);
		producto[4] = new perecederos ("Cebolla" , 710, 9, 1);
		producto[5] = new perecederos ("Hamburguesa" , 38.90, 14,4);
		
		
		for(int i =0; i<cliente.length;i++) {
			
			System.out.println();
			String mensaje = cliente[i] + ":" + "\n" + "Esta semana tenemos las siguientes ofertas para ti: \n";
			for (int y = 0; y < producto.length; y++) {
				
				if(producto[y].vencimiento() <= 10) {
					
					String oferta = "\t - " + producto[y].dame_Descripcion() +", Antes: [precio] Despues: [precio_oferta]. \n ";
					//oferta = oferta.replace("[descripcion]", producto[y].dame_Descripcion());
					oferta = oferta.replace("[precio]", String.format("%.2f", (producto[y].dame_precio())));
					oferta = oferta.replace("[precio_oferta]", String.format("%.2f",(producto[y].precio_oferta())));
					mensaje += oferta;	
				}
			}
			System.out.println(mensaje);
		}
		
		
		
		
		
		
		
	}
	
	
}
