package LambdaExpression;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LambdaExpressionDemo extends JFrame
{
    public static void main(String[] args)
    {
        LambdaExpressionDemo frame = new LambdaExpressionDemo();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }
    public LambdaExpressionDemo()
    {
        JButton btn1 = new JButton("Click Me");
        btn1.addActionListener((ActionEvent e)->
                {
                    System.out.println("World!");  //and then yo event run huncha jahele ni .
                });
        btn1.addActionListener((ActionEvent e)->
                {
                    System.out.println("Hello");        //pahele yo event run huncha jahele last ma jun event cha tyo call huncha pahele.
                });
        add(btn1);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
