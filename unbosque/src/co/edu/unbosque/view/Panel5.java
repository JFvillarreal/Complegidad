package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

import co.edu.unbosque.view.LineHighlightPainter.MyHighlightPainter;
/**
 * 
 * @author  Villarreal, Mu�os, Hernadez
 *
 */
public class Panel5 extends JPanel{
	
	private JLabel erta;
	 String revisedText = "jpruebas  ";
    String token = "un";

		
	public Panel5() {
		setLayout(null);
		
	inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		

		erta = new JLabel();
        
		
	     JFrame frame = new JFrame("LineHighlightPainter demo");
	   

	        JTextArea area = new JTextArea(9, 45);
	        area.setLineWrap(true);
	        area.setWrapStyleWord(true);
	        area.setText(revisedText);

	        // Highlighting part of the text in the instance of JTextArea
	        // based on token.
	        highlight(area, token);

	        frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
	        frame.pack();
	        frame.setVisible(true);

				
	}
	   // Creates highlights around all occurrences of pattern in textComp
    public void highlight(JTextComponent textComp, String pattern) {
        // First remove all old highlights
        removeHighlights(textComp);

        try {
            Highlighter hilite = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());

            int pos = 0;
            // Search for pattern
            while ((pos = text.indexOf(pattern, pos)) >= 0) {
                // Create highlighter using private painter and apply around pattern
                hilite.addHighlight(pos, pos + pattern.length(), myHighlightPainter);
                pos += pattern.length();
            }

        } catch (BadLocationException e) {
        }
    }

    // Removes only our private highlights
    public void removeHighlights(JTextComponent textComp) {
        Highlighter hilite = textComp.getHighlighter();
        Highlighter.Highlight[] hilites = hilite.getHighlights();

        for (int i = 0; i < hilites.length; i++) {
            if (hilites[i].getPainter() instanceof MyHighlightPainter) {
                hilite.removeHighlight(hilites[i]);
            }
        }
    }
    // An instance of the private subclass of the default highlight painter
    Highlighter.HighlightPainter myHighlightPainter = new MyHighlightPainter(Color.red);

    // A private subclass of the default highlight painter
    class MyHighlightPainter
            extends DefaultHighlighter.DefaultHighlightPainter {

        public MyHighlightPainter(Color color) {
            super(color);
        }
    }
	
	
}
