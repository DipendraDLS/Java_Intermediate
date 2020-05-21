//In Null Layout the component is independent with its container i.e when the frame is resized then size and location is independent.

package NullLayout;

import javax.swing.*;
import java.awt.*;

public class NullLayoutIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        NullLayoutIntroduction frame = new NullLayoutIntroduction();   //JFrame create gareko with the object named 'frame'.
        frame.setVisible(true); // 'frame' lai visible banauna '.setVisible(true)' garnu parchxa if 'false' then frame visible hunaa.
        frame.setBounds(500,100,1000,500); //Setting the position and size of the frame that is to be displayed.
        frame.setTitle("Null Layout"); // setting the title to the frame.

        Container c = frame.getContentPane(); // 'frame' ko by default Layout 'BorderLayout' huncha so tyo layout lai null gardina lai tyo frame ko container ko contentPane get gareko.
        c.setLayout(null); //layout lai null layout banaideko.

        //Making object of  JButton so that it could be added to the Null Layout frame.
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");

        //Setting the position  and size of each button that is to be displayed within a frame.
        btn1.setBounds(10,15,150,30);
        btn2.setBounds(170,15,150,30);
        btn3.setBounds(330,15,150,30);
        btn4.setBounds(490,15,150,30);

        //Adding the each button to the frame.
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
