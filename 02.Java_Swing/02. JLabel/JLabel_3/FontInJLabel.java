//Changing the Font, FontStyle and FontSize to the Label that we have created.
package JLabel_3;


import javax.swing.*;
import java.awt.*;

public class FontInJLabel extends JFrame
{
    public static void main(String[] args)
    {

        FontInJLabel frame = new FontInJLabel();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Font In JLabel");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JLabel username = new JLabel("UserName:");

        //Font le 3 wota parameter linxa, at first Font Name, 2nd is Font style, and last one is Font Size.
        Font font = new Font("Arial",Font.BOLD,18);

        username.setFont(font);//username.setFont(font)-> means that create gareko label ma font set gareko.
        username.setBounds(10,20,150,60);
        c.add(username);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
