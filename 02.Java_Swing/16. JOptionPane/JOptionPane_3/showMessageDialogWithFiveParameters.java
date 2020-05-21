/*
    Message Dialogs:
           => Message Dialog box of JOptionPane class displays a message that alerts the user and waits for the user to click
              "ok" button to close the dialog.
           => Three static methods to create Message Dialogs:-
              1) showMessageDialog(Component parenComponent, Object message)
              2) showMessageDialog(Component parenComponent, Object message, String title, int messageType)
              3) showMessageDialog(Component parentComponent, Object message, String titile, int messageType, Icon icon)

    showMessageDialog() Parameter Details:
             a) Component parenComponent: It can be any component (like parent Class with 'this') or it can be null value.
             b) Object message: The message to be displayed to user.
             c) String title:  The title of the Message Dialog box.
             d) int messageType: Message type takes five values such as:-
                    i)  JOptionPane.ERROR_MESSAGE
                    ii) JOptionPane.INFORMATION_MESSAGE
                    iii) JOptionPane.PLAIN_MESSAGE
                    iv) JOptionPane.WARNING_MESSAGE
                    v)  JOptionPane.QUESTION_MESSAGE
                  Each messageType has its own predefined icons that are displayed automatically along with its implementation.

              e) Icon icon : TO supply out own customized icon on the box.

*/

// ***************************** Implementation of 3rd static method to create message dialog ************************************

package JOptionPane_3;

import javax.swing.*;

public class showMessageDialogWithFiveParameters
{
    public static void main(String[] args)
    {
        ImageIcon icon = new ImageIcon("/home/dipendra/Java_Swing/src/JOptionPane_3/cdIcon.png");

        JOptionPane.showMessageDialog(null,"Insert CD !!","Insert CD",JOptionPane.PLAIN_MESSAGE,icon); //yesle 'Insert CD !!' vanni message display dinxa dialog box ma with the title 'Insert CD'
                                                                                                                                  // and 'JOptionPane.PLAIN_MESSAGE' refers to the messageType as plain message and icon  that we have in 'icon' object is displayed.


    }
}
