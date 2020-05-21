package JTable;

import javax.swing.*;
import java.awt.*;

public class JTableDemo extends JFrame
{
    public static void main(String[] args)
    {
        JTableDemo frame = new JTableDemo();
        frame.setVisible(true);

    }
    public JTableDemo()
    {
        String[] colHeading = {"Roll", "Name", "Address"};
        Object[][] data = {
                                {"1", "Dipendra", "Kuleshwor"},
                                {"2", "Ram", "Kalimati"},
                            };

        JTable table = new JTable(data,colHeading);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane scrollPane = new JScrollPane(table,v,h);
        add(scrollPane, BorderLayout.CENTER);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
