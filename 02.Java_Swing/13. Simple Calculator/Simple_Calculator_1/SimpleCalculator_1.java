package Simple_Calculator_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator_1 extends JFrame
{
    public static void main(String[] args)
    {
        SimpleCalculator_1 frame = new SimpleCalculator_1();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Calculator");
    }
    JTextArea  displayScreen;
    JLabel displayvalues;

    int countequalClick=0;

    public SimpleCalculator_1()
    {

        Container c = this.getContentPane();
        c.setLayout(null);

        JLabel brand = new JLabel("CASIO");
        brand.setBounds(335,10,105,40);
        Font font = new Font("Arial",Font.BOLD,30) ;
        brand.setFont(font);
        brand.setForeground(Color.red);
        c.add(brand);

        displayvalues = new JLabel();
        displayvalues.setBounds(600,20,200,40);
        displayvalues.setForeground(Color.red);
        c.add(displayvalues);

        displayScreen = new JTextArea();
        displayScreen.setBounds(335,50,335,50);
        displayScreen.setEditable(false);
        c.add(displayScreen);

//************************ Adding number pads as JButton *************************************************************************

                //*********** First Row Buttons **************
        JButton onButton = new JButton("C");
        onButton.setBounds(335,110,80,40);
        c.add(onButton);

        JButton backButton = new JButton("⌫");
        backButton.setBounds(420,110,80,40);
        c.add(backButton);

        JButton percentButton = new JButton("%");
        percentButton.setBounds(505,110,80,40);
        c.add(percentButton);

        JButton divideButton = new JButton("÷");
        divideButton.setBounds(590,110,80,40);
        c.add(divideButton);


                 //*********** Second Row Buttons **************
        JButton button7 = new JButton("7");
        button7.setBounds(335,160,80,40);
        c.add(button7);

        JButton button8 = new JButton("8");
        button8.setBounds(420,160,80,40);
        c.add(button8);

        JButton button9 = new JButton("9");
        button9.setBounds(505,160,80,40);
        c.add(button9);

        JButton multiplyButton = new JButton("x");
        multiplyButton.setBounds(590,160,80,40);
        c.add(multiplyButton);



                //*********** Third Row Buttons **************
        JButton button4 = new JButton("4");
        button4.setBounds(335,210,80,40);
        c.add(button4);

        JButton button5 = new JButton("5");
        button5.setBounds(420,210,80,40);
        c.add(button5);

        JButton button6 = new JButton("6");
        button6.setBounds(505,210,80,40);
        c.add(button6);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(590,210,80,40);
        c.add(subtractButton);

                 //*********** Fourth Row Buttons **************
        JButton button1 = new JButton("1");
        button1.setBounds(335,260,80,40);
        c.add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(420,260,80,40);
        c.add(button2);

        JButton button3 = new JButton("3");
        button3.setBounds(505,260,80,40);
        c.add(button3);

        JButton addButton = new JButton("+");
        addButton.setBounds(590,260,80,90);
        c.add(addButton);


                //*********** Fifth Row Buttons **************
        JButton decimalButton = new JButton(".");
        decimalButton.setBounds(335,310,80,40);
        c.add(decimalButton);

        JButton button0 = new JButton("0");
        button0.setBounds(420,310,80,40);
        c.add(button0);

        JButton equalsButton = new JButton("=");
        equalsButton.setBounds(505,310,80,40);
        c.add(equalsButton);
                //****************** Giving Credit to the programmer **********************
        JLabel credit = new JLabel("Programmer: Dipendra Shrestha");
        Font font1 = new Font("Arial", Font.ITALIC,20);
        credit.setFont(font1);
        credit.setForeground(Color.red);
        credit.setBounds(350,355,350,40);
        c.add(credit);
//************************************** Adding Action Listner *******************************************************************

        //**************************** First row button Actions ***********************
        onButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText("");
                displayvalues.setText("");
                num=0.0;
            }
        });

        backButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                int length = displayScreen.getText().length(); //yesle display screen ma vayeko text haru ko length liyeko ho.
                int number = length-1;  // "This gives the text area ko last position as the String ma index starts from '0' but .length() function counts the legth from '1' so '-1' is needed position milauna.
                                                    //suppose '9998' text area ma xa you will get length = 4, but the position of '8' is 3 as indexing starts from 0 in string so to get that position of the '8' we did 'length-1'.
