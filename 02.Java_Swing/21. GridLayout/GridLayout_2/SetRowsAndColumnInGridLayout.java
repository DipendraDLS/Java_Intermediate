package GridLayout_2;


import GridLayout_1.GridLayoutIntroduction;

import javax.swing.*;
import java.awt.*;

public class SetRowsAndColumnInGridLayout extends JFrame
{
    public static void main(String[] args)
    {
        SetRowsAndColumnInGridLayout frame = new SetRowsAndColumnInGridLayout();
        frame.setVisible(true);
        frame.setBounds(500,100,500,250);
        frame.setTitle("GridLayout Introduction");
    }

    public SetRowsAndColumnInGridLayout()
    {
        //Setting the GridLayout
        setLayout(new GridLayout(2,3));

        //Creating JButton
        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");
        JButton btn4 = new JButton("btn4");
        JButton btn5 = new JButton("btn5");


        //Adding JButton
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
