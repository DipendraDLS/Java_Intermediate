//Customizing the Font , Font Size and Font Style in JTextField.
package JTextField_2;

import javax.swing.*;
import java.awt.*;

public class FontInJTextField extends JFrame
{
    public static void main(String[] args)
    {
        FontInJTextField frame= new FontInJTextField();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Font, FontSize And FontStyle In JTextField");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextField text = new JTextField();
        text.setBounds(5,10,200,30);

        //Adding the Font, FontStyle and FontSize for the JTextField.
        Font font = new Font("Arial",Font.BOLD,20);
        text.setFont(font); //here 'text' is the JTextField that we have created and '.setFont(font)' adds the font to the JTextField through the object 'font'-> that we have created.
        c.add(text);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
