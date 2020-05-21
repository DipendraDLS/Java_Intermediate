package AnonymousIneerClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends JFrame
{
    public static void main(String[] args)
    {
        EventDemo frame = new EventDemo();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }
    public EventDemo()
    {
        JButton btn1 = new JButton("Click");
        btn1.addActionListener(new SayWorld());

        btn1.addActionListener(new SayHello());
        add(btn1);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class  SayHello implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.print("Hello");  //and then yo event run huncha jahele ni .
        }
    }
    class SayWorld implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.print("World");  //pahele yo event run huncha jahele last ma jun event cha tyo call huncha pahele.
        }
    }



}
