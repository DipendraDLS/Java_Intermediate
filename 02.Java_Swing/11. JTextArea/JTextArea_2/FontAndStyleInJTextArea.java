package JTextArea_2;

import javax.swing.*;
import java.awt.*;

public class FontAndStyleInJTextArea extends JFrame
{
    public static void main(String[] args)
    {
        FontAndStyleInJTextArea frame = new FontAndStyleInJTextArea();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JTextArea Introduction");

        Container c = frame.getContentPane();
        c.setLayout(null);

        //Adding Text Area for writing some comments by the user.
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10,15,500,250);
        c.revalidate(); //Refresh the frame so that the added things could be properly displayed. This is only useful in 'null' layout.
        c.add(textArea);

        //Adds the Scroll bar to the textArea.
        JScrollPane scrollBar = new JScrollPane(textArea);
        scrollBar.setBounds(10,15,500,250);
        c.add(scrollBar);

        //Adding Font, FontStyle and FontSize In JTextArea
        Font font = new Font("Arial",Font.ITALIC,20);
        textArea.setFont(font);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
