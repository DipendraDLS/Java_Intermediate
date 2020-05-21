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

//***************** Applying 1st way to implement vgap and hgap in FlowLayout. **************************************************
package FlowLayout_3;

import javax.swing.*;
import java.awt.*;

public class HgapAndVgapInFlowLayout_1 extends JFrame
{
    public static void main(String[] args)
    {

        HgapAndVgapInFlowLayout_1 frame = new HgapAndVgapInFlowLayout_1();
        frame.setVisible(true);
        frame.setTitle("HgapAndVgap_1");
        frame.setBounds(500,100,1000,500);

        //Setting the JFrame layout to FlowLayout. Remember! The default layout of JFrame is 'BorderLayout'.
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20)); //When you resize the container the component will start shifting from the right side of the frame.
                                                                            //you can also add it as .RIGHT, .LEFT, .CENTER.
                                                                            //'10' refers to the horizontal gap between the component within FlowLayout
                                                                           //'20' refers to the vertical gap between the component within FlowLayout

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

        frame.pack();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

