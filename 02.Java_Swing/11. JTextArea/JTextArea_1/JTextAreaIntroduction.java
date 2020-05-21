package JTextArea_1;

import javax.swing.*;
import java.awt.*;

public class JTextAreaIntroduction  extends JFrame
{
    public static void main(String[] args)
    {
        JTextAreaIntroduction frame = new JTextAreaIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JTextArea Introduction");

        Container c = frame.getContentPane();
        c.setLayout(null);

        //Adding Text Area for writing some comments by the user.
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10,15,500,250);
        c.revalidate(); //Refresh the frame so that the added things could be properly displayed. This is only useful in 'null' layout.
        c.add(textArea);

        //Adds the Scroll bar to the textArea.
        JScrollPane scrollBar = new JScrollPane(textArea);
        scrollBar.setBounds(10,15,500,250);
        c.add(scrollBar);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
