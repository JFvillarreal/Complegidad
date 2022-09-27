package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class PanelDatos extends JPanel{
	
	private JLabel enum1;
	private JLabel enum2;
	private JLabel eoperaciones;
	
	private JTextField cnum1;
	private JTextField cnum2;
	
	private JButton bsumar;
	private JButton brestar;
	
	public PanelDatos() {
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.cyan);
		setBorder(new TitledBorder("Panel de datos  5"));
		
		enum1 = new JLabel("Ingrese la palabra a buscar: ");
		enum1.setBounds(50, 50, 170, 20);
		add(enum1);
		
		
		
		cnum1 = new JTextField();
		cnum1.setBounds(240 , 50 , 250 , 20);
		add(cnum1);
		
		enum2 = new JLabel("");
		enum2.setBounds(50, 100, 170, 20);
		add(enum2);
		
		cnum2 = new JTextField();
		cnum2.setBounds(0 , 0 , 0 , 0);
		cnum2.setVisible(false);
		add(cnum2);
		
		eoperaciones = new JLabel("Operaciones: ");
		eoperaciones.setBounds(50, 100, 170, 20);
		add(eoperaciones);
		
		bsumar = new JButton("Buscar");
		bsumar.setBounds(240 , 100 , 250 , 20);
		add(bsumar);
		bsumar.setActionCommand("BUSCAR");
		
		JCheckBox btnMayusculas = new JCheckBox("Desea tener en cuenta las mayusculas ?");
		btnMayusculas.setBounds(50, 127, 97, 23);
		add(btnMayusculas);
		
		
	}

	public JLabel getEnum1() {
		return enum1;
	}

	public void setEnum1(JLabel enum1) {
		this.enum1 = enum1;
	}

	public JLabel getEnum2() {
		return enum2;
	}

	public void setEnum2(JLabel enum2) {
		this.enum2 = enum2;
	}

	public JLabel getEoperaciones() {
		return eoperaciones;
	}

	public void setEoperaciones(JLabel eoperaciones) {
		this.eoperaciones = eoperaciones;
	}

	public JTextField getCnum1() {
		return cnum1;
	}

	public void setCnum1(JTextField cnum1) {
		this.cnum1 = cnum1;
	}

	public JTextField getCnum2() {
		return cnum2;
	}

	public void setCnum2(JTextField cnum2) {
		this.cnum2 = cnum2;
	}

	public JButton getBsumar() {
		return bsumar;
	}

	public void setBsumar(JButton bsumar) {
		this.bsumar = bsumar;
	}

	public JButton getBrestar() {
		return brestar;
	}

	public void setBrestar(JButton brestar) {
		this.brestar = brestar;
	}
}
