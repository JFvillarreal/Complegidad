package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * unificacion de las interfazes en una sola
 * @author Villarreal, Mu�os, Hernadez
 *
 */
public class VentanaPrincipal extends JFrame{

	private PanelDatos pdatos;
	private Panel5 pdatos5;
	private LineHighlightPainter presaltado;
	private PanelRespuesta prespuesta;
	
	public VentanaPrincipal() {
		
		setTitle("Busqueda de palabra");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public void inicializarComponentes() {
		pdatos = new PanelDatos();
		pdatos.setBounds(25, 25, 535, 250);
		getContentPane().add(pdatos);
		
		pdatos5 = new Panel5();
		pdatos5.setBounds(25, 300, 535, 140);
		getContentPane().add(pdatos5);
			
//		presaltado = new LineHighlightPainter();
//  	presaltado.setBounds(25, 25, 535, 250);
//		getContentPane().add(presaltado);
		
//		prespuesta = new PanelRespuesta();
//		prespuesta.setBounds(25, 300, 535, 140);
//		getContentPane().add(prespuesta);
		
		
	}

	public PanelDatos getPdatos() {
		return pdatos;
	}

	public void setPdatos(PanelDatos pdatos) {
		this.pdatos = pdatos;
	}

	public PanelRespuesta getPrespuesta() {
		return prespuesta;
	}

	public void setPrespuesta(PanelRespuesta prespuesta) {
		this.prespuesta = prespuesta;
	}
	

}
