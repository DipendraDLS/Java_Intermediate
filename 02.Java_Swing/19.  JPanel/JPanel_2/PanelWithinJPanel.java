//Adding JPanel within another JPanel.
package JPanel_2;

import javax.swing.*;
import java.awt.*;

public class PanelWithinJPanel extends JFrame
{
    public static void main(String[] args)
    {
        PanelWithinJPanel frame = new PanelWithinJPanel();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Panel Within a Panel");

        //Setting the default layout of frame to null Layout.
        Container c = frame.getContentPane();
        c.setLayout(null);    //In JFrame by default Layout is BorderLayout so if we add the panel to the frame then in overall frame the panel will be applied.
                              // So inorder to apply the panel in desired position we set the default Layout to null Layout.


        //Creating a JPanel object as 'panel1'
        JPanel panel1 = new JPanel();
        panel1.setBounds(10,15,200,300);
        panel1.setBackground(Color.red);
        c.add(panel1); //Adding the panel to the frame.


        //Creating another JPanel as 'panel2' and adding 'panel2' to the 'panel1' that we have created above.
        JPanel panel2 = new JPanel();
        panel1.setLayout(null); //As default Layout for JPanel is 'FLowLayout' so setting the default Layout to the null layout so that we can
                                //manually adjust the position and size of the 'panel2'.

        panel2.setBounds(20,20,100,150); //Adjusting the 'panel2' size and postion as 'panel1' default layout has been set to null layout so we have to define size and position for 'panel2' manually.
        panel2.setBackground(Color.yellow);        //setting the 'panel2' background color.
        panel1.add(panel2);     //Adding the 'panel2' to the 'panel1'


        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
