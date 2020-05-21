/*
   => Setting the horizontal and vertical gap between the components within a FlowLayout.
   => There are two ways to give horizontal and vertical gap between the component in the FlowLayout.
       Two ways are as follow:

         1) pass the Hgap and Vgap in FLowLayout() Constructor itself as:
                eg:-
                    setLayout(new FlowLayout(FlowLayout.CENTER,10 , 5);   //Setting the FlowLayout using Constructor.


         2) Create the object of the FlowLayout and use the FlowLayout() class method as '.setHgap()' and '.setVgap()'.
               eg:-
               //setting the FlowLayout by creating it's object.
                Container c = frame.getContentPane();
                FlowLayout fl = new FlowLayout();
                c.setLayout(fl);

                fl.setHgap(10);
                fl.setVgap(5);
*/

// *************************** Applying 2nd way to set hgap and vgap to the FlowLayout ********************************
package FlowLayout_3;

import javax.swing.*;
import java.awt.*;

public class HgapAndVgapInFlowLayout_2 extends JFrame
{
    public static void main(String[] args)
    {

        HgapAndVgapInFlowLayout_2 frame = new HgapAndVgapInFlowLayout_2();
        frame.setVisible(true);
        frame.setTitle("HgapAndVgap_2");
        frame.setBounds(500,100,1000,500);


        //Creating the object 'fl' as the object of FlowLayout Class.
        FlowLayout fl = new FlowLayout();
        frame.setLayout(fl); //Applying the FlowLayout to the frame.
        fl.setHgap(10);     //setting the horizontal gap between the component in frame with FlowLayout.
        fl.setHgap(20);     //setting the vertical gap between the component in frame with FlowLayout.


        //Creating the JButton
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");

        //Adding button to the frame which has 'FlowLayout'
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
