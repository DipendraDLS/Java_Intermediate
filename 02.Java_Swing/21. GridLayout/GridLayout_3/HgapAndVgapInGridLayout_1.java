/*
   => Setting the horizontal and vertical gap between the components within a GridLayout.
   => There are two ways to give horizontal and vertical gap between the component in the GridLayout.
       Two ways are as follow:

         1) pass the Hgap and Vgap in GridLayout() Constructor itself as:
                eg:-
                    setLayout(new GridLayout(2 , 3 ,5, 10);   //Setting the GridLayout using Constructor.
                                                             //'2' is row  and '3' is column.
                                                             //'5' is Horizontal gap and '10' Vertical gap.

         2) Create the object of the GridLayout and use the GridLayout() class method as '.setHgap()' and '.setVgap()'.
               eg:-
               //setting the GridLayout by creating it's object.
                Container c = frame.getContentPane();
                GridLayout gl = new GridLayout();
                c.setLayout(gl);

                gl.setHgap(10);
                gl.setVgap(5);
*/


// ******************** Implementing the first way ***********************************************
package GridLayout_3;

import javax.swing.*;
import java.awt.*;

public class HgapAndVgapInGridLayout_1 extends JFrame
{
    public static void main(String[] args)
    {
        HgapAndVgapInGridLayout_1 frame = new HgapAndVgapInGridLayout_1();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("HgapAndVgap_1");
    }

    public HgapAndVgapInGridLayout_1()
    {
        //Setting the GridLayout
        setLayout(new GridLayout(2,3,5,10)); // here only the hgap and vgap can't be passed through constructor as you must pass the rows and column as well.

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
