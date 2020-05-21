//Using .setText() to override the label that has been defined.
package JLabel_2;

import javax.swing.*;
import java.awt.*;

public class SetTextInJLabel extends JFrame
{
    public static void main(String[] args)
    {
        SetTextInJLabel frame = new SetTextInJLabel();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("setText method in JLabel");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JLabel username = new JLabel("UserName:");
        username.setText("Password:"); //This .setText() method overrides the label that has been defined early.
        username.setBounds(10,20,150,60);
        c.add(username);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

