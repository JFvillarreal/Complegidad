package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import co.edu.unbosque.model.AlgoritmoKMP;
import co.edu.unbosque.model.LeerArchivo;
import co.edu.unbosque.model.Numero;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	

	private VentanaPrincipal ventana;
	private Numero n1;
	private Numero n2;
	LeerArchivo le = new LeerArchivo();
	 AlgoritmoKMP alkm= new AlgoritmoKMP();

	public Controller() {

		try {
		
		ventana = new VentanaPrincipal();
		asignarOyentes();

		}catch(NullPointerException e) {
		}
		
	}

	
	public void asignarOyentes() {

		ventana.getPdatos().getBsumar().addActionListener(this);

			ventana.getPdatos().getBsumar().addActionListener(this);



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		String aux = "";
		String aux_int = "";
		if(comando.equals("BUSCAR")) {
			try {
			aux = ventana.getPdatos().getCnum1().getText();
			System.out.println("La palabra que se buscara es : "+aux);
			n1 = new Numero(aux_int, aux);

			//palabra del archivo
			String rta = n1.setPalabra(le.leer());
			
			System.out.println("El contenido del archivo es  : "+rta);
			

			ventana.getPrespuesta().getErta().setText(le.leer());
			alkm.iniciar(rta,aux);
			
			}catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "No hay palabra a buscar ", "?", 3);
			}
		}
		

		
	}
	
}