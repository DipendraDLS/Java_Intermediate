package JRadioButton_4;

import javax.swing.*;
import java.awt.*;

public class SetEnabledInJRadioButton extends JFrame
{
    public static void main(String[] args)
    {
        SetEnabledInJRadioButton frame = new SetEnabledInJRadioButton();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("SetEnabled In JRadioButton");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JRadioButton esewa = new JRadioButton("eSewa");
        esewa.setBounds(10,15,100,20);

        JRadioButton khalti = new JRadioButton("khalti");
        khalti.setBounds(120,15,100,20);

        JRadioButton paypal = new JRadioButton("PayPal");
        paypal.setBounds(230,15,100,20);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(340,15,100,20);

        ButtonGroup group = new ButtonGroup();
        group.add(esewa);
        group.add(khalti);
        group.add(paypal);
        group.add(other);

        esewa.setSelected(true); // Initially 'eSewa' vanni button ma checked huncha.
        other.setEnabled(false); // 'Other' vanni RadioButton disable huncha i.e user can't use it.

        c.add(esewa);
        c.add(khalti);
        c.add(paypal);
        c.add(other);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
