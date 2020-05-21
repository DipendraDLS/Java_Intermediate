/*
    => Item events are fired by components that implement the ItemSelectable interface.
    => Generally, ItemSelectable components maintain on/off state for one or more items.
    => The Swing components that fire item events include some buttons (like check boxes, check menu items, toggle buttons)
       and combo boxes.
    => Use ItemListener interface to handle the event.
 */
package ItemListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerDemo extends JFrame
{
    public static void main(String[] args)
    {
        ItemListenerDemo frame = new ItemListenerDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public ItemListenerDemo()
    {
        setLayout(new FlowLayout());
        JLabel label = new JLabel();
        add(label);

       // A JToggleButton is a two-state button. The two states are selected and unselected
        JToggleButton toggleBtn1 = new JToggleButton("Toggle Button");
        add(toggleBtn1);


        toggleBtn1.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    label.setText("ON");     //Toggle Button is clicked then "ON" label will appear.
                }
                else
                {
                    label.setText("OFF");   //Toggle Button is released then "OFF" label will appear.
                }
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
