package JDesktopPane;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class JDesktopPaneDemo extends JFrame
{
    public static void main(String[] args)
    {
        JDesktopPaneDemo frame = new JDesktopPaneDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }

    public JDesktopPaneDemo()
    {
        JDesktopPane desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        JLabel label = new JLabel("Hello");
        JInternalFrame iframe = new JInternalFrame("frame1",true,true,true,true);
        iframe.add(label);
        iframe.setBounds(100,150,500,250);
        iframe.setVisible(true);
        desktopPane.add(iframe);
        try
        {
            iframe.setSelected(true);
        }
        catch (PropertyVetoException e)
        {

        }

        iframe.addVetoableChangeListener(new VetoableChangeListener()
        {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException
            {
                String name = evt.getPropertyName();
                Object value = evt.getNewValue();
                if(name.equals("closed") && value.equals(true) && confirmClose(iframe))
                    return;
                throw new PropertyVetoException("Cancelled by user", evt);
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private boolean confirmClose(JInternalFrame frame)
    {
        int result = JOptionPane.showInternalConfirmDialog(frame, "Confirm Close?");
        return result == JOptionPane.YES_OPTION;
    }
}
