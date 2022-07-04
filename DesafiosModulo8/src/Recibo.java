
public class Recibo {
	
	//Atributos
	
		private String TipoDeElemento;
		private float Valor;
		private int TotalDeElementos;
		
		// Método
		
		public Recibo() {
			
		}
		
		//Constructor
		
		public Recibo(String TipoDeElemento,float Valor,int TotalDeElementos) {
			this.TipoDeElemento = TipoDeElemento;
			this.Valor = Valor;
			this.TotalDeElementos = TotalDeElementos;
		
		}

		public String getTipoDeElemento() {
			return TipoDeElemento;
		}

		public void setTipoDeElemento(String tipoDeElemento) {
			TipoDeElemento = tipoDeElemento;
		}

		public float getValor() {
			return Valor;
		}

		public void setValor(float valor) {
			Valor = valor;
		}

		public int getTotalDeElementos() {
			return TotalDeElementos;
		}

		public void setTotalDeElementos(int totalDeElementos) {
			TotalDeElementos = totalDeElementos;
		}
		
		public void mostrarDatos() {
			System.out.println(" \n DATOS DEL RECIBO");
			System.out.println("Tipo de Elemento: " + TipoDeElemento);
			System.out.println("Total Diario: " + TotalDeElementos + " unidades");
			System.out.println("Valor: $ " + getValor());
		}
}
