package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonFrame implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("Click ME");
    JRadioButton radioIOT = new JRadioButton("IOT");
    JRadioButton radioAIML = new JRadioButton("AI & ML");
    JRadioButton radioDevops = new JRadioButton("Devops");
    RadioButtonFrame()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioIOT.addActionListener(this);
        frame.add(radioIOT);
        frame.add(radioAIML);
        frame.add(radioDevops);
        frame.pack();
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {

    }
}
