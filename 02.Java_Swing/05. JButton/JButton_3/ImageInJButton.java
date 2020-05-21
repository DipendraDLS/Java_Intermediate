//Adding up the button with the Image. Here Image itself acts as a button.

package JButton_3;

import javax.swing.*;
import java.awt.*;

public class ImageInJButton extends JFrame
{
    public static void main(String[] args)
    {
        ImageInJButton frame = new ImageInJButton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Image In JButton");

        Container c = frame.getContentPane();
        c.setLayout(null);

        //Adding ImageIcon in JButton
        ImageIcon icon = new ImageIcon("/home/dipendra/Java_Swing/src/JButton_3/hplogo.png"); // 'icon' vanni object ma Image set gareko ho by giving the image full path.


        JButton button = new JButton(icon);
        button.setBounds(10,15,icon.getIconWidth(),icon.getIconHeight());//'icon.getIconWidth()' -> yesle image ko width jatro cha tetrai linacha, and icon.getIconHeight() -> yesle image ko height jatro cha tetrai lincha.
        c.add(button);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
