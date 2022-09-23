package co.edu.unbosque.controller;
import co.edu.unbosque.model.ClaseY;
import co.edu.unbosque.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
	

	private ClaseY m;
	private View gui;
	
	public Controller() {


		
		m = new ClaseY();
		gui = new View(this);

		gui.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(gui.getPanelEntrada().CONVERTIR)) {
		String resultado = m.procesarDatoClaseY(gui.getPanelEntrada().getTxtNumero().getText());
		//	String resultado1 = m.getY().procesarDatoClaseY(gui.getPanelEntrada().getTxtNumero().getText());
		//		gui.getPanelResultados().getTxtMonto().setText(resultado1);
		}
	}
	
}