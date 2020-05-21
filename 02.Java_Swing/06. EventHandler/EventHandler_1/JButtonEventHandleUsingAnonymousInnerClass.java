//Adding up the functionality to the button and learning about how the action is given to the button so that it can  perform certain action  when button is clicked Using the Anonymous inner class.
package EventHandler_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonEventHandleUsingAnonymousInnerClass extends JFrame
{

    public static void main(String[] args)
    {
        JButtonEventHandleUsingAnonymousInnerClass frame = new JButtonEventHandleUsingAnonymousInnerClass();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Event Handler Introduction");
    }

    public JButtonEventHandleUsingAnonymousInnerClass() //yo yeuta constructor ho jaba yesko object create hunxa tetibeal nai yo automatically call huncha.
    {
        Container c = this.getContentPane(); //this le yaha Main function ma define gareko 'frame' vanni object lai refer garcha.
        c.setLayout(null); //Bydefault Layout 'FlowLayout hunxa so tyo layout lai null gardiyeko so that we can handle the size and position of each component in frame manually.

        //Creating the button objects.
        JButton button1  = new JButton("Red"); //button1 display huncha appear huney name is'Red'
        JButton button2  = new JButton("Green");//button2 display huncha appear huney name is'Green'
        JButton button3  = new JButton("Blue"); //button3 display huncha appear huney name is'Blue'
        JButton button4  = new JButton("Normal");//button4 display huncha appear huney name is'Normal'

        //Giving the position and Size for each button.
        button1.setBounds(10,15,100,30);
        button2.setBounds(120,15,100,30);
        button3.setBounds(230,15,100,30);
        button4.setBounds(340,15,100,30);

        //adding the defined button into the frame.
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);


        //Defining the action to each button. It is good practice to define separate ActionListner with anonymous inner class as shown below to each GUI you have added rather than cascading to if/else condition to single ActionPerformed class.

        //Defining action to button1
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                c.setBackground(Color.red); //if button1 is clicked then background of frame changes to red as c refers to the container object.
//                button1.setBackground(Color.red); //Yo garyo vani chai button ko background pani changes into red.
            }
        });

        //Defining action to button2
        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {

                c.setBackground(Color.green); //if button2 is clicked then background of frame changes to green as c refers to the container object.
            }
        });

        //Defining action to button3
        button3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                c.setBackground(Color.blue); //if button3 is clicked then background of frame changes to blue as c refers to the container object.
            }
        });

        //Defining action to button4
        button4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                c.setBackground(Color.white); ////if button is clicked then background of frame changes to white(normal) as c refers to the container object.
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cross X ma click garyo vani program pani terminate hoss vanera rakheko ho.Yo rakhena vani frame ta close huncha tara program terminate hundaina so.
    }

}


