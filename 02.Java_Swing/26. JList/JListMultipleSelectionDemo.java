package JList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class JListMultipleSelectionDemo extends JFrame
{
    public static void main(String[] args)
    {
        JListMultipleSelectionDemo frame = new JListMultipleSelectionDemo();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }
    public JListMultipleSelectionDemo()
    {
        setLayout(new FlowLayout());
        String[] list = {"Dipendra","Ram", "Hari", "Gopal"};

        JList nameJList = new JList(list);

        nameJList.setVisibleRowCount(2);
        nameJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        nameJList.setFixedCellWidth(100);// Setting the width of the list
        add(new JScrollPane(nameJList));

        JButton copyButton = new JButton("Copy>>");
        add(copyButton);
        JList copyJList = new JList();
        copyButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                copyJList.setListData(nameJList.getSelectedValues());
            }
        });

        copyJList.setVisibleRowCount( 5 ); // show 5 rows
        copyJList.setFixedCellWidth( 100 ); // set width
        copyJList.setFixedCellHeight( 15 ); // set height
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION );
        add( new JScrollPane( copyJList ) );



        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
