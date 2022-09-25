package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

	public void leer() {

		try {
			
			BufferedReader leer = new BufferedReader(new FileReader("Archivo.txt"));
			StringBuilder cadena = new StringBuilder();
			String texto = null;
			
			while((texto = leer.readLine()) != null) {
		    	  cadena.append(texto);
		    }
			
			leer.close();
			
			String resul = cadena.toString();
			
			System.out.println(resul);
		      
		}catch(FileNotFoundException e) {
			System.out.println("El Archivo No Se Encuentra");
		}catch(IOException ioException) {
			System.out.println("Error al leer");
		}catch(NullPointerException nullex) {
			System.out.println("No se pudo crear el objeto");
		}
			
		
		
	}

}
