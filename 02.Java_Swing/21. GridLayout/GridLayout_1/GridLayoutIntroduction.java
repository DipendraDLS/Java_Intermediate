/*
    GridLayout Properties:
        a) Each component takes the maximum available size of the container. Whenever the container is resized the component also gets resized.
        b) Each component has exactly of same size i.e same height and weight.
        c) If we don't define rows and column components gets arranged in a single rows in a continuous fashion.
        d) We can also define rows and column.
    What actually grid means?
     => Grid actually means cell.


*/

package GridLayout_1;

import javax.swing.*;
import java.awt.*;

public class GridLayoutIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        GridLayoutIntroduction frame = new GridLayoutIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,500,250);
        frame.setTitle("GridLayout Introduction");
    }
    public GridLayoutIntroduction()
    {

        //Setting the GridLayout
        setLayout(new GridLayout());

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
