package MouseMotionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerDemo extends JFrame
{
    public static void main(String[] args)
    {
        MouseMotionListenerDemo frame = new MouseMotionListenerDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public MouseMotionListenerDemo()
    {
        setLayout(new FlowLayout());


        MouseMotionListener motion = new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e)
            {
                System.out.println("Dragged: "+ e.getPoint());
            }

            @Override
            public void mouseMoved(MouseEvent e)
            {
                System.out.println("Mouse Moved:"+ e.getPoint());
            }
        };
        addMouseMotionListener(motion);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
