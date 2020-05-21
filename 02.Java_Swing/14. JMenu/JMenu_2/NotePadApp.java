package JMenu_2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotePadApp extends JFrame
{
    public static void main(String[] args)
    {

        NotePadApp frame = new NotePadApp();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("JMenu Introduction");

    }
    JTextArea textArea;
    public NotePadApp()
    {
        Container c = this.getContentPane();
        c.setLayout(null);
        //Program run huna bitikai yeuta textarea aawos vanera hamiley JtextArea create gareko.
        textArea = new JTextArea();
        textArea.setBounds(0,20,1000,500);
        c.add(textArea);
//********************** Creating Menu Bar ***************************************************************************************
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0,0,1000,20);
        c.add(menuBar);
//*********************** Adding Menus to the Menu Bar **************************************************************************
        //Adding  'File' Menu to menuBar.
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        //Adding  'Edit' Menu to Menu Bar.
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        //Adding  'Format' Menu to Menu Bar.
        JMenu formatMenu = new JMenu("Format");
        menuBar.add(formatMenu);

        //Adding  'View' Menu to Menu Bar.
        JMenu viewMenu = new JMenu("View");
        menuBar.add(viewMenu);

        //Adding  'View' Menu to Menu Bar.
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
//******************************* Adding MenuItems to the Menu **********************************************************************
        //Adding MenuItems to the 'File' Menu
        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);

        JMenuItem openMenuItem = new JMenuItem("Open...");
        fileMenu.add(openMenuItem);

        JMenuItem saveMenuItem = new JMenuItem("Save" );
        fileMenu.add(saveMenuItem);

        JMenuItem saveAsMenuItem = new JMenuItem("Save AS...");
        fileMenu.add(saveAsMenuItem);

        fileMenu.addSeparator(); //This adds the horizontal line after the 'Save As...' Menu.

        JMenuItem pageSetupMenuItem = new JMenuItem("Page Setup...");
        fileMenu.add(pageSetupMenuItem);

        JMenuItem printMenuItem = new JMenuItem("Print...");
        fileMenu.add(printMenuItem);

        fileMenu.addSeparator(); //This adds the horizontal line after the 'Print' MenuItem.

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        //Adding MenuItem to the 'Edit' Menu
        JMenuItem undoMenuItem = new JMenuItem("Undo");
        editMenu.add(undoMenuItem);

        editMenu.addSeparator();

        JMenuItem cutMenuItem = new JMenuItem("Cut");
        editMenu.add(cutMenuItem);

        JMenuItem copyMenuItem = new JMenuItem("Copy");
        editMenu.add(copyMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        editMenu.add(pasteMenuItem);

        JMenuItem deleteMenuItem= new JMenuItem("Delete");
        editMenu.add(deleteMenuItem);

        //Adding MenuItem to the 'Format' Menu
        JCheckBox wordWrapMenuItemCheckBox = new JCheckBox("Word Wrap");
        formatMenu.add(wordWrapMenuItemCheckBox);

        JMenuItem fontMenuItem = new JMenuItem("     Font..");
        formatMenu.add(fontMenuItem);

        //Adding MenuItem to the 'View' Menu
        JMenu zoomMenu = new JMenu("Zoom"); //Menu vitra ni Menu add garnu parda.
        viewMenu.add(zoomMenu);

            //******* Adding MenuItem to the zoomMenu. *************
        JMenuItem zoomInMenuItem = new JMenuItem("Zoom In");
        zoomMenu.add(zoomInMenuItem);

        JMenuItem zoomOutMenuItem = new JMenuItem("Zoom Out");
        zoomMenu.add(zoomOutMenuItem);

        JMenuItem defaultZoomMenuItem = new JMenuItem("Restore Default Zoom");
        zoomMenu.add(defaultZoomMenuItem);
            //*********************************************************************************

        //Adding MenuItem to the 'View' Menu which is of type checkbox.
        JCheckBox statusBarCheckBox = new JCheckBox("Status Bar");
        viewMenu.add(statusBarCheckBox);
        statusBarCheckBox.setSelected(true);
        statusBarCheckBox.setEnabled(false);

        //Adding MenuItem to the 'Help' Menu
        JMenuItem viewHelpMenuItem = new JMenuItem("View Help");
        helpMenu.add(viewHelpMenuItem);

        JMenuItem sendFeedbackMenuItem = new JMenuItem("Send Feedback");
        helpMenu.add(sendFeedbackMenuItem);

        helpMenu.addSeparator();

        JMenuItem aboutNotepadMenuItem = new JMenuItem("About Notepad");
        helpMenu.add(aboutNotepadMenuItem);

//************************** Adding ActionListner fro 'File' Menu. *************************************************************


        // Adding Action Listner for 'New' MenuItem.
        newMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea.setText(""); //Jaba 'New' menuItem click huncha taba textArea ma j sukai text hos tyo sabai hatera blank vayedincha.
            }
        });

        //Add ActionListner For 'Save' MenuItem.
        saveMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = textArea.getText(); //User le type gareko text haru textArea ma huncha so teslai get gareko 'file' vanni string ma
                try
                {
                    saveFile(text); //Save File vani function call gareko.
                }
                catch(Exception execption) // if kunai exception auncha vani teslai catch gareko.
                {
                    System.out.println(execption);
                }
            }
        });

        //Adding ActionListener For 'Open' MenuItem.
        openMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                try
                {
                    openFile();
                }
                catch (Exception exception)
                {
                    System.out.println(exception);
                }
            }
        });

        //Adding Action Listner for 'Exit' MenuItem.
        exitMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

