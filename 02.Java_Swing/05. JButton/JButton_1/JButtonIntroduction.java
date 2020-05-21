//Adding the button into the frame using JButton.
package JButton_1;

import javax.swing.*;
import java.awt.*;

public class JButtonIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        JButtonIntroduction frame = new JButtonIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JButton Introduction");

        Container c = frame.getContentPane();
        c.setLayout(null);

        //Adding the button into the frame.
        JButton button = new JButton("Click Me"); // "Click Me" vaneko chai button ma appear huni name ho.
        button.setBounds(10,15,100,30);// setting the position and size of the button.
        c.add(button);  //adding the button into the frame.

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
