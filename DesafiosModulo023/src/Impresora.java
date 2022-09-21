import java.io.IOException;
import java.util.Arrays;

public class Impresora implements AutoCloseable{
	
	private String impresora;
	private String[] documento;
	public static String impresoras_permitidas[] = {"Canon","HP","Epson", "Brother", "Samsung"};
	
	
	public Impresora(String impresora) throws Exception {
		this.impresora = impresora;
		set_impresora(impresora);
	}
	public Impresora(String impresora, String[] documento) throws Exception{
		this.documento = documento;
		set_impresora(impresora);
	}
	public void imprimir() throws IOException{
		if (documento == null) {
			throw new IOException("El documento que se tiene que imprimir debe contener datos");
		}else {
			for(String linea : documento) {
				System.out.println(linea);
			}
		}
	}
	public void imprimir(String[] documento) throws IOException{
		if (documento == null) {
			throw new IOException("El documento que se tiene que imprimir debe contener datos");
		}else {
			for(String linea :documento) {
				System.out.println(linea);
			}
		}
	}
	
	public void set_impresora(String impresora) throws Exception{
		this.impresora = impresora;
		boolean existe_impresora = false;
		if(impresora != null) {
			for(String impresora_existente : impresoras_permitidas) {
				if(impresora.equalsIgnoreCase(impresora_existente)) {
					existe_impresora = true;
					break;
				}
			}
		}
		if(!existe_impresora) {
			throw new Exception("Solo puedes ingresar impresoras de las siguientes marcas: " + impresoras_permitidas + Arrays.toString(impresoras_permitidas));
		}
	}
	public String get_impresora() {
		return impresora;
	}
	public void set_doc(String documento[]) {
		this.documento = documento;
	}
	public String[] get_documento() {
		return documento;
	}
	
	public String toString() {
		return "Impresora " + impresora + " Documento: " + Arrays.toString(documento);
	}
	public void close() throws Exception{
		System.out.println("Ha finalizado la conexión con la impresora " + impresora);
	}
}
