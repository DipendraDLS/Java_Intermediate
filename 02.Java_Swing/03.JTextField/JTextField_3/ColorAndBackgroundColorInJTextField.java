//About setBackground() ->BackgroundColor and
//      setForeground()-> Font Color.

package JTextField_3;

import javax.swing.*;
import java.awt.*;

public class ColorAndBackgroundColorInJTextField extends JFrame
{
    public static void main(String[] args)
    {
        ColorAndBackgroundColorInJTextField frame = new ColorAndBackgroundColorInJTextField();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Color and Background Color in JTextField");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextField text = new JTextField();
        text.setBounds(10,15,200,30);


        text.setBackground(Color.yellow);//Text Field ko background color set garauncha.
        text.setForeground(Color.RED);//Font ko Color set garauncha.

        //We can even create our own color using rgb color.
        Color clr = new Color(255,255,153);
        text.setBackground(clr);

        c.add(text);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
