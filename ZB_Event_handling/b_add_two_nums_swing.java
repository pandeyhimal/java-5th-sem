package ZB_Event_handling;

import javax.swing.*;
import java.awt.event.*;

public class b_add_two_nums_swing extends JFrame implements ActionListener {
    private JTextField firstNumberField, secondNumberField;
    private JButton addButton;
    private JLabel resultLabel;

    public b_add_two_nums_swing() {
        setTitle("Java ADD Calculator:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(null);

        JLabel titlelabel = new JLabel("Java Calculator:");
        titlelabel.setBounds(100, 20, 100, 20);
        add(titlelabel);

        JLabel firstJLabel = new JLabel("First number:");
        firstJLabel.setBounds(20, 50, 100, 20);
        add(firstJLabel);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(120, 50, 150, 20);
        add(firstNumberField);

        JLabel secondJLabel = new JLabel("Second number:");
        secondJLabel.setBounds(20, 80, 100, 20);
        add(secondJLabel);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(120, 80, 150, 20);
        add(secondNumberField);

        addButton = new JButton("ADD");
        addButton.setBounds(100, 120, 80, 20);
        add(addButton);
        addButton.addActionListener(this);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 160, 80, 20);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new b_add_two_nums_swing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                int firstNumber = Integer.parseInt(firstNumberField.getText());
                int secondNumber = Integer.parseInt(secondNumberField.getText());
                int result = firstNumber + secondNumber;
                resultLabel.setText("Result = " + result);
            } catch (NumberFormatException ea) {
                resultLabel.setText("Enter numbers only..!");
            }
        }
    }

}
