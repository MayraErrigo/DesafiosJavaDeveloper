package Ejercicio1;

import java.util.Objects;

public class Parámetros<x,y> implements Comparable<x> {
	
	private x clave;
	private y valor;
	
	public Parámetros(x clave, y valor) {
		
		this.clave=clave;
		this.valor = valor;
	}

	public x getClave() {
		return clave;
	}

	public void setClave(x clave) {
		this.clave = clave;
	}

	public y getValor() {
		return valor;
	}

	public void setValor(y valor) {
		this.valor = valor;
	}
	
	public int hashCode() {
		return Objects.hash(clave);
	}
	
	public String toString() {
		return "Parámetros: clave: " + clave + ", valor: " + valor;
		
	}
	
	public boolean equals (Object objeto) {
		if(this == objeto) return true;
		if(objeto == null) return false;
		if(getClass() != objeto.getClass()) return false;
		Parámetros otro = (Parámetros) objeto;
		return Objects.equals(clave, otro.clave);
	}
	
	public int compareTo(x clave) {
		if(this.clave instanceof Integer && clave instanceof Parámetros) {
			Parámetros auxiliar = (Parámetros) clave;
			if (auxiliar.clave instanceof Integer) {
				Integer auxiliar_1 = (Integer) this.clave;
				Integer auxiliar_2 = (Integer) auxiliar.clave;
				return auxiliar_1 - auxiliar_2;
			}
		}
		return 0;	
	}
}
