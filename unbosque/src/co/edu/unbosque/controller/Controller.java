package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.LeerArchivo;
import co.edu.unbosque.model.Numero;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	

	private VentanaPrincipal ventana;
	private Numero n1;
	private Numero n2;


	private LeerArchivo le;

	public Controller() {

		ventana = new VentanaPrincipal();
		asignarOyentes();

		//le.leer();
		
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
			
//			aux_int = Integer.parseInt(aux);
			n1 = new Numero(aux_int);
			
			aux = ventana.getPdatos().getCnum2().getText();
			aux_int = Integer.parseInt(aux);
			n2 = new Numero(aux_int);
			
			String rta = n1.getPalabra();
			
			ventana.getPrespuesta().getErta().setText("El valor de la suma es "+rta);
		}
	}	
	
}
