package co.edu.unbosque.model;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaVentanas;
public class AlgoritmoKMP {

	private static VistaVentanas vista;
	private static VentanaPrincipal ventanas;
	static String[] cha = new String[999];
	
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
		int contador=0;
		for (int i = 0,j =0; i < texto.length(); i++) {
			if (j < patron.length() && texto.charAt(i)==patron.charAt(j)) {
				if (++j == patron.length()) {
					System.out.println("patrones en " + (i-j+1));
					contador++;
				}
			}
			else if (j>0)
			{
				j = next[j];
				i--;
			}
	    	
			
			
		}
		
		JOptionPane.showMessageDialog(null, "La Palabra buscada se repite: "+contador+" Veces", "?", 3);
		System.out.println("veces"+contador);
		
	}
	public void iniciar(String text,String part) {

		KMP(text, part);

	}
}
