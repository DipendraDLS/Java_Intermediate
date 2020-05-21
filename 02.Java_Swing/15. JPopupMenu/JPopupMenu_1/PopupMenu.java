//Popup Menu is displayed when right button of the mouse is clicked.
// At first we need to create 'JPopupMenu' and then 'JMenuItem' should be added into the 'JPopupMenu'
package JPopupMenu_1;

import javax.swing.*;
import java.awt.*;

public class PopupMenu extends JFrame
{
    public static void main(String[] args)
    {
        PopupMenu frame = new PopupMenu();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JPopupMenu Introduction");
    }

    public PopupMenu()
    {
        Container c = this.getContentPane();
        c.setLayout(null);
//******************** JTextArea so that in that area we can add the popup menus. ****************************************************

        JTextArea textArea = new JTextArea("Press right button of your mouse.");
        textArea.setSize(1000,500);
        c.add(textArea);
//********************** Creating JPopupMenu ****************************************************************************************
        JPopupMenu popupMenu = new JPopupMenu();
//********************** Creating Menu Item *****************************************************************************************

        JMenuItem undoMenuItem = new JMenuItem("Undo");
        popupMenu.add(undoMenuItem);

        JMenuItem redoMenuItem = new JMenuItem("redo");
        popupMenu.add(redoMenuItem);

        popupMenu.addSeparator();           //Adding Separator.

        JMenuItem cutMenuItem = new JMenuItem("cut");
        popupMenu.add(cutMenuItem);

        JMenuItem copyMenuItem = new JMenuItem("copy");
        popupMenu.add(copyMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("paste");
        popupMenu.add(pasteMenuItem);

        JMenuItem deleteMenuItem = new JMenuItem("delete");
        popupMenu.add(deleteMenuItem);

//********************* popup to show in textArea. ***********************************************************
        textArea.setComponentPopupMenu(popupMenu);



        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

