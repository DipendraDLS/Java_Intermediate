package KeyAdapterClass;

import KeyListener.KeyListenerDemo;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterDemo extends JFrame
{
    public static void main(String[] args)

    {
        KeyListenerDemo frame = new KeyListenerDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
    }
    public KeyAdapterDemo()
    {
        JTextArea textArea = new JTextArea();
        textArea.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                System.out.printf("Key Typed: " + e.getKeyCode());
            }
        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

