/*
     JMenuBar:
           => Menu Bar consist of 3 different parts and these parts should be aaded into the program in a sequential manner. As without
            menu bar it won't be possible to add menus and if the 'menus' are not available then there won't be 'menu items'.

            >Parts of Menu Bar:
                    ->MenuBar
                    ->Menus
                    ->MenuItems

            Eg:- In Notepad:
                        -> The bar where 'File', 'Edit', 'Format', 'View', 'Help' appears it is known as Menu Bar.
                        -> 'File', 'Edit', 'Format', 'View', 'Help' are Menus.
                        -> when we click on 'File' menu then 'New', 'Open', 'Save', 'Save As', 'PageSetup', 'Print', 'Exit' are MenuItems.
*/

package JMenu_1;

import javax.swing.*;
import java.awt.*;

public class MenuIntroduction extends JFrame
{
    public static void main(String[] args)
    {
        MenuIntroduction frame = new MenuIntroduction();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JMenu Introduction");

    }
    public MenuIntroduction()
    {
        Container c = this.getContentPane();
        c.setLayout(null);
//********************** Creating Menu Bar ***************************************************************************************
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0,0,1000,20);
        c.add(menuBar);

//*********************** Adding Menus to the Menu Bar **************************************************************************
        //Adding  'File' Menu to menuBar.
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu); //menu bar ma menu haru display dina ko lagi 'menuBar.add()' garnu parcha.

//******************************* Adding MenuItems to the Menu **********************************************************************
        //Adding MenuItems to the 'File' Menu
        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);  //'File' menu ma menu items haru display dinako lagi 'fileMenu.add()' garnu parcha.

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
