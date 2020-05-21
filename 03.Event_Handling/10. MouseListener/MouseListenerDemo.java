/*
    Mouse events notify when the user uses the mouse (or similar input device) to interact with a component.
 */

package MouseListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerDemo extends JFrame
{
    public static void main(String[] args)
    {
        MouseListenerDemo frame = new MouseListenerDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public MouseListenerDemo()
    {
        JTextArea textArea = new JTextArea();

        //All the methods of MouseListener should be defined below.
        textArea.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Mouse Clicked.");
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                System.out.println("Mouse Entered.");
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                System.out.println("Mouse Exited");
            }
        });
        add(textArea);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}

