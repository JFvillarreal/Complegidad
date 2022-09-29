package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

import org.w3c.dom.Document;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ResaltarPalabra extends JFrame {

	private JPanel contentPane;
	private JTextField campoEscribir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResaltarPalabra frame = new ResaltarPalabra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ResaltarPalabra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Resaltar palabra");
		titulo.setBounds(138, 11, 103, 83);
		contentPane.add(titulo);
		
		JLabel lblNewLabel_1 = new JLabel("Caracter a buscar");
		lblNewLabel_1.setBounds(42, 92, 118, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setBounds(299, 88, 89, 23);
		contentPane.add(btnNewButton);
		
		campoEscribir = new JTextField();
		campoEscribir.setBounds(148, 89, 126, 20);
		contentPane.add(campoEscribir);
		campoEscribir.setColumns(10);
		
		JTextArea campoArea = new JTextArea();
		campoArea.setBounds(45, 154, 331, 96);
		contentPane.add(campoArea);
		
		JLabel lblNewLabel = new JLabel("Texto");
		lblNewLabel.setBounds(42, 130, 46, 14);
		contentPane.add(lblNewLabel);
	}
	
	public void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		resalto(campoArea,campoEscribir.getText());
	}
	
	
	class color extends DefaultHighlighter.DefaultHighlightPainter{

		public color(Color c) {
			super(c);
		}
	}
	
	
	Highlighter.HighlightPainter color=new color(Color.yellow);
	
	public void nuevaPalabra(JTextComponent txtComp) {
		
		Highlighter coloreado=txtComp.getHighlighter();
		Highlighter.Highlight[]coloreadoNuevo=coloreado.getHighlights();
		for(int i=0;i<coloreadoNuevo.length;i++) {
			if(coloreadoNuevo[i].getPainter() instanceof color) {
				
				coloreado.removeHighlight(coloreadoNuevo[i]);
			}
		}
		
	}
	
	public void resalto(JTextComponent txtComp,String encontrar) {
		nuevaPalabra(txtComp);
	try {
		Highlighter coloreado=txtComp.getHighlighter();
		Document doc=(Document) txtComp.getDocument();
		String text=((JTextComponent) doc).getText(0,((javax.swing.text.Document) doc).getLength());
		int posicion=0;
		
		while((posicion=text.toUpperCase().indexOf(encontrar.toUpperCase(),posicion))>=0) {
			coloreado.addHighlight(posicion,posicion+encontrar.length(),color);
			posicion+=encontrar.length();
		}
		
	}catch(Exception e) {
		
	}
	
	
	}
	
}
