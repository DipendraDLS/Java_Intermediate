//Defining the JLable.
//JLabel means the Lable that we can see before or above the textfield. Label like 'UserName:', 'Password:' are some example of Label Name.


package JLabel_1;

import javax.swing.*;
import java.awt.*;

public class JLabelIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        JLabelIntroduction frame = new JLabelIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JLabel Introduction");

        //This is done because by default the Layout will be 'BorderLayout' so due to that the label defined below appears randomly in any position.
        //so inorder to make the default 'BorderLayout' as null we wrote below two lines of codes.
        Container c = frame.getContentPane();
        c.setLayout(null); //sets the default Layout (i.e 'BorderLayout') to null.



        //NOTE: after creating the Label we must add each of the label that has been created.
        JLabel username = new JLabel("UserName:");
        username.setBounds(10,20,100,60); //setting the position and size of the label tag i.e 'username' that we have created.
        c.add(username); //each created Label must be added always.


        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
