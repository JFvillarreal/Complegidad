package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.LeerArchivo;
import co.edu.unbosque.model.Numero;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	

	private VentanaPrincipal ventana;
	private Numero n1;
	private Numero n2;
	LeerArchivo le = new LeerArchivo();
	

	public Controller() {

		try {
		
		ventana = new VentanaPrincipal();
		asignarOyentes();

		}catch(NullPointerException e) {
		}
		
	}

	
	public void asignarOyentes() {
<<<<<<< HEAD
		ventana.getPdatos().getBsumar().addActionListener(this);
//		ventana.getPdatos().getBrestar().addActionListener(this);
=======
		
			ventana.getPdatos().getBsumar().addActionListener(this);
			ventana.getPdatos().getBrestar().addActionListener(this);


>>>>>>> branch 'main' of https://github.com/JFvillarreal/Complegidad
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		String aux = "";
		String aux_int = "";
		if(comando.equals("BUSCAR")) {
			try {
			aux = ventana.getPdatos().getCnum1().getText();
			
//			aux_int = Integer.parseInt(aux);
			n1 = new Numero(aux_int, aux);
			
<<<<<<< HEAD
//			aux = ventana.getPdatos().getCnum2().getText();
//			aux_int = Integer.parseInt(aux);
=======
			aux = ventana.getPdatos().getCnum2().getText();
			aux_int = aux;
>>>>>>> branch 'main' of https://github.com/JFvillarreal/Complegidad

			String rta = n1.setPalabra(le.leer());
			
			
<<<<<<< HEAD
			ventana.getPrespuesta().getErta().setText("El contenido del  archivo es: "+le.leer());
=======
			ventana.getPrespuesta().getErta().setText(le.leer());
			}catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "No hay palabra a buscar", "?", 3);
			}
>>>>>>> branch 'main' of https://github.com/JFvillarreal/Complegidad
		}
		
	}
	
}