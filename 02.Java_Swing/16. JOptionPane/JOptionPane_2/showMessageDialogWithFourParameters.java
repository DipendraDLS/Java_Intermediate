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

//***************************** Implementation of 2nd static method to create message dialog ************************************

package JOptionPane_2;

import javax.swing.*;

public class showMessageDialogWithFourParameters extends JFrame
{
    public static void main(String[] args)
    {
        // i) Implementing 'JOptionPane.ERROR_MESSAGE' messageType.
        JOptionPane.showMessageDialog(null,"Hello World!!","Error",JOptionPane.ERROR_MESSAGE); //yesle 'Hello World !!' vanni message display dinxa dialog box ma with the title 'Error'
                                                                                                                          // and 'JOptionPane.ERROR_MESSAGE' refers to the messageType as error message and icon of 'X' in red color also appears automatically related to that messageType.


        // ii) Implementing 'JOptionPane.INFORMATION_MESSAGE' messageType.
        JOptionPane.showMessageDialog(null,"Hello World!!","Information",JOptionPane.INFORMATION_MESSAGE); //yesle 'Hello World !!' vanni message display dinxa dialog box ma with the title 'Information'
                                                                                                                                      // and 'JOptionPane.INFORMATION_MESSAGE' refers to the messageType as information message and icon of 'i' in blue color also appears automatically related to that messageType.

        //iii) Implementing 'JOptionPane.PLAIN_MESSAGE' messageType.
        JOptionPane.showMessageDialog(null,"Hello World!!","Plain Message",JOptionPane.PLAIN_MESSAGE); //yesle 'Hello World !!' vanni message display dinxa dialog box ma with the title 'Plain Message'
                                                                                                                                  // and 'JOptionPane.PLAIN_MESSAGE' refers to the messageType as plain message and no any icon of appears as messageType is Plain.

        //iv) Implementing 'JOptionPane.WARNING_MESSAGE' messageType.
        JOptionPane.showMessageDialog(null,"Hello World!!","Warning",JOptionPane.WARNING_MESSAGE); //yesle 'Hello World !!' vanni message display dinxa dialog box ma with the title 'Warning'
                                                                                                                              // and 'JOptionPane.WARNING_MESSAGE' refers to the messageType as warning message and icon of '!' in traingle shape with yellow color also appears automatically related to that messageType.
        //v) Implementing 'JOptionPane.QUSETION_MESSAGE' messageType.
        JOptionPane.showMessageDialog(null,"Hello World!!","Question",JOptionPane.QUESTION_MESSAGE); //yesle 'Hello World !!' vanni message display dinxa dialog box ma with the title 'Question'
                                                                                                                                // and 'JOptionPane.QUESTION_MESSAGE' refers to the messageType as question message and icon of '?' in green color also appears automatically related to that messageType.

    }
}
