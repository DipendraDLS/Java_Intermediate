package JPasswordField_2;

import javax.swing.*;
import java.awt.*;

public class FontAndColorInJPasswordField extends JFrame
{
    public static void main(String[] args)
    {
        FontAndColorInJPasswordField frame = new FontAndColorInJPasswordField();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Font and Color in JPasswordField");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField password = new JPasswordField();
        password.setBounds(10,15,200,30);

        //Adding Font Style and Color to the JPasswordField.
        Font font = new Font("Arial",Font.BOLD,20); //creating the font, fontStyle and fontSize.
        password.setFont(font);     //adding the font that has been defined into the password field.

        //Adding Background and Foreground Color to the JPasswordField.
        Color clr = new Color(255, 246, 14); //Created a color using rgb on our own.

        password.setBackground(clr);    //adding the created color for background in password field.
        password.setForeground(Color.red); //adding the prededined color of java in Font(dots) of Password field.

        c.add(password);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
