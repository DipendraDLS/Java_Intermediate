package RegistrationForm_1;

import JButton_5.ColorInJButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationDemo extends JFrame
{
    public static void main(String[] args)
    {
        RegistrationDemo frame = new RegistrationDemo();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Registration Form");
    }

    public RegistrationDemo()
    {
        Container c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);


        //****************************  Adding the JLabel **********************************************
        JLabel firstNameLabel = new JLabel("FirstName:");
        firstNameLabel.setBounds(50,15,100,20);
        c.add(firstNameLabel);

        JLabel lastNameLabel = new JLabel("LastName:");
        lastNameLabel.setBounds(50,55,150,20);
        c.add(lastNameLabel);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50,95,150,20);
        c.add(emailLabel);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50,135,150,20);
        c.add(addressLabel);

        JLabel dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(50,175,150,20);
        c.add(dobLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50,215,150,20);
        c.add(genderLabel);

        JLabel descriptionLabel = new JLabel("Description:");
        descriptionLabel.setBounds(50,270,150,20);
        c.add(descriptionLabel);

        //***********************  Adding JTextField For Text Fields  **************************************************
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(140,10,200,25);
        c.add(firstNameField);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(140,50,200,25);
        c.add(lastNameField);

        JTextField emailField = new JTextField();
        emailField.setBounds(140,90,200,25);
        c.add(emailField);

        JTextField addressField = new JTextField();
        addressField.setBounds(140,130,200,25);
        c.add(addressField);

        //********************  Adding JComboBox For Date of Birth **************************************

        //For Adding Days in ComboBox.
        String[] dayArray = new String[31]; //Reserving the 31 spaces for the 'day_array' string type array.
        for (int i=1; i<=31; i++)
        {
            dayArray[i-1]=Integer.toString(i);
        }
        JComboBox dayComboBox = new JComboBox(dayArray);
        dayComboBox.setBounds(140,170,50,25);
        c.add(dayComboBox);

        //For Adding Month in ComboBox.

        String[] monthArray = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        JComboBox monthComboBox = new JComboBox(monthArray);
        monthComboBox.setBounds(195,170,100,25);
        c.add(monthComboBox);

        //For Adding Year in JComboBox
        String[] yearArray = new String[80];
        for (int i=0; i<80; i++)
        {
            yearArray[i]= Integer.toString(1950+i); //Hamilai 1950 dekhi 2030 sama display dinu cha so 80 choti loop ghumayera 1950 ma each loop run hunda +1 add hundai jancha .
        }
        JComboBox yearComboBox = new JComboBox(yearArray);
        yearComboBox.setBounds(300,170,100,25);
        c.add(yearComboBox);

        //Using setSelectedItem so that initially My Date of Birth is selected in dobComboBox.
        dayComboBox.setSelectedItem("11");
        monthComboBox.setSelectedItem("October");
        yearComboBox.setSelectedItem("1997");


        //********************* Adding JRadioButton For Gender **************************************************
        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(140,210,200,25);
        maleRadioButton.setBackground(Color.yellow);
        c.add(maleRadioButton);

        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(140,235,200,25);
        femaleRadioButton.setBackground(Color.yellow);
        c.add(femaleRadioButton);

        //Grouping the Created Radio Button.
        ButtonGroup group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);

        //Using setSelected so that initially maleRadioButton is selected.
        maleRadioButton.setSelected(true);

        //*************** Adding JTextArea for Description ********************************
        JTextArea descriptionTextArea = new JTextArea();
        descriptionTextArea.setBounds(140,265,250,75);
        c.add(descriptionTextArea);

        //************************ Adding JCheckBox ******************************************
        JCheckBox termsAndCondition = new JCheckBox("I accept the terms and conditions.");
        termsAndCondition.setBounds(150,360,350,20);
        termsAndCondition.setBackground(Color.yellow);
        c.add(termsAndCondition);

        //*********************** Adding JButton ***********************************************
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150,390,100,30);
        c.add(submitButton);

        //********************** Adding JTextArea to display all the inputs when submit button is clicked
        JTextArea displayTextArea = new JTextArea();
        displayTextArea.setBounds(500,15,450,400);
        displayTextArea.setEditable(false);
        c.add(displayTextArea);

        //******************* Adding ActionListener to the button so that when 'submit' button is clicked then it can display all the form inputs into the 'displayTextArea' of JTextArea.

        submitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (termsAndCondition.isSelected()==true)
                {
                    String firstName = firstNameField.getText();
                    String lastName = lastNameField.getText();
                    String email = emailField.getText();
                    String address = addressField.getText();
                    String day = (String) dayComboBox.getSelectedItem();
                    String month = (String) monthComboBox.getSelectedItem();
                    String year = (String) yearComboBox.getSelectedItem();
                    String gender ="Male";
                    if(femaleRadioButton.isSelected()==true)
                        gender="Female";
                    String description = descriptionTextArea.getText();

                    displayTextArea.setForeground(Color.black);
                    displayTextArea.setText("FirstName: "+ firstName +
                                            "\nLastName: " + lastName +
                                            "\nEmail: "+ email +
                                            "\nAddress: " + address+
                                            "\nDate of Birth: " + day +" " + month+ " " + year +
                                            "\nGender: " + gender+
                                            "Description: " + description
                                             );

                }
                else
                {
                    displayTextArea.setForeground(Color.red);
                    displayTextArea.setText("Please accept the terms and conditions.");
                }
            }
        });







        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
