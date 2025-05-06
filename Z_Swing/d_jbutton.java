package Z_Swing;
 
 import java.awt.*;
 import javax.swing.*;
 
 public class d_jbutton extends JFrame {
     d_jbutton() {
         JButton b1 = new JButton("Hello"); // creating a button b1
         JButton b2 = new JButton("hi"); // creating a button b2
         setSize(400, 400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new FlowLayout()); // setting layout using FlowLayout object
         add(b1); // adding button b1 to JFrame
         add(b2); // adding button b2 to JFrame
         setVisible(true);
 
     }
 
     public static void main(String[] args) {
         new d_jbutton();
     }
 }