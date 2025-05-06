package ZA_java_swing;


import java.awt.*;
import javax.swing.*;




public class a_border_layout_jframe {
    JFrame frame;

    a_border_layout_jframe(){
        frame = new JFrame();

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        
        frame.setLayout(new BorderLayout(20,10));
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.CENTER);
        frame.add(b4, BorderLayout.EAST);
        frame.add(b5,BorderLayout.WEST);

        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new a_border_layout_jframe();
    }
}
