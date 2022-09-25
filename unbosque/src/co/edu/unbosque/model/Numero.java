package co.edu.unbosque.model;

public class Numero {
	
	private int num;
	
	public Numero() {
		num = 0;
	}
	
	public Numero( int n) {
		num = n;
	}
	
	public int sumarNumeros(Numero otro) {
		return num + otro.num;
	}
	
	public int restarNumeros(Numero otro) {
		if(num > otro.num) {
			return num - otro.num;
		}else {
			return otro.num - num;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
