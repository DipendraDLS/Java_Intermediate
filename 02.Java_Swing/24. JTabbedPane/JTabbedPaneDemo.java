package JTabbedPane;

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneDemo extends JFrame
{
    public static void main(String[] args)
    {
        JTabbedPaneDemo frame = new JTabbedPaneDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);

    }
    public JTabbedPaneDemo()
    {
        JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane

        // set up panel1 and add it to JTabbedPane
        JLabel label1 = new JLabel( "panel one", SwingConstants.CENTER );
        JPanel panel1 = new JPanel(); // create first panel
        panel1.add( label1 ); // add label to panel
        tabbedPane.addTab( "Tab One", null, panel1, "First Panel" );

        // set up panel2 and add it to JTabbedPane
        JLabel label2 = new JLabel( "panel two", SwingConstants.CENTER );
        JPanel panel2 = new JPanel(); // create second panel
        panel2.setBackground( Color.YELLOW ); // set background to yellow
        panel2.add( label2 ); // add label to panel
        tabbedPane.addTab( "Tab Two", null, panel2, "Second Panel" );

        // set up panel3 and add it to JTabbedPane
        JLabel label3 = new JLabel( "panel three" );
        JPanel panel3 = new JPanel(); // create third panel
        panel3.setLayout( new BorderLayout() ); // use borderlayout
        panel3.add( new JButton( "North" ), BorderLayout.NORTH );
        panel3.add( new JButton( "West" ), BorderLayout.WEST );
        panel3.add( new JButton( "East" ), BorderLayout.EAST );
        panel3.add( new JButton( "South" ), BorderLayout.SOUTH );
        panel3.add( label3, BorderLayout.CENTER );
        tabbedPane.addTab( "Tab Three", null, panel3, "Third Panel" );
        add( tabbedPane ); // add JTabbedPane to frame
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
