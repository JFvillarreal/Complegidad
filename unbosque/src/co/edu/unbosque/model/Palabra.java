package co.edu.unbosque.model;
/**
 * sirve para el set palabar y get palabra
 * @author  Villarreal, Mu?os, Hernadez
 *
 */
public class Palabra {
	
	private String num;
	private String palabra;
	
	public Palabra() {
		num = null;
	}
	
	public Palabra( String n,String palabra) {
		num = n;
	}
	
	public String sumarNumeros(Palabra otro) {
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
