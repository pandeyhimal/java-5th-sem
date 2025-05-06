package ZA_java_swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class b_border_layout_jpanel extends JFrame {
    b_border_layout_jpanel() {
        JPanel pa = new JPanel();
        pa.setLayout(new BorderLayout());
        pa.add(new JButton("Header"), BorderLayout.NORTH);
        pa.add(new JButton("Footer"), BorderLayout.SOUTH);
        pa.add(new JButton("Content"), BorderLayout.CENTER);
        pa.add(new JButton("Sidebar"), BorderLayout.EAST);
        pa.add(new JButton("Vertical Menu"), BorderLayout.WEST);

        add(pa);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String[] args) {

        new b_border_layout_jpanel();
    }
}
