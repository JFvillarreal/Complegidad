package co.edu.unbosque.view;

import java.lang.reflect.InvocationTargetException;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class LineHighlightPainter {

    String revisedText = "jafe es un mk a b c dfsd ss aa asdas  ";
    
    String token = "un";

    public static void main(String args[]) {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {

                public void run() {
                    new LineHighlightPainter().createAndShowGUI();
                }
            });
        } catch (InterruptedException ex) {
            // ignore
        } catch (InvocationTargetException ex) {
            // ignore
        }
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("LineHighlightPainter demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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