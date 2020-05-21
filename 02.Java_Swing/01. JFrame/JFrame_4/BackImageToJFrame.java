//Set Image Background Color to the JFrame.
package JFrame_4;

import javax.swing.*;
import java.awt.*;

public class BackImageToJFrame extends JFrame
{
    public static void main(String[] args)
    {
        BackImageToJFrame frame = new BackImageToJFrame();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Background Image To JFrame");

        //To set the background of the frame
        // 1. At first we need to know that frame consists of Content Pane.
        // 2. Now, we need to identify the object of that content pane. The object of the content pane is of 'container' type.
        // 3. After that we use .setBackgroud() to set the background of Frame,

        Container c = frame.getContentPane(); //frame.getContentPane()-> le content pane ko object lai identify garauney kam garcha. contentPane ko object ko type sadhai Container type ko huncha.
        c.setBackground(Color.lightGray);
    }
    public BackImageToJFrame()
    {
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
