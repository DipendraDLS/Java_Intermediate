//Creating the Password Field Using JPasswordField.
package JPasswordField_1;

import javax.swing.*;
import java.awt.*;

public class JPasswordFieldIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        JPasswordFieldIntroduction frame = new JPasswordFieldIntroduction();
        frame.setVisible(true);
        frame.setTitle("JPasswordField Introduction");
        frame.setBounds(500,100,1000,500);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField password = new JPasswordField();     // Creates the password Field.
        password.setBounds(10,15,200,30); // Defining the position and size for the password fields.
        c.add(password); //Adds the Password Field




        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
