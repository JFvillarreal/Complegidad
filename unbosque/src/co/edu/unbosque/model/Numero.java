package co.edu.unbosque.model;
/**
 * sirve para el set palabar y get palabra
 * @author  Villarreal, Muños, Hernadez
 *
 */
public class Numero {
	
	private String num;
	private String palabra;
	
	public Numero() {
		num = null;
	}
	
	public Numero( String n,String palabra) {
		num = n;
	}
	
	public String sumarNumeros(Numero otro) {
		return num + otro.num;
	}
	
	

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPalabra() {
		return palabra;
	}

	public String setPalabra(String palabra) {
		return this.palabra = palabra;
	}
	
	
	
}
