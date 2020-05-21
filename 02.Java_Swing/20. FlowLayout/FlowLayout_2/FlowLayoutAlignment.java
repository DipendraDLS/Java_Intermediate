//When resizing the container how to set the component position to 'left', 'right' and 'center' alignment are described below.

package FlowLayout_2;


import FlowLayout_1.FlowLayoutIntroduction;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutAlignment extends JFrame
{
    public static void main(String[] args)
    {
        FlowLayoutAlignment frame = new FlowLayoutAlignment();
        frame.setVisible(true);
        frame.setTitle("FlowLayout Introduction");
        frame.setBounds(500,100,1000,500);

        //Setting the JFrame layout to FlowLayout. Remember! The default layout of JFrame is 'BorderLayout'.
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); //When you resize the container the component will start shifting from the right side of the frame.
                                                            //you can also add it as .RIGHT, .LEFT, .CENTER.

        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);

        frame.pack();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
