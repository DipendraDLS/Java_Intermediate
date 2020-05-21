package EventHandler_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonEventHandleUsingSeperateClass extends JFrame
{
    static Container c; //'c' is the object of the Container that is defined 'static' because we have created the separate class 'RedListenerClass' and 'YellowListenerClass' so it only takes the static varaible and it is defined globally so that it can be accessd fron another class too.
    public static void main(String[] args)
    {
        JButtonEventHandleUsingSeperateClass frame = new JButtonEventHandleUsingSeperateClass();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
        frame.setTitle("Event Handler Using Separate Class");
    }
    public JButtonEventHandleUsingSeperateClass()
    {
        c = this.getContentPane();
        c.setLayout(null);

        //For Red Button.

        JButton red = new JButton("Red");
        red.setBounds(10,15,100,30);

        RedListenerClass redListener = new RedListenerClass(); //'redListener' is the object of RedListenerClass as we have to pass that object so that RedListenerClass is called and action is perfomed.
        red.addActionListener(redListener); //action is given to the button.

        c.add(red); //button is added to the frame.

        //For Yellow Button.
        JButton yellow = new JButton("Yellow");
        yellow.setBounds(120,15,100,30);

        YellowListenerClass yellowListener = new YellowListenerClass();
        yellow.addActionListener(yellowListener);
        c.add(yellow);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

//Creating a Separate Class that performs the certain action when the 'red' button is clicked.
class RedListenerClass implements ActionListener //YellowListenerClass is the class name that we have created.
{
    public void actionPerformed(ActionEvent e)
    {
        JButtonEventHandleUsingSeperateClass.c.setBackground(Color.red); //JButtonEventHandleUsingSeparateClass-> means the parent class and 'c' is the object of the container which is needed here because we have to change the background color of the frame.
    }
}

//Creating a Separate Class that performs the certain action when the 'yellow' button is clicked.
class YellowListenerClass implements ActionListener //YellowListenerClass is the class name that we have created.
{
    public void actionPerformed(ActionEvent e)
    {
        JButtonEventHandleUsingSeperateClass.c.setBackground(Color.yellow);
    }
}
