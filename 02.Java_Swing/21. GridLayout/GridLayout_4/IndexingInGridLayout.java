//Adding index  to the button so that we can define which button to tbe displayed at first index.

package GridLayout_4;

import javax.swing.*;
import java.awt.*;

public class IndexingInGridLayout extends JFrame
{
    public static void main(String[] args)
    {
        IndexingInGridLayout frame = new IndexingInGridLayout();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Indexing of component in GridLayout");
    }
    public IndexingInGridLayout()
    {
        setLayout(new GridLayout());


        //Creating JButton
        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");
        JButton btn4 = new JButton("btn4");
        JButton btn5 = new JButton("btn5");

        //Adding JButton
        add(btn1);
        add(btn2);
        add(btn3,1); //same sequence concept as in FlowLayout_4(IndexingOfComponentInFlowLayout.
        add(btn4);
        add(btn5,0);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
