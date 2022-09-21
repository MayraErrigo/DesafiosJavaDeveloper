
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clientes cliente[] = new Clientes [3];
		
		cliente[0] = new Clientes(1,"María Martinez" , "DNI", 32658987);
		cliente[1] = new Clientes(2,"José Ríos" , "DNI", 12456365);
		cliente[2] = new Clientes(3,"Mario Ortiz", "DNI" , 11236547);
		
		
		perecedero producto[] = new perecedero [6];
		
		producto[0] = new perecedero (1,"Leche" , 160.15, 7,8);
		producto[1] = new perecedero (2,"Queso" , 275.60, 15,5);
		producto[2] = new perecedero (3,"Atún" , 155.60, 25,6);
		producto[3] = new perecedero (4,"Bife de Chorizo" , 565.80, 4,25);
		producto[4] = new perecedero (5,"Cebolla" , 710, 9, 1);
		producto[5] = new perecedero (6,"Hamburguesa" , 38.90, 14,4);
		
		mensaje.ofertas(cliente, producto);
		
		
		
		
		
		
		
	}
	
	
}
