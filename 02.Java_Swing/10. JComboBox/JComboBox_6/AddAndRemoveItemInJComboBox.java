package JComboBox_6;

import JComboBox_3.SetSelectedComboBox;

import javax.swing.*;
import java.awt.*;

public class AddAndRemoveItemInJComboBox extends JFrame
{
    public static void main(String[] args)
    {
        SetSelectedComboBox frame = new SetSelectedComboBox();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Add and Remove Items in JComboBox");

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"Apple","Microsoft","Google"}; //ComboBox ma use huni list haru define gareko.
        JComboBox combo1 = new JComboBox(values);       //'Values' vaneko Created String type ko array ho.
        combo1.setBounds(25,15,100,30 );
        c.add(combo1);

        combo1.addItem("Gmail"); //Adds the Items to the ComboBox.
        combo1.removeItem("Apple"); //Removes the Items of the ComboBox.

        c.revalidate();//Refresh gareko frame lai,

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
