//Using of .setText() in JBUtton.

package JButton_2;

import javax.swing.*;
import java.awt.*;

public class SetTextInJButton extends JFrame
{
    public static void main(String[] args)
    {

        SetTextInJButton frame = new SetTextInJButton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("setText In JButton");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(10,15,100,30);

        button.setText("Login");//'Login' vanni text button ma appear huncha as .setText() le pahele ko button ko text lai override gardincha.

        c.add(button);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
