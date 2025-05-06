package Z_Swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class v_border {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo GUI for Borders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        JPanel panel_LineBorder = new JPanel();
        panel_LineBorder.setBorder(BorderFactory.createLineBorder(Color.GREEN, 10));
        panel_LineBorder.add(new JLabel("Example for Line Border"));
        panel.add(panel_LineBorder);
        JPanel panel_EtchedBorder = new JPanel();
        panel_EtchedBorder.setBorder(BorderFactory.createEtchedBorder());
        panel_EtchedBorder.add(new JLabel("Example for Etched Border"));
        panel.add(panel_EtchedBorder);
        JPanel panel_RaisedBevelBorder = new JPanel();
        panel_RaisedBevelBorder.setBorder(BorderFactory.createRaisedBevelBorder());
        panel_RaisedBevelBorder.add(new JLabel("Example for Raised Bevel Border"));
        panel.add(panel_RaisedBevelBorder);
        JPanel panel_LoweredBevelBorder = new JPanel();
        panel_LoweredBevelBorder.setBorder(BorderFactory.createLoweredBevelBorder());
        panel_LoweredBevelBorder.add(new JLabel("Example for Lowered Bevel Border"));
        panel.add(panel_LoweredBevelBorder);
        JPanel panel_TitledBorder = new JPanel();
        panel_TitledBorder.setBorder(BorderFactory.createTitledBorder("Titled Border"));
        panel_TitledBorder.add(new JLabel("Example for Titled Bevel Border"));
        panel.add(panel_TitledBorder);
        JPanel panel_TitledBorder_Right = new JPanel();
        TitledBorder title = BorderFactory.createTitledBorder("Titled Border");
        title.setTitleJustification(TitledBorder.RIGHT);
        panel_TitledBorder_Right.setBorder(title);
        panel_TitledBorder_Right.add(new JLabel("Example for Right Titled Bevel Border"));
        panel.add(panel_TitledBorder_Right);
        JPanel panel_CompoundBorder = new JPanel();
        Border first_border_to_compound = BorderFactory.createLineBorder(Color.BLACK, 2);
        Border second_border_to_compound = BorderFactory.createEtchedBorder();
        panel_CompoundBorder.setBorder(BorderFactory.createCompoundBorder(first_border_to_compound, second_border_to_compound));
        panel_CompoundBorder.add(new JLabel("Example for Compound Border"));
        panel.add(panel_CompoundBorder);
        JPanel panel_MatteBorder = new JPanel();
        Border matte = BorderFactory.createMatteBorder(1, 5, 10, 1, Color.YELLOW);
        panel_MatteBorder.setBorder(matte);
        panel_MatteBorder.add(new JLabel("Example For Matte Border"));
        panel.add(panel_MatteBorder);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}