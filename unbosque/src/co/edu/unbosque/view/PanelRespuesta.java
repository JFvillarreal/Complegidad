package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

import co.edu.unbosque.view.LineHighlightPainter.MyHighlightPainter;
/**
 * 
 * @author  Villarreal, Mu�os, Hernadez
 *
 */
public class PanelRespuesta extends JPanel{
	
	private JLabel erta;
		
	public PanelRespuesta() {
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(new Color(232,232,232));
		setBorder(new TitledBorder("Panel de respuesta"));
		
		erta = new JLabel();
        Font font =  new Font("Times new Roman", Font.BOLD,11);
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        erta.setFont(font.deriveFont(attributes));
        erta.setForeground(Color.red);
	
		erta.setBounds(10, 70, 200, 20);
		add(erta);
				
	}

	public JLabel getErta() {
		return erta;
	}

	public void setErta(JLabel erta) {
		this.erta = erta;
	}
	
	
	
	
}
