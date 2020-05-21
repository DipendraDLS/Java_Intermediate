/*
    There are two ways to give horizontal and vertical gap between the component in the borderLayout.

       Two ways are as follow:

         1) pass the Hgap and Vgap in BorderLayout() Constructor itself as:
                eg:-
                    setLayout(new BorderLayout(10,5);   //Setting the BorderLayout using Constructor.


         2) Create the object of the BorderLayout and use the BorderLayout() class method as '.setHgap()' and '.setVgap()'.
               eg:-
               //setting the BorderLayout by creating it's object.
                Container c = frame.getContentPane();
                BorderLayout bl = new BorderLayout();
                c.setLayout(bl);

                bl.setHgap(10);
                bl.setVgap(5);
*/

// *********************** Using 1st way ************************************************************************
package BorderLayout_2;

import javax.swing.*;
import java.awt.*;

public class HgapAndVgapInBorderLayout_1 extends JFrame
{
    public static void main(String[] args)
    {
        HgapAndVgapInBorderLayout_1 frame = new HgapAndVgapInBorderLayout_1();
        frame.setVisible(true);
        frame.setTitle("Hgap and Vgap using Constructor");
    }

    public HgapAndVgapInBorderLayout_1()
    {
        //Setting the Border Layout
        setLayout(new BorderLayout(10,5));

        //Creating the button
        JButton topButton = new JButton("PAGE_START/NORTH");
        JButton bottomButton = new JButton("PAGE_END/SOUTH");
        JButton leftButton = new JButton("LINE_START/WEST");
        JButton rightButton = new JButton("LINE_END/EAST");
        JButton centerButton = new JButton("CENTER");

        //Adding the buttons to the frame.
        //Note: if we don't pass the area where to be displayed i.e if we do only add(topButton) then by default the area covered will be center.
        add(topButton,BorderLayout.PAGE_START);
        add(bottomButton,BorderLayout.PAGE_END);
        add(leftButton,BorderLayout.LINE_START);
        add(rightButton,BorderLayout.LINE_END);
        add(centerButton,BorderLayout.CENTER); //if we remove any of the above buttons and keep only the center button then center button occupies all the remaining space as much as the space is remaining.


        pack(); //Visible garaunda frame lai resize garauney kam pack ko ho. NOTE:- don't use this in NullLayout.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
