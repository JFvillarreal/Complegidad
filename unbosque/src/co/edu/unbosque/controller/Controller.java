package co.edu.unbosque.controller;
<<<<<<< HEAD
=======
import co.edu.unbosque.model.ClaseY;
import co.edu.unbosque.model.LeerArchivo;
import co.edu.unbosque.view.View;
>>>>>>> branch 'main' of https://github.com/JFvillarreal/Complegidad

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.Mensaje;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	
<<<<<<< HEAD
	private VentanaPrincipal ventana;
	private Numero n1;
	private Numero n2;
=======

	private ClaseY m;
	private View gui;
	private LeerArchivo le;
>>>>>>> branch 'main' of https://github.com/JFvillarreal/Complegidad
	
	public Controller() {
<<<<<<< HEAD
		ventana = new VentanaPrincipal();
		asignarOyentes();
=======


		
		m = new ClaseY();
		gui = new View(this);

		gui.setVisible(true);
		le.leer();
		
>>>>>>> branch 'main' of https://github.com/JFvillarreal/Complegidad
	}
	
	public void asignarOyentes() {
		ventana.getPdatos().getBsumar().addActionListener(this);
		ventana.getPdatos().getBrestar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		String aux = "";
		int aux_int = 0;
		if(comando.equals("SUMAR")) {
			aux = ventana.getPdatos().getCnum1().getText();
			aux_int = Integer.parseInt(aux);
			n1 = new Numero(aux_int);
			
			aux = ventana.getPdatos().getCnum2().getText();
			aux_int = Integer.parseInt(aux);
			n2 = new Numero(aux_int);
			
			int rta = n1.sumarNumeros(n2);
			
			ventana.getPrespuesta().getErta().setText("El valor de la suma es "+rta);
		}
	}	
	
}
