package Z_Swing;

import javax.swing.*;
import java.awt.*;

public class zi_jlayeredpane extends JFrame {

    public zi_jlayeredpane() {
        super("LayeredPane Example");
        setSize(200, 200);
        JLayeredPane pane = getLayeredPane();
        // creating buttons
        JButton top = new JButton();
        top.setBackground(Color.white);
        top.setBounds(20, 20, 50, 50);
        JButton middle = new JButton();
        middle.setBackground(Color.red);
        middle.setBounds(40, 40, 50, 50);
        JButton bottom = new JButton();
        bottom.setBackground(Color.cyan);
        bottom.setBounds(60, 60, 50, 50);
        // adding buttons on pane

        pane.add(bottom, BorderLayout.SOUTH, 1);
        pane.add(middle, BorderLayout.NORTH, 2);
        pane.add(top, BorderLayout.EAST, 3);
    }

    public static void main(String[] args) {
        zi_jlayeredpane panel = new zi_jlayeredpane();
        panel.setVisible(true);
    }
}
