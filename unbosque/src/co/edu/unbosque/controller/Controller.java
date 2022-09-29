package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.AlgoritmoBM;
import co.edu.unbosque.model.AlgoritmoKMP;
import co.edu.unbosque.model.LeerArchivo;
import co.edu.unbosque.model.Palabra;
import co.edu.unbosque.view.LineHighlightPainter;
import co.edu.unbosque.view.Panel5;
import co.edu.unbosque.view.VentanaPrincipal;
/**
 * funciona para generar la interfaz y llamar metodos de los algoritmos
 * @author Villarreal, Mu�os, Hernadez
 *
 */
public class Controller implements ActionListener{
	
	private Panel5 panel5;
	private VentanaPrincipal ventana;
	private Palabra n1;
	private Palabra n2;
//	private LineHighlightPainter pat;
	LeerArchivo le = new LeerArchivo();
	AlgoritmoKMP alkm= new AlgoritmoKMP();
	AlgoritmoBM BM = new AlgoritmoBM();

	public Controller() {

		try {
		
		ventana = new VentanaPrincipal();
		asignarOyentes();

		}catch(NullPointerException e) {
		}
		
	}

/**
 * metodo para dar action listener a los botones
 * para que el controlador pueda llamar los metodos
 */
	public void asignarOyentes() {

		ventana.getPdatos().getBsumar().addActionListener(this);
//		ventana.getPdatos().getBrestar().addActionListener(this);

			ventana.getPdatos().getBsumar().addActionListener(this);
			ventana.getPdatos().getBrestar().addActionListener(this);



	}

	@Override
	/**
	 * metodo para utilizar los action lister y ejecutar los algoritmos
	 * dependiento del boton
	 */
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		String aux = "";
		String aux_int = "";
		if(comando.equals("KMP")) {
			try {
			aux = ventana.getPdatos().getCnum1().getText();
			System.out.println("La palabra que se buscara es : "+aux);
			
//			aux_int = Integer.parseInt(aux);
			n1 = new Palabra(aux_int, aux);
			

	
			
			//palabra del archivo
			String rta = n1.setPalabra(le.leer());
			
			System.out.println("El contenido del archivo es  : "+rta);
			alkm.iniciar(rta,aux);
			panel5.iniciar(rta, aux);
			ventana.getPrespuesta().getErta().setText("El contenido del  archivo es: "+le.leer());

			ventana.getPrespuesta().getErta().setText(le.leer());
			}catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "No hay palabra a buscar ", "?", 3);
			}
		}
		if(comando.equals("BM")) {
			try {
			aux = ventana.getPdatos().getCnum1().getText();
			System.out.println("La palabra que se buscara es : "+aux);
//			aux_int = Integer.parseInt(aux);
			n1 = new Palabra(aux_int, aux);
			

			
			//palabra del archivo
			String rta = n1.setPalabra(le.leer());
			
			System.out.println("El contenido del archivo es  : "+rta);
			BM.iniciar(rta,aux);
			
			ventana.getPrespuesta().getErta().setText("El contenido del  archivo es: "+le.leer());

			ventana.getPrespuesta().getErta().setText(le.leer());
			}catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "No hay palabra a buscar ", "?", 3);
			}
		}
	}
	
}