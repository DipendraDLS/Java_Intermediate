//Login with ActionListner

package LoginForm_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginForm_2 extends JFrame
{
    public static void main(String[] args)
    {
        LoginForm_2 frame = new LoginForm_2();
        frame.setVisible(true);
        frame.setTitle("Login Form");
        frame.setBounds(500,100,1000,500);

    }

    public LoginForm_2()
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

        loginButton.addActionListener(new ActionListener()
        {
            //This below line 57 and 58 code is Label object that is created so it can be used whenever action is performed inorder to display the message whether or not user has sucessuflly loggedin or not.
           //'warn' and 'sucess' objects are used later on in if/else condition.
            JLabel warn = new JLabel("Wrong Username or Password");
            JLabel sucess = new JLabel("Login Sucessful!");

            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                String username = usernameField.getText();
               // String password = passwordField.getText(); //As this is not the correct way to get the password from the password field.

                // This is the correct way!
                 char[] password = passwordField.getPassword(); //JPasswordField stores the password in Array of Character.
                 char[] raw_password = {'D','i','p','e','n'};   // yo diyeko password and user le field ma type gareko password ko comparision garna ko lagi yo raw_password chaiyeko ho.

                if (username.equals("Dipen") && Arrays.equals(password,raw_password)) //comparing the value that user has entered and the password they entered with the actual username and password.
                {
                    c.setBackground(Color.green);
                    c.remove(warn); //this code just removes the previous warning msg(if 'warn' adds any message) if user tries multiple times to login  within same running program.
                    sucess.setBounds(100,115,500,50);
                    c.add(sucess);
                }

                else
                {
                    c.setBackground(Color.red);
                    c.remove(sucess);   //this code just removes the previous success message(if 'sucess' adds any message) if user tries multiple time to login within the same running program.
                    warn.setBounds(100,115,500,50);
                    c.add(warn);
                }
            }

        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
