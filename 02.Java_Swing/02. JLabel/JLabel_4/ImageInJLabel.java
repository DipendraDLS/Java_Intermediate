//Adding Image on the JLabel
package JLabel_4;

import javax.swing.*;
import java.awt.*;

public class ImageInJLabel extends JFrame
{
    public static void main(String[] args)
    {
        ImageInJLabel frame = new ImageInJLabel();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,700);
        frame.setTitle("Image on JLabel");
        Container c = frame.getContentPane();
        c.setLayout(null);

        ImageIcon icon = new ImageIcon("/home/dipendra/Java_Swing/src/JLabel_4/HP_logo.png");
        JLabel image = new JLabel(icon); //icon vanni ImageIcon type ko object ho jaslai JLabel ma pass gariyeko cha.
        image.setBounds(100,200,icon.getIconWidth(),icon.getIconHeight()); //Image ko display huni position and size diyeko ho. yedi Image ko width and height tha chaina vani we can use .getIconWidth() and .getIconHeight().
        c.add(image);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

