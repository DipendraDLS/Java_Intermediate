package GridBagLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;

    public class GridBagLayoutDemo extends JFrame
    {
        public static void main(String[] args)
        {
            GridBagLayoutDemo frame = new GridBagLayoutDemo();
            frame.setVisible(true);
            frame.setTitle("GridBagLayout Demo");
        }
        public GridBagLayoutDemo()
        {
            setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.fill = GridBagConstraints.VERTICAL;

            c.gridx = 0; c.gridy = 0;  // here c.gridx-> column, c.gridy-> rows
            add(new JButton("Button 1"), c);

            c.gridx = 1; c.gridy = 0;
            c.weightx = 0.5;
            add(new JButton("Button 2"), c);

            c.gridx = 2; c.gridy = 0;
            c.weightx = 0.5;
            add(new JButton("Button 3"), c);

            c.gridx = 1; c.gridy = 1;
            c.weightx = 0; c.weighty = 1;
            c.gridwidth = 2;            //Katiwota sama ko column liney vanera define gareko.
                                        //if katiwota sama rows liney vanera define garnu cha vaney use 'c.gridheight'
             add(new JButton("Long Button 4"), c);

            pack();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }

