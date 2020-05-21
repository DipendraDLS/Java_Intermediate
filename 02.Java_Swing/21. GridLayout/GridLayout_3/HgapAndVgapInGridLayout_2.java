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

//******************** Implementing 2nd way for Hgap and Vgap
package GridLayout_3;

import javax.swing.*;
import java.awt.*;

public class HgapAndVgapInGridLayout_2  extends JFrame
{
    public static void main(String[] args)
    {
        HgapAndVgapInGridLayout_2 frame = new HgapAndVgapInGridLayout_2();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("HgapAndVgap_2");

    }
    public HgapAndVgapInGridLayout_2()
    {
        //Setting the GridLayout by creating object to the GridLayout Class.
        GridLayout gl = new GridLayout();
        setLayout(gl);  //Setting the layout as GridLayout by passing the object.
        gl.setRows(2);  //Setting the number of rows
        gl.setColumns(3); //Setting the number of columns
        gl.setHgap(5);    //Setting the Horizontal gap between the components
        gl.setVgap(10);   //Setting the Vertical gap between the components.

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
