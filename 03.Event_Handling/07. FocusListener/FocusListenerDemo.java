/*
    =>  Focus events are fired whenever a component gains or loses the keyboard focus.
    => This is true whether the change in focus occurs through the mouse, the keyboard, or programmatically.
 */


package FocusListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusListenerDemo extends JFrame
{
    public static void main(String[] args)
    {
        FocusListenerDemo frame = new FocusListenerDemo();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }
    public FocusListenerDemo()
    {
        setLayout(new FlowLayout());
        JTextField textField1 = new JTextField(10);
        add(textField1);
        JTextField textField2 = new JTextField(10);
        add(textField2);


        textField2.setBackground(Color.GRAY); //program run hunda initally 'textField1' ma focus vayerakheko huncha so 'textField2 lai 'gray' banai deko so that no any confusion may occur.
        FocusListener focus = new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                JTextField t = (JTextField)e.getSource(); //Jun textField ma focus gain vayeraheko cha tesko Source 't' vanni JTextField Object ma rakheko.
//                System.out.println("FocusGained: "+ t); //Object ma k ayerakheko cha herna ko lagi.
                t.setBackground(Color.WHITE);               //Focus vayeraheko textfield lai white banaideko.
            }

            @Override
            public void focusLost(FocusEvent e)
            {
                JTextField t = (JTextField)e.getSource(); //Focus Lost vayeko JTextField ko Source 't' vanni JTextField ko object ma rakheko.
//              System.out.println("FocusLost: "+ t);     //Object ma k ayerakheko cha herna ko lagi.
                t.setBackground(Color.GRAY);            //Focus Lost vayeko Source lai Gray color ma change gardiyeko.
            }
        };

        textField1.addFocusListener(focus);
        textField2.addFocusListener(focus);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
