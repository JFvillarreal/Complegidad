package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

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
		erta.setBounds(175, 70, 200, 20);
		add(erta);
				
	}

	public JLabel getErta() {
		return erta;
	}

	public void setErta(JLabel erta) {
		this.erta = erta;
	}
	
	
}
