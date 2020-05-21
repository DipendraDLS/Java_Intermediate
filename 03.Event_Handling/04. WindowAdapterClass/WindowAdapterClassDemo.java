// If we use the concept of Listener then we have to implement all of the methods that are defined within that Listener.
//So inorder to overcome with this difficulties we can use "Adapter Class".
package WindowAdapterClass;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterClassDemo extends JFrame
{
    public static void main(String[] args)
    {
        WindowAdapterClassDemo frame = new WindowAdapterClassDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public WindowAdapterClassDemo()
    {
        addWindowListener(new WindowAdapter()  //WindowAdapter rakheko vayera we can define the method that are only necessary to us no need
                                                //to define all of the methods.
        {
            //Java ko WindowListener ma define vayeko methods haru ho.
            @Override
            public void windowOpened(WindowEvent e)
            {
                System.out.println("Opened");
            }

            @Override
            public void windowIconified(WindowEvent e)
            {
                System.out.println("Iconified");
            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                 if(confirmClose()==true)
                     System.exit(0);

            }
        });

        pack();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    private boolean confirmClose()
    {
        int result = JOptionPane.showConfirmDialog(this,"Close Application?");
        return result==JOptionPane.YES_OPTION;

    }
}
