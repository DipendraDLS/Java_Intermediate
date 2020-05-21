package WindowFocusListener;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class WindowFocusListenerDemo extends JFrame
{
    public static void main(String[] args)
    {
        WindowFocusListenerDemo frame = new WindowFocusListenerDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public WindowFocusListenerDemo()
    {
        addWindowFocusListener(new WindowFocusListener()
        {
            @Override
            public void windowGainedFocus(WindowEvent e)
            {
                System.out.println("Focus Gained");
            }

            @Override
            public void windowLostFocus(WindowEvent e)
            {
                System.out.println("Focus Lost");
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
