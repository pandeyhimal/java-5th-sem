package Z_Swing;

import javax.swing.*;
 
 public class q_jslider extends JFrame {
     q_jslider() {
         JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
         JPanel panel = new JPanel();
         panel.add(slider);
         add(panel);
     }
 
     public static void main(String[] args) {
         q_jslider frame = new q_jslider();
         frame.pack();
         frame.setVisible(true);
     }
 }
