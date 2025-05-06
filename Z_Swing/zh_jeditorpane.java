package Z_Swing;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class zh_jeditorpane {

    JFrame myFrame = null;

    public static void main(String[] a) {
        (new zh_jeditorpane()).test();
    }

    private void test() {
        myFrame = new JFrame("JEditorPane Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 200);
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("text/plain");
        myPane.setText("The night seems to fade But the moonlight lingers on."
                + " There are wonders for everyone The stars shine so bright."
                + " But they're fading after dawn There is magic in Kingston Town.");
        myFrame.setContentPane(myPane);
        myFrame.setVisible(true);
    }
}
