//Only GUI Part of Login Form is Covered.
package LoginForm_1;

import javax.swing.*;
import java.awt.*;

public class LoginForm_1 extends JFrame
{
    public static void main(String[] args)
    {
        LoginForm_1 frame = new LoginForm_1();
        frame.setVisible(true);
        frame.setTitle("Login Form");
        frame.setBounds(500,100,1000,500);

    }

    public LoginForm_1()
    {
        Container c = this.getContentPane();
        c.setLayout(null);

        //Setting the BackGround Color of the Frame.
        Color clr = new Color(255, 247, 205);
        c.setBackground(clr);

        //Adding 'UserName:' Label
        JLabel usernameLabel = new JLabel("UserName:");
        usernameLabel.setBounds(10,15,100,30);
        c.add(usernameLabel);

        //Adding username text field.
        JTextField usernameField = new JTextField();
        usernameField.setBounds(100,20,150,20);
        c.add(usernameField);

        //Adding 'Password:' Label .
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,60,100,30);
        c.add(passwordLabel);

        //Adding 'PasswordField'.
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100,65,150,20);
        c.add(passwordField);

        //Adding 'Login' Button.
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100,100,100,30);
        c.add(loginButton);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

