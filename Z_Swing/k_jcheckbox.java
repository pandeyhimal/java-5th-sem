package Z_Swing;

import java.awt.*;
import javax.swing.*;

public class k_jcheckbox extends JFrame {
    k_jcheckbox() {
        JCheckBox jcb = new JCheckBox("Horror"); // creating JCheckBox.
        add(jcb); // adding JCheckBox to frame.
        jcb = new JCheckBox("Action"); // creating JCheckBox.
        add(jcb); // adding JCheckBox to frame.
        jcb = new JCheckBox("Romance"); // creating JCheckBox.
        add(jcb); // adding JCheckBox to frame.
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new k_jcheckbox();
    }
}
