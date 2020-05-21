//Add Title To The JFrame Title Bar.
package JFrame_2;

import javax.swing.*;

public class TitleToJFrame extends JFrame
{
    public static void main(String[] args)
    {
        TitleToJFrame frame =new TitleToJFrame();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);

        //Frame ko top ma string ko rup ma pass gareko kura lai as a Title Set gardincha.
        frame.setTitle("Title To JFrame");
    }

    public TitleToJFrame()
    {
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
