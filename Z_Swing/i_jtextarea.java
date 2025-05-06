package Z_Swing;

import javax.swing.*;
 
 public class i_jtextarea {
     i_jtextarea() {
         JFrame textArea_f = new JFrame();
         JTextArea textArea_area = new JTextArea("Hello Sanothimi");
         textArea_area.setBounds(10, 30, 200, 200);
         textArea_f.add(textArea_area);
         textArea_f.setSize(400, 400);
         textArea_f.setLayout(null);
         textArea_f.setVisible(true);
     }
 
     public static void main(String[] args) {
         new i_jtextarea();
     }
 }