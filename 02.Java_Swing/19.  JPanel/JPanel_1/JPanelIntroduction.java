/*
    Basic Concept to be known:-

    1) Light-Weighted Component:
       => Those component that can be added to other components.
          eg:- JButton, JRadioButton
              JButton ----> JFrame   i.e JButton Component can be added to the JFrame component.

    2) Heavy-Weighted Component:
       => Those component that can't be added to some other components.
          eg:- JFrame, JDialog
               JFrame ------> X   i.e JFrame can't be added to any other component these are also know as top level container.

    3) Container:
       => A container is a component, which may contains some other light weight component.
          eg:- JFrame is a container that can contain various light-weight component like JButton, JRadioButton, JCheckbox etc.

          JButton ------> JFrame  i.e JButton can be added to the JFrame so JFrame is a container.
          JLabel -------> JFrame  i.e JLabel can be added to the JFrame so JFrame is a container.
              .
              .
              .         and so on.
          But,

          X --------------> JButton i.e no any other component can be added to the JButton so it is not a container as it is a component.
          X --------------> JLabel  i.e no any other component can be added to the JLabel so it is not a container as it is a component.
          .
          .
          . and so on..

     Q. What is JPanel?
        => JPanel:
                -> JPanel is the light-weight component that can be added to the frame.
                        eg:- you can create JPanel and add it to the frame. Here, 'frame' means the JFrame that you will be creating.

                 ->JPanel is also considered as the container because other component can also be added to the JPanel.
                        eg:- The JPanel that has been added to the frame can contain various component like JButton, JLabel etc within it.

                 ->One JPanel can contain another JPanel as well.
                        eg:- The JPanel that has been added to the frame can contain another JPanel as well.

            NOTE:- The by default Layout in JPanel is the 'FlowLayout' but in JFrame the by default layout is 'BorderLayout'.
*/

//***************************** Creating a JPanel ***************************************************************
package JPanel_1;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.yellow;

public class JPanelIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        // Creating the object for JFrame.
        JPanelIntroduction frame = new JPanelIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JPanel Introduction");

        //Setting the default layout of frame to null Layout.
        Container c = frame.getContentPane();
        c.setLayout(null);    //In JFrame by default Layout is BorderLayout so if we add the panel to the frame then in overall frame the panel will be applied.
                              // So inorder to apply the panel in desired position we set the default Layout to null Layout.


        //Creating JPanel and adding it into the frame by giving the desired position and size of the JPanel.
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(10,15,250,300); //Setting the 'panel' size and position manually as the JFrame default layout is set to null.
        c.add(panel);  //Adding the panel to the frame.

        //Adding JButton component (Light-weight component) to the JPanel.
        JButton btn1 = new JButton("Button");
        panel.add(btn1);   //As we can see that without giving the size and position of the button the 'btn1' is displayed properly into the panel because
                            // the by default Layout for the JPanel is 'FlowLayout' due to this we don't need to define the size and postion using .setBound() method while adding button to the JPanel.

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
