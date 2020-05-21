//Single Selection List
package JList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListDemo extends JFrame
{
    public static void main(String[] args)
    {
        JListDemo frame = new JListDemo();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }

    public JListDemo()
    {
      Container c = this.getContentPane();
      c.setLayout(new FlowLayout());

      String[] colorNames = {"Red", "Green", "Blue","Black"};
      Color[] colors = {Color.red, Color.green, Color.blue,Color.black};

      JList colorJList = new JList(colorNames);
      colorJList.setVisibleRowCount(3);
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// do not allow multiple selections
      add(new JScrollPane(colorJList));

      colorJList.addListSelectionListener(new ListSelectionListener()
      {
          @Override
          public void valueChanged(ListSelectionEvent e)
          {
            c.setBackground(colors[colorJList.getSelectedIndex()]);
          }
      });
      setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}
