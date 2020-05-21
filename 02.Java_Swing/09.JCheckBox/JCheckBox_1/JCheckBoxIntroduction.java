//Adding CheckBox Using JCheckBox
package JCheckBox_1;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        JCheckBoxIntroduction frame = new JCheckBoxIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JCheckBox Introduction");

        Container c = frame.getContentPane();
        c.setLayout(null);

        //Adding the CheckBox to the frame.
        JCheckBox checkBox = new JCheckBox("I Agree Terms and Condition");
        checkBox.setBounds(10,15,250,30);
        c.add(checkBox);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
