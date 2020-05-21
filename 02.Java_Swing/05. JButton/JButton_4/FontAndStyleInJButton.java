package JButton_4;

import javax.swing.*;
import java.awt.*;

public class FontAndStyleInJButton extends JFrame
{
    public static void main(String[] args)
    {
        FontAndStyleInJButton frame = new FontAndStyleInJButton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Font, FontStyle and FontSize to the Button Text.");


        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton button = new JButton("Click Here");
        button.setBounds(10,15,150,30);

        //Adding the Font, FontStyle and FontSize to the Button Text.
        Font font = new Font("Arial",Font.ITALIC,20); //Font set gareko, FOntStyle Set gareko and then Font Size Set gareko.
        button.setFont(font); //Tyo set gareko object (i.e 'font') button ma apply garauna object pass gareko.

        c.add(button); //buttton add gareko ho.

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
