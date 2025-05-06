package Z_Swing;

import javax.swing.*;
 
 public class w_joptionpane {
     JFrame optionPane_f;
 
     w_joptionpane() {
         optionPane_f = new JFrame();
         JOptionPane.showMessageDialog(optionPane_f, "Hello, Welcome to Sanothimi College");
     }
 
     public static void main(String[] args) {
         new w_joptionpane();
     }
 }
