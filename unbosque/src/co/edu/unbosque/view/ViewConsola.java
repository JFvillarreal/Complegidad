package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * sirve para  el mostrar en la consola mensjes en la ejecucion
 * de los algoritmos
 * @author Villarreal, Muños, Hernadez
 *
 */
public class ViewConsola {
	
	private Scanner leer;
	
	public ViewConsola() {
		leer = new Scanner(System.in);
	}
	
	public int leerDato(String mensaje) {
		System.out.println(mensaje);
		int dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
	
	public String leerDatoString(String mensaje) {
		System.out.println(mensaje);
		String dato = leer.nextLine();
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
}