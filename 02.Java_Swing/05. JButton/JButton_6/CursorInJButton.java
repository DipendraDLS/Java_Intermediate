//Adding the Cursor In JButton.
//Adding the Cursor In JButton.

package JButton_6;

import javax.swing.*;
import java.awt.*;

public class CursorInJButton extends JFrame
{
    public static void main(String[] args)
    {
        CursorInJButton frame = new CursorInJButton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Cursor In JButton");

        Container c = frame.getContentPane();
        c.setLayout(null);


        JButton button = new JButton("Click Me");
        button.setBounds(10,15,100,30);

        //Adding the Hand Cursor so that whenever we move cursor to the button we can see the normal cursor get changes to hand cursor.
        Cursor curs = new Cursor(Cursor.HAND_CURSOR); //Creating the 'curs' as the object of Cursor.
        button.setCursor(curs); //To add Hand_Cursor whenever we take the pointer to the button that we have created.

        c.add(button);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
