/*
    =>Properties of FlowLayout are:-
        a) 'FlowLayout' is the default layout for the JPanel.
        b)  Component size is automatically set to according preferred size. eg:- As the text size grows button size also grows according to text.
        c)  Adding the component in FLowLayout, the position of components are arranged in a row one by one.
        d)  if the horizontal space is not enough to hold all the components then it uses multiple row i.e components are automatically shift into another row.
        3)  if the horizontal space are enough to hold all the components and it has more remaining space then components are shifted into the centre automatically.
*/


package FlowLayout_1;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        FlowLayoutIntroduction frame = new FlowLayoutIntroduction();
        frame.setVisible(true);
        frame.setTitle("FlowLayout Introduction");
        frame.setBounds(500,100,1000,500);

        //Setting the JFrame layout to FlowLayout. Remember! The default layout of JFrame is 'BorderLayout'.
        frame.setLayout(new FlowLayout());

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
