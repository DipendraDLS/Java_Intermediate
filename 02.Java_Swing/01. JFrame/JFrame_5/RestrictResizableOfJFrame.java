//Restrict the Resizable of JFrame.
package JFrame_5;

import javax.swing.*;

public class RestrictResizableOfJFrame extends JFrame
{
    public static void main(String[] args)
    {
        RestrictResizableOfJFrame frame = new RestrictResizableOfJFrame();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Restrict Resizable Of JFrame");

        //.setResizable(false) means that that we can't resize the Frame size that appears on our screen.
        frame.setResizable(false);
    }
    public RestrictResizableOfJFrame()
    {
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
