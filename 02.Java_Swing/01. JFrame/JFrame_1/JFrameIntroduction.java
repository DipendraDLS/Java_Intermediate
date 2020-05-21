//Basic Introduction To Create a Frame in Swing using JFrame.

package JFrame_1;

import javax.swing.*;

public class JFrameIntroduction extends JFrame  //swing ma define gareko cha JFrame lai so import garnu parcha ->import javax.swing.*;
{
    public static void main(String[] args)
    {
        //BOilerPlate code define gareko. yo Boiler Plate swing ko each and every program ma halnu parcha.
        JFrameIntroduction frame = new JFrameIntroduction();
        frame.setVisible(true); //frame lai display dina ko lagi setVisible(true) gareko ho.

        /* if we are not using anytype of Layout Manager like flowLayout, GridLayout or GridBagLayout then we need to give
           size manually to the frame.
        */
//        frame.setSize(1000,500); //provides the width and height of the frame.

//        frame.setLocation(500,150); // Screen ko kun chai position ma frame lai display diney vanera define gareko.

        //Both the jobs of 'setSize()' and 'setLocation()' can be handled by single method called 'setBound()'
        frame.setBounds(500,150,1000,500); //x and y denotes the position on the screen and 'width' and 'height' denotes the size of the frame.
    }

    public JFrameIntroduction()
    {
        pack(); //pack() method is defined in Window class in Java and it sizes the frame so that all its contents are at or above their preferred sizes

        setDefaultCloseOperation(EXIT_ON_CLOSE); //frame ma cross x button click garda program ni terminate hoss vanera yo rakheko ho.
                                                // if yo setDefaultCloseOpreation(EXIT_ON_CLOSE) rakhena vani frame ko cross x ma click garda frame matrai close huncha tara program terminate hundaina.
    }
}
