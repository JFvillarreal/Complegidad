package co.edu.unbosque.model;

public class Numero {
	
	private int num;
	private String palabra;
	
	public Numero() {
		num = 0;
	}
	
	public Numero( int n,String palabra) {
		num = n;
	}
	
	public int sumarNumeros(Numero otro) {
		return num + otro.num;
	}
	
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	
	
}
