
public class Elemento {
	
	//Atributos
	
	private String tipoDeElemento;
	private float longitud;
	private float ancho;
	private float peso;
	
	//metodo
	
	public Elemento() {
		
	}
	//Constructores
	
	public Elemento(String tipoDeElemento, float longitud, float ancho, float peso) {
		this.tipoDeElemento = tipoDeElemento;
		this.longitud = longitud;
		this.ancho = ancho;
		this.peso = peso;
	}

	public String getTipoDeElemento() {
		return tipoDeElemento;
	}

	public void setTipoDeElemento(String tipoDeElemento) {
		this.tipoDeElemento = tipoDeElemento;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
