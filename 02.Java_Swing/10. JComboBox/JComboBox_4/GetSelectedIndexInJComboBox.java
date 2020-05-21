package JComboBox_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetSelectedIndexInJComboBox extends JFrame
{
    public static void main(String[] args)
    {
        GetSelectedIndexInJComboBox frame = new GetSelectedIndexInJComboBox();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("GetSelectedIndex In JComboBox");
    }

    public GetSelectedIndexInJComboBox()
    {
        Container c = this.getContentPane();
        c.setLayout(null);

        //Adding of ComboBox.
        String[] values = {"Apple","Microsoft","Google"}; //ComboBox ma use huni list haru define gareko.
        JComboBox combo1 = new JComboBox(values);       //'Values' vaneko Created String type ko array ho.
        combo1.setBounds(25,15,100,30 );
        c.add(combo1);

        this.revalidate();  //this vaneko yaha 'frame' vanni object lai refer garcha.


        //Adding the button to perform the action about which index in ComboBox has been selected.
        JButton button = new JButton("Submit");
        button.setBounds(130,15,100,30);
        c.add(button);

        //Adding label so that the selected index of the comboBox can be displayed as a message in frame.
        JLabel label = new JLabel("Message:");
        label.setBounds(25,50,300,50);
        c.add(label);

        //Defining the action to be performed when the button is clicked.
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                label.setText("Message: Index " + combo1.getSelectedIndex()+ " is selected."); //Create gareko JLabel ko through message display garayeko.
                                                                                               //'.getSelectedIndex()' le select gareko ComboBox ko item ko index lincha. index always stars from '0'.
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
