package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * unificacion de las interfazes en una sola
 * @author Villarreal, Muños, Hernadez
 *
 */
public class VentanaPrincipal extends JFrame{

	private PanelDatos pdatos;
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
		
		prespuesta = new PanelRespuesta();
		prespuesta.setBounds(25, 300, 535, 140);
		getContentPane().add(prespuesta);
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
