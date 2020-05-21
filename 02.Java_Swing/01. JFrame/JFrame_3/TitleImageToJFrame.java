//Add Image Icon To The Title Bar of Jframe.

package JFrame_3;

import javax.swing.*;

public class TitleImageToJFrame extends JFrame
{
    public static void main(String[] args)
    {
        TitleImageToJFrame frame = new TitleImageToJFrame();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Image Title Demo To JFrame");

        //To set the icon image on the Title bar of the JFrame.
        ImageIcon icon = new ImageIcon("HP_logo.png"); //icon vanni object create gareko.

        frame.setIconImage(icon.getImage()); //'icon' vanni object ko type ImageIcon cha so tyo object ko type lai Image ma change garna
                                             //Hamiley .getImage() method lai use gareko ho.
    }

    public TitleImageToJFrame()
    {
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