//                System.out.println(number);

                String storeRemainingValues;

                if (length>0)
                {
                    StringBuilder back = new StringBuilder(displayScreen.getText()); //StringBuilder creates the empty string builder, which is used to store strings. 'back' is the object of StringBuilder.
                    back.deleteCharAt(number); //deleteCharAt() le certain position lincha and tyo position ma vayeko value lai delete garcha(deletes single character from specific position). Here 'number' refers to the position that we have calculated the position above.
                    storeRemainingValues = back.toString(); //convert StringBuilder 'back'  into the string as the textArea only accepts the string values.
                    displayScreen.setText(storeRemainingValues); //storeRemainingValues vanni string ma delete garisakey pachi ko remaining string lai store garirako huncha.
                }
            }
        });

        percentButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                num = Double.parseDouble(displayScreen.getText());
                calculations = 5;
                displayvalues.setText(num + "%");
                displayScreen.setText("");
            }

        });

        divideButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                num = Double.parseDouble(displayScreen.getText()); // 'num' vanni double type ko varaible ho globally declare gareko cha tesma pahele 'TextArea' ma ayeko value lai linxha and 'num' ma rakhi rakhcha.
                calculations =4;            //Switch Case ko 'Case4' lai refer garcha.
                displayvalues.setText(num + "/"); //Screen ko mathi label ko lagi ho so that we can see kun number sanga operation k perform hundai cha.
                displayScreen.setText(""); // "/" button click garisakey pachi screen clear huna paryo so that user can enter another new value to add with it.

            }
        });


        //**************************** Second row button Actions ***********************
        button7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"7");
            }
        });

        button8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"8");
            }
        });

        button9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"9");
            }
        });

        multiplyButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                num = Double.parseDouble(displayScreen.getText()); // 'num' vanni double type ko varaible ho globally declare gareko cha tesma pahele 'TextArea' ma ayeko value lai linxha and 'num' ma eakhi rakhcha.
                calculations =3;            //Switch Case ko 'Case3' lai refer garcha.
                displayvalues.setText(num + "*"); //Screen ko mathi label ko lagi ho so that we can see kun number sanga operation k perform hundai cha.
                displayScreen.setText(""); // "*" button click garisakey pachi screen clear huna paryo so that user can enter another new value to add with it.


            }
        });

        //**************************** Third row button Actions ***********************
        button4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"4");
            }
        });

        button5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"5");
            }
        });

        button6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"6");
            }
        });

        subtractButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                num = Double.parseDouble(displayScreen.getText()); // 'num' vanni double type ko varaible ho globally declare gareko cha tesma pahele 'TextArea' ma ayeko value lai linxha and 'num' ma eakhi rakhcha.
                calculations =2;            //Switch Case ko 'Case1' lai refer garcha.
                displayvalues.setText(num + "-"); //Screen ko mathi label ko lagi ho so that we can see kun number sanga operation k perform hundai cha.
                displayScreen.setText(""); // "-" button click garisakey pachi screen clear huna paryo so that user can enter another new value to add with it.

            }
        });

        //**************************** Fourth row button Actions ***********************
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"1");
            }
        });

        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"2");
            }
        });

        button3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+"3");
            }
        });

        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {

                ArithmeticOperations(); // Suppose if we have to perform operation like 7*9+3 at once then this 'Arithmetic' Operation must be called because at first 7*9 operation perform huna paryo and then ayeko answer ma '+3' add huna paryo so tesko lagi ho yo function call chai.
                num = num+Double.parseDouble(displayScreen.getText()); // 'num' vanni integer type ko varaible ho globally declare gareko cha tesma pahele 'TextArea' ma ayeko value lai linxha and 'num' ma eakhi rakhcha.
                calculations =1;            //Switch Case ko 'Case1' lai refer garcha.
                displayvalues.setText(num + "+"); //Screen ko mathi label ko lagi ho so that we can see kun number sanga operation k perform hundai cha.
                displayScreen.setText(""); // "+" button click garisakey pachi screen clear huna paryo so that user can enter another new value to add with it.

            }
        });

        //**************************** Fifth row button Actions ***********************
        decimalButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText() + ".");
            }
        });

        button0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                displayScreen.setText(displayScreen.getText()+ "0");
            }
        });

        equalsButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.out.println(countequalClick);
                displayvalues.setText(" ");
                ArithmeticOperations(); //equals to click garda matra 'displayScreen' ma answer show hos vanera yo button ma matrai 'ArithmeticOperation' vanni function call gareko.

            }
        });



        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    double num, ans;
    int calculations;

    public void ArithmeticOperations()
    {
        switch (calculations)
        {

            case 1:
                ans = num + Double.parseDouble(displayScreen.getText()); //Button ko Action hunda yedi Text area ma pahele ko value cha vani 'num' ma huncha and tyo 'num' ko value ra ahiley ko text area ko recent value lai liyera operation perform huncha.
                displayScreen.setText(Double.toString(ans)); // screen ma calculation garisakey pachi ayeko answer lai display gareko.
                num=0.0;    //aba answer aayesakey pachi 'num' vanni varaible lai reset to 0.0 gareko so that pachi new operation perform garna khokda ni  tei 'num' ma store vayerakheko purano value sanga kunai operation paerform nahos vanera.
                break;
            case 2:
                ans = num - Double.parseDouble(displayScreen.getText());
                displayScreen.setText(Double.toString(ans));
                break;
            case 3:
                ans = num * Double.parseDouble(displayScreen.getText());
                displayScreen.setText(Double.toString(ans));
                break;
            case 4:
                ans = num / Double.parseDouble(displayScreen.getText());
                displayScreen.setText(Double.toString(ans));
                break;
            case 5:
                ans = num/100;
                displayScreen.setText(Double.toString(ans));
                break;

        }
    }

}
