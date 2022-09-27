package co.edu.unbosque.model;

/**
 * ejecuta el algoritmo Boyer Moore, Este procesa el patrón 
 * y crea arrays diferentes para cada heurística. 
 * En cada paso desliza el patrón por el máximo de 
 * deslices sugeridos por las dos heurísticas, 
 * entonces usa la mejor de las dos heurísticas en cada paso.
 * @author Villarreal, Muños, Hernadez
 *
 */
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
	/**
	 * busca los patrones de un texto usando BM
	 * @param texto un char cogido del metodo inicar
	 * @param patron un char cogido del metodo inicar
	 */
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
	/**
	 * metodo para trasformar Strings cogidos de la interfaz
	 * @param txt string cogido del archivo.txt
	 * @param pat Strin cogido de la interfaz por el usuario
	 */
	public  void iniciar(String txt, String pat) {
		 char text[] = txt.toCharArray();
	     char patron[] = pat.toCharArray();
	     buscar(text, patron);
	}
}
