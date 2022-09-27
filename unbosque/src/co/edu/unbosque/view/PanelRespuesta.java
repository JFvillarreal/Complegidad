package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelRespuesta extends JPanel{
	
	private JTextArea erta;
	private JScrollPane scrollpane;
		
	public PanelRespuesta() {
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(new Color(232,232,232));
		setBorder(new TitledBorder("Panel de respuesta"));
		
		erta = new JTextArea();
        Font font =  new Font("Times new Roman", Font.BOLD,11);
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        erta.setFont(font.deriveFont(attributes));
        erta.setLineWrap(true);
        scrollpane=new JScrollPane(erta);
        scrollpane.setBounds(10, 20, 450, 200);
        add(scrollpane);
	
		erta.setBounds(10, 20, 450, 200);
		add(erta);
				
	}

	public JTextArea getErta() {
		return erta;
	}

	public void setErta(JTextArea erta) {
		this.erta = erta;
	}
	
	
}
