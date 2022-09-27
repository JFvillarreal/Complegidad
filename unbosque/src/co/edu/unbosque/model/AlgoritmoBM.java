package co.edu.unbosque.model;

public class AlgoritmoBM {

	static int valorMaximo = 256;
	static int entero(int a, int b){
		return (a>b) ? a:b;
	}
	static void PreAlgoritmo(char[] str, int cantidad, int badchar[]) {
		int i;
		for ( i = 0;i<valorMaximo;i++) {
			badchar[i] = -1;
		}
		for (i = 0; i<cantidad; i++) {
			badchar[(int) str[i]] = i;
		}
	}
	public static void buscar(char texto[], char patron[]) {
		int longPatron = patron.length;
		int longTexto =  texto.length;
		int badchar[]= new int[valorMaximo];
		PreAlgoritmo(patron, longPatron, badchar);
		int s = 0;
		while(s <= (longTexto-longPatron)) {
			int j = longPatron-1;
			while(j>=0 && patron[j] == texto[s+j]) {
				j--;
			}
			if(j<0) {
				System.out.println("patron encontrado en "+ s);
				s+=(s + longPatron<longTexto)? longTexto - badchar[texto[s+longPatron]]:1;
			}
			
			else {
				s+=entero(1, j-badchar[texto[s+j]]);
			}
		}
	}
	public  void iniciar(String txt, String pat) {
		 char text[] = txt.toCharArray();
	     char patron[] = pat.toCharArray();
	     buscar(text, patron);
	}
}
