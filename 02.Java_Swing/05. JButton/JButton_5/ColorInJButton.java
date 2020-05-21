package JButton_5;

import javax.swing.*;
import java.awt.*;

public class ColorInJButton extends JFrame
{
    public static void main(String[] args)
    {
        ColorInJButton frame = new ColorInJButton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Color In JButton");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton button = new JButton("Clicl Me");
        button.setBounds(10,15,100,30);

        //Creating own color using rgb format.
        Color clr = new Color(40, 255, 225);

        button.setBackground(clr);          //Adding the background Color to the button.
        button.setForeground(Color.red);    //Adding the Text Color of the button.

        c.add(button);      //Adding the button into the Frame.

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
