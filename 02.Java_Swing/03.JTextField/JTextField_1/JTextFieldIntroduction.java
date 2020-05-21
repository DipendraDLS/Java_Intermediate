//Adding JTextField to the JFrame.
package JTextField_1;

import javax.swing.*;
import java.awt.*;

public class JTextFieldIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        JTextFieldIntroduction frame = new JTextFieldIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JTextField Introduction");

        Container c = frame.getContentPane();
        c.setLayout(null);


        JTextField text = new JTextField(); //JFrame ma define gareko JTextField le text field provide garney ka garcha.
        text.setBounds(10,20,100,20);   //Text Field ko position, and size define gareko ho.
        c.add(text);    //Adds the textfield to the frame

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
