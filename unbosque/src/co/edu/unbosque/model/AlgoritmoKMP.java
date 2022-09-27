package co.edu.unbosque.model;
import co.edu.unbosque.view.VistaVentanas;
public class AlgoritmoKMP {

	private static VistaVentanas vista;
	
	public static void KMP(String texto , String patron) {
		
		if (patron == null || patron.length() == 0) {
			vista.mostrarInformacionError("error en patron");
			return;
		}
		if(texto == null || patron.length()> texto.length()) {
			vista.mostrarInformacionError("error en el texto");
		}
		
		char[] chars = patron.toCharArray();
		int[] next = new int[patron.length() +1];
		for (int i = 1; i<patron.length(); i++) {
			int j = next[i + 1];
			while (j>0 && chars[j] != chars[i]) {
				j = next[j];
			}
			if (j>0 || chars[j] == chars[i]) {
				next[i+1] = j + 1;
			}
		}
		for (int i = 0,j =0; i < texto.length(); i++) {
			if (j < patron.length() && texto.charAt(i)==patron.charAt(j)) {
				if (++j == patron.length()) {
					System.out.println("patrones en ..." + (i-j+1));
				}
			}
			else if (j>0)
			{
				j = next[j];
				i--;
			}
		}
	}
	public void iniciar(String text,String part) {

		KMP(text, part);

	}
}
