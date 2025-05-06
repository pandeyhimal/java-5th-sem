package ZA_java_swing;

import java.awt.*;
import javax.swing.*;


public class c_gridlayout {
    JFrame frame;
    c_gridlayout(){
        frame = new JFrame();
        JButton b1 = new JButton("Btn 1");
        JButton b2 = new JButton("Btn 2");
        JButton b3 = new JButton("Btn 3");
        JButton b4 = new JButton("Btn 4");
        JButton b5 = new JButton("Btn 5");
        JButton b6 = new JButton("Btn 6");
        JButton b7 = new JButton("Btn 7");
        JButton b8 = new JButton("Btn 8");
        JButton b9 = new JButton("Btn 9");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);

        // frame.setLayout(new GridLayout());
        // frame.setLayout(new GridLayout(3,3));
        frame.setLayout(new GridLayout(3,3,20,20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new c_gridlayout();
    }
}
