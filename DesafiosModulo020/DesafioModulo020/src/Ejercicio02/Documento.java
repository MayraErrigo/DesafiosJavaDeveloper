package Ejercicio02;

public class Documento {
	
	private String tipo_doc;
	private String num_doc;
	
	public Documento() {
		
	}
	public Documento(String tipo_doc, String num_doc) {
		this.tipo_doc = tipo_doc;
		this.num_doc = num_doc;
	}
	public String dame_datos() {
		return "Documentos [tipo: " + tipo_doc + ", número: " + num_doc + "]";
	}
	
	
	public void set_tipoDoc(String tipoDoc) {
		tipo_doc = tipoDoc;
	}
	public String dame_tipoDoc() {
		return tipo_doc;
	}
	public void set_numDoc(String num_doc) {
		this.num_doc = num_doc;
	}
	public String  dame_numDoc() {
		return num_doc;
	}
	
	
	
}
