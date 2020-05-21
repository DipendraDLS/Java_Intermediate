package JRadioBUtton_3;

import javax.swing.*;
import java.awt.*;

public class FontAndStyleInJRadioBUtton extends JFrame
{
    public static void main(String[] args)
    {
        FontAndStyleInJRadioBUtton frame = new FontAndStyleInJRadioBUtton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500); //setting the position and size of the 'frame' that is to be displayed in the Screen.
        frame.setTitle("Font and Style in JRadioButton");


        Container c = frame.getContentPane();
        frame.setLayout(null);

        //Adding 1st Radio Button
        JRadioButton gender1 = new JRadioButton("Male"); //gender1 vanni object ho 1st RadioButton ko.
        gender1.setBounds(10,15,100,30);    //Setting the position and size of the 'Radio button' that is to be displayed within a frame.

        //Adding 2nd Radio Button
        JRadioButton gender2 = new JRadioButton("Female");//gender2 vanni object ho 2nd RadioButton ko.
        gender2.setBounds(10,50,150,30); //Setting the position and size of the 'Radio button' that is to be displayed within a frame.

        //Grouping the radio buttons that we have created above so that if we select one then another button deselect automatically.
        ButtonGroup group = new ButtonGroup();
        group.add(gender1);//gender1 and gender2 vanni radio button haru yeutai group ma parcha vanera define gareko ho.
        group.add(gender2);

        gender1.setSelected(true); //Initially yesle by default 'gender1' button ma selected cha vanera dekhauncha.

        Font font = new Font("Arial",Font.BOLD,20);
        gender1.setFont(font);
        gender2.setFont(font);

        //Created radio buttons are added to the frame to be displayed.
        c.add(gender1);
        c.add(gender2);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
