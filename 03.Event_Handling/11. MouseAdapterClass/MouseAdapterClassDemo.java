/*
    If you want to implement only some of the function of MouseListener Event then you can use MouseAdapter Class.
 */
package MouseAdapterClass;

import MouseListener.MouseListenerDemo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MouseAdapterClassDemo extends JFrame
{
    public static void main(String[] args)
    {
        MouseListenerDemo frame = new MouseListenerDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public MouseAdapterClassDemo()
    {
        JTextArea textArea = new JTextArea();
        textArea.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
