package SimpleSplitPane;

import javax.swing.*;
import java.awt.*;

public class SplitPaneDemo extends JFrame
{
    public static void main(String[] args)
    {
        SplitPaneDemo frame = new SplitPaneDemo();
        frame.setVisible(true);
        frame.setBounds(500 ,100,1000,500);
    }

    JSplitPane splitPane;
    JScrollPane leftScrollPane, rightScrollPane;
    public SplitPaneDemo()
    {
        JLabel leftLabel = new JLabel();
        JLabel rightLabel = new JLabel();

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(leftLabel),new JScrollPane(rightLabel));
        leftLabel.setIcon(new ImageIcon("Car.jpg"));
        rightLabel.setIcon(new ImageIcon("Bike.jpg"));

        add(splitPane);
        splitPane.setDividerLocation(500);
        splitPane.setOneTouchExpandable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

