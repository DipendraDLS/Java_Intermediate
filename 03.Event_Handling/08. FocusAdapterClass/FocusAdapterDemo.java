
/*
        If you want to add only some of the methods that you need of FocusListener then you can use FocusAdapterClass connected.
 */


package FocusAdapterClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusAdapterDemo extends JFrame
{
    public static void main(String[] args)
    {
        FocusAdapterDemo frame = new FocusAdapterDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);

    }
    public FocusAdapterDemo()
    {
        setLayout(new FlowLayout());
        JTextField textField1 = new JTextField(10);
        add(textField1);
        JTextField textField2 = new JTextField(10);
        add(textField2);

        textField1.setBackground(Color.GRAY);
        textField2.setBackground(Color.GRAY);

        FocusAdapter focus = new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                JTextField t = (JTextField)e.getSource();
                t.setBackground(Color.GREEN); //Jun active cha tesma color set huncha greeen.
            }
        };
        textField1.addFocusListener(focus);
        textField2.addFocusListener(focus);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
