package Z_Swing;

import javax.swing.*;
 
 public class s_jtabbedpane {
 
     JFrame f;
 
     s_jtabbedpane() {
         f = new JFrame();
         JTextArea ta = new JTextArea(200, 200);
         JPanel p1 = new JPanel();
         p1.add(ta);
         JPanel p2 = new JPanel();
         JPanel p3 = new JPanel();
         JTabbedPane tp = new JTabbedPane();
         tp.setBounds(50, 50, 200, 200);
         tp.add("home", p1);
         tp.add("service", p2);
         tp.add("contact", p3);
         f.add(tp);
         f.setSize(400, 400);
         f.setLayout(null);
         f.setVisible(true);
     }
 
     public static void main(String[] args) {
         new s_jtabbedpane();
     }
 }