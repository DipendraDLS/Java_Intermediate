/*
    => Key events indicate when the user is typing at the keyboard.
    => Notifications are sent about two basic kinds of key events:
           1. The typing of a Unicode character (keyTyped)
           2. The pressing/releasing of a key on the keyboard
                             (keyPressed, keyReleased)
 */

package KeyListener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends JFrame
{
    public static void main(String[] args)
    {
        KeyListenerDemo frame = new KeyListenerDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }

    public KeyListenerDemo()
    {
        JTextArea textArea = new JTextArea();

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e)
            {
                System.out.println("Typed: "+ e.getKeyChar()); //keyboard ko kun character type garyo vanera dincha
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.printf("Pressed: " + e.getKeyCode() +"\n"); //keyboard ko kun character press garyo tesko ASCII value dincha.
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                System.out.println("Released:" + e.getKeyCode()+"\n"); //keyboard ko kun character release garyo tesko ASCII value dincha.
            }
        });
        add(textArea);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
