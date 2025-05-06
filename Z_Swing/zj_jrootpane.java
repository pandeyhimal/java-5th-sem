package Z_Swing;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;

public class zj_jrootpane {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRootPane root = f.getRootPane();
        Container content = root.getContentPane();
        content.add(new JButton("Hello"));
        f.pack();
        f.setVisible(true);
    }
}
