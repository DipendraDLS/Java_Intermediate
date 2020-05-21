package JRadioButton_1;

import javax.swing.*;
import java.awt.*; //container ko lagi ho.

public class JRadioButtonIntroduction extends JFrame
{
    public static void main(String[] args)
    {
         JRadioButtonIntroduction frame = new JRadioButtonIntroduction();
         frame.setVisible(true);
         frame.setBounds(500,100,1000,500); //setting the position and size of the 'frame' that is to be displayed in the Screen.
         frame.setTitle("JRadioButton Introduction");


        Container c = frame.getContentPane();
        frame.setLayout(null);

        //Adding 1st Radio Button
        JRadioButton gender1 = new JRadioButton("Male"); //gender1 vanni object ho 1st RadioButton ko.
        gender1.setBounds(10,15,100,30);    //Setting the position and size of the 'Radio button' that is to be displayed within a frame.
        c.add(gender1);

        //Adding 2nd Radio Button
        JRadioButton gender2 = new JRadioButton("Female");//gender2 vanni object ho 2nd RadioButton ko.
        gender2.setBounds(10,50,100,30); //Setting the position and size of the 'Radio button' that is to be displayed within a frame.
        c.add(gender2);

        //Note: ButtonGroup gareko chaina so both the radio button ekaochoti select vayeraheko cha. so see JRadioButton_2 package to see 'ButtonGroup' Implementation.


         frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
