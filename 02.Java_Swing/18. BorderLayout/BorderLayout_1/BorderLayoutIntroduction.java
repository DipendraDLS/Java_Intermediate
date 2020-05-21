/*
    => In JFrame default layout is BorderLayout().
    => In Border Layout the content are dependent to the frame as whenever the the frame is resized the content within a frame also gets resized.
    => BorderLayout places the content upto 5 areas:
        a) top (PAGE_START/NORTH)
        b) bottom (PAGE_END/SOUTH)
        c) left (LINE_START/WEST)
        d) right (LINE_END/EAST)
        e) center (CENTER)



*/

package BorderLayout_1;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutIntroduction extends JFrame
{
    public static void main(String[] args)
    {
            BorderLayoutIntroduction frame = new BorderLayoutIntroduction();
            frame.setVisible(true);
            frame.setTitle("Border Layout");

    }

    //Constructor
    public BorderLayoutIntroduction()
    {
        //Setting the Border Layout
        setLayout(new BorderLayout());

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

