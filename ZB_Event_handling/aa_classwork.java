package ZB_Event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class aa_classwork {
    public static void main(String[] args) {
// Create the frame
JFrame frame = new JFrame("Java Swing Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); // Vertical layout

// Create components
JTextField firstNumberField = new JTextField();
JTextField secondNumberField = new JTextField();
JButton addButton = new JButton("Add");
JLabel resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

// Set preferred size for text fields
Dimension fieldSize = new Dimension(200, 30); // width=200px, height=30px
firstNumberField.setPreferredSize(fieldSize);
secondNumberField.setPreferredSize(fieldSize);

// Create panels for better structure
JPanel panel1 = new JPanel();
panel1.add(new JLabel("First Number:"));
panel1.add(firstNumberField);

JPanel panel2 = new JPanel();
panel2.add(new JLabel("Second Number:"));
panel2.add(secondNumberField);

JPanel panel3 = new JPanel();
panel3.add(addButton);

JPanel panel4 = new JPanel();
panel4.add(resultLabel);

// Add action to button
addButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double sum = num1 + num2;
            resultLabel.setText("Result: " + sum);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers.");
        }
    }
});

// Add panels to frame
frame.add(panel1);
frame.add(panel2);
frame.add(panel3);
frame.add(panel4);

frame.pack(); // Adjust frame size
frame.setLocationRelativeTo(null); // Center the window
frame.setVisible(true);
    }
}
