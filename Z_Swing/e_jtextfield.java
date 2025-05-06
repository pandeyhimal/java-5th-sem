package Z_Swing;
 
 import java.awt.*;
 import javax.swing.*;
 
 public class e_jtextfield extends JFrame {
     e_jtextfield() {
         JTextField jtf = new JTextField(20); // creating JTextField.
         add(jtf); // adding JTextField to frame.
         setLayout(new FlowLayout());
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(400, 400);
         setVisible(true);
 
     }
 
     public static void main(String[] args) {
         new e_jtextfield();
     }
 }