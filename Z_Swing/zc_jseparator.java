package Z_Swing;

import javax.swing.*;
import java.awt.*;

public class zc_jseparator {
    public static void main(String args[]) {
        JFrame f = new JFrame("Separator Example");
        f.setLayout(new GridLayout(0, 1));
        JLabel l1 = new JLabel("Hello Nepal");
        f.add(l1);
        JSeparator sep = new JSeparator();
        f.add(sep);
        JLabel l2 = new JLabel("Hello Sanothimi");
        f.add(l2);
        f.setSize(400, 100);
        f.setVisible(true);
    }
}