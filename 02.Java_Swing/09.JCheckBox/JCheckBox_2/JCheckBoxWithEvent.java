package JCheckBox_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxWithEvent extends JFrame
{
    public static void main(String[] args)
    {
        JCheckBoxWithEvent frame = new JCheckBoxWithEvent();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JCheckBox With Event Handler");


    }
    public JCheckBoxWithEvent()
    {
        Container c = this.getContentPane();
        c.setLayout(null);

        JCheckBox checkbox1 = new JCheckBox("Apple");
        checkbox1.setBounds(10,15,100,30);
        c.add(checkbox1);

        JCheckBox checkbox2 = new JCheckBox("Microsoft");
        checkbox2.setBounds(10,50,100,30);
        c.add(checkbox2);

        JButton button = new JButton("Submit");
        button.setBounds(10,90,100,30);
        c.add(button);

        JTextField textArea = new JTextField();
        textArea.setBounds(115,90,250,30);
        c.add(textArea);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
            //Checking each an every possible events that user can do.
                if(checkbox1.isSelected())
                {
                    textArea.setText("Apple");
                }

                if(checkbox2.isSelected())
                {
                    textArea.setText("Microsoft");
                }

                if (checkbox1.isSelected() && checkbox2.isSelected())
                {
                    textArea.setText("Apple Microsoft");
                }
                if(checkbox1.isSelected()!=true && checkbox2.isSelected()!=true)
                {
                    textArea.setText(" ");
                }

                //NOTE:- These Above mentioned multiple If condition can be reduced within a less lines of codes as
//                String text = "";
//                text += checkbox1.isSelected()?"Apple":""; //If Apple is selected then displays apple otherwise display blank.
//                text += checkbox2.isSelected()?"Microsoft":""; //If Microsoft is selected then displays Microsoft otherwise display blank.
//                textArea.setText(text);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}
