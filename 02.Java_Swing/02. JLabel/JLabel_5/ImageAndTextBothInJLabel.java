//Adding Image along with the text in JLabel.
package JLabel_5;

import javax.swing.*;
import java.awt.*;

public class ImageAndTextBothInJLabel extends JFrame
{
    public static void main(String[] args)
    {
        ImageAndTextBothInJLabel frame = new ImageAndTextBothInJLabel();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,700);
        frame.setTitle("Image along with Text in JLabel");

        Container c = frame.getLayeredPane();
        c.setLayout(null);


        ImageIcon icon = new ImageIcon("/home/dipendra/Java_Swing/src/JLabel_5/hplogo.png"); //Full Path to the image location.

        //Appears at the left side.
        JLabel label1 = new JLabel("HP ICON",icon,JLabel.LEFT);
        label1.setBounds(100,50,200,80);
        c.add(label1);

        //Appears at Centre
        JLabel label2 = new JLabel("HP ICON",icon,JLabel.CENTER);
        label2.setBounds(100,150,200,80);
        c.add(label2);

        //Appears at Right Side
        JLabel label3 = new JLabel("HP ICON",icon,JLabel.RIGHT);
        label3.setBounds(100,250,200,80);
        c.add(label3);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
