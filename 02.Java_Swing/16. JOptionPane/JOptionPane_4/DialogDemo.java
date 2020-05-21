package JOptionPane_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame
{
    public static void main(String[] args)
    {
        DialogDemo frame = new DialogDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Dialog Demo");
    }
    public DialogDemo()
    {

        Container c = this.getContentPane();
        c.setLayout(null);

        JButton showMessageDialogButton = new JButton("Show Message Dialog");
        showMessageDialogButton.setBounds(20,20,250,20);
        c.add(showMessageDialogButton);

        JButton showConfirmDialogButton = new JButton("Show Confirm Dialog");
        showConfirmDialogButton.setBounds(275,20,250,20);
        c.add(showConfirmDialogButton);
        
//***************** Adding ActionListner ************************************************************************************************

        showMessageDialogButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JOptionPane.showMessageDialog(DialogDemo.this,"Hello");
            }
        });

        showConfirmDialogButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                int selection = JOptionPane.showConfirmDialog(DialogDemo.this,"Message","Title",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

                if (selection==JOptionPane.OK_OPTION)
                    JOptionPane.showMessageDialog(DialogDemo.this,"OK Clicked");
                else
                    JOptionPane.showMessageDialog(DialogDemo.this, "Cancel Clicked");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

