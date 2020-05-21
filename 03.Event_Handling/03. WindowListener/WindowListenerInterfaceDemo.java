// If we use the concept of Listener then we have to implement all of the methods that are defined within that Listener.
//So inorder to overcome with this difficulties we can use "Adapter Class".

package WindowListener;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerInterfaceDemo extends JFrame
{
    public static void main(String[] args)
    {
        WindowListenerInterfaceDemo frame = new WindowListenerInterfaceDemo();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }
    public WindowListenerInterfaceDemo()
    {
        JTextArea textArea = new JTextArea();

        addWindowListener(new WindowListener()
        {
            //Java ko WindowListener ma define vayeko methods haru ho.

            @Override
            public void windowOpened(WindowEvent e)
            {
                System.out.println("Opened");
            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closing");

            }

            @Override
            public void windowClosed(WindowEvent e)
            {
                System.out.println("Closed");
            }

            @Override
            public void windowIconified(WindowEvent e)  //Window minimized hunda
            {
                System.out.println("Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e)  //Window maximized after minimized
            {
                System.out.println("Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e)
            {
                System.out.println("Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e)
            {
                System.out.println("Deactivated");
            }
        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
