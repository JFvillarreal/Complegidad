package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		try {
			
			BufferedReader leer = new BufferedReader(new FileReader("uwu.txt"));
			StringBuilder cadena = new StringBuilder();
			String texto = null;
			
			while((texto = leer.readLine()) != null) {
		    	  cadena.append(texto);
		    }
		      
		}catch(FileNotFoundException e) {
			System.out.println("El Archivo No Se Encuentra");
		}catch(IOException ioException) {
			System.out.println("Error al leer");
		}
			
		
		
	}

}
