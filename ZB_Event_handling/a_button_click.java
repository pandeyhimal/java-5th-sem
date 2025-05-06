package ZB_Event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class a_button_click {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Button click Event Example:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        // Create a button
        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hello Sanothimi!");
            }
        });
        // Add button to the frame
        frame.getContentPane().add(button);

        // make the frame visible
        frame.setVisible(true);
    }
}
