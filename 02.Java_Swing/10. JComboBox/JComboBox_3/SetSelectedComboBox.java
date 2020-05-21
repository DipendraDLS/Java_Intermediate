package JComboBox_3;

import javax.swing.*;
import java.awt.*;

public class SetSelectedComboBox extends JFrame
{
    public static void main(String[] args)
    {
        SetSelectedComboBox frame = new SetSelectedComboBox();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JComboBox Introduction");

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"Apple","Microsoft","Google"}; //ComboBox ma use huni list haru define gareko.
        JComboBox combo1 = new JComboBox(values);       //'Values' vaneko Created String type ko array ho.
        combo1.setBounds(25,15,100,30 );

        combo1.setSelectedIndex(1); //'1' no. ko index bydefault select huncha and index starts from '0'.
//      combo1.setSelectedItem("Microsoft"); //'Microsoft' vanni item bydefault selected huncha.

        c.add(combo1);

        c.revalidate();//Yedi run garda display ma kei ayena vani that means ki container refresh vako chaina. so yesle container ko object lai refresh garauna help garcha.


        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
