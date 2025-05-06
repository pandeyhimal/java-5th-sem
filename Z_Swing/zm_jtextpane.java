package Z_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class zm_jtextpane {

    public static void main(String args[]) throws BadLocationException {
        JFrame frame = new JFrame("JTextPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();
        JTextPane pane = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);

        // Set the attributes before adding text
        pane.setCharacterAttributes(attributeSet, true);
        pane.setText("Hello ");

        attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setForeground(attributeSet, Color.red);
        StyleConstants.setBackground(attributeSet, Color.yellow);

        Document doc = pane.getStyledDocument();
        doc.insertString(doc.getLength(), "to all the students ", attributeSet);

        attributeSet = new SimpleAttributeSet();
        doc.insertString(doc.getLength(), " of Sanothimi Campus.", attributeSet);

        JScrollPane scrollPane = new JScrollPane(pane);
        cp.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
