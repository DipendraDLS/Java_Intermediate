//Popup menu that performs certain action like changing the background color.
package JPopupMenu_2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopupMenuWithActionListener extends JFrame
{
    public static void main(String[] args)
    {
        PopupMenuWithActionListener frame = new PopupMenuWithActionListener();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Popup Menu that changes background Color");

    }
    public PopupMenuWithActionListener()
    {
        Container c = this.getContentPane();
        c.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setSize(1000,500);
        c.add(textArea);

        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem redMenuItem = new JMenuItem("Red");
        popupMenu.add(redMenuItem);


        JMenuItem greenMenuItem = new JMenuItem("Green");
        popupMenu.add(greenMenuItem);

        JMenuItem blueMenuItem = new JMenuItem("Blue");
        popupMenu.add(blueMenuItem);

        JMenuItem yellowMenuItem = new JMenuItem("Yellow");
        popupMenu.add(yellowMenuItem);

        JMenuItem defualtMenuItem = new JMenuItem("Default");
        popupMenu.add(defualtMenuItem);


        textArea.setComponentPopupMenu(popupMenu);


        redMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textArea.setBackground(Color.red);
            }
        });

        greenMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textArea.setBackground(Color.green);
            }
        });

        blueMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textArea.setBackground(Color.blue);
            }
        });

        yellowMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textArea.setBackground(Color.yellow);
            }
        });

        defualtMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textArea.setBackground(Color.white);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
