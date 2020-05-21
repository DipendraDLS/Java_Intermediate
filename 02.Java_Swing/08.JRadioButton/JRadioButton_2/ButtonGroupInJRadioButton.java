package JRadioButton_2;


import JRadioButton_1.JRadioButtonIntroduction;

import javax.swing.*;
import java.awt.*;

public class ButtonGroupInJRadioButton extends JFrame
{
    public static void main(String[] args)
    {
        ButtonGroupInJRadioButton frame = new ButtonGroupInJRadioButton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500); //setting the position and size of the 'frame' that is to be displayed in the Screen.
        frame.setTitle("ButtonGroup In JRadioButton");


        Container c = frame.getContentPane();
        frame.setLayout(null);

        //Adding 1st Radio Button
        JRadioButton gender1 = new JRadioButton("Male"); //gender1 vanni object ho 1st RadioButton ko.
        gender1.setBounds(10,15,100,30);    //Setting the position and size of the 'Radio button' that is to be displayed within a frame.

        //Adding 2nd Radio Button
        JRadioButton gender2 = new JRadioButton("Female");//gender2 vanni object ho 2nd RadioButton ko.
        gender2.setBounds(10,50,100,30); //Setting the position and size of the 'Radio button' that is to be displayed within a frame.

        //Grouping the radio buttons that we have created above so that if we select one then another button deselect automatically.
        ButtonGroup group = new ButtonGroup();
        group.add(gender1);//gender1 and gender2 vanni radio button haru yeutai group ma parcha vanera define gareko ho.
        group.add(gender2);

        gender1.setSelected(true); //Initially yesle by default 'gender1' button ma selected cha vanera dekhauncha.

        //Created radio buttons are added to the frame to be displayed.
        c.add(gender1);
        c.add(gender2);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
