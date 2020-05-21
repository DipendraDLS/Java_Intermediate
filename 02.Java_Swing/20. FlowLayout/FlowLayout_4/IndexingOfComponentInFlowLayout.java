//Adding index  to the button so that we can define which button to tbe displayed at first index.

package FlowLayout_4;

import javax.swing.*;
import java.awt.*;

public class IndexingOfComponentInFlowLayout extends JFrame
{
    public static void main(String[] args)
    {

        IndexingOfComponentInFlowLayout frame = new IndexingOfComponentInFlowLayout();
        frame.setVisible(true);
        frame.setTitle("Indexing of Components in FlowLayout");
        frame.setBounds(500,100,1000,500);

        //Setting the JFrame layout to FlowLayout. Remember! The default layout of JFrame is 'BorderLayout'.
        frame.setLayout(new FlowLayout());

        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3,1); //It seems like 'btn3' must be the 2nd one that should be appear but actual sequence will be->
                                // At first btn1, and btn 2 will be added. and sequence will be -> btn1, btn2
                                // when its the turn of btn3 the sequence will be-> btn1, btn3, btn2
                                // after that btn4 turn sequence will be-> btn1, btn3, btn2, btn4
                                // after that btn5 turn sequence will be-> btn0, btn1, btn3, btn2, btn4........ So 'btn3' will appearing as 3rd button.
        frame.add(btn4);
        frame.add(btn5,0);

        frame.pack();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
