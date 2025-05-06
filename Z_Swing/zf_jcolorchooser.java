package Z_Swing;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class zf_jcolorchooser extends JFrame implements ActionListener {

    JButton b;
    Container c;

    zf_jcolorchooser() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        zf_jcolorchooser ch = new zf_jcolorchooser();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}