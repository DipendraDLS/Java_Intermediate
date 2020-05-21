//Adding ComboBox that can be editable.
package JComboBox_2;

import JComboBox_1.JComboBoxIntroduction;

import javax.swing.*;
import java.awt.*;

public class EditableJComboBox extends JFrame
{
    public static void main(String[] args)
    {
        EditableJComboBox frame = new EditableJComboBox();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Editable JComboBox");

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"Apple","Microsoft","Google"};
        JComboBox combo1 = new JComboBox(values);
        combo1.setBounds(25,15,100,30 );

        combo1.setEditable(true);// ComboBox ma type garna milni facility provide garcha.
        c.add(combo1);


        c.revalidate();//Yedi run garda display ma kei ayena vani that means ki container refresh vako chaina. so yesle container ko object lai refresh garauna help garcha.


        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
