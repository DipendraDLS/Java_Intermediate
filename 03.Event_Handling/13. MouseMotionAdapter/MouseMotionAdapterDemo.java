/*
    If you want to use only some of the methods of the MouseListener then we can use MouseMotionAdapter
 */
package MouseMotionAdapter;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAdapterDemo extends JFrame
{
    public static void main(String[] args)
    {
        MouseMotionAdapterDemo frame = new MouseMotionAdapterDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public MouseMotionAdapterDemo()
    {
        addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseMoved(MouseEvent e)
            {
                System.out.println("Mouse Moved: "+ e.getPoint());
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