//********************* For 'Save'  menuItem functionality ***********************************************

    //Note: save garnu ko logic is that ki 'textArea' ma lekheko kura lai new file create garera write garnu ho.
    private void saveFile(String text) throws IOException
    {
        String userDir = System.getProperty("user.home"); //'userDir' ma 'user' samako directory ayera baseko hunxa.
        JFileChooser chooser = new JFileChooser(userDir+"/Desktop");         //JFileChooser is a quick and easy way to prompt the user to choose a file or a file saving location.
                                                                                            //userDir+"/Desktop" -> file choose garni bydefault directory diyeko.
        chooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));        //File ko types lai filter garxha so that .'txt' file matrai dekhawos vanera.
        chooser.setSelectedFile(new File(".txt"));             //yesle save garda file ko name lekhni thau ma bydefault '.txt' extension rakhdini kam garcha.
        int result = chooser.showSaveDialog(this);              //Yesle save click garda aapear huni dialogbox lai display ma layuni kam garcha.

        if(result == JFileChooser.APPROVE_OPTION)            // If the return value is APPROVE_OPTION(i.e dialog box ko save  click gareko cha vani.), the user actually selected a file, which we can obtain with the getSelectedFile() method.
        {
            File file = chooser.getSelectedFile();          //save garna lageko text lai 'file' vanni file datatype name gareko object ma 'get' gereko.
            PrintWriter out = null;                          //implementation of Writer class. It is used to print the formatted representation of objects to the text-output stream.
            try
                {
                    out = new PrintWriter(file);            //user le type gareko 'textArea' ma jun text haru cha teslai get garera 'file' vanni file type ko datatype ma write gareko ho.
                    out.print(text);                        // jun kura user le type gareko cha tyo kura 'text' vanni string ma cha function call hunda pass gareko cha so tei text harulai file ma write garera print gardiyeko. yo garena vani tyo create gareko 'file' ma display ma aundaina
                }
            finally
                {
                    out.close();
                }
        }
        else
            return;
    }

//************************* For 'Open' menuItem functionality *******************************************************

    private void openFile() throws Exception
    {
        String userDir = System.getProperty("user.home");
        JFileChooser fileChooser = new JFileChooser(userDir+"/Desktop");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files(*.txt)","txt"));
        int result = fileChooser.showOpenDialog(this);              //showOpenDialog-> 'open' dialogbox ko lagi.

        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile =fileChooser.getSelectedFile();           //yedi dialog box ko 'open' click garyo vani 'selectedFile' vanni file type ko object ma choose gareko file ayera bascha

            //**** Aba tyo 'selectedFile' ma ayeko file lai read garera tyo file ma vayeko text haru lai textArea maw display garauni ho.******
            BufferedReader in = null;
            String fileName = selectedFile.getName(); //jun file open garyo tyo selected file ko name liyera 'fileName' vanni string varaible ma rakheko.
            setTitle(fileName);                      // tyo 'fileName' ma vako name lai Notepad App ko title ma display garaideko ho.

            try{
                    in = new BufferedReader(new FileReader(selectedFile)); //BufferReader ma pass gareko 'selectedFile' so that select gareko file ma vako kura lai read garna sakos.
                    StringBuilder sb = new StringBuilder();  //String builder chainxa because yedi file read garda escape sequence lik "\n" cha vani hamilai tyo ni read garnu parcha so.

                    String line;
                    while (true)
                    {
                        line = in.readLine();
                        sb.append(line + "\n"); //'sb' StringBuilder ko object ho jasle garda escape sequence like"\n" tyo 'selectedFile' ma cha vani teslai ni read garna sakos vanera.
                        if (line==null)         //yedi 'line' ma null cha vani means text sakyo vani vaneko ho.
                            break;
                        textArea.setText(sb.toString()); //'textArea' ma k k read garyo tyo sabai display ma dekhauni kam gareko.
                    }
                }
                finally
                {
                    if (in!=null)
                        in.close(); //read gareko file lai close gareko kam sakey pachi.
                }

//            Desktop.getDesktop().open(selectedFile); // tyo select vayeko file lai desktop ma open garauna xa xutai App jasto gari vaney yo on line le file open garaidina help garcha.
        }
    }
}



