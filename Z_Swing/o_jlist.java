package Z_Swing;

import javax.swing.*;
 
 public class o_jlist {
     o_jlist() {
         JFrame list_f = new JFrame();
         DefaultListModel<String> list_l1 = new DefaultListModel<>();
         list_l1.addElement("Sin Nombre");
         list_l1.addElement("A man and a woman");
         list_l1.addElement("Terminator");
         list_l1.addElement("John Wick");
         JList<String> list1 = new JList<>(list_l1);
         list1.setBounds(100, 100, 75, 75);
         list_f.add(list1);
         list_f.setSize(400, 400);
         list_f.setLayout(null);
         list_f.setVisible(true);
 
     }
 
     public static void main(String[] args) {
         new o_jlist();
     }
 }