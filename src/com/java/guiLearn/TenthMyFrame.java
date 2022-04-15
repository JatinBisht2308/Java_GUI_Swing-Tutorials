package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TenthMyFrame implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();
    //    defining the constructor
    TenthMyFrame()
    {
//        Making the JTextField
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.BOLD,30));
//        changes the color of the text
        textField.setForeground(Color.GREEN);
//        changes the background color of the text field
        textField.setBackground(Color.BLACK);
//    changes the color of the caret-> line blinks when you have some empty space to type
        textField.setCaretColor(Color.CYAN);
//        informing the user to write the preferred credentials
        textField.setText("enter username here");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600,400);
        frame.setLayout(new FlowLayout());
//        Note firstly add the textFeild then pack it out
        frame.add(textField);
//        adding the button
        button.setBounds(255,0,50,30);
        button.addActionListener(this);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

//    override the actionPerformed method
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()== button)
      {
          System.out.println("Your response is submitted "+textField.getText());
//          prevents the user to edited the text when it is submitted(we have created this here beceause first the user will submit the text then only it will be able to not change or press the button
          textField.setEditable(false);
//          used to enable/disable the button to get submitted
          button.setEnabled(false);
      }
    }
}
