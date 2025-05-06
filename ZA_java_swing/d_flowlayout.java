package ZA_java_swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class d_flowlayout extends JFrame {
    JButton b1 = new JButton("Btn 1");
    JButton b2 = new JButton("Btn 2");
    JButton b3 = new JButton("Btn 3");
    JButton b4 = new JButton("Btn 4");
    JButton b5 = new JButton("Btn 5");
    JButton b6 = new JButton("Btn 6");
    JButton b7 = new JButton("Btn 7");
    JButton b8 = new JButton("Btn 8");
    JButton b9 = new JButton("Btn 9");

    d_flowlayout() {
        setTitle("FlowLayout");
        setBounds(50, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container c = getContentPane();

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);

        // FlowLayout f = new FlowLayout();
        FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 10, 20);
        // f.setVgap(20);
        // f.setHgap(20);

        c.setLayout(f);
    }
}
