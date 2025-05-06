package Z_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
// import javax.swing.*;

public class b_iframe extends JFrame {
    public b_iframe() {
        super("This is the title of this frame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello sanothimi");
        add(label);

        JButton btn = new JButton("CLick Me!");
        add(btn);
    }

    public static void main(String[] args) {
        b_iframe frame = new b_iframe();
        frame.setVisible(true);
    }
}
