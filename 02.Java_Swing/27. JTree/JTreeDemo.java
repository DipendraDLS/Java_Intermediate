package JTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JTreeDemo extends JFrame
{
    public static void main(String[] args)
    {
        JTreeDemo frame = new JTreeDemo();
        frame.setVisible(true);
        frame.setBounds(100,500,1000,500);
    }
    public JTreeDemo()
    {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("World");
        DefaultMutableTreeNode country = new DefaultMutableTreeNode("USA");
        root.add(country);
        DefaultMutableTreeNode state = new DefaultMutableTreeNode("California");
        country.add(state);
        DefaultMutableTreeNode city = new DefaultMutableTreeNode("San Jose");
        state.add(city);
        city = new DefaultMutableTreeNode("San Diego");
        state.add(city);

        country = new DefaultMutableTreeNode("Nepal");
        root.add(country);
        state = new DefaultMutableTreeNode("Kathmandu");
        country.add(state);
        city = new DefaultMutableTreeNode("Kuleshwor");
        state.add(city);
        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        JTree tree = new JTree(treeModel);
        add(new JScrollPane(tree));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}


